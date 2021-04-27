package unidade2;

import javax.swing.JOptionPane;

public class JantarPizza {

	public static void main(String[] args) {

		double valor_jantar=Double.parseDouble(JOptionPane.showInputDialog("Favor informar o valor do jantar"));
		
		int numero_clientes=Integer.parseInt(JOptionPane.showInputDialog("Favor informar a quantidade de clientes pagantes"));

		double valor_jantar_por_cliente= valor_jantar / numero_clientes;
		
		JOptionPane.showMessageDialog(null, "O Valor Total do Jantar é: "+valor_jantar+". O valor que deverá ser pago por cada cliente pagante é de "+valor_jantar_por_cliente);
		
	}

}
