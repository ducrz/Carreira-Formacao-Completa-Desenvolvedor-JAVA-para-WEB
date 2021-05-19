package unidade4;

public class Conta {
	
	//atributos
	private int numero;
	protected double saldo;
	private double limite;
	private Cliente cliente[];
	
	//metodos
	public boolean saca(double valor) {
		if(valor <= saldo) {
			saldo = saldo - valor;
			return true;
		} else
			return false; //Nao Realizou o Saque por falta de saldo		
	}
	public void deposita(double valor) {
		saldo = saldo + valor;
		
	}
	public void transfere(Conta destino, double valor) {
		if (valor <= saldo) {
			this.saldo= this.saldo - valor;
			destino.deposita(valor);
		}else
			System.out.println("Não foi possível realizar a transferência!");					
	}
	public void atualiza(double taxa) {
		this.saldo = this.saldo + this.saldo*taxa;
		
	}
	
	//GETTERS AND SETTERS

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public Cliente[] getCliente() {
		return cliente;
	}
	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente= new Cliente[5]; //Relação 1 -> 5
		
	}



	
	
	
}
