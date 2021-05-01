package unidade4;

import javax.swing.JOptionPane;

public class PopulacaoAB {

	public static void main(String[] args) {

		final int habitantesA=5000000,habitantesB=7000000;
		final double taxaA=0.03, taxaB= 0.02;
		
		double populacaoA,populacaoB;
		int tempo=0;
		
		populacaoA= habitantesA;
		populacaoB= habitantesB;
		
		while(populacaoB >= populacaoA) {
			populacaoA= populacaoA + taxaA * populacaoA;
			populacaoB= populacaoB + taxaB * populacaoB;
			tempo ++;	
			
		}//Fim While
		
		JOptionPane.showMessageDialog(null, "Serão Necessários "+tempo+" anos");
	}

}
