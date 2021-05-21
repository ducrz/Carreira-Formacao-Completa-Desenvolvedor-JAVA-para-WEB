package unidade1;

public class Teste {

	public static void main(String[] args) {
		int i=0;
		String frases[] = {"um","dois","três"};
	
		while (i<4) { // o índice vai de 0 a 2 !
			try{
				System.out.println(frases[i]);
			} 
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro no Acesso ao Vetor");
			}
			i++;

			
		}
	}

}
