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

public class CursoApp {
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
	public static void inserir(long cdcurso, String nome, long valor, String url) throws SQLException {
		String sql ="INSERT INTO  Curso values('"+cdcurso+"','"+nome+"','"+valor+"','"+url+"')";
		Statement statement = conexao.createStatement();
		statement.execute(sql);
		conexao.commit();		
	}
	public static void inserirPS(long cdcurso, String nome, long valor, String url) throws SQLException {
		String sql ="INSERT INTO  Curso values(?,?,?)";		
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setLong(1,cdcurso);
		statement.setString(2,nome);
		statement.setLong(3,valor);
		statement.setString(4,url);		
		statement.executeUpdate();
		conexao.commit();		
	}
	public static void inserirSP(long cdcurso, String nome, long valor, String url) throws SQLException {
		String sql ="{call sp_inserircurso(?,?,?,?)}";
		CallableStatement cstmt = conexao.prepareCall(sql);
		cstmt.setLong(1,cdcurso);
		cstmt.setString(2,nome);
		cstmt.setLong(3,valor);
		cstmt.setString(4,url);		
		cstmt.execute();
		conexao.commit();		
	}
	public static void consultar(long cdcurso) throws SQLException {
		String sql ="SELECT * FROM Curso Where cdcurso="+cdcurso+"";
		Statement statement = conexao.createStatement();
		ResultSet rs =statement.executeQuery(sql);
		while(rs.next()) {
			System.out.println("cdCurso:"+rs.getLong(1)+
			" nome:"+ rs.getString(2)+ " valor"+ rs.getLong(3)+ " url"+ rs.getString(4));
		}		
	}
	public static void consultarTodos() throws SQLException {
		String sql ="SELECT * FROM Curso";
		Statement statement = conexao.createStatement();
		ResultSet rs =statement.executeQuery(sql);
		int contador = rs.getRow();
		while(rs.next()) {
			System.out.println("CDCURSO:"+rs.getLong(1)+" nome:"+rs.getString(2)+
			" valor:"+ rs.getLong(3)+ " url"+ rs.getString(4));
			contador++;
			System.out.println("===================");
		}
		System.out.println("Número de Cursos Listados >>>"+contador+"\n");
		
	}
	public static void alterar(long cdcurso, String nome, long valor, String url) throws SQLException {
		String sql ="UPDATE Curso set nome='"+nome+"',valor='"+valor+"' WHERE cdcurso="+cdcurso;
		Statement statement = conexao.createStatement();
		statement.executeUpdate(sql);
		conexao.commit();		
		
	}
	public static void excluir(long cdcurso) throws SQLException {
		String sql ="DELETE FROM Curso WHERE cdcurso="+cdcurso;
		Statement statement = conexao.createStatement();
		statement.executeUpdate(sql);
		conexao.commit();		
	}

	public static void main(String[] args) {
		
			try {
				conectar();
				Scanner teclado = new Scanner(System.in);
				int opcao=0;
				long valor,cdcurso=0;
				String nome,url;
			
				while(opcao != 6) {
					System.out.println("Sistema de Gerenciamento de Cursos");
					System.out.println("====================================");
					System.out.println("Digite [1] para Consultar Todos os Cursos");
					System.out.println("Digite [2] para Consultar Um Curso Específico");
					System.out.println("Digite [3] para Cadastrar um Novo Curso");
					System.out.println("Digite [4] para Alterar um Curso");
					System.out.println("Digite [5] para Excluir um Curso");
					System.out.println("Digite [6] para Sair");	
					System.out.println("====================================");
					opcao = teclado.nextInt();
			
					switch(opcao) { //Consultar Todos os CURSOS
						case 1:{
							System.out.println("[1] Consultar todos");
							consultarTodos();
							break;
							
						}
						case 2:{ //Consultar
							System.out.println("[2] Consultar um Curso");
							System.out.println("Favor informar o cdcurso >>>");
							cdcurso= teclado.nextLong();
							consultar(cdcurso);
							break;							
						}
						case 3:{ //Cadastrar CURSO
							System.out.println("[3] Cadastrar um Novo Curso");
							
							System.out.println("Favor informar o CDCURSO >>>");
							cdcurso= teclado.nextLong();
							teclado.nextLine(); //Esvaziar o buffer do teclado
							
							System.out.println("Favor informar o Nome >>>");
							nome= teclado.nextLine();
							teclado.nextLine(); //Esvaziar o buffer do teclado

							
							System.out.println("Favor informar o Valor >>>");
							valor= teclado.nextLong();							
							teclado.nextLine(); //Esvaziar o buffer do teclado
							
							System.out.println("Favor informar a URL >>>");
							url= teclado.nextLine();							
							teclado.nextLine(); //Esvaziar o buffer do teclado
							
							//inserir(cpf,nome,email);
							//inserirPS(cpf,nome,email);
							inserirSP(cdcurso,nome,valor, url);


							break;	
							
						}
						case 4:{ //Alteracao
							System.out.println("[4] Alterar um Curso");
							System.out.println("Favor informar o CDCURSO >>>");
							cdcurso= teclado.nextLong();							
							teclado.nextLine(); //Esvaziar o buffer do teclado
							
							System.out.println("Favor informar o Nome do Curso >>>");
							nome= teclado.nextLine();
							
							System.out.println("Favor informar o Valor >>>");
							valor= teclado.nextLong();
							
							System.out.println("Favor informar a URL >>>");
							url= teclado.nextLine();
							
							alterar(cdcurso, nome,valor,url);
							break;	
							
						}
						case 5:{
							System.out.println("[5] Excluir um Curso");
							System.out.println("Favor informar o CDCURSO >>>");
							cdcurso= teclado.nextLong();							
														
							excluir(cdcurso);
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
