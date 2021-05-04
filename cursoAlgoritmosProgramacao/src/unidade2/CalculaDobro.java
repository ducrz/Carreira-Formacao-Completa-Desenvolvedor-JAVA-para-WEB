package unidade2;


import javax.swing.JOptionPane;

public class CalculaDobro {

	public static void main(String[] args) {
		/*
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o seu Número");

		double numero = teclado.nextDouble();
		double dobro= numero *2;

		System.out.println("O dobro do número é "+dobro);		
		*/
		var numero = JOptionPane.showInputDialog("Digite o seu Número");
		
		var dobro= Double.parseDouble(numero)*2;
		
		JOptionPane.showMessageDialog(null, "O dobro do número é "+dobro);

	}

}
