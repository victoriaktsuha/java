package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.ProductGenerics;
import services.CalculationService;

public class Generics {

	public static void main(String[] args) {

		// 239. Introdu��o a Generics

		/*
		 * Generics permitem que classes, interfaces e m�todos possam ser parametrizados
		 * por tipo. Seus benef�cios s�o: - Reuso - Type safety - Performance
		 * 
		 * Uso comum: cole��es
		 */

		/*
		 * Problema motivador 1 (reuso) (https://github.com/acenelio/generics1-java)
		 * 
		 * Deseja-se fazer um programa que leia uma quantidade N, e depois N n�meros
		 * inteiros. Ao final, imprima esses n�meros de forma organizada conforme
		 * exemplo. Em seguida, informar qual foi o primeiro valor informado.
		 * 
		 * Criar um servi�o de impress�o: ------------------------------ Print Service
		 * ------------------------------ ------------------------------ +
		 * addValue(value: int):void + first(): int + print(): void
		 * ------------------------------
		 */

		// PROBLEMA COM SOLU��O 1

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

		// PROBLEMA COM SOLU��O 2

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

		// PROBLEMA COM SOLU��O 3

//		Scanner sc = new Scanner(System.in);
//		//Para Integer
//		//PrintService<Integer> ps = new PrintService<>();
//		//Para String
//		PrintService<String> ps = new PrintService<>();
//		
//		System.out.print("How many values? ");
//		int n = sc.nextInt();	
//		
//		for(int i = 0; i< n; i++) {
//			//Integer value = sc.nextInt();
//			String value = sc.next();
//			ps.addValue(value);
//		}
//		
//		ps.print();
//		//Integer x = ps.first();
//		String x = ps.first();
//		System.out.println("First: " + x);	
//		
//		sc.close();

		// 240. Gen�ricos delimitados (https://github.com/acenelio/generics2-java)

		/*
		 * Uma empresa de consultoria deseja avaliar a performance de produtos,
		 * funcion�rios, dentre outras coisas. Um dos c�lculos que ela precisa �
		 * encontrar o maior dentre um conjunto de elementos. Fazer um programa que leia
		 * um conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
		 * mostre o mais caro deles.
		 * 
		 * Criar um servi�o de c�lculo:
		 * -----------------------------
		 * CalculationService
		 * -----------------------------
		 * -----------------------------
		 * + max<T>(list: List<T>): T
		 * 
		 */
		
		//
		List<ProductGenerics> list = new ArrayList<>();
		
		String path = "C:\\tmp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				//vetor para armazenar conte�do antes e depois da v�rgula, separadamente
				String[] fields = line.split(",");
				//converter string da fields[1] em double
				list.add(new ProductGenerics(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			ProductGenerics x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
