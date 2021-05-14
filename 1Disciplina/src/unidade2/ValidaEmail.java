/*** Validando E-mail Utilizando Regex Matcher e Pattern ***/
package unidade2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class ValidaEmail {

	public static void main(String[] args) {

		String email= JOptionPane.showInputDialog("Digite um E-mail");
		
		String validacao="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";;
	
	    Pattern pattern = Pattern.compile(validacao);
	    
	    Matcher matcher = pattern.matcher(email);
	    String resposta= matcher.matches() ? "Válido":"Inválido";
	      
	    JOptionPane.showMessageDialog(null, "0 E-mail "+email+" é "+resposta);
	}

}
