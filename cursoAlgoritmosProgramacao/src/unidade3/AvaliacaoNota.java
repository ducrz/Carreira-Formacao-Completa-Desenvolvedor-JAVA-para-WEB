package unidade3;

import javax.swing.JOptionPane;

public class AvaliacaoNota {

	public static void main(String[] args) {

	int nota;
	
	nota = Integer.parseInt(JOptionPane.showInputDialog("Digite uma Nota: 0 à 100"));
	
	if(nota >= 0 && nota <= 100){ //Inicio IF
		if(nota >= 90) {
			JOptionPane.showMessageDialog(null, "Conceito Excelente!");
		}
		else if(nota >= 70) {
			JOptionPane.showMessageDialog(null, "Conceito Bom!");
		}
		else if(nota >= 50) {
			JOptionPane.showMessageDialog(null, "Conceito Regular!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Conceito Insuficiente!");
			AvaliacaoNota.main(null);

		}
		
		
	}//Fim IF
	
	}

}
