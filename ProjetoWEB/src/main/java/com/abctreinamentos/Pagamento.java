package com.abctreinamentos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PAGAMENTO database table.
 * 
 */
@Entity
@NamedQuery(name="Pagamento.findAll", query="SELECT p FROM Pagamento p")
public class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PagamentoPK id;

	private String datainscricao;

	public Pagamento() {
	}

	public Pagamento(PagamentoPK pgtoid, String datainscricao2) {
		// TODO Auto-generated constructor stub
	}

	public PagamentoPK getId() {
		return this.id;
	}

	public void setId(PagamentoPK id) {
		this.id = id;
	}

	public String getDatainscricao() {
		return this.datainscricao;
	}

	public void setDatainscricao(String datainscricao) {
		this.datainscricao = datainscricao;
	}
	@Override
	public String toString() {
		return "Pagamento [cpf="+id.getCpf()+" cdcurso=" +id.getCdcurso()+" data_inscricao="+datainscricao+"]";
	}

}