package unidade3;

import javax.swing.JOptionPane;

public class FormaPagamento {

	public static void main(String[] args) {
		double valor_produto, valor_final_produto;
		int codigo;
		
		valor_produto= Double.parseDouble(JOptionPane.showInputDialog(null, "Favor Informar o Valor do Produto"));
		codigo= Integer.parseInt(JOptionPane.showInputDialog(null, "Favor Informar o Tipo de Pagamento: "
				+ "1 [10% de Desconto à vista],"
				+ " 2 [5% de Desconto no Cartão de Crédito]"
				+ " 3 [Em 2x Sem Juros]"
				+ " 4 [Em 3 vezes com juros de 10%]"));
		
		
		switch(codigo){//Inicio Switch
			case 1:{		
				valor_final_produto= valor_produto*0.9;				
				JOptionPane.showMessageDialog(null, "O valor final com Desconto de 10% será de "+valor_final_produto);
				break;
			}
			case 2:{	
				valor_final_produto= valor_produto*0.95;	
				JOptionPane.showMessageDialog(null, "O valor final com Desconto de 5% será de "+valor_final_produto);
				break;
			}
			case 3:{
				valor_final_produto= valor_produto;	
				JOptionPane.showMessageDialog(null, "O valor do produto em 2x sem juros será de   "+valor_final_produto/2);
				break;
			}	
			case 4:{
				valor_final_produto= valor_produto*1.1;	
				JOptionPane.showMessageDialog(null, "O valor do produto em 3x com juros será de   "+valor_final_produto/3);
				break;
			}	
			default:{
				JOptionPane.showMessageDialog(null, "Opção Digitada Incorreta!");
				FormaPagamento.main(null);

			}
		
		}//Fim Switch
	
	}

}
