package unidade4;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		int valor,soma_valor=0,conta,cont=0;
		
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um valor");
		valor= teclado.nextInt();
		
		
		while(valor != -1) {
			soma_valor = soma_valor+valor;
			cont++;
			
			System.out.println("Digite um valor");
			valor= teclado.nextInt();		
			
		}
		System.out.println("Média="+soma_valor/cont);
		
		
	}

}
