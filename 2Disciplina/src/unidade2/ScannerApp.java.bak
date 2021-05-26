package unidade2;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Formatter saida = new Formatter(System.out);
		
		float primeira_nota=0,segunda_nota=0,terceira_nota=0,quarta_nota=0;
		double media=0;

		System.out.println("Digite a Primeira Nota:");
		primeira_nota= teclado.nextFloat();
		
		System.out.println("Digite a Segunda Nota:");
		segunda_nota= teclado.nextFloat();
		
		System.out.println("Digite a Terceira Nota:");
		terceira_nota= teclado.nextFloat();
		
		System.out.println("Digite a Quarta Nota:");
		quarta_nota= teclado.nextFloat();
		
		media = (primeira_nota + segunda_nota + terceira_nota + quarta_nota)/4;
		
		saida.format("Média = %.2f", media);
		
		teclado.close();
		saida.close();

	}

}
