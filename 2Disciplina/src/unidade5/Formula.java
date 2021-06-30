package unidade5;
@FunctionalInterface
public interface Formula {
	double calcular();
	default double sqrt(int a) {
	return Math.sqrt(a);
	}

}
