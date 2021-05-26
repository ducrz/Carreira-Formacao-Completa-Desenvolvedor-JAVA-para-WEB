package unidade2;

import java.io.FileInputStream;

public class StreamApp {
	
	public static void byteStream() throws Exception {
		FileInputStream entrada = new FileInputStream("./src/unidade2/dados.txt");
		int cont=0;
	
		while((entrada.read()) != -1) {
			cont++;
			System.out.println("Número de caracteres é: "+cont);
		}
		entrada.close();

	}
	public static void caracterStream(char letra) throws Exception {
		FileInputStream entrada = new FileInputStream("./src/unidade2/dados.txt");
		int cont=0;
		int c=0;
	
		while((c= entrada.read()) != -1) {
			if(c == letra)
				cont++;			
		}
		System.out.println("Número de Vezes que a letra informada foi encontrada: "+cont);


		entrada.close();
		
		
	}

	public static void main(String[] args) {
		try {
			byteStream();
			System.out.println("Informar a letra a ser encontrada");
			char letra = (char)System.in.read();
			caracterStream(letra);

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
