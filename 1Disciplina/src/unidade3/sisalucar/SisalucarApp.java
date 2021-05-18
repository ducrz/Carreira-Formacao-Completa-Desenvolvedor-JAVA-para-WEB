package unidade3.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros=0;

	public static void main(String[] args) {
		
		Carro carro1 = new Carro(); //1º objeto carro
		carro1.idCarro=1;
		carro1.modelo= "Nivus";
		carro1.placa="XXXX-999";
		carro1.cor="Azul";
		carro1.ano= 2022;
		carro1.valorDiaria= 99.90f;
		carro1.fabricante="Volkswagem";
		
		SisalucarApp.totalCarros = SisalucarApp.totalCarros +1;		
		
		Carro carro2= new Carro(); //2º objeto carro
		
		Cliente cliente1= new Cliente(); //1º objeto cliente
		cliente1.idCliente=1;
		cliente1.cpf="999999999-99";
		cliente1.nome="João Pedro";
		cliente1.cnh="XYZ0001";
		
		//Cliente cliente2= new Cliente(); //2º objeto tipo cliente
		
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.idCarro,cliente1.idCliente,carro1.valorDiaria);
		gerarRelatorioLocacao(carro1, LocalDate.now(),LocalDate.now().plusDays(5));
		
		
	}
	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		Locacao locacao= new Locacao();
		
		locacao.idLocacao=1;

		locacao.idCarro=idCarro;
		locacao.idCliente=idCliente;
		locacao.dataInicio= LocalDate.now();
		locacao.dataFim = LocalDate.now().plusDays(2);
		locacao.valorLocado = 2 * 99.90f;		
	}
	
	public static void gerarRelatorioLocacao(Carro carro1, LocalDate ... datas ){
		float totalFaturado = 2 * 99.90f;	
		
		
	}
	
	

}
