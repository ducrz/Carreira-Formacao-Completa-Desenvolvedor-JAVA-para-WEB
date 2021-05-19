package unidade3;

public class Conta {
	
	//atributos
	int numero;
	double saldo;
	double limite;
	String nome;
	
	//metodos
	public boolean saca(double valor) {
		return false;		
	}
	public void deposita(double valor) {
		
	}
	public void transfere(Conta destino, double valor) {
				
	}
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.transfere(conta2, 50);		
	}
}
