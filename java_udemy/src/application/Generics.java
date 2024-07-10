package application;

import entities.ClientGenerics;

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
		 * Método que retorna um número inteiro representando um código gerado a partir das informações do objeto
		 * Colisão: Pode acontecer de gerar o mesmo hashCode para obj diferentes, mas nunca hasCode diferente 
		 * para o mesmo obj
		 * 
		 * Regra de ouro:
		 * - Se o hashCode de dois objetos for diferente, então os dois objetos são diferentes
		 * - Se o código de dois objetos for igual, muito provavelmente os objetos são iguais (pode haver colisão)
		 */
		
//		String c = "Maria";
//		String d = "Alex";
//		
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
		
		ClientGenerics c1 = new ClientGenerics("Maria", "maria@gmail.com");
		ClientGenerics c2 = new ClientGenerics("Alex", "alex@gmail.com");
		ClientGenerics c3 = new ClientGenerics("Maria", "alex@gmail.com");
		ClientGenerics c4 = new ClientGenerics("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c4)); //true - compara o conteúdo
		
		System.out.println(c1 == c4); //false pois a referencia de memoria são 2 objetos diferentes
		 
		System.out.println(s1 == s2); /* true - pois apesar de ser objetos diferentes, 
		a expressão literal/string é tratada de outra forma. 
		Diferente de String s1 = new String("Test"), onde é forçada a criação 
		de um novo objeto*/
	
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
