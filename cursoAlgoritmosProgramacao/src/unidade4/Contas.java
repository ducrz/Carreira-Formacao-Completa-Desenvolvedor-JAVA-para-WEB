package unidade4;

import javax.swing.JOptionPane;

public class Contas {

	public static void main(String[] args) {
		int numero_contas=0;
		double valor=0,valor_total=0;
		String descricao_conta;
		
		descricao_conta= JOptionPane.showInputDialog("Qual é a Conta?");
		valor= Double.parseDouble(JOptionPane.showInputDialog("Qual é o Valor?"));


		while (valor > 0) {			
			JOptionPane.showMessageDialog(null, "Conta: "+descricao_conta+ ". Valor: "+valor);
			numero_contas++;

			descricao_conta= JOptionPane.showInputDialog("Qual é a Conta?");
			valor= Double.parseDouble(JOptionPane.showInputDialog("Qual é o Valor?"));
			
			valor_total= valor_total + valor;			

		}
			JOptionPane.showMessageDialog(null, "Quantidade de contas: "+numero_contas+ ". Valor Total: "+valor_total);
			

		
		
	}

}
