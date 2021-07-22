package com.abctreinamentos;
// Generated 21 de jul de 2021 17:06:25 by Hibernate Tools 5.5.3.Final


/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long cpf;
	private String nome;
	private String email;

	public Cliente() {
	}

	public Cliente(long cpf) {
		this.cpf = cpf;
	}

	public Cliente(long cpf, String nome, String email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public long getCpf() {
		return this.cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente [cpf="+cpf+" nome=" +nome+" email="+email+"]";
	}
	

}