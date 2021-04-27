package unidade2;

import javax.swing.JOptionPane;

public class LanHouse {

	public static void main(String[] args) {

		final double CUSTO_POR_15_MINUTOS=2;
		
		double horas=Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas de utilização do Cliente"));
		double minutos=Double.parseDouble(JOptionPane.showInputDialog("Informe o número de Minutos de utilização do Cliente"));

		double total_minutos= (horas*60)+minutos;
		
		double total_a_pagar= Math.round(total_minutos/15)*CUSTO_POR_15_MINUTOS;
		
		
		JOptionPane.showMessageDialog(null, "O Valor Total a Pagar é de "+total_a_pagar);
		
		
		
	}

}
