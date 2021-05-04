package unidade2;

import javax.swing.JOptionPane;

public class RevendaVeiculos {

	public static void main(String[] args) {
		var modelo= JOptionPane.showInputDialog("Qual o Modelo do Carro?");
		
		double preco_carro= Double.parseDouble(JOptionPane.showInputDialog("Qual é o Preço do Carro?"));

		double valor_entrada= preco_carro / 2;

		double saldo_restante= (preco_carro - valor_entrada) /12;
		
		JOptionPane.showMessageDialog(null,"O Valor da Entrada é de "+valor_entrada+". O Saldo Restante pode ser pago em 12 parcelas de "+saldo_restante);

	}

}
