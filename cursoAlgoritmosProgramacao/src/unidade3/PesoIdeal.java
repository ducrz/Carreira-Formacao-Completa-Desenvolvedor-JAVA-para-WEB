package unidade3;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		

		double altura,peso_ideal_homem,peso_ideal_mulher;
		String sexo;
		
		altura= Double.parseDouble(JOptionPane.showInputDialog("Informe a Altura"));
		sexo= JOptionPane.showInputDialog("Digite o Sexo: F para Feminino ou M para Masculino");
		
		if(sexo.equalsIgnoreCase("M")){
			peso_ideal_homem = (altura*72.7)-58;			
			JOptionPane.showMessageDialog(null, peso_ideal_homem);
			
		}
		else{		
			peso_ideal_mulher = (altura*62.1)-44.7;
			JOptionPane.showMessageDialog(null, peso_ideal_mulher);

		}

		

	}

}
