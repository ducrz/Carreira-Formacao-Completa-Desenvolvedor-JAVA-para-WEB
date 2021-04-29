package unidade4;

import java.util.Scanner;

public class CalculaMedia50Alunos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final double numero_avaliacoes=4;
		int i;
		double nota1,nota2,nota3,nota4;
		double media,media50alunos=0;
		
		
		for(i =1; i <=5; i++) {
			
			System.out.println("Digite a Primeira Nota");

			nota1= teclado.nextDouble();

			System.out.println("Digite a Segunda Nota");

			nota2= teclado.nextDouble();

			System.out.println("Digite a Terceira Nota");

			nota3= teclado.nextDouble();

			System.out.println("Digite a Quarta Nota");

			nota4= teclado.nextDouble();

			media= (nota1+nota2+nota3+nota4)/numero_avaliacoes;
			media50alunos= media50alunos+media;			
		}
		media50alunos= media50alunos/i;
		System.out.println("Média dos 5 alunos="+media50alunos);
		teclado.close();

		
	}


}
