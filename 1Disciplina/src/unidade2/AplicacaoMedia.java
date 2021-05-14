package unidade2;

import java.util.Scanner;

public class AplicacaoMedia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um Valor: ");
		int valor= teclado.nextInt();		
		int maior,menor;
		menor = maior = valor;
		double media =0,soma=0;
		int numeros =0;
		
		while(valor != -1) {
			soma = soma + valor;
			numeros++;		
			
			if(valor > maior)
				maior = valor;
			else if(valor <menor)
				menor=valor;
			System.out.println("Digite um Valor: ");
			valor= teclado.nextInt();
		}
		media = soma / numeros;
		
		System.out.println("Maior valor= "+maior);
		System.out.println("Menor Valor= "+menor);		
		System.out.printf("Média = %.2f",media);
	}

}
