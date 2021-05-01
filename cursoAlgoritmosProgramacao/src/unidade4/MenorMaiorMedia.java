package unidade4;

import java.util.Scanner;

public class MenorMaiorMedia {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		double valor, menor_valor,maior_valor,media=0;
		int cont= 0;
		
		System.out.println("Digite o valor:");
		valor = teclado.nextDouble();
		menor_valor= valor;
		maior_valor= valor;

		
		while(valor != 0) {//Início While
			cont++;
				if(valor < menor_valor) {
					menor_valor = valor;
				}else if(valor > maior_valor){
					maior_valor= valor;
					media= media+valor;
				}
				System.out.println("Digite o valor:");
				valor = teclado.nextDouble();			
			
		}//Fim While
		media = media/cont;
		System.out.println("O Menor Valor é: "+menor_valor);
		System.out.println("O Maior Valor é: "+maior_valor);
		System.out.println("A Média é: "+media);
		
	}

}
