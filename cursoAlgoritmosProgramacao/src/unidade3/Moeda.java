package unidade3;

import javax.swing.JOptionPane;

public class Moeda {

	public static void main(String[] args) {

		double valor_real;
		int tipo_moeda;
		
		valor_real= Double.parseDouble(JOptionPane.showInputDialog(null, "Favor Informar o Valor a ser convertido"));
		tipo_moeda= Integer.parseInt(JOptionPane.showInputDialog(null, "Favor Informar a Moeda para Conversão: 1 (Libras) - 2 (Dólar) - 3 (Euro)"));
		
		
		switch(tipo_moeda){//Inicio Switch
			case 1:{		
				JOptionPane.showMessageDialog(null, "O valor convertido em Libras é "+valor_real/7.45);
				break;
			}
			case 2:{		
				JOptionPane.showMessageDialog(null, "O valor convertido em Dólar é "+valor_real/5.34);
				break;
			}
			case 3:{
				JOptionPane.showMessageDialog(null, "O valor convertido em Euro é "+valor_real/6.48);
				break;
			}	
			default:{
				JOptionPane.showMessageDialog(null, "Opção Digitada Incorreta!");
								
			}
		
		}//Fim Switch
	}

}
