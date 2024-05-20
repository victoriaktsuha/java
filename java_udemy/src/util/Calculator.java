package util;

public class Calculator {
	
	//Aqui é acrescentado o 'static' pois os valores dos cálculos não mudam para 'calculadoras' (objetos) diferentes, ou seja, são cálculos estáticos. O valor de PI também é estático.
	
	public static final double PI = 3.14159; // 'final' para constantes, e o padrão de nomes para constante é letra maiúscula
												

	// funções
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}

}
