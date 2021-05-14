package unidade2;

import javax.swing.JOptionPane;

public class Avaliacao {

	public static void main(String[] args) {
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Nota"));
		
		// intervalo de nota valido - 0 a 100
		if((nota < 0) || (nota >100)){
			JOptionPane.showMessageDialog(null, "Nota Inválida. Favor digitar nota no intervalor de 0 à 100");
			main(null); //recursividade
		}else {
				if(nota <50)
					JOptionPane.showMessageDialog(null, "Conceito: Insuficiente");
				else if (nota < 70)
					JOptionPane.showMessageDialog(null, "Conceito: Regular");
				else if (nota < 90)
					JOptionPane.showMessageDialog(null, "Conceito: Bom");
				else
					JOptionPane.showMessageDialog(null, "Conceito: Excelente");
			
		}
	}

}
