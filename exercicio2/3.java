import javax.swing.JOptionPane;

Scanner teclado = new Scanner(System.in);

System.out.println("Digite um número");

int numero= teclado.nextInt();

int numero_anterior= numero-1;

int numero_posterior= numero+1;


System.out.println("Você digitou o número: "+numero+". O número anterior é: "+numero_anterior+". O número posterior é: "+numero_posterior);

JOptionPane.showMessageDialog(null, "Você digitou o número: "+numero+". O número anterior é: "+numero_anterior+". O número posterior é: "+numero_posterior );
