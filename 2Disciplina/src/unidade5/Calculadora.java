package unidade5;

public class Calculadora implements Formula{

	public static void main(String[] args) {
		IMatematica objeto = new IMatematica() {
			public int somar(int a, int b){return a+b;}
			public int subtrair(int a, int b){return a-b;}
			public int multiplicar(int a, int b){return a*b;}
			public int dividir(int a, int b){return a/b;}
			@Override
			public double exponenciacao(double a, double b) {
				return Math.pow(a,b);
			}
			@Override
			public double radiciacao(double a, double b) {
				return Math.pow(a, 1/b);
			}
			};
			System.out.println("anônimo: " + objeto.getClass());
			System.out.println("=> " + objeto.somar(5,5));
			System.out.println("=> " + objeto.subtrair(6,4));
			System.out.println("=> " + objeto.multiplicar(3,4));
			System.out.println("=> " + objeto.dividir(10,2));
	}

	@Override
	public double calcular() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
