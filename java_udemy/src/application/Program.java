package application;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Resolvendo problemas sem orienta��o a objetos

		/*
		 * Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y
		 * (suponha medidas v�lidas). Em seguida, mostrar o valor das �reas dos dois
		 * tri�ngulos e dizer qual dos dois tri�ngulos possui a maior �rea. A f�rmula
		 * para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b
		 * e c � a seguinte (f�rmula de Heron): area = raiz quadrada de
		 * p(p-a)(p-b)(p-c), onde p=(a+b+c)/2
		 */
		
//		double xA, xB, xC, yA, yB, yC;
//		
//		System.out.println("Digite as medidas do tri�ngulo X:");
//		xA = sc.nextDouble();
//		xB = sc.nextDouble();
//		xC = sc.nextDouble();
//		
//		System.out.println("Digite as medidas do tri�ngulo Y:");
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
//		System.out.printf("�rea do tri�ngulo X: %.4f%n", areaX);
//		
//		System.out.printf("�rea do tri�ngulo Y: %.4f%n", areaY);
//		
//		if(areaX > areaY) {
//			System.out.println("Maior �rea: X");
//		}else {
//			System.out.println("Maior �rea: Y");
//		}
		
		// Criando uma classe com 3 atributos para representar melhor o tri�ngulo
		
		/*
		 * Tri�ngulo � uma entidade com 3 atributos: a, b e c. Estamos usando 3 var�veis
		 * distintas para representar cada tri�ngulo: double xA, xB, xC, yA, yB, yC;
		 * Para melhorar isso, vamos usar uma classe para representar um tri�ngulo.
		 * 
		 * Classe: � um tipo estruturado que pode conter (membros): - Atributos
		 * (dados/campos) - M�todos (fun��es/opera��es)
		 * 
		 * A classe tamb�m pode prover muitos outros recursos, tais como: - Construtores
		 * - Sobrecarga - Encapsulamento - Heran�a - Polimorfismo
		 * 
		 * Exemplos: - Entidades: Produto, Cliente, Triangulo - Servi�os:
		 * ProdutoService, ClienteService, EmailService, StorageService - Controladores:
		 * ProdutoController, ClienteController - Utilit�rios: Calculadora, Compactador
		 * 
		 * Portanto, criaremos uma classe p�blica chamada 'Triangle' que conter� 3
		 * atributos tamb�m p�blicos de tipo double
		 * 
		 * package entities; 
		 * public class Triangle{ 
		 * 		public double a; 
		 * 		public double b;
		 * 		public double c; 
		 * }
		 * 
		 * Quando a vari�vel � do tipo classe, temos que instanciar a vari�vel.
		 * Ent�o poderemos instanciar a classe para criar os objetos de x e y:
		 * 
		 * Triangle x, y; 
		 * x = new Triangle(); 
		 * y = new Triangle();
		 * 
		 * X e Y ent�o poder�o conter os 3 atributos correspondentes as 3 medidas
		 */
		
		//Resolu��o com classe Triangle
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		//Para acessar e armazenar os valores nos atributos do objeto x:
		System.out.println("Digite as medidas do tri�ngulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		//Para acessar e armazenar os valores nos atributos do objeto y:
		System.out.println("Digite as medidas do tri�ngulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("�rea do tri�ngulo X: %.4f%n", areaX);
		
		System.out.printf("�rea do tri�ngulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior �rea: X");
		}else {
			System.out.println("Maior �rea: Y");
		}
		
		//classe � a defini��o do tipo e objeto � a instancia��o da classe
		
		/*
		
		-- Instancia��o --
		
		Exemplo:
		double areaX, areaY, p;
		Triangle x, y;
		
		- Mem�ria
			> Stack - onde as vari�veis est�ticas como areaX, areaY e p s�o criadas.
			Durante a executa��o do programa, podemos fazer uma aloca��o din�mica de mem�ria atrav�s do 'new' 
			utilizado para instanciar um objeto, que ser� armazenado no Heap		
			> Heap - aqui s�o criados objetos din�micos atrav�s da aloca��o din�mica de mem�ria feita atrav�s do 'new'.
			As vari�veis x e y, mesmo que objetos no heap, tamb�m estar�o no Stack, mas armazenando um endere�o de 
			mem�ria do objeto criado no Heap
		 
		 */
		
		sc.close();
		
	}

}
