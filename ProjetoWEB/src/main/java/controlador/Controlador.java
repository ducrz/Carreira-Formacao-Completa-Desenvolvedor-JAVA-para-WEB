package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abctreinamentos.Cliente;
import com.abctreinamentos.Curso;
import com.abctreinamentos.Pagamento;
import com.abctreinamentos.PagamentoPK;





/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoWEB");
	EntityManager em = emf.createEntityManager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	this.doPost(req, resp);
    }	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Variaveis
		int idformulario; //1-cliente, 2 cursos, 3 pagamentos
		int tipoformulario; //1.1- consulta e etc
		
		String cpfMascara;
		long cpf,cdcurso,valor;
		String nome,email;
		String nomecurso,valorcurso,url;
		String datainscricao;
		
		idformulario = Integer.parseInt(request.getParameter("idformulario"));
		tipoformulario = Integer.parseInt(request.getParameter("tipoformulario"));
		
		EntityTransaction tx = em.getTransaction();
		HttpSession session = request.getSession();
		if(idformulario == 1) { //Clientes
			switch(tipoformulario) { //Consultar Todos os Clientes
			case 11:{
				TypedQuery<Cliente> query = em.createQuery(""+ "Select c from Cliente c",Cliente.class);
				List<Cliente> clientes = query.getResultList();
				session.setAttribute("mensagem", "Total de Cliente(s): "+clientes.size());
				session.setAttribute("clientes",clientes);					
				response.sendRedirect("clientes/consultaTodos.jsp");
				break;
				
			}
			case 12:{ //Consultar

				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);
				Cliente cliente = em.find(Cliente.class,cpf);
				
				if(cliente != null) //cliente encontrado
				{
					session.setAttribute("mensagem", "Cliente "+cpf+" Encontrado!");
					session.setAttribute("cliente",cliente);
				}
				else //cliente não existe
				{
					session.setAttribute("mensagem", "Cliente "+cpf+" Não Encontrado!");
					session.setAttribute("cliente",null);					
				}
				response.sendRedirect("clientes/resultado.jsp");
				break;						
			}
			case 13:{ //Cadastrar Cliente
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);
				nome = request.getParameter("nome");
				email = request.getParameter("email");


				Cliente cliente = new Cliente(cpf,nome,email);
				
				tx.begin();
				em.persist(cliente);
				tx.commit();
				session.setAttribute("mensagem", "Cliente "+cpf+" Cadastrado!");
				session.setAttribute("cliente",cliente);
				response.sendRedirect("clientes/resultado.jsp");
				break;	
				
			}
			case 14:{ //Alteracao
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);
				nome = request.getParameter("nome");
				email = request.getParameter("email");
				
				Cliente cliente = em.find(Cliente.class,cpf);


				if(cliente != null) //cliente encontrado
				{
					cliente = new Cliente(cpf,nome,email);
					tx.begin();
					em.merge(cliente);
					tx.commit();
					
					session.setAttribute("mensagem", "Cliente "+cpf+" Alterado!");
					session.setAttribute("cliente",cliente);
				}
				else //cliente não existe
				{
					session.setAttribute("mensagem", "Cliente "+cpf+" Não Encontrado. Alteração Cancelada!");
					session.setAttribute("cliente",null);					
				}
				response.sendRedirect("clientes/resultado.jsp");				
				break;
				
			}
			case 15:{
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);

				Cliente cliente = em.find(Cliente.class,cpf);
				
				if(cliente != null) //cliente encontrado
				{
					tx.begin();
					em.remove(cliente);
					tx.commit();
					session.setAttribute("mensagem", "Cliente "+cpf+" Excluído!");						
				}
				else //cliente não existe
					session.setAttribute("mensagem", "Cliente "+cpf+" Não Encontrado. Exclusão Cancelada!");
				session.setAttribute("cliente",null);					
				response.sendRedirect("clientes/resultado.jsp");
				break;	
				
			}
			
			}
			
		}
		else if(idformulario == 2) {//Cursos
			
			switch(tipoformulario) { 
			case 1:{ //Consultar Todos os Cursos
				TypedQuery<Curso> query = em.createQuery(""
						+ "Select c from Curso c",Curso.class);
				List<Curso> cursos = query.getResultList();
				session.setAttribute("mensagem", "Total de Curso(s): "+cursos.size());
				session.setAttribute("cursos",cursos);					
				response.sendRedirect("cursos/consultaTodos.jsp");
				break;
				
			}
			case 22:{ //Consultar
				
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));
				Curso curso = em.find(Curso.class,cdcurso);
				
				if(curso != null) //curso encontrado
				{
					session.setAttribute("mensagem", "Curso "+cdcurso+" Encontrado!");
					session.setAttribute("curso",curso);
				}
				else //curso não existe
				{
					session.setAttribute("mensagem", "Curso "+cdcurso+" Não Encontrado!");
					session.setAttribute("curso",null);					
				}
				response.sendRedirect("cursos/resultado.jsp");
				break;	
			}
			case 23:{ //Cadastrar Curso
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));
				nomecurso = request.getParameter("nome");
				valorcurso = request.getParameter("valor");
				valor = Long.parseLong(valorcurso);
				url = request.getParameter("site");
				
				Curso curso = new Curso(cdcurso,nomecurso,valor,url);
				tx.begin();
				em.persist(curso);
				tx.commit();
				session.setAttribute("mensagem", "Curso "+cdcurso+" Cadastrado!");
				session.setAttribute("curso",curso);
				response.sendRedirect("cursos/resultado.jsp");
				break;						
				
			}
			case 24:{ //Alteracao
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf = Long.parseLong(cpfMascara);
				nome = request.getParameter("nome");
				email = request.getParameter("email");
				
				Cliente cliente = em.find(Cliente.class,cpf);
				
				if(cliente != null) //cliente encontrado
				{
					cliente = new Cliente(cpf,nome,email);
					tx.begin();
					em.merge(cliente);
					tx.commit();
					
					session.setAttribute("mensagem", "Cliente "+cpf+" Alterado!");
					session.setAttribute("cliente",cliente);
				}
				else //cliente não existe
				{
					session.setAttribute("mensagem", "Cliente "+cpf+" Não Encontrado. Alteração Cancelada!");
					session.setAttribute("cliente",null);					
				}
				response.sendRedirect("clientes/resultado.jsp");				
				break;
				
			}
			case 25:{
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));
				
				Curso curso = em.find(Curso.class,cdcurso);
				if(curso != null) //curso encontrado
				{
					tx.begin();
					em.remove(curso);
					tx.commit();
					session.setAttribute("mensagem", "Curso "+cdcurso+" Excluído!");						
				}
				else //cliente não existe
					session.setAttribute("mensagem", "Curso "+cdcurso+" Não Encontrado. Exclusão Cancelada!");
				session.setAttribute("curso",null);					
				response.sendRedirect("cursos/resultado.jsp");
			
				break;
				
			}
			}
			
		}
		else if(idformulario == 3) {//Pagamentos
			
			switch(tipoformulario)
			{
				case 31: //Consultar Todos
				{
					TypedQuery<Pagamento> query = em.createQuery(""+ "Select p from Pagamento p",Pagamento.class);
					List<Pagamento> pagamentos = query.getResultList();
					session.setAttribute("mensagem", "Total de Pagamento(s): "+pagamentos.size());
					session.setAttribute("pagamentos",pagamentos);					
					response.sendRedirect("pagamentos/consultaTodos.jsp");break;
				}
			case 32:{ //Consultar
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf = Long.parseLong(cpfMascara);
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));
				out.println("<h2> Pagamentos => Consultar =>"+cpf+"-"+cdcurso);	
				
				PagamentoPK pgtoid = new PagamentoPK(cpf, cdcurso);
				Pagamento pagamento = em.find(Pagamento.class,pgtoid);
				
				if(pagamento != null) //curso encontrado
				{
					session.setAttribute("mensagem", "Pagamento "+cpf+" "+cdcurso+" Encontrado!");
					session.setAttribute("pagamento",pagamento);
				}
				else //curso não existe
				{
					session.setAttribute("mensagem", "Pagamento "+cpf+" "+cdcurso+" Não Encontrado!");
					session.setAttribute("pagamento",null);					
				}
				response.sendRedirect("pagamentos/resultado.jsp");					
				break;	
			}
			case 33:{ //Cadastrar Pagamento
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf = Long.parseLong(cpfMascara);
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));
				datainscricao = request.getParameter("datainscricao");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate date = LocalDate.parse(datainscricao,formatter);
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
				PagamentoPK pgtoid = new PagamentoPK(cpf, cdcurso);
				Pagamento pagamento = new Pagamento(pgtoid,fmt.format(date));
				tx.begin();
				em.persist(pagamento);
				tx.commit();
				session.setAttribute("mensagem", "Pagamento "+cpf+" "+cdcurso+" Cadastrado!");
				session.setAttribute("pagamento",pagamento);
				response.sendRedirect("pagamentos/resultado.jsp");					
				break;	
				
			}
			case 34:{ //Alteracao
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf = Long.parseLong(cpfMascara);
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));
				datainscricao = request.getParameter("datainscricao");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate date = LocalDate.parse(datainscricao,formatter);
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
				PagamentoPK pgtoid = new PagamentoPK(cpf, cdcurso);
				Pagamento pagamento = new Pagamento(pgtoid,datainscricao);
				pagamento = em.find(Pagamento.class,pgtoid);
				
				if(pagamento != null) //pagamento encontrado
				{
					pagamento = new Pagamento(pgtoid,fmt.format(date));
					tx.begin();
					em.merge(pagamento);
					tx.commit();
					
					session.setAttribute("mensagem", "Pagamento "+cpf+" "+cdcurso+" Alterado!");
					session.setAttribute("pagamento",pagamento);
				}
				else //curso não existe
				{
					session.setAttribute("mensagem", "Pagamento "+cpf+" "+cdcurso+" Não Encontrado. Alteração Cancelada!");
					session.setAttribute("pagamento",null);					
				}
				response.sendRedirect("pagamentos/resultado.jsp");	
				break;
				
			}
			case 35:{
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf = Long.parseLong(cpfMascara);
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));
				
				PagamentoPK pgtoid = new PagamentoPK(cpf, cdcurso);
				Pagamento pagamento = em.find(Pagamento.class,pgtoid);
				
				if(pagamento != null) //pagamento encontrado
				{
					tx.begin();
					em.remove(pagamento);
					tx.commit();
					session.setAttribute("mensagem", "Pagamento "+cpf+" "+cdcurso+" Excluído!");						
				}
				else //cliente não existe
					session.setAttribute("mensagem", "Pagamento "+cpf+" "+cdcurso+" Não Encontrado. Exclusão Cancelada!");
				session.setAttribute("pagamento",null);					
				response.sendRedirect("pagamentos/resultado.jsp");						
				break;	
				
			}
			}
			
		}

		
	}

}
