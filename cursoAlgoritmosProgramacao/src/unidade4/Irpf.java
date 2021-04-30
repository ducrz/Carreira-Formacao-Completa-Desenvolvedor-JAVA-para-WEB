package unidade4;

import javax.swing.JOptionPane;

public class Irpf {

	public static void main(String[] args) {

		double irpf,renda_mensal,salario_liquido;
		int numero_contribuintes=1, numero_dependentes;
		String nome,cpf;
		
		while(numero_contribuintes <= 10) {
			nome= JOptionPane.showInputDialog("Digite o Nome do Contribuinte");
			cpf= JOptionPane.showInputDialog("Digite o CPF do Contribuinte");			
			numero_dependentes= Integer.parseInt(JOptionPane.showInputDialog("Digite o Número de Dependentes"));
			renda_mensal= Double.parseDouble(JOptionPane.showInputDialog("Digite a Renda Mensal"));
			
			salario_liquido= renda_mensal-(numero_dependentes*189.59)-(0.11*renda_mensal);
			
			if(salario_liquido <= 1903.98) {
				irpf=0;
				JOptionPane.showMessageDialog(null, "O Contribuinte "+nome+" é isento!");				
			}
			else if(salario_liquido >= 1903.99 && salario_liquido <= 2826.65){
				irpf=0.075 * salario_liquido - 142.80;
				JOptionPane.showMessageDialog(null, "O IRPF do Contribuinte "+nome+" é de "+irpf);				
			}
			else if(salario_liquido >= 2826.66 && salario_liquido <= 3751.05){
				irpf=0.15 * salario_liquido - 354.80;
				JOptionPane.showMessageDialog(null, "O IRPF do Contribuinte "+nome+" é de "+irpf);				
			}
			else if(salario_liquido >= 3751.06 && salario_liquido <= 4664.68){
				irpf=0.225 * salario_liquido - 636.13;
				JOptionPane.showMessageDialog(null, "O IRPF do Contribuinte "+nome+" é de "+irpf);				
			}
			else {
				irpf=0.275 * salario_liquido - 869.36;
				JOptionPane.showMessageDialog(null, "O IRPF do Contribuinte "+nome+" é de "+irpf);				
			}
			numero_contribuintes++;

			
		}//FIM WHILE
		
	}

}
