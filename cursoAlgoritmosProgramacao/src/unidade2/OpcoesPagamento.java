package unidade2;

import javax.swing.JOptionPane;

public class OpcoesPagamento {

	public static void main(String[] args) {
		final int quantidade_parcelas=3;
		
		
		double preco_produto=Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço do Produto"));
		
		double preco_a_vista= preco_produto * 0.9;
		
		JOptionPane.showMessageDialog(null, "O Produto pago à vista têm 10% de desconto e sairá por "+preco_a_vista);
	
		
		double preco_a_prazo= preco_produto/quantidade_parcelas;
		JOptionPane.showMessageDialog(null, "O Produto pode ser pago em 3X de  "+preco_a_prazo);
	}

}
