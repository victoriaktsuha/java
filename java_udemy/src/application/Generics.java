package application;

import entities.ClientGenerics;

public class Generics {

	public static void main(String[] args) {
		/* START MAIN() */

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
		 * Criar um servi�o de c�lculo: ----------------------------- CalculationService
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
//				//vetor para armazenar conte�do antes e depois da v�rgula, separadamente
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
		 * Generics s�o invariantes
		 * 
		 * List<Object> n�o � o supertipo de qualquer tipo de lista:
		 * 
		 * List<Object> myObjs = new ArrayList<Object>(); List<Integer> myNumbers = new
		 * ArrayList<Integer>(); myObjs = myNumbers; // erro de compila��o
		 * 
		 * O supertipo de qualquer tipo de lista � List<?>. Este � um tipo curinga:
		 * 
		 * List<?> myObjs = new ArrayList<Object>(); List<Integer> myNumbers = new
		 * ArrayList<Integer>(); myObjs = myNumbers;
		 * 
		 */

		// Aqui est� correto - integer � um subtipo de object, ocorre aqui upcasting
//		Object obj;
//		Integer x = 10;
//		obj = x;

		// ! integer � um subtipo de object, MAS List<Integer> N�O � um subtipo de
		// List<Object>
		// Aqui est� incorreto, pois lista de integer n�o � lista de object
//		List<Object> myObjs = new ArrayList<Object>(); 
//		List<Integer> myNumbers = new ArrayList<Integer>(); 
//		myObjs = myNumbers; // erro de compila��o - n�o � possivel fazer um upcasting

		// <?> supertipo de qualquer tipo de lista
//		List<?> myObjs = new ArrayList<Object>();
//		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers;

		/*
		 * Com tipos curinga podemos fazer m�todos que recebem um gen�rico de
		 * "qualquer tipo":
		 */

//		List<Integer> myInts = Arrays.asList(5, 2, 10);
//		printList(myInts);
//
//		List<String> myStrs = Arrays.asList("Maria", "Bob");
//		printList(myStrs);

		/*
		 * Por�m n�o � poss�vel adicionar dados a uma cole��o de tipo curinga:
		 */

//		List<?> list = new ArrayList<Integer>();
//		list.add(3); // erro de compila��o

		// O compilador n�o sabe qual � o tipo espec�fico do qual a lista foi
		// instanciada.

		// 242. Curingas delimitados (bounded wildcards)
		// (https://github.com/acenelio/generics4-java)

		/*
		 * Vamos fazer um m�todo para retornar a soma das �reas de uma lista de figuras
		 * 
		 */

		// Problema 1 - solu��es impr�prias

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
		 * Princ�pio get/put - covari�ncia get - OK put (add) - ERROR
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
//		list.add(20); // erro de compilacao - o compilador n�o permite pois n�o sabe qual tipo especifico ser� adicionado, j� que 'Number' � um tipo mais generico, e pode ter qualquer subtipo como int, double, float, etc

		/*
		 * Princ�pio get/put - contravari�ncia get - ERROR put (add) - OK
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
//		Number y = myNums.get(0); // erro de compilacao - n�o � possivel acessar um elemento da lista e tentar atribui-lo a uma vari�vel do tipo Number, pq o tipo da lista pode ser um tipo que seja um supertipo de Number. Adicionar em um variavel do tipo Object seria mais aceito, pois Object � a superclass de Number e �ltimo n�vel

		// Problema 2 - princ�pio get/put

		/*
		 * Vamos fazer um m�todo que copia os elementos de uma lista para uma outra
		 * lista que pode ser mais gen�rica que a primeira.
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
		 * S�o opera��es da classe Object utilizadas para comparar se um objeto � igual
		 * a outro
		 * 
		 * � equals: lento, resposta 100% � hashCode: r�pido, por�m resposta positiva
		 * n�o � 100%
		 * 
		 * � Tipos comuns (String, Date, Integer, Double, etc.) j� possuem implementa��o
		 * para essas opera��es. Classes personalizadas precisam sobrep�-las.
		 * 
		 */

		/*
		 * Equals
		 * 
		 * M�todo que compara se o objeto � igual a outro, retornando true ou false.
		 */

//		String a = "Maria";
//		String b = "Alex";
//
//		System.out.println(a.equals(b));

		/*
		 * HashCode 
		 * 
		 * M�todo que retorna um n�mero inteiro representando um c�digo gerado a partir das informa��es do objeto
		 * Colis�o: Pode acontecer de gerar o mesmo hashCode para obj diferentes, mas nunca hasCode diferente 
		 * para o mesmo obj
		 * 
		 * Regra de ouro:
		 * - Se o hashCode de dois objetos for diferente, ent�o os dois objetos s�o diferentes
		 * - Se o c�digo de dois objetos for igual, muito provavelmente os objetos s�o iguais (pode haver colis�o)
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
		System.out.println(c1.equals(c4)); //true - compara o conte�do
		
		System.out.println(c1 == c4); //false pois a referencia de memoria s�o 2 objetos diferentes
		 
		System.out.println(s1 == s2); /* true - pois apesar de ser objetos diferentes, 
		a express�o literal/string � tratada de outra forma. 
		Diferente de String s1 = new String("Test"), onde � for�ada a cria��o 
		de um novo objeto*/
	
	}

	/* END MAIN() */

	// m�todo para aula 241. Tipos curinga - imprime uma lista de qualquer tipo
//	public static void printList(List<?> list) {
//		for (Object obj : list) {
//			System.out.println(obj);
//		}
//	}

	// m�todo para aula 242. Curingas delimitados - problema 1
	// outdated - essa solu��o de m�todo s� funciona para uma lista<ShapeGenerics>;
	// Caso a lista seja de um subtipo (que extende) de ShapeGeneics, n�o funciona
//	public static double totalArea(List<ShapeGenerics> list) {
//		double sum = 0.0;
//		for(ShapeGenerics s : list) {
//			sum += s.area();
//		}
//		return sum;
//	}

	// m�todo para aula 242. Curingas delimitados - problema 1
	// refatorado - essa solu��o de m�todo funciona caso a lista seja de tipo
	// ShapeGenerics ou de um subtipo (que extende) de ShapeGeneics, mas ainda n�o �
	// possivel adicionar elementos na lista
//		public static double totalArea(List<? extends ShapeGenerics> list) {
//			double sum = 0.0;
//			for(ShapeGenerics s : list) {
//				sum += s.area();
//			}
//			return sum;
//		}

	// m�todo para aula 242. Curingas delimitados - problema 2
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
