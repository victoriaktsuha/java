import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.ProductFunctionalLambda;

public class FunctionalLambda {

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

		//Comparator com expressão lambda direto como argumento

		List<ProductFunctionalLambda> list = new ArrayList<>();

		list.add(new ProductFunctionalLambda("TV", 900.00));
		list.add(new ProductFunctionalLambda("Notebook", 1200.00));
		list.add(new ProductFunctionalLambda("Tablet", 450.00));

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (ProductFunctionalLambda p : list) {
			System.out.println(p);
		}

	}

}
