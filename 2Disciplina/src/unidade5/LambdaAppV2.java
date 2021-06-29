package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaAppV2 {

	public static void main(String[] args) {
		List<Integer>integers = Arrays.asList(1, 2, 3, 4, 5);
		
		
		integers.forEach(x->System.out.println(x));
		
		integers.forEach(x ->{
			int var=1;

			var++;
			System.out.println(x);
			
		});
	}

}
