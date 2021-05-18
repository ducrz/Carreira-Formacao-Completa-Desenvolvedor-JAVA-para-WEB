package unidade3;

public class StringTokens {

	public static void main(String[] args) {
		String dataNascimento = "03/07/1989";
		
		String[] tokens = dataNascimento.split("/");
		
		String token1 = tokens[0];
		String token2 = tokens[1];
		String token3 = tokens[2];
				
		System.out.println("Primeiro Token "+token1);
		System.out.println("Segundo Token "+token2);
		System.out.println("Terceiro Token "+token3);


		
	}

}
