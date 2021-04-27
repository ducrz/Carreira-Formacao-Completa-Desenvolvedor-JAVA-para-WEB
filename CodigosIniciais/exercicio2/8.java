import javax.swing.JOptionPane;

Scanner teclado = new Scanner(System.in);

System.out.println("Qual o Modelo do Carro?");

String modelo= teclado.next();


System.out.println("Qual é o Preço do Carro?");

double preco_carro= teclado.nextDouble();

double valor_entrada= preco_carro / 2;

double saldo_restante= (preco_carro - valor_entrada) /12;

System.out.println("O Valor da Entrada é de "+valor_entrada+". O Saldo Restante pode ser pago em 12 parcelas de "+saldo_restante);

JOptionPane.ShowMessageDialog(null,"O Valor da Entrada é de "+valor_entrada+". O Saldo Restante pode ser pago em 12 parcelas de "+saldo_restante);

