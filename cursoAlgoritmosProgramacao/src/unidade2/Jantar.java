package unidade2;

import javax.swing.JOptionPane;

public class Jantar {

	public static void main(String[] args) {

		final double taxa_garcom=0.1; //Constante
		
		double valor_jantar, valor_jantar_total; //Variaveis
		
		valor_jantar= Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do Jantar"));
		valor_jantar_total= valor_jantar + (taxa_garcom*valor_jantar);
		JOptionPane.showMessageDialog(null,"O Valor Total do Jantar é de "+valor_jantar_total+". Foi incluso a taxa do Garçom de 10%");
		
	}

}
