package unidade3;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final double numero_avaliacoes=4;
		double nota1,nota2,nota3,nota4;
		double media;
		int frequencia;
		
		System.out.println("Digite a Primeira Nota");

		nota1= teclado.nextDouble();

		System.out.println("Digite a Segunda Nota");

		nota2= teclado.nextDouble();

		System.out.println("Digite a Terceira Nota");

		nota3= teclado.nextDouble();

		System.out.println("Digite a Quarta Nota");

		nota4= teclado.nextDouble();
		
		System.out.println("Digite a Frequência do Aluno");

		frequencia= teclado.nextInt();


		media= (nota1+nota2+nota3+nota4)/numero_avaliacoes;
		

		System.out.println("A Média de Notas do Aluno é "+media);
		
		if(media <5 || frequencia < 75) {
			System.out.println("Aluno Reprovado!");
			
		}else {
			System.out.println("Aluno Aprovado!");

		}
		
		teclado.close();

		
	}

}
