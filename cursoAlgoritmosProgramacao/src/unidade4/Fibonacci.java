package unidade4;

public class Fibonacci {

	public static void main(String[] args) {
		double f,f1,f2,f9=0,f10=0,f100=0, f10000=0;
		f1=1;
		f2=1;
		
		for(int i=3; i <= 10000; i++) {//Inicio FOR
			f= f1+f2;
			f1=f2;
			f2=f;
			
			if(i == 9) {
				f9=f;				
			}else if(i == 10) {
				f10=f;				
			}else if(i == 100) {
				f100=f;				
			}else if(i == 10000) {
				f10000=f;				
			}
		}//FIM FOR
		
		System.out.println("F9="+f9);
		System.out.println("F10="+f10);
		System.out.println("F100="+f100);
		System.out.println("F1000="+f10000);


	}

}
