package com.abctreinamentos;


import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ClienteApp {

	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			int opcao=0;
			long cpf;
			String nome,email;
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoWEB");
			EntityManager em = emf.createEntityManager();
			
			EntityTransaction tx = em.getTransaction();
			
		
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
						TypedQuery<Cliente> query = em.createQuery("Select c from Cliente c",Cliente.class);
						List<Cliente> clientes = query.getResultList();
						clientes.forEach(System.out::println);
						break;
						
					}
					case 2:{ //Consultar
						System.out.println("[2] Consultar um Cliente");
						System.out.println("Favor informar o CPF >>>");
						cpf= teclado.nextLong();
						Cliente cliente = em.find(Cliente.class,cpf);
						System.out.println(cliente);
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
						tx.begin();						
						em.persist(cliente);
						tx.commit();
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
						tx.begin();
						em.merge(cliente);
						tx.commit();

						break;	
						
					}
					case 5:{
						System.out.println("[5] Excluir um Cliente");
						System.out.println("Favor informar o CPF >>>");
						cpf= teclado.nextLong();							
													
						Cliente cliente = em.find(Cliente.class,cpf);
						tx.begin();
						em.remove(cliente);
						tx.commit();
						
						break;	
						
					}
					case 6:{ //Sair
						System.out.println("Encerrando o Programa...");
						em.close();

						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
	
	
	

	


