package unidade4;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double fatorial;
		int numero,numero_digitado;
		
		System.out.println("Digite um Número:");
		numero = teclado.nextInt();
		
		fatorial=1;
		numero_digitado=numero;
		
		while(numero >= 1) {//Inicio While
			fatorial= fatorial*numero;
			numero--;			
		}//Fim While
		System.out.println("A fatorial de "+numero_digitado+" é "+fatorial);
		teclado.close();

	}


}
