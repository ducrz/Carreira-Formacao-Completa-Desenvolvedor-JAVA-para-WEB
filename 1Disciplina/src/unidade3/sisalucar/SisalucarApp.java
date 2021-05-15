package unidade3.sisalucar;

public class SisalucarApp {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro(); //1º objeto carro
		carro1.idCarro=1;
		carro1.modelo= "Nivus";
		carro1.placa="XXXX-999";
		carro1.cor="Azul";
		carro1.ano= 2022;
		carro1.valorDiaria= 99.90f;
		carro1.fabricante="Volkswagem";
		
		
		Carro carro2= new Carro(); //2º objeto carro
		
		Cliente cliente1= new Cliente(); //1º objeto cliente
		cliente1.idCliente=1;
		cliente1.cpf="999999999-99";
		cliente1.nome="João Pedro";
		cliente1.cnh="XYZ0001";
		
		Cliente cliente2= new Cliente(); //2º objeto tipo cliente
		
		
	}
	public void realizarLocacao(long idCarro, long idCliente) {
		Locacao locacao= new Locacao();
		
		locacao.idLocacao=1;

		locacao.idCarro=idCarro;
		locacao.idCliente=idCliente;
		
	}

}
