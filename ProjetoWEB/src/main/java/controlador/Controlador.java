package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
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
		long cpf,cdcurso;
		String nome,email;
		String nomecurso,valorcurso,url;
		String datainscricao;
		
		idformulario = Integer.parseInt(request.getParameter("idformulario"));
		tipoformulario = Integer.parseInt(request.getParameter("tipoformulario"));
		
		if(idformulario == 1) { //Clientes
			switch(tipoformulario) { //Consultar Todos os Clientes
			case 11:{
				/*System.out.println("[1] Consultar todos");
				TypedQuery<Cliente> query = em.createQuery("Select c from Cliente c",Cliente.class);
				List<Cliente> clientes = query.getResultList();
				clientes.forEach(System.out::println);
				break;*/
				
			}
			case 12:{ //Consultar

				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);
				out.println("<h2>Clientes => Consultar =>"+cpf);				
				//Cliente cliente = em.find(Cliente.class,cpf);
				break;							
			}
			case 13:{ //Cadastrar Cliente
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);
				nome = request.getParameter("nome");
				email = request.getParameter("email");


				out.println("<h2>Clientes => Cadastrar =>"+cpf+"-"+nome+"-"+email+"");
				
				/*Cliente cliente = new Cliente(cpf,nome,email);
				tx.begin();						
				em.persist(cliente);
				tx.commit();*/
				break;	
				
			}
			case 14:{ //Alteracao
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);
				nome = request.getParameter("nome");
				email = request.getParameter("email");


				out.println("<h2>Clientes => Alterar =>"+cpf+"-"+nome+"-"+email+"");
				
				
				/*Cliente cliente = new Cliente(cpf,nome,email);
				tx.begin();
				em.merge(cliente);
				tx.commit();*/

				break;	
				
			}
			case 15:{
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);
				out.println("<h2>Clientes => Excluir=>"+cpf);					
											
				/*Cliente cliente = em.find(Cliente.class,cpf);
				tx.begin();
				em.remove(cliente);
				tx.commit();*/
				
				break;	
				
			}
			
			}
			
		}
		else if(idformulario == 2) {//Cursos
			
			switch(tipoformulario) { 
			case 1:{ //Consultar Todos os Cursos
				/*
				TypedQuery<Curso> query = em.createQuery("Select c from Curso c",Curso.class);
				List<Curso> cursos = query.getResultList();
				cursos.forEach(System.out::println);*/
				break;
				
			}
			case 22:{ //Consultar
				
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));	
				out.println("<h2>Cursos => Consultar =>"+cdcurso);		
				
				//Curso curso = em.find(Curso.class,cdcurso);

				break;							
			}
			case 23:{ //Cadastrar Curso
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));	
				nomecurso = request.getParameter("nome");
				valorcurso =	request.getParameter("valor");
				url= request.getParameter("site");				
			
				out.println("<h2>Cursos => Cadastrar =>"+cdcurso+"-"+nomecurso+"-"+valorcurso+"-"+url);	

				/*Curso curso = new Curso(cdcurso,nome,valor,url);				
				tx.begin();						
				em.persist(curso);
				tx.commit();*/

				break;	
				
			}
			case 24:{ //Alteracao
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));	
				nomecurso = request.getParameter("nome");
				valorcurso =	request.getParameter("valor");
				url= request.getParameter("site");				
			
				out.println("<h2>Cursos => Alterar =>"+cdcurso+"-"+nomecurso+"-"+valorcurso+"-"+url);	

				/*Curso curso = new Curso(cdcurso,nome,valor,url);
				tx.begin();
				em.merge(curso);
				tx.commit();*/

				break;	
				
			}
			case 25:{
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));	
				out.println("<h2>Cursos => Excluir =>"+cdcurso);								
				/*							
				Curso curso = em.find(Curso.class,cdcurso);
				tx.begin();
				em.remove(curso);
				tx.commit();*/
				break;	
				
			}
			}
			
		}
		else if(idformulario == 3) {//Pagamentos
			
			switch(tipoformulario) { //Consultar Todos os Pagamentos
			case 31:{
				
				/*TypedQuery<Pagamento> query = em.createQuery("Select c from Pagamento c",Pagamento.class);
				List<Pagamento> pagamentos = query.getResultList();
				pagamentos.forEach(System.out::println);*/
				break;
				
			}
			case 32:{ //Consultar
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));	
				out.println("<h2>Pagamentos => Consultar =>"+cpf+"-"+cdcurso);								

				
				/*PagamentoId pgtoid= PagamentoId(cpf,cdcurso);
				
				Pagamento pagamento = em.find(Pagamento.class,cpf);
				System.out.println(pagamento);*/
				break;							
			}
			case 33:{ //Cadastrar Pagamento
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));	
				datainscricao = request.getParameter("datainscricao");	
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate date = LocalDate.parse(datainscricao,formatter);
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

				out.println("<h2>Pagamentos => Cadastrar =>"+cpf+"-"+cdcurso+"-"+fmt.format(date));
					
				/*PagamentoPK pgtoid= new PagamentoPK(cpf,cdcurso);										
				Pagamento pagamento = new Pagamento(pgtoid,datainscricao);				
				tx.begin();						
				em.persist(pagamento);
				tx.commit();*/


				break;	
				
			}
			case 34:{ //Alteracao
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));	
				datainscricao = request.getParameter("datainscricao");	
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate date = LocalDate.parse(datainscricao,formatter);
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

				out.println("<h2>Pagamentos => Alterar =>"+cpf+"-"+cdcurso+"-"+fmt.format(date));
				
									
				/*Pagamento pagamento = new Pagamento(pgtoid,datainscricao);
				tx.begin();						
				em.merge(pagamento);
				tx.commit();*/
				break;	
				
			}
			case 35:{
				cpfMascara = request.getParameter("cpf");
				cpfMascara = cpfMascara.replaceAll("[.-]","");
				cpf= Long.parseLong(cpfMascara);
				cdcurso = Long.parseLong(request.getParameter("cdcurso"));	
				out.println("<h2>Pagamentos => Excluir =>"+cpf+"-"+cdcurso);
				
				/*PagamentoPK pgtoid= new PagamentoPK(cpf,cdcurso);				
	
				Pagamento pagamento = em.find(Pagamento.class,cpf);
				tx.begin();
				em.remove(pagamento);
				tx.commit();*/
				break;	
				
			}
			}
			
		}

		
	}

}
