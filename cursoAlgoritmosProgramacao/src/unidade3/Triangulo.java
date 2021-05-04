package unidade3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado A");
		a= teclado.nextInt();
		
		System.out.println("Digite o valor do lado B");
		b= teclado.nextInt();
		
		System.out.println("Digite o valor do lado C");
		c= teclado.nextInt();
		
		
		if((a< b + c) && (b<a+c) && (c < a +b)) { //Inicio IF
			if((a == b) && (b == c)){
				System.out.println("Triângulo Equilátero!");				
			}
			else{
				if ((a == b) || (b == c) || (c == a)){
					System.out.println("Triângulo Isósceles!");					
				}
				else {
					System.out.println("Triângulo Escaleno!");					

				}
				
			}			
			
		}//Fim IF
		else {
			System.out.println("Os Lados Informados Não Formam um Triângulo!");
		}


		teclado.close();

		
	}

}
