package unidade4;

import java.util.Scanner;

public class MenorValor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor, menor_valor,maior_valor;
		
		System.out.println("Digite o valor:");
		valor = teclado.nextInt();
		menor_valor= valor;
		maior_valor= valor;

		
		while(valor != 0) {//Início While
				if(valor < menor_valor) {
					menor_valor = valor;
				}else if(valor > maior_valor){
					maior_valor= valor;
					
				}
				System.out.println("Digite o valor:");
				valor = teclado.nextInt();			
			
		}//Fim While
		
		System.out.println("O Menor Valor é: "+menor_valor);
		System.out.println("O Maior Valor é: "+maior_valor);

		teclado.close();

	}

}
