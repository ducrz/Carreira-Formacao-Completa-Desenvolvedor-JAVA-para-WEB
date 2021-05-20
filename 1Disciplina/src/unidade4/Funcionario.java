/* SUPERCLASSE */
package unidade4;

public abstract class Funcionario {
	
	
	
	public static void verificarTipoFuncionario(Funcionario objeto) {
		if(objeto instanceof Diretor) {
			System.out.println("Diretor.");
		}else if(objeto instanceof Professor){
			System.out.println("Professor.");
		}
		else{
			System.out.println("Administrativo.");
		}
	}
	public abstract void getBonificacao();
	
	public static void main(String[] args) {
		
		Funcionario objeto;

		
		objeto = new Diretor();
		
		((Diretor)objeto).departamento = "RH"; //Exemplo de Casting
		
		verificarTipoFuncionario(objeto);
		
		Professor prof = new Professor();
		
		Autenticavel aut = prof; //Interface recebendo referencia de objeto
		
		Cidadao cidadao = prof;
		
		Contribuinte contribuinte = prof;
		
		
	}
}
