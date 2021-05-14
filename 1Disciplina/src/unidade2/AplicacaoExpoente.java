package unidade2;

import java.util.Scanner;

public class AplicacaoExpoente {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double e=0;
		
		System.out.println("Digite o Valor de X: ");
		double x= teclado.nextDouble();		
		
		for(int y=1; y<=50; y++) {
			e= e + Math.pow(x,y)/y;
			System.out.printf("O Valor de e(x)= %.2f",e);
			
		}
		
	}

}
