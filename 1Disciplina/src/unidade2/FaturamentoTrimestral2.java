package unidade2;

import javax.swing.JOptionPane;

public class FaturamentoTrimestral2 {

	public static void main(String[] args) {
		double vendas_janeiro;
		double vendas_fevereiro;
		double vendas_marco;
		
		
		vendas_janeiro= Double.parseDouble(JOptionPane.showInputDialog("Informe o Faturamento do Mês de Janeiro!"));
		vendas_fevereiro= Double.parseDouble(JOptionPane.showInputDialog("Informe o Faturamento do Mês de Fevereiro!"));
		vendas_marco= Double.parseDouble(JOptionPane.showInputDialog("Informe o Faturamento do Mês de Março!"));

		double faturamento_trimestral= vendas_janeiro+vendas_fevereiro+vendas_marco;
		
		System.out.println("O Faturamento Trimestral foi de "+faturamento_trimestral);
		
		JOptionPane.showMessageDialog(null, "O Faturamento Trimestral foi de "+faturamento_trimestral);
		

		
	}

}
