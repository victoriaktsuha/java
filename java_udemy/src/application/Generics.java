package application;

import java.util.Scanner;

import services.PrintService;

public class Generics {

	public static void main(String[] args) {

		/*
		 * Generics permitem que classes, interfaces e métodos possam ser parametrizados
		 * por tipo. Seus benefícios são: - Reuso - Type safety - Performance
		 * 
		 * Uso comum: coleções
		 */

		/*
		 * Problema motivador 1 (reuso)
		 * 
		 * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
		 * inteiros. Ao final, imprima esses números de forma organizada conforme
		 * exemplo. Em seguida, informar qual foi o primeiro valor informado.
		 * 
		 * Criar um serviço de impressão:
		 * ------------------------------
		 * Print Service
		 * ------------------------------
		 * ------------------------------
		 * + addValue(value: int):void
		 * + first(): int
		 * + print(): void
		 * ------------------------------
		 */
				
		//PROBLEMA COM SOLUÇÃO 1
		
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
		
		//PROBLEMA COM SOLUÇÃO 2
		
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
		
		//PROBLEMA COM SOLUÇÃO 3 
		
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
