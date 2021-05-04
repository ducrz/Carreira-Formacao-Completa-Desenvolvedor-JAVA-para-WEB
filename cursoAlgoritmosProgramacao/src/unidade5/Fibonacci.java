/**************************************************/
/* Autor: Eduardo Silva Monteiro */
/* Data: 04/05/2021 */
/* Esta classe calcula Fibonacci */
/**************************************************/

package unidade5;

import java.util.Scanner;

public class Fibonacci {
	
	public static void fibo(int numero) {
		int f1, f2, f;
		f1=1;
		f2=1;
		f=0;
		
		System.out.print(f1+","+f2+",");

		for(int i=3; i <= numero; i++) {//Inicio FOR
			f= f1+f2;
			f1=f2;
			f2=f;
			System.out.print(f+",");
		}			
			
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor digitar um Número:");
		int numero= teclado.nextInt();
		fibo(numero);
		teclado.close();
	}

}
