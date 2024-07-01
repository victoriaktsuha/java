package application;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;
import util.Calculator;
import util.CurrencyConverter;

public class Statics {

	//vers�o 1 de m�todos est�ticos
	public final static double PI = 3.14159; // 'final' para constantes, e o padr�o de nomes para constante � letra mai�scula
	
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
		
		
		/**
		 * Membros Est�ticos I
		 * 
		 * Uma classe possui membros, que s�o os atributos e m�todos.
		 * 
		 * Os membros est�ticos, tamb�m chamados de membros de classe - em oposi��o a
		 * membros e inst�ncia. S�o membros que fazem sentido independentemente de
		 * objetos. N�o precisam de objetos para serem chamados. S�o chamados a partir
		 * do pr�prio nome da classe. 
		 * No exemplo dos tri�ngulos, x � uma inst�ncia e y �
		 * outra inst�ncia e � poss�vel 'chamar' os membros mesmo em instancias
		 * diferentes, ou seja, independente do objeto.
		 * 
		 * Aplica��es comuns: 
		 * - classes utilit�rias (Math.sqrt()) 
		 * - declara��o de
		 * constantes
		 * 
		 * Uma classe que possui somente membros est�ticos, pode ser uma classe est�tica
		 * tamb�m. Esta classe n�o poder� ser instanciada.
		 * 
		 * Problema exemplo 
		 * Fazer um programa para ler um valor num�rico qualquer, e da�
		 * mostrar quanto seria o valor de um circunfer�ncia e do volume de uma esfera
		 * para um raio daquele valor. Informar tamb�m o valor de PI com duas casas
		 * decimais.
		 * 
		 * Exemplo: 
		 * Enter radius: 3.0 
		 * Circumference: 18.84 
		 * Volume: 113.04 
		 * PI value: 3.14
		 * 
		 * Resolu��o em 3 vers�es: 
		 * 1: m�todos na pr�pria classe do programa - dentro de
		 * um m�todo est�tico voc� n�o pode chamar membros de inst�ncia da mesma classe
		 * 2: classe Calculator com membros de inst�ncia - principio da delega��o - precisa de um objeto (new) para utilizar o membros das classe
		 * 3: classe Calculator com m�todo est�tico - referencia a classe direto (classe utilit�ria)
		 */
		
		//vers�o 2 m�todos est�ticos
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		//vers�o 1 m�todos est�ticos
		double c1 = circumference(radius);
		double v1 = volume(radius);
		
		//vers�o 2 m�todos est�ticos
		double c2 = calc.circumference(radius);
		double v2 = calc.volume(radius);
		
		//vers�o 3 m�todos est�ticos
		double c3 = Calculator.circumference(radius);
		double v3 = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c1);
		System.out.printf("Volume: %.2f%n", v1);
		
		System.out.printf("Circumference: %.2f%n", c2);
		System.out.printf("Volume: %.2f%n", v2);
		
		System.out.printf("Circumference: %.2f%n", c3);
		System.out.printf("Volume: %.2f%n", v3);
		
		//vers�o 1 m�todos est�ticos
		System.out.printf("PI value: %.2f%n", PI);
		
		//vers�o 2 m�todos est�ticos
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		//vers�o 3 m�todos est�ticos
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		/*
		 * Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a
		 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 * pagar pelos d�lares, considerando ainda que a pessoa ter� que pagar 6% de IOF
		 * sobre o valor em d�lar. Criar uma classe CurrencyConverter para ser
		 * respons�vel pelos c�lculos.
		 * 
		 * Exemplo: 
		 * What is the dollar price ? 3.10 
		 * How many dollars will be bought ? 200.00 
		 * Amount to be paid in reais = 657.20
		 */
		
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();		
		System.out.print("How many dollars will be bought? ");
		double dollarAmount = sc.nextDouble();
		double convertion = CurrencyConverter.convertion(dollarPrice, dollarAmount);
		System.out.printf("Amount to be paid in reais = ", convertion);
		
		

	}
	

	// m�todos vers�o 1 de m�todos est�ticos 
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}

	public static Integer position(List<EmployeeList> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		// se esgotar o for, o m�todo retorna nulo
		return null;
	}
}
