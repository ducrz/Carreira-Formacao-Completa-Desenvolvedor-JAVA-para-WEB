package unidade2;

import javax.swing.JOptionPane;

public class SerieArmonica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero= Double.parseDouble(JOptionPane.showInputDialog("Digite um Número: "));
		double soma=numero;

		
		for(int i=2; i< 52; i++) {//50 elementos de serie armonica
			soma += numero /i;			
		}
		
		JOptionPane.showMessageDialog(null, "A soma da Série Harmônica de "+numero+" é "+soma);

	}

}
