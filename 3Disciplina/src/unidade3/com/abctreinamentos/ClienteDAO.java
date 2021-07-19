package unidade3.com.abctreinamentos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClienteDAO {
	
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String usuario = "curso_java";
	static String senha = "schema";
	
	static Connection conexao;
	
	public static void conectar() throws SQLException {
		conexao=DriverManager.getConnection( url,usuario,senha );
		DatabaseMetaData meta = conexao.getMetaData();
		conexao.setAutoCommit(false);
		System.out.println(">> Conectado ao Banco de Dados "+meta.getDatabaseProductVersion());
	}
	public static void desconectar() throws SQLException {
		conexao.close();
	}
	public static void inserir(Cliente cliente) throws SQLException {
		String sql ="INSERT INTO  Cliente values("+cliente.getCpf()+",'"+cliente.getNome()+"','"+cliente.getEmail()+"')";
		Statement statement = conexao.createStatement();
		statement.execute(sql);
		conexao.commit();		
	}
	
	public static Cliente consultar(long cpf) throws SQLException {
		String sql ="SELECT * FROM Cliente Where cpf="+cpf+"";
		Statement statement = conexao.createStatement();
		ResultSet rs =statement.executeQuery(sql);
		Cliente cliente = null;
		
		while(rs.next()) {			
			cliente = new Cliente(rs.getLong(1),rs.getString(2),rs.getString(3));

		}	
		return cliente;
	}
	public static List<Cliente > consultarTodos() throws SQLException {
		String sql ="SELECT * FROM Cliente";
		Statement statement = conexao.createStatement();
		ResultSet rs =statement.executeQuery(sql);
		List<Cliente> clientes = new LinkedList<>();

		while(rs.next()) {
			Cliente cliente = new Cliente(rs.getLong(1),rs.getString(2),rs.getString(3));
			clientes.add(cliente);

			System.out.println("===================");
		}
		return clientes;
	}
	public static void alterar(Cliente cliente) throws SQLException {
		String sql ="UPDATE Cliente set nome='"+cliente.getNome()+"',email='"+cliente.getEmail()+"' WHERE cpf="+cliente.getCpf();
		Statement statement = conexao.createStatement();
		statement.executeUpdate(sql);
		conexao.commit();		
		
	}
	public static void excluir(long cpf) throws SQLException {
		String sql ="DELETE FROM Cliente WHERE cpf="+cpf;
		Statement statement = conexao.createStatement();
		statement.executeUpdate(sql);
		conexao.commit();		
	}

	public static void main(String[] args) {
		
			try {
				conectar();
				Scanner teclado = new Scanner(System.in);
				int opcao=0;
				long cpf;
				String nome,email;
			
				while(opcao != 6) {
					System.out.println("Sistema de Gerenciamento de Clientes");
					System.out.println("====================================");
					System.out.println("Digite [1] para Consultar Todos os Clientes");
					System.out.println("Digite [2] para Consultar Um Cliente Específico");
					System.out.println("Digite [3] para Cadastrar um Novo Cliente");
					System.out.println("Digite [4] para Alterar um Cliente");
					System.out.println("Digite [5] para Excluir um Cliente");
					System.out.println("Digite [6] para Sair");	
					System.out.println("====================================");
					opcao = teclado.nextInt();
			
					switch(opcao) { //Consultar Todos os Clientes
						case 1:{
							System.out.println("[1] Consultar todos");
							List<Cliente> clientes = ClienteDAO.consultarTodos();
							clientes.forEach(System.out::println);
							System.out.println("Número de Clientes >>>"+clientes.size()+"");
							break;
							
						}
						case 2:{ //Consultar
							System.out.println("[2] Consultar um Cliente");
							System.out.println("Favor informar o CPF >>>");
							cpf= teclado.nextLong();
							Cliente cliente = ClienteDAO.consultar(cpf);
							System.out.println(cliente);
							break;							
						}
						case 3:{ //Cadastrar Cliente
							System.out.println("[3] Cadastrar um Novo Cliente");
							System.out.println("Favor informar o CPF >>>");
							cpf= teclado.nextLong();							
							teclado.nextLine(); //Esvaziar o buffer do teclado
							
							System.out.println("Favor informar o Nome >>>");
							nome= teclado.nextLine();
							
							System.out.println("Favor informar o Email >>>");
							email= teclado.nextLine();
							Cliente cliente = new Cliente(cpf,nome,email);
							
							ClienteDAO.inserir(cliente);


							break;	
							
						}
						case 4:{ //Alteracao
							System.out.println("[4] Alterar um Cliente");
							System.out.println("Favor informar o CPF >>>");
							cpf= teclado.nextLong();							
							teclado.nextLine(); //Esvaziar o buffer do teclado
							
							System.out.println("Favor informar o Nome >>>");
							nome= teclado.nextLine();
							
							System.out.println("Favor informar o Email >>>");
							email= teclado.nextLine();
							
							Cliente cliente = new Cliente(cpf,nome,email);
							
							ClienteDAO.alterar(cliente);
							break;	
							
						}
						case 5:{
							System.out.println("[5] Excluir um Cliente");
							System.out.println("Favor informar o CPF >>>");
							cpf= teclado.nextLong();							
														
							ClienteDAO.excluir(cpf);
							break;	
							
						}
						case 6:{ //Sair
							System.out.println("Encerrando o Programa...");
							break;
						}
					}
				}
				teclado.close();
				desconectar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		
	}


}
