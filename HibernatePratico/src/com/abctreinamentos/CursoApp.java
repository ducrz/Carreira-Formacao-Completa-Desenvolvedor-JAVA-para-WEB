package com.abctreinamentos;

import java.util.Scanner;

public class CursoApp {
	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			int opcao=0;
			long cdcurso,valor;
			String nome,url;
			
			CursoDAO dao = new CursoDAO();
		
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
						//consultarTodos();
						break;
						
					}
					case 2:{ //Consultar
						System.out.println("[2] Consultar um Curso");
						System.out.println("Favor informar o CDCURSO >>>");
						cdcurso= teclado.nextLong();
						System.out.println(dao.find(cdcurso));
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
						
						Curso Curso = new Curso(cdcurso,nome,valor,url);
						
						dao.persist(Curso);


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
						
						Curso Curso = new Curso(cdcurso,nome,valor,url);
						dao.merge(Curso);

						break;	
						
					}
					case 5:{
						System.out.println("[5] Excluir um Curso");
						System.out.println("Favor informar o CDCURSO >>>");
						cdcurso= teclado.nextLong();							
													
						Curso Curso = dao.find(cdcurso);
						dao.delete(Curso);
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
