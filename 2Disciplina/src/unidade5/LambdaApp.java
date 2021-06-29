package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {

	public static void main(String[] args) {
		List<Integer>integers = Arrays.asList(1, 2, 3, 4, 5);
		//Expressão Lambda
		integers.forEach(x->System.out.println(x));
	}

}
