package com.abctreinamentos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PAGAMENTO database table.
 * 
 */
@Embeddable
public class PagamentoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long cpf;

	private long cdcurso;

	public PagamentoPK() {
	}
	public PagamentoPK(long cpf2, long cdcurso2) {
		// TODO Auto-generated constructor stub
	}
	public long getCpf() {
		return this.cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getCdcurso() {
		return this.cdcurso;
	}
	public void setCdcurso(long cdcurso) {
		this.cdcurso = cdcurso;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PagamentoPK)) {
			return false;
		}
		PagamentoPK castOther = (PagamentoPK)other;
		return 
			(this.cpf == castOther.cpf)
			&& (this.cdcurso == castOther.cdcurso);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.cpf ^ (this.cpf >>> 32)));
		hash = hash * prime + ((int) (this.cdcurso ^ (this.cdcurso >>> 32)));
		
		return hash;
	}
}