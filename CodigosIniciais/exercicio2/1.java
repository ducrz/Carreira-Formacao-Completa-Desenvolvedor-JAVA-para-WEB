import javax.swing.JOptionPane;

final double taxa_garcom=0.1;

Scanner teclado = new  Scanner(System.in);


System.out.println("Favor informar o valor do Jantar");

double valor_jantar= teclado.nextDouble();

double valor_jantar_total= valor_jantar + (taxa_garcom*valor_jantar);


System.out.println("O Valor Total do Jantar é de "+valor_jantar_total+". Foi incluso a taxa do Garçom de 10%");



JOptionPane.showMessageDialog(null,"O Valor Total do Jantar é de "+valor_jantar_total+". Foi incluso a taxa do Garçom de 10%");

