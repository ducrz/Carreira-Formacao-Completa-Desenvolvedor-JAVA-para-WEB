package unidade4;

import java.util.ArrayList;

public class NoteBook {
	static ArrayList<String> anotacoes;

	public static void main(String[] args) {
		
		anotacoes = new ArrayList<>();
		
		anotacoes.add("Buy Bread");
		anotacoes.add("Sell Car");
		anotacoes.add("11:30 mtg");

		System.out.println(anotacoes);
		
		double tempo1= System.currentTimeMillis();
		
		for(int i = 3; i < 10003; i++)
			anotacoes.add("texto_"+i);
		
		double tempo2= System.currentTimeMillis();
		
		System.out.println((tempo2 - tempo1)/1000);
		//System.out.println(anotacoes);


	}

}
