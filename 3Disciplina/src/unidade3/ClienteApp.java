package unidade3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ClienteApp {
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String usuario = "curso_java";
	static String senha = "schema";
	
	static Connection conexao;
	
	public static void conectar() throws SQLException {
		conexao=DriverManager.getConnection( url,usuario,senha );
		conexao.setAutoCommit(false);
	}
	public static void desconectar() throws SQLException {
		conexao.close();
	}
	public static void inserir(long cpf, String nome, String email) throws SQLException {
		String sql ="INSERT INTO  Cliente values("+cpf+",'"+nome+"','"+email+"')";
		Statement statement = conexao.createStatement();
		statement.execute(sql);
		conexao.commit();		
	}
	public static void inserirPS(long cpf, String nome, String email) throws SQLException {
		String sql ="INSERT INTO  Cliente values(?,?,?)";		
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setLong(1,cpf);
		statement.setString(2,nome);
		statement.setString(3,email);		
		statement.executeUpdate();
		conexao.commit();		
	}
	public static void inserirSP(long cpf, String nome, String email) throws SQLException {
		String sql ="{call sp_inserircliente(?,?,?)}";
		CallableStatement cstmt = conexao.prepareCall(sql);
		
		cstmt.setLong(1,cpf);
		cstmt.setString(2,nome);
		cstmt.setString(3,email);		
		cstmt.execute();
		conexao.commit();		
	}
	public static void consultar(long cpf) throws SQLException {
		String sql ="SELECT * FROM Cliente Where cpf="+cpf+"";
		Statement statement = conexao.createStatement();
		ResultSet rs =statement.executeQuery(sql);
		while(rs.next()) {
			System.out.println("cpf:"+rs.getInt(1)+
			" nome:"+ rs.getString(2)+ " email"+ rs.getString(3));
		}		
	}
	public static void consultarTodos() throws SQLException {
		String sql ="SELECT * FROM Cliente";
		Statement statement = conexao.createStatement();
		ResultSet rs =statement.executeQuery(sql);
		int contador = rs.getRow();
		while(rs.next()) {
			System.out.println("cpf:"+rs.getInt(1)+
			" nome:"+ rs.getString(2)+ " email"+ rs.getString(3));
			contador++;
			System.out.println("===================");
		}
		System.out.println("Número de Clientes Listados >>>"+contador+"\n");
		
	}
	public static void alterar(long cpf, String nome, String email) throws SQLException {
		String sql ="UPDATE Cliente set nome='"+nome+"',email='"+email+"' WHERE cpf="+cpf;
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
							consultarTodos();
							break;
							
						}
						case 2:{ //Consultar
							System.out.println("[2] Consultar um Cliente");
							System.out.println("Favor informar o CPF >>>");
							cpf= teclado.nextLong();
							consultar(cpf);
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
							
							//inserir(cpf,nome,email);
							//inserirPS(cpf,nome,email);
							inserirSP(cpf,nome,email);


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
							
							alterar(cpf,nome,email);
							break;	
							
						}
						case 5:{
							System.out.println("[5] Excluir um Cliente");
							System.out.println("Favor informar o CPF >>>");
							cpf= teclado.nextLong();							
														
							excluir(cpf);
							break;	
							
						}
						case 6:{ //Sair
							System.out.println("Encerrando o Programa...");
							break;
						}
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		
	}

}
