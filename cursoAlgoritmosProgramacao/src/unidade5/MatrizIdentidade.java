package unidade5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MatrizIdentidade {

	public static void main(String[] args) throws IOException {
		int i,j;
		int matrizI[][]= new int[3][3];
		
		//Arquivo para guardas as informacoes da Matriz Identidade
		
		FileWriter arq= new FileWriter("matriz.txt");
		PrintWriter gravaarq = new PrintWriter(arq);
		
		for(i=0; i<3; i++) {
			for(j=0;j<3;j++) {
				if(i == j) {
					matrizI[i][j]=1;					
				}else {
					matrizI[i][j]=0;					

				}	
				
				
			}
			for(i=0; i<3; i++) {
				for(j=0; j<3; j++) {
					gravaarq.print(matrizI[i][j]);					
				}
				gravaarq.println();					

				
			}
			arq.close();
			gravaarq.close();
			
						
		}
		
		
	}

}
