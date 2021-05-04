package unidade5;

import javax.swing.JOptionPane;


public class Matematica {

	public static void tabuada(int n){
		int i,total;
		for(i=1; i<=10; i++){
			total=n*i;
			JOptionPane.showMessageDialog(null, "Número: "+n+"x"+i+"="+total);
		}	
	}
	
	public static void main(String[] args) {
		int numero=0;
		//leia numero
		numero= Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
		tabuada(numero);	
	}

}
