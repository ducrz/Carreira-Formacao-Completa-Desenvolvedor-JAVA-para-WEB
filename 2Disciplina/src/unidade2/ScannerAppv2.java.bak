package unidade2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerAppv2 {

	public static void main(String[] args) {

		try {
			Scanner entrada = new Scanner(new FileReader("./src/unidade2/numeros.txt"));
			double soma=0;
			String valor;
			while(entrada.hasNext()) {
				valor = entrada.next();
				soma = soma + Double.parseDouble(valor);				
			}
			entrada.close();
			JOptionPane.showMessageDialog(null, "A soma dos valores é: "+soma);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
