package unidade1;

import java.util.Scanner;

public class Calculadora {
	
	public static void dividir(int n1, int n2) throws ArithmeticException{
		System.out.println(n1/n2);
	}
	public static void main(String[] args) throws DivisaoZeroException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o 1º valor");
		int n1= entrada.nextInt();
		
		System.out.println("Digite o 2º valor");
		int n2 = entrada.nextInt();
		
		//Calculadora calculadora = new Calculadora();
		//calculadora.dividir(n1,n2);
		try {
			dividir(n1,n2);

		}
		catch(ArithmeticException e) {
			throw new DivisaoZeroException();
		}
	}

}
