package unidade2;

import java.util.Scanner;

public class Operadores2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o 1º valor!");		
		int numero1=teclado.nextInt();
		
		System.out.println("Digite o 2º valor!");
		int numero2=teclado.nextInt();
		
		
		System.out.println("O 1º Valor é maior que o 2º valor? "+(numero1 > numero2));
		System.out.println("O 1º Valor é igual que o 2º valor? "+(numero1 == numero2));
		System.out.println("O 1º Valor é menor que o 2º valor? "+(numero1 < numero2));


		
		
		



	}

}
