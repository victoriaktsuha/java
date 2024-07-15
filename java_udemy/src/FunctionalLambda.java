import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.ProductFunctionalLambda;
import util.ProductPredicate;

public class FunctionalLambda {
		
	public static int globalValue = 3; //254. Programa��o funcional e c�lculo lambda
	
	/*START MAIN*/
	public static void main(String[] args) {

		// 253. Uma experi�ncia com Comparator

		/*
		 * � Suponha uma classe Product com os atributos name e price. � Podemos
		 * implementar a compara��o de produtos por meio da implementa��o da interface
		 * Comparable<Product> � Entretanto, desta forma nossa classe n�o fica fechada
		 * para altera��o: se o crit�rio de compara��o mudar, precisaremos alterar a
		 * classe Product. � Podemos ent�o usar o default method "sort" da interface
		 * List: default void sort(Comparator<? super E> c)
		 * 
		 */

		// Tipo com implementa��o de comparable

//		List<ProductFunctionalLambda> list = new ArrayList<>();
//		
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Notebook", 1200.00));
//		list.add(new ProductFunctionalLambda("Tablet", 450.00));
//		
//		Collection.sort(list);
//		
//		for(ProductFunctionalLambda p : list) {
//			System.out.println(p);
//		}

		// Comparator como classe separada

//		List<ProductFunctionalLambda> list = new ArrayList<>();
//		
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Notebook", 1200.00));
//		list.add(new ProductFunctionalLambda("Tablet", 450.00));
//		
//		//interface funcional -  tem apenas um m�todo abstrato
//		list.sort(new MyComparator());
//		
//		for(ProductFunctionalLambda p : list) {
//			System.out.println(p);
//		}

		// Comparator objeto de classe anonima, ao inv�s de usar a classe MyComparator

//		List<ProductFunctionalLambda> list = new ArrayList<>();
//
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Notebook", 1200.00));
//		list.add(new ProductFunctionalLambda("Tablet", 450.00));
//
//		Comparator<ProductFunctionalLambda> comp = new Comparator<ProductFunctionalLambda>() {
//
//			@Override
//			public int compare(ProductFunctionalLambda p1, ProductFunctionalLambda p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};
//		
//		list.sort(comp);
//
//		for (ProductFunctionalLambda p : list) {
//			System.out.println(p);
//		}

		// Comparator com express�o lambda (fun��o an�nima) com chaves

//		List<ProductFunctionalLambda> list = new ArrayList<>();
//
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Notebook", 1200.00));
//		list.add(new ProductFunctionalLambda("Tablet", 450.00));
//		
//		//arrow function
//		Comparator<ProductFunctionalLambda> comp = (p1, p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		};
//
//		list.sort(comp);
//
//		for (ProductFunctionalLambda p : list) {
//			System.out.println(p);
//		}

		// Comparator com express�o lambda (fun��o an�nima) sem chaves

//		List<ProductFunctionalLambda> list = new ArrayList<>();
//
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Notebook", 1200.00));
//		list.add(new ProductFunctionalLambda("Tablet", 450.00));
//
//		Comparator<ProductFunctionalLambda> comp = (p1, p2) -> p1.getName().toUpperCase()
//				.compareTo(p2.getName().toUpperCase());
//
//		list.sort(comp);
//
//		for (ProductFunctionalLambda p : list) {
//			System.out.println(p);
//		}

		// Comparator com express�o lambda direto como argumento

//		List<ProductFunctionalLambda> list = new ArrayList<>();
//
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Notebook", 1200.00));
//		list.add(new ProductFunctionalLambda("Tablet", 450.00));
//
//		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
//
//		for (ProductFunctionalLambda p : list) {
//			System.out.println(p);
//		}

		// 254. Programa��o funcional e c�lculo lambda

		/* Paradigmas de programa��o:
		 * � Imperativo (C, Pascal, Fortran, Cobol) 
		 * � Orientado a objetos (C++, Object, Pascal, Java (< 8), C# (< 3)) 
		 * � Funcional (Haskell, Closure, Clean, Erlang) 
		 * � L�gico (Prolog) 
		 * � Multiparadigma (JavaScript, Java (8+), C# (3+), Ruby, Python, Go)
		 * 
		 */
		
		/* Paradigma funcional de programa��o
		 * Baseado no formalismo matem�tico C�lculo Lambda (Church 1930)
		 * Programa��o Imperativa x Programa��o Funcional (quadro comparativo no PDF)
		 */
		
//		int[] vect = new int[] {3, 4, 5};
//		changeOddValues(vect);
//		System.out.println(Arrays.toString(vect));
		
		//Passar uma fun��o como argumento de outra fun��o - onde a fun��o seria objeto de primeira classe
		
		//C�lculo lambda = formalismo matem�tico base da programa��o funcional
		//Express�o lambda = fun��o an�nima de primeira classe
		
		
		//255. Interface funcional
		
		/* � uma interface que possui um �nico m�todo abstrato.
		 * Suas implementa��es ser�o tratadas como express�es lambda
		 * 
		 * Algumas interfaces mais comuns:
		 * - Predicate
		 * - Function
		 * - Consumer - ao contr�rio das demais interfaces funcionais, no caso do Consumer, �
		 * esperado que ele possa gerar efeitos colaterais
		 */
		
		
		//256. Predicate (exemplo com removeIf) (https://github.com/acenelio/lambda2-java)
		
		/* Fazer um programa que, a partir de uma lista de produtos, remova da lista somente 
		 * aqueles cujo pre�o m�nimo seja 100.
		 * 
		 */
		
		//implementa��o da interface
		
//		List<ProductFunctionalLambda> list = new ArrayList<>();
//
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Mouse", 50.00));
//		list.add(new ProductFunctionalLambda("Tablet", 350.50));
//		list.add(new ProductFunctionalLambda("HD Case", 80.90));
//		
//		//express�o lambda = predicado
//		//list.removeIf(p -> p.getPrice() >= 100);
//		
//		//com interface funcional implementada na classe ProductPredicate
//		list.removeIf(new ProductPredicate());
//		
//		for(ProductFunctionalLambda p : list) {
//			System.out.println(p);
//		}
		
		
		//reference method com m�todo est�tico
		
		List<ProductFunctionalLambda> list = new ArrayList<>();

		list.add(new ProductFunctionalLambda("TV", 900.00));
		list.add(new ProductFunctionalLambda("Mouse", 50.00));
		list.add(new ProductFunctionalLambda("Tablet", 350.50));
		list.add(new ProductFunctionalLambda("HD Case", 80.90));
		
		//express�o lambda = predicado
		//list.removeIf(p -> p.getPrice() >= 100);
		
		//com interface funcional implementada na classe ProductPredicate
//		list.removeIf(new ProductPredicate());
		
		//reference method com m�todo est�tico		
//		list.removeIf(ProductFunctionalLambda::staticProductPredicate);
		
		//reference method com m�todo n�o est�tico
//		list.removeIf(ProductFunctionalLambda::nonStaticProductPredicate);
		
		//express�o lambda declarada
//		Predicate<ProductFunctionalLambda> pred = p -> p.getPrice() >= 100.0;		
//		list.removeIf(pred);
		
		//express�o lambda inline e n�o declarada
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		
		for(ProductFunctionalLambda p : list) {
			System.out.println(p);
		}
				
	}
	
	
	/*END MAIN*/
	
	//fun��o para aula 254. Programa��o funcional e c�lculo lambda
	//essa fun��o n�o tem TRANSPAR�NCIA REFERENCIAL pois ela est� dependendo de um valor externo
//	public static void changeOddValues(int[] numbers) {
//		for(int i = 0; i < numbers.length; i++) {
//			if(numbers[i] % 2 != 0) {
//				numbers[i] += globalValue;
//			}
//		}
//	}

}
