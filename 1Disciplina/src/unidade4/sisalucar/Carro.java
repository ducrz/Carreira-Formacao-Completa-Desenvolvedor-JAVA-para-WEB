package unidade4.sisalucar;


public class Carro extends Veiculo {

	private long idCarro;
	private String placa;
	private String fabricante;
	private String modelo;
	private int ano;
	private String cor;
	private float valorDiaria;
	private Revendedor revendedor;
	
	
	
	public long getIdCarro() { //METODO GET
		return idCarro;
	}
	public void setIdCarro(long idCarro) { //METODO SET
		this.idCarro = idCarro;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public Revendedor getRevendedor() {
		return revendedor;
	}
	public void setRevendedor(Revendedor revendedor) {
		this.revendedor = revendedor;
	}
	public Carro(long idCarro, String placa, String fabricante, 
			String modelo, int ano, String cor, float valorDiaria, Revendedor revendedor) {
		super(); //chama o construtor da superclasse
		this.idCarro = idCarro;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
		this.revendedor= revendedor;
	}
	
	public Carro() { //Construtor Vazio
		
	}
	
	public int getPassageiro() { //Anulação
		return 4;
	}
	
	public void acelera(int limiteVelocidade) { //Sobrecarga
		System.out.println("Obedeça os Limite de Velocidade "+limiteVelocidade);
		
	}
	public void abastecer(int quantidadeLitros){
		System.out.println("Para abastecer o carro é necessário "+quantidadeLitros+" litros.");
		
		
	}
	public static void main(String[] args) {
		Carro carro1 = new Carro(1, "ABC-2001","Volkswagem","Virtus", 2021, "Azul", 99.90f,Revendedor.ABCVEICULOS);
		Carro carro2= new Carro(); //Construtor Vazio
		
		carro1.acelera();
		carro1.freia();
		carro1.getPassageiro();
		carro1.getVelocidade();
		carro1.autonomia = 40;
	}
	
}
