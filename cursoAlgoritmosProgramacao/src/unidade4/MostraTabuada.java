package unidade4;

import java.util.Scanner;

public class MostraTabuada {

	public static void main(String[] args) {
		int i, numero,total;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um Número:");
		numero= teclado.nextInt();
		
		for(i=1; i <= 10; i++) {
			total = numero * i;
			System.out.println("Número: "+numero+"X"+i+"="+total);
			teclado.close();

			
		}

	}

}
