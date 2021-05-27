package unidade3;

public class NotaAluno {
	
	double valor;
	
	//Construtor Generico
	<T extends Number>NotaAluno(T obj){
		valor = obj.doubleValue();
	}
	
	//Metodo Generico
	<T extends Number>double retornarValor(T obj) {
		return obj.doubleValue();
	}

}
