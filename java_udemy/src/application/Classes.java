package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Classes {
	
	public static void main(String[] args) throws ParseException {
	//public static void main(String[] args) throws ParseException {
		
		/* quando "throws ParseException" não é acrescentado ao método principal, estamos
		 * informando ao programa que esse método não lança nenhuma exceção/erro. Mas se 
		 * utilizarmos uma chamada dentro de Main que pode lançar uma exceção, como é o 
		 * caso do .parse(), o compilador vai indicar erro para que essa exceção seja 
		 * tratada ou propagada("jogada" para outro metodo resolver) no método que ela se encontra. Acrescentando esse termo, 
		 * indicdos que essa exceção não precisa ser tratada pelo método que ela está 
		 * inserida.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		// Criando uma classe com 3 atributos para representar melhor o triângulo
		
		/*
		 * Triângulo é uma entidade com 3 atributos: a, b e c. Estamos usando 3 varáveis
		 * distintas para representar cada triângulo: double xA, xB, xC, yA, yB, yC;
		 * Para melhorar isso, vamos usar uma classe para representar um triângulo.
		 * 
		 * Classe: É um tipo estruturado que pode conter (membros): 
		 * - Atributos (dados/campos) 
		 * - Métodos (funções/operações)
		 * 
		 * A classe também pode prover muitos outros recursos, tais como: 
		 * - Construtores
		 * - Sobrecarga 
		 * - Encapsulamento 
		 * - Herança 
		 * - Polimorfismo
		 * 
		 * Exemplos: 
		 * - Entidades: Produto, Cliente, Triangulo 
		 * - Serviços: ProdutoService, ClienteService, EmailService, StorageService 
		 * - Controladores: ProdutoController, ClienteController 
		 * - Utilitários: Calculadora, Compactador
		 * 
		 * Portanto, criaremos uma classe pública chamada 'Triangle' que conterá 3
		 * atributos também públicos de tipo double
		 * 
		 * package entities; 
		 * public class Triangle{ 
		 * 		public double a; 
		 * 		public double b;
		 * 		public double c; 
		 * }
		 * 
		 * Quando a variável é do tipo classe, temos que instanciar a variável.
		 * Então poderemos instanciar a classe para criar os objetos de x e y:
		 * 
		 * Triangle x, y; 
		 * x = new Triangle(); 
		 * y = new Triangle();
		 * 
		 * X e Y então poderão conter os 3 atributos correspondentes as 3 medidas
		 */
		
		//Resolução com classe Triangle
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		//Para acessar e armazenar os valores nos atributos do objeto x:
		System.out.println("Digite as medidas do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		//Para acessar e armazenar os valores nos atributos do objeto y:
		System.out.println("Digite as medidas do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		

	}
}
