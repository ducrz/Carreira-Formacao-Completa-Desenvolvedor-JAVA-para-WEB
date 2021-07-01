package unidade6;

import javax.swing.JOptionPane;

public class DialogApp {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Iniciando a Aplicação...","Instalação Concluída", JOptionPane.INFORMATION_MESSAGE);
		String nome= JOptionPane.showInputDialog("Digite o seu nome");
		int resposta= JOptionPane.showConfirmDialog(null, "O Nome "+nome+" foi informado. Salvar as alterações?");
		
		
		JOptionPane.showMessageDialog(null, ""+resposta);
		
		if(resposta == 0) { //SIM

		}
		else if(resposta == 1) { //NAO
			
		}
		else if(resposta == 2) { //CANCELAR
			
		}
		
	}

}
