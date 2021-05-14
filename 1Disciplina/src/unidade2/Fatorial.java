package unidade2;


import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		
		double fatorial=1;
		int numero,numero_digitado;		
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
		
		numero_digitado=numero;
		
		while(numero >= 1) {
			fatorial= fatorial*numero;
			numero--;			
		}
		JOptionPane.showMessageDialog(null, "A fatorial de "+numero_digitado+" é "+fatorial);
	}

}
