import javax.swing.JOptionPane;

Scanner teclado = new  Scanner(System.in);



System.out.println("Favor informar o número de Dias da viagem");
double dias=teclado.nextDouble();

System.out.println("Favor informar o número de Horas da viagem");
double horas=teclado.nextDouble();

double total_viagem_horas=(24*dias)+horas;


System.out.println("Duração Total da Viagem em Horas "+total_viagem_horas);

JOptionPane.showMessageDialog(null,"Duração Total da Viagem em Horas "+total_viagem_horas)


