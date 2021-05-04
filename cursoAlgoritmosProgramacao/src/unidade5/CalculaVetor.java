package unidade5;

import java.util.Scanner;

public class CalculaVetor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int i;
		double A[]= new double[10];
		double B[]= new double[10];		
		
		for(i=0; i < 10; i++) {
			System.out.println("Favor Informar o Valor de A["+i+"]");
			A[i]= teclado.nextDouble();		
			//Alimentar o vetor B
			if(i%2 == 0) {
				B[i]= 2*A[i];
						
			}else {
				B[i]= A[i]/2;
			}
			
		}//Fim For

		for(double valor:A)
			System.out.print("A= "+valor+" ");
			System.out.println(" ********** ");
		
		for(double valor:B) 
			System.out.print("B= "+valor+" ");

		
		
		/* Exemplo da Aula
		for(i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("[i="+i+"][j="+j+"]");
			}
			System.out.println();

		}
		*/
		

		

	}	


}
