package unidade3;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class AcessoBD {
	
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String usuario = "curso_java";
	static String senha = "schema";
	
	static Connection conexao;
	
	public static void conectar() throws SQLException {
		conexao=DriverManager.getConnection( url,usuario,senha );
		conexao.setAutoCommit(false);
	}
	public static void consultarCliente() throws SQLException {
		String consulta = "SELECT * FROM Cliente";
		Statement statement = conexao.createStatement();
		
		ResultSet rs = statement.executeQuery(consulta);
		
		while(rs.next()) {
			JOptionPane.showMessageDialog(null, "cpf:"+rs.getInt(1)+
			" nome:"+ rs.getString(2)+ " email"+ rs.getString(3));
			}

		
	}
	public static void mostrarMetaInfoBD() throws SQLException {
		DatabaseMetaData meta = conexao.getMetaData();
		String fabricanteBd = meta.getDatabaseProductName();
		String versaoBD = meta.getDatabaseProductVersion();
		
		JOptionPane.showMessageDialog(null, fabricanteBd+"<===>"+versaoBD);
		
	}


	public static void main(String[] args) {
		try {
			conectar();
			mostrarMetaInfoBD();
			consultarCliente();
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		


	}

}
