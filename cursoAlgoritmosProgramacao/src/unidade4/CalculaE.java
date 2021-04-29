package unidade4;

import java.util.Scanner;

public class CalculaE {

	public static void main(String[] args) {
		double x,e;
		int i;
		
		Scanner teclado = new Scanner(System.in);
		
		e= 0;
		System.out.println("Digite o X: ");
		x = teclado.nextInt();
		
		for(i=1; i <= 50; i++) {//Inicio FOR
			
			e=e+Math.pow(x,i)/i;
			
		}//FIM FOR
		System.out.println("O Valor de E^"+x+"="+e);
		
	}

}
