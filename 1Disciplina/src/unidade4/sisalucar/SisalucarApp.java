package unidade4.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros=0;

	public static void main(String[] args) {
		
		Carro carro1 = new Carro(); //1º objeto carro
		carro1.setIdCarro(1);
		carro1.setModelo("Nivus");
		carro1.setPlaca("XXXX-999");
		carro1.setCor("Azul");
		carro1.setAno(2022);
		carro1.setValorDiaria(99.90f);
		carro1.setFabricante("Volkswagem");
		
		SisalucarApp.totalCarros = SisalucarApp.totalCarros +1;		
		
		Carro carro2= new Carro(); //2º objeto carro
		
		Cliente cliente1= new Cliente(); //1º objeto cliente
		cliente1.setIdCliente(1);
		cliente1.setCpf("999999999-99");
		cliente1.setNome("João Pedro");
		cliente1.setCnh("XYZ0001");
		
		//Cliente cliente2= new Cliente(); //2º objeto tipo cliente
		
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.getIdCarro(),cliente1.getIdCliente(),carro1.getValorDiaria());
		gerarRelatorioLocacao(carro1, LocalDate.now(),LocalDate.now().plusDays(5));
		
		
	}
	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		Locacao locacao= new Locacao();
		
		locacao.setIdLocacao(1);

		locacao.setIdCarro(idCarro);
		locacao.setIdCliente(idCliente);
		locacao.setDataInicio(LocalDate.now());
		locacao.setDataFim(LocalDate.now().plusDays(2));
		locacao.setValorLocado(2 * 99.90f);		
	}
	
	public static void gerarRelatorioLocacao(Carro carro1, LocalDate ... datas ){
		float totalFaturado = 2 * 99.90f;	
		
		
	}
	
	

}
