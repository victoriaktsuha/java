package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Classes {
	
	public static void main(String[] args) throws ParseException {
	//public static void main(String[] args) throws ParseException {
		
		/* quando "throws ParseException" n�o � acrescentado ao m�todo principal, estamos
		 * informando ao programa que esse m�todo n�o lan�a nenhuma exce��o/erro. Mas se 
		 * utilizarmos uma chamada dentro de Main que pode lan�ar uma exce��o, como � o 
		 * caso do .parse(), o compilador vai indicar erro para que essa exce��o seja 
		 * tratada ou propagada("jogada" para outro metodo resolver) no m�todo que ela se encontra. Acrescentando esse termo, 
		 * indicdos que essa exce��o n�o precisa ser tratada pelo m�todo que ela est� 
		 * inserida.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		// Criando uma classe com 3 atributos para representar melhor o tri�ngulo
		
		/*
		 * Tri�ngulo � uma entidade com 3 atributos: a, b e c. Estamos usando 3 var�veis
		 * distintas para representar cada tri�ngulo: double xA, xB, xC, yA, yB, yC;
		 * Para melhorar isso, vamos usar uma classe para representar um tri�ngulo.
		 * 
		 * Classe: � um tipo estruturado que pode conter (membros): 
		 * - Atributos (dados/campos) 
		 * - M�todos (fun��es/opera��es)
		 * 
		 * A classe tamb�m pode prover muitos outros recursos, tais como: 
		 * - Construtores
		 * - Sobrecarga 
		 * - Encapsulamento 
		 * - Heran�a 
		 * - Polimorfismo
		 * 
		 * Exemplos: 
		 * - Entidades: Produto, Cliente, Triangulo 
		 * - Servi�os: ProdutoService, ClienteService, EmailService, StorageService 
		 * - Controladores: ProdutoController, ClienteController 
		 * - Utilit�rios: Calculadora, Compactador
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
		

	}
}
