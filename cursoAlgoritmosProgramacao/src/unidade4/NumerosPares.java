package unidade4;

import javax.swing.JOptionPane;

public class NumerosPares {

	public static void main(String[] args) {
		
		int a,b,i;
		
		a= Integer.parseInt(JOptionPane.showInputDialog("Digite o Número A"));
		b= Integer.parseInt(JOptionPane.showInputDialog("Digite o Número B"));
		
		for (i=a+1; i < b; i++) {
			if(i%2 == 0) {
				JOptionPane.showMessageDialog(null, "O Número "+i+" é par!");
			}
			
		}

		
	}

}
