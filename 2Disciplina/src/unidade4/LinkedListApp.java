package unidade4;


import java.util.LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {

		LinkedList<String> lista = new LinkedList<>();
		
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		
		lista.removeFirst(); //Retira o primeiro elemento
		lista.removeLast(); //Retira o último elemento
		
		System.out.println(lista);
	}

}
