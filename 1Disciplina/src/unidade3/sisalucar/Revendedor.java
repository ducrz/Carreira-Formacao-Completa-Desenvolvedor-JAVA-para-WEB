package unidade3.sisalucar;

public enum Revendedor {

	ABCVEICULOS("000000/0000","Rua do ABC, 1500", "Volkswagem"), 
	SIMAOVEICULOS("000000/0000","Avenida Simao, 1000","Fiat"),
	EMANUELVEICULOS("000000/0000","Avenida Belém, 2412","Renault");
	
	String cnpj;
	String endereco;
	String fabricante;
	private Revendedor(String cnpj, String endereco, String fabricante) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.fabricante = fabricante;
	}
	
	
}
