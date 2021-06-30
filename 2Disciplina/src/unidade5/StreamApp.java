package unidade5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApp {
	static List<String> funcionarios = new ArrayList<>();
	public static void filtrar(String letra) {
		funcionarios.stream().filter(s -> s.startsWith(letra)).forEach(System.out::print);
		
	}
	public static void ordenar(String letra) {
		funcionarios.stream().sorted().filter(s -> s.startsWith(letra)).forEach(System.out::println);

	}
	public static void contar(String letra) {
		long contador =  funcionarios.stream().filter(s->s.startsWith(letra)).count();
	}
	
	public static void main(String[] args) {
		//listagem de funcionários
		funcionarios.add("Antonio");
		funcionarios.add("José");
		funcionarios.add("Pedro");
		funcionarios.add("João");
		funcionarios.add("Andreia");
		//criação de um stream de funcionários para
		//manipulação dos seus objetos
		filtrar("A");
		ordenar("A");
		contar("A");
		
	}
	
	

}
