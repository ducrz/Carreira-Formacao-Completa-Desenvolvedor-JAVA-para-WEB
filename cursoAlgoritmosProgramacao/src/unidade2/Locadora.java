package unidade2;

import javax.swing.JOptionPane;

public class Locadora {

	public static void main(String[] args) {
		var titulo_filme = JOptionPane.showInputDialog("Insira o título do Filme");
		
		int duracao_filme_horas = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de horas do Filme"));
		int duracao_filme_minutos = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de minutos do Filme"));

		int nova_duracao_filme= (duracao_filme_horas*60)+duracao_filme_minutos;
		
		JOptionPane.showMessageDialog(null, "O Filme "+titulo_filme+" têm duração de "+nova_duracao_filme+" minutos.");
		
				
	}

}
