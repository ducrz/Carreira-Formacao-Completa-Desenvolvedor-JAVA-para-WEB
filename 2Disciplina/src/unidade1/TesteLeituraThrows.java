package unidade1;

import java.io.IOException;

public class TesteLeituraThrows {

	public static void main(String[] args) {
		byte [] bytes = new byte[10];
		
		System.out.print("Digite algo: ");
		try {
			System.in.read(bytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nEco: " + new String(bytes));
	}

}
