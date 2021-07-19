package unidade5.com.abctreinamentos;

public class Cliente {
	
	long cpf;
	String nome;
	String email;
	public Cliente(long cpf, String nome, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	

}
