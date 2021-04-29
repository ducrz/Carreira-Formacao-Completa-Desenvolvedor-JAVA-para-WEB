package unidade4;

import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {

		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um Número: ");
		numero = teclado.nextInt();
		
		
		for(int i=numero; i >= 1; i--){
			System.out.println("Número = "+i);			
						
		}
		teclado.close();
	}

}
