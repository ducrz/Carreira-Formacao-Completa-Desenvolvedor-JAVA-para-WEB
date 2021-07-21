package com.abctreinamentos;

import java.util.Scanner;

public class ClienteApp {

	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			int opcao=0;
			long cpf;
			String nome,email;
			
			ClienteDAO dao = new ClienteDAO();
		
			while(opcao != 6) {
				System.out.println("Sistema de Gerenciamento de Clientes");
				System.out.println("====================================");
				System.out.println("Digite [1] para Consultar Todos os Clientes");
				System.out.println("Digite [2] para Consultar Um Cliente Específico");
				System.out.println("Digite [3] para Cadastrar um Novo Cliente");
				System.out.println("Digite [4] para Alterar um Cliente");
				System.out.println("Digite [5] para Excluir um Cliente");
				System.out.println("Digite [6] para Sair");	
				System.out.println("====================================");
				opcao = teclado.nextInt();
		
				switch(opcao) { //Consultar Todos os Clientes
					case 1:{
						System.out.println("[1] Consultar todos");
						//consultarTodos();
						break;
						
					}
					case 2:{ //Consultar
						System.out.println("[2] Consultar um Cliente");
						System.out.println("Favor informar o CPF >>>");
						cpf= teclado.nextLong();
						System.out.println(dao.find(cpf));
						break;							
					}
					case 3:{ //Cadastrar Cliente
						System.out.println("[3] Cadastrar um Novo Cliente");
						System.out.println("Favor informar o CPF >>>");
						cpf= teclado.nextLong();							
						teclado.nextLine(); //Esvaziar o buffer do teclado
						
						System.out.println("Favor informar o Nome >>>");
						nome= teclado.nextLine();
						
						System.out.println("Favor informar o Email >>>");
						email= teclado.nextLine();
						
						Cliente cliente = new Cliente(cpf,nome,email);
						
						dao.persist(cliente);


						break;	
						
					}
					case 4:{ //Alteracao
						System.out.println("[4] Alterar um Cliente");
						System.out.println("Favor informar o CPF >>>");
						cpf= teclado.nextLong();							
						teclado.nextLine(); //Esvaziar o buffer do teclado
						
						System.out.println("Favor informar o Nome >>>");
						nome= teclado.nextLine();
						
						System.out.println("Favor informar o Email >>>");
						email= teclado.nextLine();
						
						Cliente cliente = new Cliente(cpf,nome,email);
						dao.merge(cliente);

						break;	
						
					}
					case 5:{
						System.out.println("[5] Excluir um Cliente");
						System.out.println("Favor informar o CPF >>>");
						cpf= teclado.nextLong();							
													
						Cliente cliente = dao.find(cpf);
						dao.delete(cliente);
						break;	
						
					}
					case 6:{ //Sair
						System.out.println("Encerrando o Programa...");
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
	
	
	

	


