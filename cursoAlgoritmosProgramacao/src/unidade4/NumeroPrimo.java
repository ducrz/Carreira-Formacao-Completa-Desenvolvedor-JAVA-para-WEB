package unidade4;

import javax.swing.JOptionPane;

public class NumeroPrimo {

	public static void main(String[] args) {
		int numero,i,numero_divisores=0;
		
		
		numero= Integer.parseInt(JOptionPane.showInputDialog("Digite um Número:"));
		
		for(i=1; i <= numero; i++) {
			if(numero%i == 0) {
				numero_divisores++;
			}			
		}//Fim FOR
		if(numero_divisores == 2) {
			JOptionPane.showMessageDialog(null, "O Número "+numero+" é Primo!");			
		} else {
			JOptionPane.showMessageDialog(null, "O Número "+numero+" não é Primo!");			

		}
	}

}
