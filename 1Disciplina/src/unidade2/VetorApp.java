package unidade2;

public class VetorApp {

	public static void main(String[] args) {
		//vetor de tipos primitivos
		int vetor[]= new int[10];
		
		
		//Fibonacci
		int fibo[] = new int[20];
		fibo[0]=1;
		fibo[1]= fibo[0];
		fibo[2]= fibo[0]+fibo[1];
		
		for(int i=3; i<20; i++) {
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		for(int f:fibo) {
			System.out.print(f+",");			
		}
		
		//vetor de objetos
		String vetorString[]= new String[10];
		vetorString[0]= new String("Eduardo");
		vetorString[1]= new String("Antonio");
		
		for(String z: vetorString)
			System.out.print(z+",");
		
		
		//Matriz
		int matriz[][]= new int[3][3];
		
		matriz[0][0]=100;
		
	}

}
