package unidade5;

import javax.swing.JOptionPane;

public class Aluno {

	public static void main(String[] args) {
		int i;
		String nome;
		String lista_alunos []=new String[5];
		
		//Nomes que serão inseridos no Vetor
		for(i=0; i<5;i++) {			
			nome= JOptionPane.showInputDialog("Digite o Nome do Aluno");
			lista_alunos[i]=nome;			
			
		}//Fim FOR
		for(i=0; i<5;i++) {			
			JOptionPane.showMessageDialog(null, "Nome"+i+" ="+lista_alunos[i]);			
		}//Fim FOR
		
	}

}
