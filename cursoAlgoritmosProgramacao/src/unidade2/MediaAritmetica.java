package unidade2;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		final double numero_avaliacoes=4;
		double nota1,nota2,nota3,nota4;
		double media;
		
		System.out.println("Digite a Primeira Nota");

		nota1= teclado.nextDouble();

		System.out.println("Digite a Segunda Nota");

		nota2= teclado.nextDouble();

		System.out.println("Digite a Terceira Nota");

		nota3= teclado.nextDouble();

		System.out.println("Digite a Quarta Nota");

		nota4= teclado.nextDouble();


		media= (nota1+nota2+nota3+nota4)/numero_avaliacoes;

		System.out.println("A Média de Notas do Aluno é "+media);
		
		teclado.close();
		
		
	}

}
