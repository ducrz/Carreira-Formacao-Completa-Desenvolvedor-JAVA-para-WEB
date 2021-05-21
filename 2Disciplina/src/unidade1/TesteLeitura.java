package unidade1;

import java.io.IOException;

public class TesteLeitura {

	public static void main(String[] args) throws IOException{
		byte [] bytes = new byte[10];
		
		System.out.print("Digite algo: ");	
		System.in.read(bytes);	
		System.out.println("\nEco: " + new String(bytes));
	}

}
