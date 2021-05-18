package unidade3.sisalucar;

import java.time.LocalDate;

public class Locacao {

	long idLocacao;
	long idCarro;
	long idCliente;
	float valorLocado;
	LocalDate dataInicio;
	LocalDate dataFim;
	public Locacao(long idLocacao, long idCarro, long idCliente, float valorLocado, LocalDate dataInicio,
			LocalDate dataFim) {
		super();
		this.idLocacao = idLocacao;
		this.idCarro = idCarro;
		this.idCliente = idCliente;
		this.valorLocado = valorLocado;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	
	public Locacao() {
		
	}
	
}
