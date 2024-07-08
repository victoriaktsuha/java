package application;

import java.util.Scanner;

import services.PrintService;

public class Generics {

	public static void main(String[] args) {

		/*
		 * Generics permitem que classes, interfaces e m�todos possam ser parametrizados
		 * por tipo. Seus benef�cios s�o: - Reuso - Type safety - Performance
		 * 
		 * Uso comum: cole��es
		 */

		/*
		 * Problema motivador 1 (reuso)
		 * 
		 * Deseja-se fazer um programa que leia uma quantidade N, e depois N n�meros
		 * inteiros. Ao final, imprima esses n�meros de forma organizada conforme
		 * exemplo. Em seguida, informar qual foi o primeiro valor informado.
		 * 
		 * Criar um servi�o de impress�o:
		 * ------------------------------
		 * Print Service
		 * ------------------------------
		 * ------------------------------
		 * + addValue(value: int):void
		 * + first(): int
		 * + print(): void
		 * ------------------------------
		 */
				
		//PROBLEMA COM SOLU��O 1
		
//		Scanner sc = new Scanner(System.in);
//		PrintService ps = new PrintService();
//		
//		System.out.print("How many values? ");
//		int n = sc.nextInt();
//		
//		for(int i = 0; i< n; i++) {
//			int value = sc.nextInt();
//			ps.addValue(value);
//		}
//		
//		ps.print();
//		System.out.println("First: " + ps.first());
//		
//		sc.close();
		
		//PROBLEMA COM SOLU��O 2
		
//		Scanner sc = new Scanner(System.in);
//		PrintService ps = new PrintService();
//		
//		System.out.print("How many values? ");
//		int n = sc.nextInt();
//		
//		ps.addValue("Maria");
//		
//		for(int i = 0; i< n; i++) {
//			Integer value = sc.nextInt();
//			ps.addValue(value);
//		}
//		
//		ps.print();
//		Integer x = (Integer)ps.first();
//		System.out.println("First: " + x);	
//		
//		sc.close();
		
		//PROBLEMA COM SOLU��O 3 
		
		Scanner sc = new Scanner(System.in);
		//Para Integer
		//PrintService<Integer> ps = new PrintService<>();
		//Para String
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();	
		
		for(int i = 0; i< n; i++) {
			//Integer value = sc.nextInt();
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		//Integer x = ps.first();
		String x = ps.first();
		System.out.println("First: " + x);	
		
		sc.close();

	}

}
