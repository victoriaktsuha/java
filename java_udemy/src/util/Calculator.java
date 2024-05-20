package util;

public class Calculator {
	
	//Aqui � acrescentado o 'static' pois os valores dos c�lculos n�o mudam para 'calculadoras' (objetos) diferentes, ou seja, s�o c�lculos est�ticos. O valor de PI tamb�m � est�tico.
	
	public static final double PI = 3.14159; // 'final' para constantes, e o padr�o de nomes para constante � letra mai�scula
												

	// fun��es
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}

}
