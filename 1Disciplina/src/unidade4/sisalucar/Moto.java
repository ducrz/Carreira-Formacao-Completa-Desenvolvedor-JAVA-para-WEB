package unidade4.sisalucar;

public class Moto extends Veiculo {

		public int getPassageiro() { //Anulação
			return 1;
		}
		
		public void acelera(int limiteVelocidade) { //Sobrecarga
			System.out.println("Obedeça os Limite de Velocidade "+limiteVelocidade);
			
		}
}
