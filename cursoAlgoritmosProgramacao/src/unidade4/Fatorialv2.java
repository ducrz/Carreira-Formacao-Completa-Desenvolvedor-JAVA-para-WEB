package unidade4;

import java.util.Scanner;

public class Fatorialv2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double fatorial;
		int numero,numero_digitado;
		
		System.out.println("Digite um Número:");
		numero = teclado.nextInt();
		
		fatorial=1;
		numero_digitado=numero;
		
		do {
			fatorial= fatorial*numero;
			numero--;			
		}while(numero >= 1);
		System.out.println("A fatorial de "+numero_digitado+" é "+fatorial);
		
	}

}
