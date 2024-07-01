package application;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;
import util.Calculator;
import util.CurrencyConverter;

public class Statics {

	//versão 1 de métodos estáticos
	public final static double PI = 3.14159; // 'final' para constantes, e o padrão de nomes para constante é letra maiúscula
	
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
		
		
		/**
		 * Membros Estáticos I
		 * 
		 * Uma classe possui membros, que são os atributos e métodos.
		 * 
		 * Os membros estáticos, também chamados de membros de classe - em oposição a
		 * membros e instância. São membros que fazem sentido independentemente de
		 * objetos. Não precisam de objetos para serem chamados. São chamados a partir
		 * do próprio nome da classe. 
		 * No exemplo dos triângulos, x é uma instância e y é
		 * outra instância e é possível 'chamar' os membros mesmo em instancias
		 * diferentes, ou seja, independente do objeto.
		 * 
		 * Aplicações comuns: 
		 * - classes utilitárias (Math.sqrt()) 
		 * - declaração de
		 * constantes
		 * 
		 * Uma classe que possui somente membros estáticos, pode ser uma classe estática
		 * também. Esta classe não poderá ser instanciada.
		 * 
		 * Problema exemplo 
		 * Fazer um programa para ler um valor numérico qualquer, e daí
		 * mostrar quanto seria o valor de um circunferência e do volume de uma esfera
		 * para um raio daquele valor. Informar também o valor de PI com duas casas
		 * decimais.
		 * 
		 * Exemplo: 
		 * Enter radius: 3.0 
		 * Circumference: 18.84 
		 * Volume: 113.04 
		 * PI value: 3.14
		 * 
		 * Resolução em 3 versões: 
		 * 1: métodos na própria classe do programa - dentro de
		 * um método estático você não pode chamar membros de instância da mesma classe
		 * 2: classe Calculator com membros de instância - principio da delegação - precisa de um objeto (new) para utilizar o membros das classe
		 * 3: classe Calculator com método estático - referencia a classe direto (classe utilitária)
		 */
		
		//versão 2 métodos estáticos
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		//versão 1 métodos estáticos
		double c1 = circumference(radius);
		double v1 = volume(radius);
		
		//versão 2 métodos estáticos
		double c2 = calc.circumference(radius);
		double v2 = calc.volume(radius);
		
		//versão 3 métodos estáticos
		double c3 = Calculator.circumference(radius);
		double v3 = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c1);
		System.out.printf("Volume: %.2f%n", v1);
		
		System.out.printf("Circumference: %.2f%n", c2);
		System.out.printf("Volume: %.2f%n", v2);
		
		System.out.printf("Circumference: %.2f%n", c3);
		System.out.printf("Volume: %.2f%n", v3);
		
		//versão 1 métodos estáticos
		System.out.printf("PI value: %.2f%n", PI);
		
		//versão 2 métodos estáticos
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		//versão 3 métodos estáticos
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		/*
		 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
		 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
		 * sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
		 * responsável pelos cálculos.
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
	

	// métodos versão 1 de métodos estáticos 
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
		// se esgotar o for, o método retorna nulo
		return null;
	}
}
