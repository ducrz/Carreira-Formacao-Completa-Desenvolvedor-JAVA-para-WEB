package com.abctreinamentos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CURSO database table.
 * 
 */
@Entity
@NamedQuery(name="Curso.findAll", query="SELECT c FROM Curso c")
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long cdcurso;

	private String nomecurso;

	private String url;

	private long valor;

	public Curso() {
	}

	public Curso(long cdcurso2, String nome, long valor2, String url2) {
		// TODO Auto-generated constructor stub
	}

	public long getCdcurso() {
		return this.cdcurso;
	}

	public void setCdcurso(long cdcurso) {
		this.cdcurso = cdcurso;
	}

	public String getNomecurso() {
		return this.nomecurso;
	}

	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getValor() {
		return this.valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
	return "Curso [cdcurso="+cdcurso+" nome="+nomecurso+" nome="+valor+" valor="+url+"]";
	}

}