package com.abctreinamentos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CLIENTE database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long cpf;

	private String email;

	private String nome;

	public Cliente() {
	}

	public Cliente(long cpf2, String nome2, String email2) {
		// TODO Auto-generated constructor stub
	}

	public long getCpf() {
		return this.cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Cliente [cpf="+cpf+" nome=" +nome+" email="+email+"]";
	}
	

}