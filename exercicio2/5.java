import javax.swing.JOptionPane;

Scanner teclado = new Scanner(System.in);

int quantidade_parcelas=3;

System.out.println("Informa o Preço do Produto");
double preco_produto= teclado.nextDouble();


double preco_a_vista= preco_produto * 0.9;

System.out.println("O Produto pago à vista têm 10% de desconto e sairá por "+preco_a_vista);

JOptionPane.showMessageDialog(null, "O Produto pago à vista têm 10% de desconto e sairá por "+preco_a_vista);

double preco_a_prazo= preco_produto/quantidade_parcelas;

System.out.println("O Produto pode ser pago em 3X de  " +preco_a_prazo);
JOptionPane.showMessageDialog(null, "O Produto pode ser pago em 3X de  "+preco_a_prazo);


