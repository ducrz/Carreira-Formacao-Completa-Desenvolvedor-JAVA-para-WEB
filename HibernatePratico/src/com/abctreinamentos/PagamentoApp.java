package com.abctreinamentos;

import java.util.Scanner;

public class PagamentoApp {

	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			int opcao=0;
			long cpf,cdcurso;
			String datainscricao;
			
			PagamentoDAO dao = new PagamentoDAO();
		
			while(opcao != 6) {
				System.out.println("Sistema de Gerenciamento de Pagamentos");
				System.out.println("====================================");
				System.out.println("Digite [1] para Consultar Todos os Pagamentos");
				System.out.println("Digite [2] para Consultar Um Pagamento Específico");
				System.out.println("Digite [3] para Cadastrar um Novo Pagamento");
				System.out.println("Digite [4] para Alterar um Pagamento");
				System.out.println("Digite [5] para Excluir um Pagamento");
				System.out.println("Digite [6] para Sair");	
				System.out.println("====================================");
				opcao = teclado.nextInt();
		
				switch(opcao) { //Consultar Todos os Pagamentos
					case 1:{
						System.out.println("[1] Consultar todos");
						//consultarTodos();
						break;
						
					}
					case 2:{ //Consultar
						System.out.println("[2] Consultar um Pagamento");
						System.out.println("Favor informar o CPF >>>");
						cpf= teclado.nextLong();
						teclado.nextLine(); //Esvaziar o buffer do teclado

						System.out.println("Favor informar o CDCURSO >>>");
						cdcurso= teclado.nextLong();
						
						PagamentoId pgtoid= new PagamentoId(cpf,cdcurso);						
						
						System.out.println(dao.find(pgtoid));
						break;							
					}
					case 3:{ //Cadastrar Pagamento
						System.out.println("[3] Cadastrar um Novo Pagamento");
						System.out.println("Favor informar o CPF >>>");
						cpf= teclado.nextLong();
						teclado.nextLine(); //Esvaziar o buffer do teclado

						System.out.println("Favor informar o CDCURSO >>>");
						cdcurso= teclado.nextLong();
						
						teclado.nextLine(); //Esvaziar o buffer do teclado


						
						System.out.println("Favor informar a Data de Inscrição >>>");
						datainscricao= teclado.nextLine();		
						PagamentoId pgtoid= new PagamentoId(cpf,cdcurso);						

											
						Pagamento Pagamento = new Pagamento(pgtoid,datainscricao);
						
						dao.persist(Pagamento);


						break;	
						
					}
					case 4:{ //Alteracao
						System.out.println("[4] AlterarNovo Pagamento");
						System.out.println("Favor informar o CPF >>>");
						cpf= teclado.nextLong();
						teclado.nextLine(); //Esvaziar o buffer do teclado

						
						System.out.println("Favor informar o CDCURSO >>>");
						cdcurso= teclado.nextLong();
						teclado.nextLine(); //Esvaziar o buffer do teclado

						PagamentoId pgtoid= new PagamentoId(cpf,cdcurso);						

						
						System.out.println("Favor informar a Data de Inscrição >>>");
						datainscricao= teclado.nextLine();
						teclado.nextLine(); //Esvaziar o buffer do teclado
						
											
						Pagamento Pagamento = new Pagamento(pgtoid,datainscricao);
						dao.merge(Pagamento);

						break;	
						
					}
					case 5:{
						System.out.println("[2] Consultar um Pagamento");
						System.out.println("Favor informar o CPF >>>");
						cpf= teclado.nextLong();
						teclado.nextLine(); //Esvaziar o buffer do teclado

						System.out.println("Favor informar o CDCURSO >>>");
						cdcurso= teclado.nextLong();
						
						PagamentoId pgtoid= new PagamentoId(cpf,cdcurso);				
			
						Pagamento Pagamento = dao.find(pgtoid);
						dao.delete(Pagamento);
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
