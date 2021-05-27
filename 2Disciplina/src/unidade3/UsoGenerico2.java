package unidade3;

public class UsoGenerico2 {
	
	public static void main(String[] args) {
		ExemploGenerics2<Integer, String> iob = new ExemploGenerics2<>(89, "Eduardo");
		
		iob.showType();
	}
}
