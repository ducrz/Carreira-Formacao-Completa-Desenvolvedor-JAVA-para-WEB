import javax.swing.JOptionPane;

Scanner teclado = new Scanner(System.in);

System.out.println("Insira o título do Filme");
String titulo_filme= teclado.next();

System.out.println("Insira o número de horas do Filme");
int duracao_filme_horas= teclado.nextDouble();

System.out.println("Insira o número de minutos do Filme");
int duracao_filme_minutos= teclado.nextDouble();

int nova_duracao_filme= (duracao_filme_horas*60)+duracao_filme_minutos;

System.out.println("O Filme "+titulo_filme+" têm duração de "+nova_duracao_filme+" minutos.");






