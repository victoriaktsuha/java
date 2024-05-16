package application;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Resolvendo problemas sem orientação a objetos

		/*
		 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
		 * (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois
		 * triângulos e dizer qual dos dois triângulos possui a maior área. A fórmula
		 * para calcular a área de um triângulo a partir das medidas de seus lados a, b
		 * e c é a seguinte (fórmula de Heron): area = raiz quadrada de
		 * p(p-a)(p-b)(p-c), onde p=(a+b+c)/2
		 */
		
//		double xA, xB, xC, yA, yB, yC;
//		
//		System.out.println("Digite as medidas do triângulo X:");
//		xA = sc.nextDouble();
//		xB = sc.nextDouble();
//		xC = sc.nextDouble();
//		
//		System.out.println("Digite as medidas do triângulo Y:");
//		yA = sc.nextDouble();
//		yB = sc.nextDouble();
//		yC = sc.nextDouble();
//		
//		double p = (xA + xB + xC) / 2.0;
//		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
//		
//		p = (yA + yB + yC) / 2.0;
//		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
//		
//		System.out.printf("Área do triângulo X: %.4f%n", areaX);
//		
//		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
//		
//		if(areaX > areaY) {
//			System.out.println("Maior área: X");
//		}else {
//			System.out.println("Maior área: Y");
//		}
		
		// Criando uma classe com 3 atributos para representar melhor o triângulo
		
		/*
		 * Triângulo é uma entidade com 3 atributos: a, b e c. Estamos usando 3 varáveis
		 * distintas para representar cada triângulo: double xA, xB, xC, yA, yB, yC;
		 * Para melhorar isso, vamos usar uma classe para representar um triângulo.
		 * 
		 * Classe: É um tipo estruturado que pode conter (membros): - Atributos
		 * (dados/campos) - Métodos (funções/operações)
		 * 
		 * A classe também pode prover muitos outros recursos, tais como: - Construtores
		 * - Sobrecarga - Encapsulamento - Herança - Polimorfismo
		 * 
		 * Exemplos: - Entidades: Produto, Cliente, Triangulo - Serviços:
		 * ProdutoService, ClienteService, EmailService, StorageService - Controladores:
		 * ProdutoController, ClienteController - Utilitários: Calculadora, Compactador
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
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior área: X");
		}else {
			System.out.println("Maior área: Y");
		}
		
		//classe é a definição do tipo e objeto é a instanciação da classe
		
		/*
		
		-- Instanciação --
		
		Exemplo:
		double areaX, areaY, p;
		Triangle x, y;
		
		- Memória
			> Stack - onde as variáveis estáticas como areaX, areaY e p são criadas.
			Durante a executação do programa, podemos fazer uma alocação dinâmica de memória através do 'new' 
			utilizado para instanciar um objeto, que será armazenado no Heap		
			> Heap - aqui são criados objetos dinâmicos através da alocação dinâmica de memória feita através do 'new'.
			As variáveis x e y, mesmo que objetos no heap, também estarão no Stack, mas armazenando um endereço de 
			memória do objeto criado no Heap
		 
		 */
		
		sc.close();
		
	}

}
