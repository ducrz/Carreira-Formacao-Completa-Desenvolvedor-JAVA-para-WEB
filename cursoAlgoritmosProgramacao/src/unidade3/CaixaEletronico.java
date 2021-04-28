package unidade3;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {
		double saque,notas100,notas50,notas10;
		double resto;
		
		
		saque= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
		
		if(saque%10 == 0) { //Inicio IF
			
			notas100 = Math.floor(saque/100);
			resto = saque%100;
			
			notas50 = Math.floor(resto/50);
			resto =  resto%50;
			
			notas10 = Math.floor(resto/10);
			
			if(notas100 > 0) {
				JOptionPane.showMessageDialog(null, "O Número de notas de Cem "+notas100);				
			}
			if(notas50 > 0) {
				JOptionPane.showMessageDialog(null, "O Número de notas de Cinquenta "+notas50);				
			}
			if(notas10 > 0) {
				JOptionPane.showMessageDialog(null, "O Número de notas de Dez "+notas10);				
			}
			
			
			
		}//FIM IF
		else {
			JOptionPane.showMessageDialog(null, "O Valor Informado para o Saque é Inválido!");
		}
		
	}

}
