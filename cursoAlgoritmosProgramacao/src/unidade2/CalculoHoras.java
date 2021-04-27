package unidade2;

import javax.swing.JOptionPane;

public class CalculoHoras {

	public static void main(String[] args) {

		int dias= Integer.parseInt(JOptionPane.showInputDialog("Favor informar o número de Dias da viagem"));
		
		int horas= Integer.parseInt(JOptionPane.showInputDialog("Favor informar o número de Horas da viagem"));

		double total_viagem_horas=(dias*24)+horas;
		
		JOptionPane.showMessageDialog(null, "Duração Total da Viagem em Horas "+total_viagem_horas);
	}

}
