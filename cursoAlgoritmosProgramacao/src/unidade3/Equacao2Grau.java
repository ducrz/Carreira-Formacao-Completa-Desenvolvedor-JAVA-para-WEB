package unidade3;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o Primeiro Número");
		int a = teclado.nextInt();
		
		System.out.println("Informe o Segundo Número");
		int b = teclado.nextInt();
		
		System.out.println("Informe o Terceiro Número");
		int c = teclado.nextInt();
		
		double delta = (b*b)- (4*a*c);
		
		if(delta >= 0) {
			double x1 = -b -(Math.sqrt(delta))/2*a;
			double x2 = -b +(Math.sqrt(delta))/2*a;
			
			System.out.println(x1);
			System.out.println(x2);		
			
		}else {
			System.out.println("Não existem raízes reais");
		}
		
		teclado.close();

	}

}
