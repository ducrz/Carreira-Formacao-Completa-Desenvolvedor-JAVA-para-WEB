package unidade2;

import javax.swing.JOptionPane;

public class EscreveVariaveis {

	public static void main(String[] args) {
		//String fruta= "Banana";
		double valor= 3.50;
		
		String fruta= JOptionPane.showInputDialog("Digite o Nome da Fruta");
		
		//System.out.println("O valor da "+fruta+" é de "+valor);

		JOptionPane.showMessageDialog(null, "O valor da "+fruta+" é de "+valor);
		
	}

}
