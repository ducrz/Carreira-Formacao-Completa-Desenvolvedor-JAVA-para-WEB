package unidade3;

public class UsoLogin {
	
	public static void main(String[] args) {
		Login<String, String> iob = new Login<>("Eduardo", "@senha");
		
		iob.showType();
	}
}
