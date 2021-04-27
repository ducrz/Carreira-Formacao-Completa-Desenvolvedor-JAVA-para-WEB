import javax.swing.JOptionPane;

double custo_por_15_minutos=2;

Scanner teclado= new Scanner(System.in);

System.out.println("Informe o número de horas de utilização do Cliente");
double horas= teclado.nextInt();


System.out.println("Informe o número de minutos de utilização do Cliente");
double minutos= teclado.nextInt();

double total_minutos= (horas*60)+minutos;


double total_a_pagar= Math.round(total_minutos/15)*custo_por_15_minutos;


System.out.println("O Valor Total a Pagar é de "+total_a_pagar);




