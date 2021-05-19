package unidade4.sisalucar;

public class Onibus extends Veiculo {
	
	public int getPassageiro() { //Anulação
		return 45;
	}
	
	public void acelera(int limiteVelocidade) { //Sobrecarga
		System.out.println("Obedeça os Limite de Velocidade "+limiteVelocidade);
		
	}

}
