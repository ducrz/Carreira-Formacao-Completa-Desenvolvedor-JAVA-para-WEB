package unidade3;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um Número!");
		int numero= teclado.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("Este Número é Par!");
		}else {
			System.out.println("Este Número é Impar!");

		}
		teclado.close();

	}

}
