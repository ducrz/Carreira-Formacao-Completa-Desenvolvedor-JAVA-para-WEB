package unidade5;

import javax.swing.JOptionPane;

public class NotasAlunos {

	public static void main(String[] args) {
		int i,j,aprovados=0,reprovados=0;
		double soma=0,media=0;
		String nome;
		String lista_alunos []=new String[5];
		boolean situacao_alunos[] = new boolean[5];
		double notas_alunos[][]= new double[5][4];
		
		//Nomes que serão inseridos no Vetor
		for(i=0; i<5;i++) {			
			nome= JOptionPane.showInputDialog("Digite o Nome do Aluno");
			lista_alunos[i]=nome;	
			for(j=0; j< 4; j++) {
				notas_alunos[i][j]=Double.parseDouble(JOptionPane.showInputDialog("Favor informar a nota do aluno"));			
				soma= soma + notas_alunos[i][j];
			}
			media = soma/4;
			if(media < 5) {
					situacao_alunos[i]=false;
			}
			else {
				situacao_alunos[i]=true;
				soma=0;

			}
			
		}//Fim FOR
		for(i=0; i<5;i++) {		
			if(situacao_alunos[i]) {
				aprovados++;				
			}else {
				reprovados++;
			}
			JOptionPane.showMessageDialog(null, "Aprovados= "+aprovados);	
			JOptionPane.showMessageDialog(null, "Reprovados= "+reprovados);			

		}//Fim FOR
	}

}
