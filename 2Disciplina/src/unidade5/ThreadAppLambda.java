package unidade5;

public class ThreadAppLambda {
public static void main(String[] args) {
//criação de um Lambda
Runnable r = () ->{
	for (int i = 0; i <= 1000; i++)
	System.out.println(i);
	};
	//criando uma Thread passando como argumento um Lambda
	new Thread(r).start(); }
}