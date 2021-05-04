package unidade4;

import java.util.Scanner;

public class CadastraAluno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int matricula, cont=0;
		String nome,endereco,telefone;
		
		System.out.println("Digite o número da Matrícula:");
		matricula=teclado.nextInt();
		
		while (matricula != 0){
			System.out.println("Digite o Nome:");
			nome=teclado.next();
			System.out.println("Digite o Endereço:");
			endereco=teclado.next();
			System.out.println("Digite o Telefone:");
			telefone=teclado.next();
			cont++;			
			System.out.println("Digite o número da Matrícula:");
			matricula=teclado.nextInt();
			
		}
		
		
		teclado.close();

	}

}
