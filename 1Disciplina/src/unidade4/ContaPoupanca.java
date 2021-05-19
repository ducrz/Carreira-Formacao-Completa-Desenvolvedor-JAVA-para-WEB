package unidade4;

public class ContaPoupanca extends Conta {
	
	public void atualiza(double taxa) {
		saldo = saldo + saldo*(taxa*3);
		
	}

}
