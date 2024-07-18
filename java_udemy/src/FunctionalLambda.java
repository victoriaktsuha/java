import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalLambda {

	public static int globalValue = 3; // 254. Programação funcional e cálculo lambda

	/* START MAIN */
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

		/*
		 * Paradigmas de programação: • Imperativo (C, Pascal, Fortran, Cobol) •
		 * Orientado a objetos (C++, Object, Pascal, Java (< 8), C# (< 3)) • Funcional
		 * (Haskell, Closure, Clean, Erlang) • Lógico (Prolog) • Multiparadigma
		 * (JavaScript, Java (8+), C# (3+), Ruby, Python, Go)
		 * 
		 */

		/*
		 * Paradigma funcional de programação Baseado no formalismo matemático Cálculo
		 * Lambda (Church 1930) Programação Imperativa x Programação Funcional (quadro
		 * comparativo no PDF)
		 */

//		int[] vect = new int[] {3, 4, 5};
//		changeOddValues(vect);
//		System.out.println(Arrays.toString(vect));

		// Passar uma função como argumento de outra função - onde a função seria objeto
		// de primeira classe

		// Cálculo lambda = formalismo matemático base da programação funcional
		// Expressão lambda = função anônima de primeira classe

		// 255. Interface funcional

		/*
		 * É uma interface que possui um único método abstrato. Suas implementações
		 * serão tratadas como expressões lambda
		 * 
		 * Algumas interfaces mais comuns: - Predicate - Function - Consumer - ao
		 * contrário das demais interfaces funcionais, no caso do Consumer, é esperado
		 * que ele possa gerar efeitos colaterais
		 */

		// 256. Predicate (exemplo com removeIf)
		// (https://github.com/acenelio/lambda2-java)

		/*
		 * Fazer um programa que, a partir de uma lista de produtos, remova da lista
		 * somente aqueles cujo preço mínimo seja 100.
		 * 
		 */

		// implementação da interface

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

		// reference method com método estático

//		List<ProductFunctionalLambda> list = new ArrayList<>();
//
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Mouse", 50.00));
//		list.add(new ProductFunctionalLambda("Tablet", 350.50));
//		list.add(new ProductFunctionalLambda("HD Case", 80.90));
//		
		// expressão lambda = predicado
		// list.removeIf(p -> p.getPrice() >= 100);

		// com interface funcional implementada na classe ProductPredicate
//		list.removeIf(new ProductPredicate());

		// reference method com método estático
//		list.removeIf(ProductFunctionalLambda::staticProductPredicate);

		// reference method com método não estático
//		list.removeIf(ProductFunctionalLambda::nonStaticProductPredicate);

		// expressão lambda declarada
//		Predicate<ProductFunctionalLambda> pred = p -> p.getPrice() >= 100.0;		
//		list.removeIf(pred);

		// expressão lambda inline e não declarada
//		list.removeIf(p -> p.getPrice() >= 100.0);
//		
//		
//		for(ProductFunctionalLambda p : list) {
//			System.out.println(p);
//		}

		// 257. Consumer (com exemplo forEach)
		// (https://github.com/acenelio/lambda3-java)

		/*
		 * interface funcional, parametrizada pelo tipo T e tem um único método abstrato
		 * 'accept', que recebe um tipo T e é void
		 */

		/*
		 * Fazer um programa que a apartir de uma lista de produtos, aumente o preço dos
		 * produtos em 10%
		 * 
		 */

//		List<ProductFunctionalLambda> list = new ArrayList<>();
//
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Mouse", 50.00));
//		list.add(new ProductFunctionalLambda("Tablet", 350.50));
//		list.add(new ProductFunctionalLambda("HD Case", 80.90));
//		
//		//implementação da interface
//		
//		//forEach de List recebe um consumer como argumento
//		list.forEach(new PriceUpdate());
//		
//		//reference method com método estático
//		list.forEach(ProductFunctionalLambda::staticPriceUpdate);
//		
//		//reference method com método não estático
//		list.forEach(ProductFunctionalLambda::nonStaticPriceUpdate);
//		
//		//expressão lambda declarada		
//		double factor = 1.1;
//		
//		Consumer<ProductFunctionalLambda> cons = p -> p.setPrice(p.getPrice() * factor);
//		
//		list.forEach(cons);
//		
//		
//		//expressão lambda inline		
//		double factor = 1.1;
//		
//		list.forEach(p -> p.setPrice(p.getPrice() * factor));
//		
//		
//		//reference method para println
//		list.forEach(System.out::println);

		
		
		// 258. Function (exemplo com map) (https://github.com/acenelio/lambda4-java)

		/*
		 * interface funcional com 2 parametros <T, R>, com apenas um método que recebe
		 * um objeto do tipo T e retorna um objeto do tipo R
		 */

		/*
		 * Fazer um programa que a partir de uma lista de produtos, gere uma nova ista
		 * contendo os nomes dos produtos em caixa alta
		 */

//		List<ProductFunctionalLambda> list = new ArrayList<>();
//
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Mouse", 50.00));
//		list.add(new ProductFunctionalLambda("Tablet", 350.50));
//		list.add(new ProductFunctionalLambda("HD Case", 80.90));

		/*
		 * Nota sobre a função map A função "map" (não confunda com a estrutura de dados
		 * Map) é uma função que aplica uma função a todos elementos de uma stream.
		 * Conversões: • List para stream: .stream() • Stream para List:
		 * .collect(Collectors.toList())
		 */

		// implementação da interface

		// a função map aplica uma função a cada elemento da stream, gerando uma nova
		// stream com os elementos transformados
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

		// reference method com método estático
//		List<String> names = list.stream().map(ProductFunctionalLambda::staticUpperCaseName).collect(Collectors.toList());

		// reference method com método não estático
//		List<String> names = list.stream().map(ProductFunctionalLambda::nonStaticUpperCaseName).collect(Collectors.toList());

		// expressão lambda declarada
//		Function<ProductFunctionalLambda, String> function = p -> p.getName().toUpperCase();	
//		List<String> names = list.stream().map(function).collect(Collectors.toList());

		// expressão lambda inline

//		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
//		names.forEach(System.out::println);

		// 259. Criando funções que recebem funções como parâmetro
		// (https://github.com/acenelio/lambda5-java)

		/*
		 * removeIf(Predicate) forEach(Consumer) map(Function)
		 */

		/*
		 * Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos
		 * preços somente dos produtos cujo nome começa com "T"
		 * 
		 */

//		List<ProductFunctionalLambda> list = new ArrayList<>();
//
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Mouse", 50.00));
//		list.add(new ProductFunctionalLambda("Tablet", 350.50));
//		list.add(new ProductFunctionalLambda("HD Case", 80.90));
//		
//		ProductService ps = new ProductService();
//		
////		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
//		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
//		
//		System.out.println("Sum = " + String.format("%.2f", sum));

		
		
		// 260. Stream

		/*
		 * uma sequencia de elementos advinda de uma fonte de dados que oferece suporte
		 * a "operações agregadas". • Fonte de dados: coleção, array, função de
		 * iteração, recurso de E/S
		 * 
		 * Características:
		 * Stream é uma solução para processar sequências de dados de forma: 
		 * • Declarativa (iteração interna: escondida do programador) 
		 * • Parallel-friendly (imutável -> thread safe) 
		 * • Sem efeitos colaterais 
		 * • Sob demanda (lazy evaluation) 
		 * 
		 * • Acesso sequencial (não há índices) 
		 * 
		 * • Single-use: só pode ser "usada" uma vez 
		 * 
		 * • Pipeline: operações em streams retornam novas streams. Então é possível criar uma 
		 * cadeia de operações (fluxo de processamento).
		 * 
		 * 
		 * Operações intermediárias e terminais
		 * • O pipeline é composto por zero ou mais operações intermediárias e uma terminal.
		 * 
		 * - Operação intermediária:
		 * • Produz uma nova streams (encadeamento)
		 * • Só executa quando uma operação terminal é invocada (lazy evaluation)
		 * Exemplos:
		 * • filter
		 * • map
		 * • flatmap
		 * • peek
		 * • distinct
		 * • sorted
		 * • skip
		 * • limit (*)
		 * * short-circuit - corta a execução em razão de uma condição
		 * 
		 * - Operação terminal:
		 * • Produz um objeto não-stream (coleção ou outro)
		 * • Determina o fim do processamento da stream
		 * Exemplos:
		 * • forEach
		 * • forEachOrdered
		 * • toArray
		 * • reduce
		 * • collect
		 * • min
		 * • max
		 * • count
		 * • anyMatch (*)
		 * • allMatch (*)
		 * • noneMatch (*)
		 * • findFirst (*)
		 * • findAny (*)
		 * * short-circuit
		 * 
		 * Criar uma stream
		 * 
		 * Basta chamar o método stream() ou parallelStream() a partir de qualquer objeto Collection
		 * 
		 * Outras formas de se criar uma stream incluem:
		 * - Stream.of
		 * - Stream.ofNullable
		 * - Stream.iterate
		 */
		
//		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
//		Stream<Integer> st1 = list.stream().map(x -> x * 10);		
//		System.out.println(Arrays.toString(st1.toArray()));
//		
//		Stream<String> st2 = Stream.of("Bob", "John", "Mary");		
//		System.out.println(Arrays.toString(st2.toArray()));
//		
//		//começa com 0 e o próximo serão adicionados a 2 - sequencia infinita, que será limitada pelo limit()
//		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);		
//		System.out.println(Arrays.toString(st3.limit(10).toArray()));
//		
//		//fibonacci - irá gerar uma sequencia de pares		
//		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);		
//		System.out.println(Arrays.toString(st4.limit(10).toArray()));
				
		
		//261. Pipeline
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//operação intermediaria (map())
		Stream<Integer> st1 = list.stream().map(x -> x * 10);	
		//operação terminal (toArray())
		System.out.println(Arrays.toString(st1.toArray()));
		
		//operação terminal (reduce())
		int sum = list.stream().reduce(0, (x , y) -> x + y);
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));

	}
	/* END MAIN */

	// função para aula 254. Programação funcional e cálculo lambda
	// essa função não tem TRANSPARÊNCIA REFERENCIAL pois ela está dependendo de um
	// valor externo
//	public static void changeOddValues(int[] numbers) {
//		for(int i = 0; i < numbers.length; i++) {
//			if(numbers[i] % 2 != 0) {
//				numbers[i] += globalValue;
//			}
//		}
//	}

}
