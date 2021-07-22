package com.abctreinamentos;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class CursoApp {
	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			int opcao=0;
			long cdcurso,valor;
			String nome,url;
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAApp");
			EntityManager em = emf.createEntityManager();
			
			EntityTransaction tx = em.getTransaction();		
			while(opcao != 6) {
				System.out.println("Sistema de Gerenciamento de Cursos");
				System.out.println("====================================");
				System.out.println("Digite [1] para Consultar Todos os Cursos");
				System.out.println("Digite [2] para Consultar Um Curso Específico");
				System.out.println("Digite [3] para Cadastrar um Novo Curso");
				System.out.println("Digite [4] para Alterar um Curso");
				System.out.println("Digite [5] para Excluir um Curso");
				System.out.println("Digite [6] para Sair");	
				System.out.println("====================================");
				opcao = teclado.nextInt();
		
				switch(opcao) { //Consultar Todos os Cursos
					case 1:{
						System.out.println("[1] Consultar todos");
						TypedQuery<Curso> query = em.createQuery("Select c from Curso c",Curso.class);
						List<Curso> cursos = query.getResultList();
						cursos.forEach(System.out::println);
						break;
						
					}
					case 2:{ //Consultar
						System.out.println("[2] Consultar um Curso");
						System.out.println("Favor informar o CDCURSO >>>");
						cdcurso= teclado.nextLong();
						Curso curso = em.find(Curso.class,cdcurso);
						System.out.println(curso);
						break;							
					}
					case 3:{ //Cadastrar Curso
						System.out.println("[3] Cadastrar um Novo Curso");
						System.out.println("Favor informar o CDCURSO >>>");
						cdcurso= teclado.nextLong();
						teclado.nextLine(); //Esvaziar o buffer do teclado

						
						System.out.println("Favor informar o Nome >>>");
						nome= teclado.nextLine();
						
						
						System.out.println("Favor informar o Valor >>>");
						valor= teclado.nextLong();
						teclado.nextLine(); //Esvaziar o buffer do teclado

						
						
						System.out.println("Favor informar a URL >>>");
						url= teclado.nextLine();
						
						Curso curso = new Curso(cdcurso,nome,valor,url);
						
						tx.begin();						
						em.persist(curso);
						tx.commit();

						break;	
						
					}
					case 4:{ //Alteracao
						System.out.println("[4] Alterar um Curso");
						System.out.println("Favor informar o CDCURSO >>>");
						cdcurso= teclado.nextLong();							
						teclado.nextLine(); //Esvaziar o buffer do teclado
						
						System.out.println("Favor informar o Nome >>>");
						nome= teclado.nextLine();
						
						System.out.println("Favor informar o Valor >>>");
						valor= teclado.nextLong();
						teclado.nextLine(); //Esvaziar o buffer do teclado

						
						System.out.println("Favor informar a URL >>>");
						url= teclado.nextLine();
						
						Curso curso = new Curso(cdcurso,nome,valor,url);
						tx.begin();
						em.merge(curso);
						tx.commit();

						break;	
						
					}
					case 5:{
						System.out.println("[5] Excluir um Curso");
						System.out.println("Favor informar o CDCURSO >>>");
						cdcurso= teclado.nextLong();							
													
						Curso curso = em.find(Curso.class,cdcurso);
						tx.begin();
						em.remove(curso);
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
