package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.ProductGenerics;
import services.CalculationService;

public class Generics {

	public static void main(String[] args) {
		/* START MAIN() */

		// 239. Introdução a Generics

		/*
		 * Generics permitem que classes, interfaces e métodos possam ser parametrizados
		 * por tipo. Seus benefícios são: - Reuso - Type safety - Performance
		 * 
		 * Uso comum: coleções
		 */

		/*
		 * Problema motivador 1 (reuso) (https://github.com/acenelio/generics1-java)
		 * 
		 * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
		 * inteiros. Ao final, imprima esses números de forma organizada conforme
		 * exemplo. Em seguida, informar qual foi o primeiro valor informado.
		 * 
		 * Criar um serviço de impressão: ------------------------------ Print Service
		 * ------------------------------ ------------------------------ +
		 * addValue(value: int):void + first(): int + print(): void
		 * ------------------------------
		 */

		// PROBLEMA COM SOLUÇÃO 1

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

		// PROBLEMA COM SOLUÇÃO 2

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

		// PROBLEMA COM SOLUÇÃO 3

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

		// 240. Genéricos delimitados (https://github.com/acenelio/generics2-java)

		/*
		 * Uma empresa de consultoria deseja avaliar a performance de produtos,
		 * funcionários, dentre outras coisas. Um dos cálculos que ela precisa é
		 * encontrar o maior dentre um conjunto de elementos. Fazer um programa que leia
		 * um conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
		 * mostre o mais caro deles.
		 * 
		 * Criar um serviço de cálculo: ----------------------------- CalculationService
		 * ----------------------------- ----------------------------- + max<T>(list:
		 * List<T>): T
		 * 
		 */

//		List<ProductGenerics> list = new ArrayList<>();
//		
//		String path = "C:\\tmp\\in.txt";
//		
//		try (BufferedReader br = new BufferedReader(new FileReader(path))){
//			String line = br.readLine();
//			while(line != null) {
//				//vetor para armazenar conteúdo antes e depois da vírgula, separadamente
//				String[] fields = line.split(",");
//				//converter string da fields[1] em double
//				list.add(new ProductGenerics(fields[0], Double.parseDouble(fields[1])));
//				line = br.readLine();
//			}
//			
//			ProductGenerics x = CalculationService.max(list);
//			System.out.println("Most expensive:");
//			System.out.println(x);
//		}
//		catch(IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}

		// 241. Tipos curinga (wildcard types)

		/*
		 * Generics são invariantes
		 * 
		 * List<Object> não é o supertipo de qualquer tipo de lista:
		 * 
		 * List<Object> myObjs = new ArrayList<Object>(); List<Integer> myNumbers = new
		 * ArrayList<Integer>(); myObjs = myNumbers; // erro de compilação
		 * 
		 * O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
		 * 
		 * List<?> myObjs = new ArrayList<Object>(); List<Integer> myNumbers = new
		 * ArrayList<Integer>(); myObjs = myNumbers;
		 * 
		 */

		// Aqui está correto - integer é um subtipo de object, ocorre aqui upcasting
//		Object obj;
//		Integer x = 10;
//		obj = x;

		// ! integer é um subtipo de object, MAS List<Integer> NÃO É um subtipo de
		// List<Object>
		// Aqui está incorreto, pois lista de integer não é lista de object
//		List<Object> myObjs = new ArrayList<Object>(); 
//		List<Integer> myNumbers = new ArrayList<Integer>(); 
//		myObjs = myNumbers; // erro de compilação - não é possivel fazer um upcasting

		// <?> supertipo de qualquer tipo de lista
//		List<?> myObjs = new ArrayList<Object>();
//		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers;

		/*
		 * Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo":
		 */

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Maria", "Bob");
		printList(myStrs);

		/*
		 * Porém não é possível adicionar dados a uma coleção de tipo curinga:
		 */
		
		List<?> list = new ArrayList<Integer>();
		list.add(3); // erro de compilação
		
		//O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.
	}

	/* END MAIN() */

	// método para aula 241. Tipos curinga - imprime uma lista de qualquer tipo
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
