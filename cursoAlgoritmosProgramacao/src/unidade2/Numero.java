package unidade2;

import javax.swing.JOptionPane;

public class Numero {

	public static void main(String[] args) {
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite umNúmero!"));

		double numero_anterior= numero-1;
		
		double numero_posterior= numero+1;

		
		JOptionPane.showMessageDialog(null, "Você digitou o número: "+numero+". O número anterior é: "+numero_anterior+". O número posterior é: "+numero_posterior);
	}

}
