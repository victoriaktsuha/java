import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.ProductFunctionalLambda;
import util.ProductPredicate;

public class FunctionalLambda {
		
	public static int globalValue = 3; //254. Programação funcional e cálculo lambda
	
	/*START MAIN*/
	public static void main(String[] args) {

		// 253. Uma experiência com Comparator

		/*
		 * • Suponha uma classe Product com os atributos name e price. • Podemos
		 * implementar a comparação de produtos por meio da implementação da interface
		 * Comparable<Product> • Entretanto, desta forma nossa classe não fica fechada
		 * para alteração: se o critério de comparação mudar, precisaremos alterar a
		 * classe Product. • Podemos então usar o default method "sort" da interface
		 * List: default void sort(Comparator<? super E> c)
		 * 
		 */

		// Tipo com implementação de comparable

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
//		//interface funcional -  tem apenas um método abstrato
//		list.sort(new MyComparator());
//		
//		for(ProductFunctionalLambda p : list) {
//			System.out.println(p);
//		}

		// Comparator objeto de classe anonima, ao invés de usar a classe MyComparator

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

		// Comparator com expressão lambda (função anônima) com chaves

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

		// Comparator com expressão lambda (função anônima) sem chaves

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

		// Comparator com expressão lambda direto como argumento

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

		// 254. Programação funcional e cálculo lambda

		/* Paradigmas de programação:
		 * • Imperativo (C, Pascal, Fortran, Cobol) 
		 * • Orientado a objetos (C++, Object, Pascal, Java (< 8), C# (< 3)) 
		 * • Funcional (Haskell, Closure, Clean, Erlang) 
		 * • Lógico (Prolog) 
		 * • Multiparadigma (JavaScript, Java (8+), C# (3+), Ruby, Python, Go)
		 * 
		 */
		
		/* Paradigma funcional de programação
		 * Baseado no formalismo matemático Cálculo Lambda (Church 1930)
		 * Programação Imperativa x Programação Funcional (quadro comparativo no PDF)
		 */
		
//		int[] vect = new int[] {3, 4, 5};
//		changeOddValues(vect);
//		System.out.println(Arrays.toString(vect));
		
		//Passar uma função como argumento de outra função - onde a função seria objeto de primeira classe
		
		//Cálculo lambda = formalismo matemático base da programação funcional
		//Expressão lambda = função anônima de primeira classe
		
		
		//255. Interface funcional
		
		/* É uma interface que possui um único método abstrato.
		 * Suas implementações serão tratadas como expressões lambda
		 * 
		 * Algumas interfaces mais comuns:
		 * - Predicate
		 * - Function
		 * - Consumer - ao contrário das demais interfaces funcionais, no caso do Consumer, é
		 * esperado que ele possa gerar efeitos colaterais
		 */
		
		
		//256. Predicate (exemplo com removeIf) (https://github.com/acenelio/lambda2-java)
		
		/* Fazer um programa que, a partir de uma lista de produtos, remova da lista somente 
		 * aqueles cujo preço mínimo seja 100.
		 * 
		 */
		
		//implementação da interface
		
//		List<ProductFunctionalLambda> list = new ArrayList<>();
//
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Mouse", 50.00));
//		list.add(new ProductFunctionalLambda("Tablet", 350.50));
//		list.add(new ProductFunctionalLambda("HD Case", 80.90));
//		
//		//expressão lambda = predicado
//		//list.removeIf(p -> p.getPrice() >= 100);
//		
//		//com interface funcional implementada na classe ProductPredicate
//		list.removeIf(new ProductPredicate());
//		
//		for(ProductFunctionalLambda p : list) {
//			System.out.println(p);
//		}
		
		
		//reference method com método estático
		
		List<ProductFunctionalLambda> list = new ArrayList<>();

		list.add(new ProductFunctionalLambda("TV", 900.00));
		list.add(new ProductFunctionalLambda("Mouse", 50.00));
		list.add(new ProductFunctionalLambda("Tablet", 350.50));
		list.add(new ProductFunctionalLambda("HD Case", 80.90));
		
		//expressão lambda = predicado
		//list.removeIf(p -> p.getPrice() >= 100);
		
		//com interface funcional implementada na classe ProductPredicate
//		list.removeIf(new ProductPredicate());
		
		//reference method com método estático		
//		list.removeIf(ProductFunctionalLambda::staticProductPredicate);
		
		//reference method com método não estático
//		list.removeIf(ProductFunctionalLambda::nonStaticProductPredicate);
		
		//expressão lambda declarada
//		Predicate<ProductFunctionalLambda> pred = p -> p.getPrice() >= 100.0;		
//		list.removeIf(pred);
		
		//expressão lambda inline e não declarada
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		
		for(ProductFunctionalLambda p : list) {
			System.out.println(p);
		}
				
	}
	
	
	/*END MAIN*/
	
	//função para aula 254. Programação funcional e cálculo lambda
	//essa função não tem TRANSPARÊNCIA REFERENCIAL pois ela está dependendo de um valor externo
//	public static void changeOddValues(int[] numbers) {
//		for(int i = 0; i < numbers.length; i++) {
//			if(numbers[i] % 2 != 0) {
//				numbers[i] += globalValue;
//			}
//		}
//	}

}
