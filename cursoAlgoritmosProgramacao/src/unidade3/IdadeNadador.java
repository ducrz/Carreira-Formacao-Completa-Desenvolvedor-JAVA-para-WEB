package unidade3;

import java.util.Scanner;

public class IdadeNadador {

	public static void main(String[] args) {
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual a Idade do Nadador?");
		idade = teclado.nextInt();
		
		if(idade >= 0 && idade <= 100) {
			
				if (idade <=5) {
				 System.out.println("Categoria Infantil A");
				}
				else if (idade <=8) {
					 System.out.println("Categoria Infantil B");
				}
				else if (idade <=11) {
					 System.out.println("Categoria Infantil C");
				}
				else if (idade <=13) {
					 System.out.println("Categoria Juvenil A");
				}
				else if (idade <=17) {
					 System.out.println("Categoria Juvenil B");
				}
				else {
					 System.out.println("Categoria Adulto");

				}	
			
		}
		else {
			 System.out.println("Idade Inválida");					 
			 IdadeNadador.main(null);

		}
		teclado.close();

			
	}

}
