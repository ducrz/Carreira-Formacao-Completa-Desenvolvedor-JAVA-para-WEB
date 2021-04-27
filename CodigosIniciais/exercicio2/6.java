import javax.swing.JOptionPane;


Scanner teclado = new Scanner(System.in);

int numero_avaliacoes=4;

System.out.println("Digite a Primeira Nota");

double nota1= teclado.nextDouble();

System.out.println("Digite a Segunda Nota");

double nota2= teclado.nextDouble();

System.out.println("Digite a Terceira Nota");

double nota3= teclado.nextDouble();

System.out.println("Digite a Quarta Nota");

double nota4= teclado.nextDouble();


double media= (nota1+nota2+nota3+nota4)/numero_avaliacoes;

System.out.println("A Média de Notas do Aluno é "+media);

JOptionPane.showMessageDialog(null, "A Média de Notas do Aluno é "+media);
