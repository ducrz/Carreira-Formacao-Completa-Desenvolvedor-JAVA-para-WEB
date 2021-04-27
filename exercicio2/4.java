import javax.swing.JOptionPane;

Scanner teclado = new Scanner(System.in);

System.out.println("Favor informar o valor do jantar");

double valor_jantar = teclado.nextDouble();

System.out.println("Favor informar a quantidade de clientes pagantes");

int numero_clientes= teclado.nextInt();

double valor_jantar_por_cliente= valor_jantar / numero_clientes;

System.out.println("O Valor Total do Jantar é: "+valor_jantar+". O valor que deverá ser pago por cada cliente pagante é de "+valor_jantar_por_cliente);

JOptionPane.showMessageDialog(null, "O Valor Total do Jantar é: "+valor_jantar+". O valor que deverá ser pago por cada cliente pagante é de "+valor_jantar_por_cliente);

