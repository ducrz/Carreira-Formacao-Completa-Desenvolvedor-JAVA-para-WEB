package unidade2;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		//While
		int x= 0;
		while(x < 10) {
			System.out.println("X= "+x);
			x++;
		}
		
		//DO
		int b=0;
		do {
			System.out.println("X= "+b);
			b++;
			
		} while (b<10);
		
		//FOR
		for(int i=0; i<10; i++) {
			System.out.println("X= "+i);			
		}
		
		//FOR EACH		
		int vetor[]= {1,2,3,4,5,6,7,8,9,10};
		
		for (int y: vetor) {
			System.out.println(y);
		}
		
	}

}
