package unidade2;

public class MatrizOffRoad {

	public static void main(String[] args) {
		int matriz[][]= new int[4][4];
		int numero1=0,numero2=0;		
		
		for(int coluna=0; coluna<4; coluna++) {
			for(int linha=0; linha<4; linha++) {
				
				if(linha %2 == 0) { //Se eh par coloca 2
					matriz[coluna][linha] = 2;
					numero2++;
				}else { //Se eh impar coloca 1
					matriz[coluna][linha] = 1;
					numero1++;
				}
			}
			
		}	
		for(int x=0; x<=3; x++) {
			for(int y=0; y<=3; y++) {
				System.out.print(matriz[x][y]);				
			}
			System.out.println("");
			}
		System.out.println("O Número 1 aparece "+numero1+" vezes. O Número 2 aparece "+numero2+" vezes.");
		
	}

}
