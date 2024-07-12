package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

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
		 * Com tipos curinga podemos fazer métodos que recebem um genérico de
		 * "qualquer tipo":
		 */

//		List<Integer> myInts = Arrays.asList(5, 2, 10);
//		printList(myInts);
//
//		List<String> myStrs = Arrays.asList("Maria", "Bob");
//		printList(myStrs);

		/*
		 * Porém não é possível adicionar dados a uma coleção de tipo curinga:
		 */

//		List<?> list = new ArrayList<Integer>();
//		list.add(3); // erro de compilação

		// O compilador não sabe qual é o tipo específico do qual a lista foi
		// instanciada.

		// 242. Curingas delimitados (bounded wildcards)
		// (https://github.com/acenelio/generics4-java)

		/*
		 * Vamos fazer um método para retornar a soma das áreas de uma lista de figuras
		 * 
		 */

		// Problema 1 - soluções impróprias

//		List<ShapeGenerics> myShapes = new ArrayList<>();
//		myShapes.add(new RectangleGenerics(3.0, 2.0));
//		myShapes.add(new CircleGenerics(2.0));
//		
//		List<CircleGenerics> myCircles = new ArrayList<>();
//		myCircles.add(new CircleGenerics(2.0));
//		myCircles.add(new CircleGenerics(3.0));
//		
//		System.out.println("Total area: " + totalArea(myCircles));

		/*
		 * Princípio get/put - covariância get - OK put (add) - ERROR
		 */

//		List<Integer> intList = new ArrayList<Integer>();
//		intList.add(10);
//		intList.add(5);
//		
//		//tipo Number ou qualquer subtipo (subclass - Integer, Double, Float, etc) de Number
//		List<? extends Number> list = intList;
//		
//		Number x = list.get(0);
//		
//		list.add(20); // erro de compilacao - o compilador não permite pois não sabe qual tipo especifico será adicionado, já que 'Number' é um tipo mais generico, e pode ter qualquer subtipo como int, double, float, etc

		/*
		 * Princípio get/put - contravariância get - ERROR put (add) - OK
		 */

//		List<Object> myObjs = new ArrayList<Object>();
//		myObjs.add("Maria");
//		myObjs.add("Alex");
//		
//		//tipo Number ou qualquer supertipo (superclass - Object(Char, Number, Boolean)) de Number
//		List<? super Number> myNums = myObjs;
//		
//		myNums.add(10);
//		myNums.add(3.14);
//		
//		Number y = myNums.get(0); // erro de compilacao - não é possivel acessar um elemento da lista e tentar atribui-lo a uma variável do tipo Number, pq o tipo da lista pode ser um tipo que seja um supertipo de Number. Adicionar em um variavel do tipo Object seria mais aceito, pois Object é a superclass de Number e último nível

		// Problema 2 - princípio get/put

		/*
		 * Vamos fazer um método que copia os elementos de uma lista para uma outra
		 * lista que pode ser mais genérica que a primeira.
		 */

//		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
//		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
//		List<Object> myObjs = new ArrayList<Object>();
//		//copia de myInts/myDoubles para myObjs
//		copy(myInts, myObjs);
//		printList(myObjs);
//		copy(myDoubles, myObjs);
//		printList(myObjs);

		// 243. hashCode e equals

		/*
		 * São operações da classe Object utilizadas para comparar se um objeto é igual
		 * a outro
		 * 
		 * • equals: lento, resposta 100% • hashCode: rápido, porém resposta positiva
		 * não é 100%
		 * 
		 * • Tipos comuns (String, Date, Integer, Double, etc.) já possuem implementação
		 * para essas operações. Classes personalizadas precisam sobrepô-las.
		 * 
		 */

		/*
		 * Equals
		 * 
		 * Método que compara se o objeto é igual a outro, retornando true ou false.
		 */

//		String a = "Maria";
//		String b = "Alex";
//
//		System.out.println(a.equals(b));

		/*
		 * HashCode
		 * 
		 * Método que retorna um número inteiro representando um código gerado a partir
		 * das informações do objeto Colisão: Pode acontecer de gerar o mesmo hashCode
		 * para obj diferentes, mas nunca hasCode diferente para o mesmo obj
		 * 
		 * Regra de ouro: - Se o hashCode de dois objetos for diferente, então os dois
		 * objetos são diferentes - Se o código de dois objetos for igual, muito
		 * provavelmente os objetos são iguais (pode haver colisão)
		 */

//		String c = "Maria";
//		String d = "Alex";
//		
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());

//		ClientGenerics c1 = new ClientGenerics("Maria", "maria@gmail.com");
//		ClientGenerics c2 = new ClientGenerics("Alex", "alex@gmail.com");
//		ClientGenerics c3 = new ClientGenerics("Maria", "alex@gmail.com");
//		ClientGenerics c4 = new ClientGenerics("Maria", "maria@gmail.com");
//		
//		String s1 = "Test";
//		String s2 = "Test";
//		
//		System.out.println(c1.hashCode());
//		System.out.println(c4.hashCode());
//		System.out.println(c2.hashCode());
//		System.out.println(c3.hashCode());
//		System.out.println(c1.equals(c4)); //true - compara o conteúdo
//		
//		System.out.println(c1 == c4); //false pois a referencia de memoria são 2 objetos diferentes
//		 
//		System.out.println(s1 == s2); /* true - pois apesar de ser objetos diferentes, 
//		a expressão literal/string é tratada de outra forma. 
//		Diferente de String s1 = new String("Test"), onde é forçada a criação 
//		de um novo objeto*/

		// 244. Set

		/*
		 * Set<T> É uma interface Representa um conjunto de elementos (similar ao da
		 * Álgebra) • Não admite repetições • Elementos não possuem posição • Acesso,
		 * inserção e remoção de elementos são rápidos • Oferece operações eficientes de
		 * conjunto: interseção, união, diferença.
		 * 
		 * Principais implementações: • HashSet - mais rápido(operações O(1) em tabela
		 * hash) e não ordenado • TreeSet - mais lento (operações O(log(n)) em árvore
		 * rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator) •
		 * LinkedHashSet - velocidade intermediária e elementos na ordem em que são
		 * adicionados
		 * 
		 * Alguns métodos importantes • add(obj), remove(obj), contains(obj) • Baseado
		 * em equals e hashCode • Se equals e hashCode não existir, é usada comparação
		 * de ponteiros • clear() • size() • removeIf(predicate) • addAll(other) -
		 * união: adiciona no conjunto os elementos do outro conjunto, sem repetição •
		 * retainAll(other) - interseção: remove do conjunto os elementos não contitos
		 * em other • removeAll(other) - diferença: remove do conjunto os elementos
		 * contidos em other
		 */

		// Demo 1

		// Set<String> set = new HashSet<>(); //sem ordenação
		// Set<String> set = new TreeSet<>(); //com ordenação - letras maiusculas pesa
		// mais que a letra
//		Set<String> set = new LinkedHashSet<>(); //mantém a ordem original dos elementos
//		
//		set.add("TV");
//		set.add("Tablet");
//		set.add("Notebook");
//		
//		//System.out.println(set.contains("Notebook")); //boolean, verifica se contém o item no set
//		//set.remove("Tablet"); //remove
//		/*set.removeIf(x -> x.length() >= 3);*/ /* remove com condição - remove todo elemntos x 
//		tal que/desde que o tamanho de x seja maior igual a 3 */
//		set.removeIf(x -> x.charAt(0) == 'T'); //remove todos que comecem com T
//		
//		
//		for (String p : set) {
//			System.out.println(p);
//		}

		// Demo 2

//		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
//		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
//		
//		//union
//		Set<Integer> c = new TreeSet<>(a);
//		c.addAll(b); //une todos os elementos de b, sem duplicar
//		System.out.println(c);
//		
//		//intersection
//		Set<Integer> d = new TreeSet<>(a);
//		d.retainAll(b); //registra apenas elementos em comum com b
//		System.out.println(d);
//		
//		//difference
//		Set<Integer> e = new TreeSet<>(a);
//		e.removeAll(b); //registra apenas elementos que não estão em b
//		System.out.println(e);

		// 245.Como Set testa igualdade

		/*
		 * Como as coleções Hash testam igualdade? • Se hashCode e equals estiverem
		 * implementados: • Primeiro hashCode. Se der igual, usa equals para confirmar.
		 * • Lembre-se: String, Integer, Double, etc. já possuem equals e hashCode • Se
		 * hashCode e equals NÃO estiverem implementados: • Compara as referências
		 * (ponteiros) dos objetos.
		 * 
		 */

//		Set<ProductSetGenerics> set = new HashSet<>();
//		
//		set.add(new ProductSetGenerics("TV", 900.0));
//		set.add(new ProductSetGenerics("Notebook", 1200.0));
//		set.add(new ProductSetGenerics("Tablet", 400.0));
//		
//		ProductSetGenerics prod = new ProductSetGenerics("Notebook", 1200.0);
//		
//		System.out.println(set.contains(prod)); 
		/*
		 * 1º false - pois não contém a implementação do hashCode equals para comparar o
		 * conteúdo, então utiliza ponteiros para comparar um objeto ao outro 2º true -
		 * após a criação do hashCode() e equals() na classe ProductSetGenerics
		 */

		// 246. Como TreeSet compara os elementos

//		Set<ProductTreeSetGenerics> set = new TreeSet<>();
//		
//		set.add(new ProductTreeSetGenerics("TV", 900.0));
//		set.add(new ProductTreeSetGenerics("Notebook", 1200.0));
//		set.add(new ProductTreeSetGenerics("Tablet", 400.0));
//		
//		for (ProductTreeSetGenerics p : set) {
//			System.out.println(p);
//		}

		// 247. Exercício resolvido (Set) (https://github.com/acenelio/set1-java)

		/*
		 * Um site de internet registra um log de acessos dos usuários. Um registro de
		 * log consiste no nome do usuário (apenas uma palavra) e o instante em que o
		 * usuário acessou o site no padrão ISO 8601, separados por espaço, conforme
		 * exemplo. Fazer um programa que leia o log de acessos a partir de um arquivo,
		 * e daí informe quantos usuários distintos acessaram o site.
		 */

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter file full path: ");
//		String path = sc.nextLine();
//		
//		try (BufferedReader br = new BufferedReader(new FileReader(path))){
//			
//			Set<LogEntry> set = new HashSet<>();
//			
//			String line = br.readLine();
//			while (line != null) {
//				
//				String[] fields = line.split(" ");
//				String username = fields[0];
//				Date moment = Date.from(Instant.parse(fields[1]));
//				
//				set.add(new LogEntry(username, moment));
//				
//				line = br.readLine();
//			}
//			System.out.println("Total users: " + set.size());
//		}
//		catch(IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//		sc.close();

		// 248. Exercício de fixação (Set) (https://github.com/acenelio/set2-java)

		/*
		 * Em um portal de cursos online, cada usuário possui um código único,
		 * representado por um número inteiro. Cada instrutor do portal pode ter vários
		 * cursos, sendo que um mesmo aluno pode se matricular em quantos cursos quiser.
		 * Assim, o número total de alunos de um instrutor não é simplesmente a soma dos
		 * alunos de todos os cursos que ele possui, pois pode haver alunos repetidos em
		 * mais de um curso. O instrutor Alex possui três cursos A, B e C, e deseja
		 * saber seu número total de alunos. Seu programa deve ler os alunos dos cursos
		 * A, B e C do instrutor Alex, depois mostrar a quantidade total e alunos dele,
		 * conforme exemplo.
		 * 
		 */

		// 249.Map

		/*
		 * Map <K,V>
		 * 
		 * É uma coleção de pares chave/valor - não admite repetições do objeto chave -
		 * os elementos são indexados pelo objeto chave (não possuem posição) - acesso,
		 * inserção e remoção de elementos são rápidos
		 * 
		 * uso comum: cookies, local storage, qualquer modelo chave-valor
		 * 
		 * principais implementações: - hashmap: mais rápido e não ordenado - treemap:
		 * mais lento e ordenado pelo compareTo do objeto - linkedhashmap: velocidade
		 * intermediária e elementos na ordem em que são adicionados
		 * 
		 * métodos importantes: - put(key, value), remove(key), containsKey(key),
		 * get(key) - baseado em equals e hashCode - se equals e hashcode não existir, é
		 * usada comparação de ponteiros - clear() - size() - keySet() - retorna um
		 * Set<K> - values() - retorna um Collection<V>
		 */

		// Demo 1

//		Map<String, String> cookies = new TreeMap<>();
//		
//		cookies.put("username", "Maria");
//		cookies.put("email", "maria@gmail.com");
//		cookies.put("phone", "998236531");
//		
//		cookies.remove("email");
//		cookies.put("phone", "89643121"); //será sobreescrito
//		
//		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
//		System.out.println("Phone number: " + cookies.get("phone"));
//		System.out.println("Email: " + cookies.get("email"));
//		System.out.println("Size: " + cookies.size());
//		
//		System.out.println("ALL COOKIES:");
//		for(String key : cookies.keySet()) {
//			System.out.println(key + ": " + cookies.get(key));
//		}

		// Demo 2

//		Map<ProductMapGenerics, Double> stock = new HashMap<>();
//		
//		ProductMapGenerics p1 = new ProductMapGenerics("Tv", 900.0);
//		ProductMapGenerics p2 = new ProductMapGenerics("Notebook", 1200.0);
//		ProductMapGenerics p3 = new ProductMapGenerics("Tablet", 400.0);
//		
//		stock.put(p1, 10000.0);
//		stock.put(p2, 20000.0);
//		stock.put(p3, 15000.0);
//		
//		ProductMapGenerics ps = new ProductMapGenerics("Tv", 900.0);
//		
//		System.out.println("Contains 'ps' key: " + stock.containsKey(ps)); 
		// false se a classe não tiver hashCode e equals; do contrário, true

		
		
		// 250. Exercício de fixação (Map) (https://github.com/acenelio/map1-java)

		/*
		 * Na contagem de votos de uma eleição, são gerados vários registros de votação
		 * contendo o nome do candidato e a quantidade de votos (formato .csv) que ele
		 * obteve em uma urna de votação. Você deve fazer um programa para ler os
		 * registros de votação a partir de um arquivo, e daí gerar um relatório
		 * consolidado com os totais de cada candidato.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> votes = new LinkedHashMap<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if(votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				}
				else {
					votes.put(name, count);
				}
				
				
				line = br.readLine();
			}
			
			for(String key : votes.keySet()) {				
				System.out.println(key + ": " + votes.get(key));
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

	/* END MAIN() */

	// método para aula 241. Tipos curinga - imprime uma lista de qualquer tipo
//	public static void printList(List<?> list) {
//		for (Object obj : list) {
//			System.out.println(obj);
//		}
//	}

	// método para aula 242. Curingas delimitados - problema 1
	// outdated - essa solução de método só funciona para uma lista<ShapeGenerics>;
	// Caso a lista seja de um subtipo (que extende) de ShapeGeneics, não funciona
//	public static double totalArea(List<ShapeGenerics> list) {
//		double sum = 0.0;
//		for(ShapeGenerics s : list) {
//			sum += s.area();
//		}
//		return sum;
//	}

	// método para aula 242. Curingas delimitados - problema 1
	// refatorado - essa solução de método funciona caso a lista seja de tipo
	// ShapeGenerics ou de um subtipo (que extende) de ShapeGeneics, mas ainda não é
	// possivel adicionar elementos na lista
//		public static double totalArea(List<? extends ShapeGenerics> list) {
//			double sum = 0.0;
//			for(ShapeGenerics s : list) {
//				sum += s.area();
//			}
//			return sum;
//		}

	// método para aula 242. Curingas delimitados - problema 2
//	public static void copy(List<? extends Number> source, List<? super Number> target) {
//		for (Number n : source) {
//			target.add(n);
//		}
//	}
//
//	public static void printList(List<?> list) {
//		for (Object obj : list) {
//			System.out.print(obj + " ");
//		}
//		System.out.println();
//	}
}
