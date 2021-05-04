package unidade4;

import java.util.Scanner;

public class NumeroEstrelas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int i,numero_linhas;
		String estrela = "*";
		
		System.out.println("Digite o Número de Linhas");
		numero_linhas= teclado.nextInt();
		
		for(i=1; i <= numero_linhas; i++) {
			System.out.println(estrela);
			estrela= estrela + "*";
			
			teclado.close();

		} //Fim For

	}

}
