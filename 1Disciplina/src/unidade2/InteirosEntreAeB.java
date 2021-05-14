package unidade2;

import javax.swing.JOptionPane;

public class InteirosEntreAeB {

	public static void main(String[] args) {
		int menor=0,maior=0,soma=0;

		int numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		menor= numero1;
		maior= numero1;

		
		int numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		if(numero2 < menor) {
			menor = numero2;
		}
		if(numero2 > maior) {
			maior = numero2;
		}

		
		for(int i=menor+1; i< maior; i++) {
			soma += i;			
		}
		JOptionPane.showMessageDialog(null, "Os números informados foram: "+numero1+" e "+numero2+". A soma"
				+ " entre todos os inteiros existentes entre eles é: "+soma);
		

	}

}
