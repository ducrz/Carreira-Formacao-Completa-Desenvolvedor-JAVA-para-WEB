package unidade4;

public class ContaCorrente extends Conta {
	
	public void atualiza(double taxa) {
		saldo = saldo + saldo*(taxa*2);
		
	}
}
