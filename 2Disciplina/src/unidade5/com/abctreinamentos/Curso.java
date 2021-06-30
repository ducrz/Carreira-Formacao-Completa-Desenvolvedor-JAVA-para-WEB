package unidade5.com.abctreinamentos;

import java.nio.file.Path;

public class Curso {
	
	int cdcurso;
	String nome;
	float valor;
	Path url;
	public Curso(int cdcurso, String nome, float valor, Path url) {
		super();
		this.cdcurso = cdcurso;
		this.nome = nome;
		this.valor = valor;
		this.url = url;
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + "]";
	}
	public int getCdcurso() {
		return cdcurso;
	}
	public void setCdcurso(int cdcurso) {
		this.cdcurso = cdcurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Path getUrl() {
		return url;
	}
	public void setUrl(Path url) {
		this.url = url;
	}
	
	

}
