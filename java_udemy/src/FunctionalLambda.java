import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalLambda {

	public static int globalValue = 3; // 254. Programa��o funcional e c�lculo lambda

	/* START MAIN */
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

		/*
		 * Paradigmas de programa��o: � Imperativo (C, Pascal, Fortran, Cobol) �
		 * Orientado a objetos (C++, Object, Pascal, Java (< 8), C# (< 3)) � Funcional
		 * (Haskell, Closure, Clean, Erlang) � L�gico (Prolog) � Multiparadigma
		 * (JavaScript, Java (8+), C# (3+), Ruby, Python, Go)
		 * 
		 */

		/*
		 * Paradigma funcional de programa��o Baseado no formalismo matem�tico C�lculo
		 * Lambda (Church 1930) Programa��o Imperativa x Programa��o Funcional (quadro
		 * comparativo no PDF)
		 */

//		int[] vect = new int[] {3, 4, 5};
//		changeOddValues(vect);
//		System.out.println(Arrays.toString(vect));

		// Passar uma fun��o como argumento de outra fun��o - onde a fun��o seria objeto
		// de primeira classe

		// C�lculo lambda = formalismo matem�tico base da programa��o funcional
		// Express�o lambda = fun��o an�nima de primeira classe

		// 255. Interface funcional

		/*
		 * � uma interface que possui um �nico m�todo abstrato. Suas implementa��es
		 * ser�o tratadas como express�es lambda
		 * 
		 * Algumas interfaces mais comuns: - Predicate - Function - Consumer - ao
		 * contr�rio das demais interfaces funcionais, no caso do Consumer, � esperado
		 * que ele possa gerar efeitos colaterais
		 */

		// 256. Predicate (exemplo com removeIf)
		// (https://github.com/acenelio/lambda2-java)

		/*
		 * Fazer um programa que, a partir de uma lista de produtos, remova da lista
		 * somente aqueles cujo pre�o m�nimo seja 100.
		 * 
		 */

		// implementa��o da interface

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

		// reference method com m�todo est�tico

//		List<ProductFunctionalLambda> list = new ArrayList<>();
//
//		list.add(new ProductFunctionalLambda("TV", 900.00));
//		list.add(new ProductFunctionalLambda("Mouse", 50.00));
//		list.add(new ProductFunctionalLambda("Tablet", 350.50));
//		list.add(new ProductFunctionalLambda("HD Case", 80.90));
//		
		// express�o lambda = predicado
		// list.removeIf(p -> p.getPrice() >= 100);

		// com interface funcional implementada na classe ProductPredicate
//		list.removeIf(new ProductPredicate());

		// reference method com m�todo est�tico
//		list.removeIf(ProductFunctionalLambda::staticProductPredicate);

		// reference method com m�todo n�o est�tico
//		list.removeIf(ProductFunctionalLambda::nonStaticProductPredicate);

		// express�o lambda declarada
//		Predicate<ProductFunctionalLambda> pred = p -> p.getPrice() >= 100.0;		
//		list.removeIf(pred);

		// express�o lambda inline e n�o declarada
//		list.removeIf(p -> p.getPrice() >= 100.0);
//		
//		
//		for(ProductFunctionalLambda p : list) {
//			System.out.println(p);
//		}

		// 257. Consumer (com exemplo forEach)
		// (https://github.com/acenelio/lambda3-java)

		/*
		 * interface funcional, parametrizada pelo tipo T e tem um �nico m�todo abstrato
		 * 'accept', que recebe um tipo T e � void
		 */

		/*
		 * Fazer um programa que a apartir de uma lista de produtos, aumente o pre�o dos
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
//		//implementa��o da interface
//		
//		//forEach de List recebe um consumer como argumento
//		list.forEach(new PriceUpdate());
//		
//		//reference method com m�todo est�tico
//		list.forEach(ProductFunctionalLambda::staticPriceUpdate);
//		
//		//reference method com m�todo n�o est�tico
//		list.forEach(ProductFunctionalLambda::nonStaticPriceUpdate);
//		
//		//express�o lambda declarada		
//		double factor = 1.1;
//		
//		Consumer<ProductFunctionalLambda> cons = p -> p.setPrice(p.getPrice() * factor);
//		
//		list.forEach(cons);
//		
//		
//		//express�o lambda inline		
//		double factor = 1.1;
//		
//		list.forEach(p -> p.setPrice(p.getPrice() * factor));
//		
//		
//		//reference method para println
//		list.forEach(System.out::println);

		
		
		// 258. Function (exemplo com map) (https://github.com/acenelio/lambda4-java)

		/*
		 * interface funcional com 2 parametros <T, R>, com apenas um m�todo que recebe
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
		 * Nota sobre a fun��o map A fun��o "map" (n�o confunda com a estrutura de dados
		 * Map) � uma fun��o que aplica uma fun��o a todos elementos de uma stream.
		 * Convers�es: � List para stream: .stream() � Stream para List:
		 * .collect(Collectors.toList())
		 */

		// implementa��o da interface

		// a fun��o map aplica uma fun��o a cada elemento da stream, gerando uma nova
		// stream com os elementos transformados
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

		// reference method com m�todo est�tico
//		List<String> names = list.stream().map(ProductFunctionalLambda::staticUpperCaseName).collect(Collectors.toList());

		// reference method com m�todo n�o est�tico
//		List<String> names = list.stream().map(ProductFunctionalLambda::nonStaticUpperCaseName).collect(Collectors.toList());

		// express�o lambda declarada
//		Function<ProductFunctionalLambda, String> function = p -> p.getName().toUpperCase();	
//		List<String> names = list.stream().map(function).collect(Collectors.toList());

		// express�o lambda inline

//		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
//		names.forEach(System.out::println);

		// 259. Criando fun��es que recebem fun��es como par�metro
		// (https://github.com/acenelio/lambda5-java)

		/*
		 * removeIf(Predicate) forEach(Consumer) map(Function)
		 */

		/*
		 * Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos
		 * pre�os somente dos produtos cujo nome come�a com "T"
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
		 * a "opera��es agregadas". � Fonte de dados: cole��o, array, fun��o de
		 * itera��o, recurso de E/S
		 * 
		 * Caracter�sticas:
		 * Stream � uma solu��o para processar sequ�ncias de dados de forma: 
		 * � Declarativa (itera��o interna: escondida do programador) 
		 * � Parallel-friendly (imut�vel -> thread safe) 
		 * � Sem efeitos colaterais 
		 * � Sob demanda (lazy evaluation) 
		 * 
		 * � Acesso sequencial (n�o h� �ndices) 
		 * 
		 * � Single-use: s� pode ser "usada" uma vez 
		 * 
		 * � Pipeline: opera��es em streams retornam novas streams. Ent�o � poss�vel criar uma 
		 * cadeia de opera��es (fluxo de processamento).
		 * 
		 * 
		 * Opera��es intermedi�rias e terminais
		 * � O pipeline � composto por zero ou mais opera��es intermedi�rias e uma terminal.
		 * 
		 * - Opera��o intermedi�ria:
		 * � Produz uma nova streams (encadeamento)
		 * � S� executa quando uma opera��o terminal � invocada (lazy evaluation)
		 * Exemplos:
		 * � filter
		 * � map
		 * � flatmap
		 * � peek
		 * � distinct
		 * � sorted
		 * � skip
		 * � limit (*)
		 * * short-circuit - corta a execu��o em raz�o de uma condi��o
		 * 
		 * - Opera��o terminal:
		 * � Produz um objeto n�o-stream (cole��o ou outro)
		 * � Determina o fim do processamento da stream
		 * Exemplos:
		 * � forEach
		 * � forEachOrdered
		 * � toArray
		 * � reduce
		 * � collect
		 * � min
		 * � max
		 * � count
		 * � anyMatch (*)
		 * � allMatch (*)
		 * � noneMatch (*)
		 * � findFirst (*)
		 * � findAny (*)
		 * * short-circuit
		 * 
		 * Criar uma stream
		 * 
		 * Basta chamar o m�todo stream() ou parallelStream() a partir de qualquer objeto Collection
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
//		//come�a com 0 e o pr�ximo ser�o adicionados a 2 - sequencia infinita, que ser� limitada pelo limit()
//		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);		
//		System.out.println(Arrays.toString(st3.limit(10).toArray()));
//		
//		//fibonacci - ir� gerar uma sequencia de pares		
//		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);		
//		System.out.println(Arrays.toString(st4.limit(10).toArray()));
				
		
		//261. Pipeline
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//opera��o intermediaria (map())
		Stream<Integer> st1 = list.stream().map(x -> x * 10);	
		//opera��o terminal (toArray())
		System.out.println(Arrays.toString(st1.toArray()));
		
		//opera��o terminal (reduce())
		int sum = list.stream().reduce(0, (x , y) -> x + y);
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));

	}
	/* END MAIN */

	// fun��o para aula 254. Programa��o funcional e c�lculo lambda
	// essa fun��o n�o tem TRANSPAR�NCIA REFERENCIAL pois ela est� dependendo de um
	// valor externo
//	public static void changeOddValues(int[] numbers) {
//		for(int i = 0; i < numbers.length; i++) {
//			if(numbers[i] % 2 != 0) {
//				numbers[i] += globalValue;
//			}
//		}
//	}

}
