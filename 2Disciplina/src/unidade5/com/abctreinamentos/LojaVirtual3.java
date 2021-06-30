package unidade5.com.abctreinamentos;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class LojaVirtual3 {
	
	static Map<Cliente,List<Curso>> pagamentos = new HashMap<>();
	
	public static void listarCursos(List<Curso> lista) {
		//lista.forEach(p -> System.out.println(p.getCdcurso()+"<=>"+p.getNome()));
		lista.forEach(System.out::print);
	}
	
	public static void main(String[] args) {
		//Criar os cursos para venda
		Curso java8 = new Curso(1, "Java 8 para Web", 2000, Paths.get("/java8"));
		Curso oracle12c = new Curso(2, "Oracle 12C", 2500, Paths.get("/oracle12c"));
		Curso php7 = new Curso(1, "PHP 7", 1500, Paths.get("/php7"));

		
		//Cadastrar o cliente
		Cliente eduardo = new Cliente("000.000.000-00", "Eduardo Silva Monteiro", "contato@cupomdescontoo.com");
		
		//Criar a lista de curso do cliente
		List<Curso> cursosEduardo = new LinkedList<>();
		
		//fazer um checkout dos cursos
		Scanner entrada = new Scanner(System.in);
		int opcao=0;
		
		while(opcao != 4) {
			System.out.println("Qual curso deseja comprar? [1-Java8],[2-Oracle12C,[3-PHP7],[4-Finalizar Compra]");
			opcao = entrada.nextInt();
			
			if(opcao == 1)
				cursosEduardo.add(java8);
			else if(opcao == 2)
				cursosEduardo.add(oracle12c);
			else if(opcao == 3)
				cursosEduardo.add(php7);
			else
				opcao=4;		
			
		}
		entrada.close();
		pagamentos.put(eduardo, cursosEduardo);
		System.out.println(pagamentos);
		//listarCursos(cursosEduardo);
		Consumer<List<Curso>> consumer = LojaVirtual::listarCursos;
		consumer.accept(cursosEduardo);

		
	}

}
