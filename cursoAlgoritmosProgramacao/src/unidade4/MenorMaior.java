package unidade4;

import java.util.Scanner;

public class MenorMaior {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero,menor,maior,i;
		
		System.out.println("Digite um Número:");
		numero = teclado.nextInt();
		
		menor=numero;
		maior=numero;
		
		for(i=1; i< 10; i++) {
			System.out.println("Digite um Número:");
			numero = teclado.nextInt();
			if(numero < menor) {
				menor=numero;				
			}else if(numero > maior) {
				maior=numero;				
			}
			
		}
		System.out.println("O Maior Número é: "+maior);
		System.out.println("O Menor Número é: "+menor);		
		teclado.close();

	}


}
