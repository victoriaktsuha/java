package application;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	/**
	 * @param args
	 */
	
	//versão 1 de métodos estáticos
	//public final double PI = 3.14159; // 'final' para constantes, e o padrão de nomes para constante é letra maiúscula
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		
		
		// Resolvendo problemas sem orientação a objetos

		/*
		 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
		 * (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois
		 * triângulos e dizer qual dos dois triângulos possui a maior área. A fórmula
		 * para calcular a área de um triângulo a partir das medidas de seus lados a, b
		 * e c é a seguinte (fórmula de Heron): area = raiz quadrada de
		 * p(p-a)(p-b)(p-c), onde p=(a+b+c)/2
		 */
		
//		double xA, xB, xC, yA, yB, yC;
//		
//		System.out.println("Digite as medidas do triângulo X:");
//		xA = sc.nextDouble();
//		xB = sc.nextDouble();
//		xC = sc.nextDouble();
//		
//		System.out.println("Digite as medidas do triângulo Y:");
//		yA = sc.nextDouble();
//		yB = sc.nextDouble();
//		yC = sc.nextDouble();
//		
//		double p = (xA + xB + xC) / 2.0;
//		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
//		
//		p = (yA + yB + yC) / 2.0;
//		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
//		
//		System.out.printf("Área do triângulo X: %.4f%n", areaX);
//		
//		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
//		
//		if(areaX > areaY) {
//			System.out.println("Maior área: X");
//		}else {
//			System.out.println("Maior área: Y");
//		}
		
		// Criando uma classe com 3 atributos para representar melhor o triângulo
		
		/*
		 * Triângulo é uma entidade com 3 atributos: a, b e c. Estamos usando 3 varáveis
		 * distintas para representar cada triângulo: double xA, xB, xC, yA, yB, yC;
		 * Para melhorar isso, vamos usar uma classe para representar um triângulo.
		 * 
		 * Classe: É um tipo estruturado que pode conter (membros): 
		 * - Atributos (dados/campos) 
		 * - Métodos (funções/operações)
		 * 
		 * A classe também pode prover muitos outros recursos, tais como: 
		 * - Construtores
		 * - Sobrecarga 
		 * - Encapsulamento 
		 * - Herança 
		 * - Polimorfismo
		 * 
		 * Exemplos: 
		 * - Entidades: Produto, Cliente, Triangulo 
		 * - Serviços: ProdutoService, ClienteService, EmailService, StorageService 
		 * - Controladores: ProdutoController, ClienteController 
		 * - Utilitários: Calculadora, Compactador
		 * 
		 * Portanto, criaremos uma classe pública chamada 'Triangle' que conterá 3
		 * atributos também públicos de tipo double
		 * 
		 * package entities; 
		 * public class Triangle{ 
		 * 		public double a; 
		 * 		public double b;
		 * 		public double c; 
		 * }
		 * 
		 * Quando a variável é do tipo classe, temos que instanciar a variável.
		 * Então poderemos instanciar a classe para criar os objetos de x e y:
		 * 
		 * Triangle x, y; 
		 * x = new Triangle(); 
		 * y = new Triangle();
		 * 
		 * X e Y então poderão conter os 3 atributos correspondentes as 3 medidas
		 */
		
		//Resolução com classe Triangle
		
//		Triangle x, y;
//		x = new Triangle();
//		y = new Triangle();
		
		//Para acessar e armazenar os valores nos atributos do objeto x:
//		System.out.println("Digite as medidas do triângulo X:");
//		x.a = sc.nextDouble();
//		x.b = sc.nextDouble();
//		x.c = sc.nextDouble();
		
		//Para acessar e armazenar os valores nos atributos do objeto y:
//		System.out.println("Digite as medidas do triângulo Y:");
//		y.a = sc.nextDouble();
//		y.b = sc.nextDouble();
//		y.c = sc.nextDouble();
		
		//Criando um método para obtermos os benefícios de reaproveitamento e delegação
		
		/*
		 * Agora vamos melhorar nossa classe acrescentando nela um método para calcular a área. 
		 * Quais são os benefícios de se calcular a área de um triângulo por meio de um método dentro da classe Triangle ? 
		 * - Reaproveitamento de código: nós eliminamos o código repetido (cálculo das áreas dos triângulos x e y) no
		 * programa principal. 
		 * - Delegação das responsabilidades: quem deve ser responsável por saber como calcular a área de um triângulo é o próprio
		 * triângulo. A lógica do cálculo da área não deve estar em outro lugar.
		 */
		
		//utilizando método area
//		double areaX = x.area();
//		double areaY = y.area();
//		
//		System.out.printf("Área do triângulo X: %.4f%n", areaX);
//		
//		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
//		
//		if(areaX > areaY) {
//			System.out.println("Maior área: X");
//		}else {
//			System.out.println("Maior área: Y");
//		}
		
		//classe é a definição do tipo e objeto é a instanciação da classe
		
		/*
		
		-- Instanciação --
		
		Exemplo:
		double areaX, areaY, p;
		Triangle x, y;
		
		- Memória
			> Stack - onde as variáveis estáticas como areaX, areaY e p são criadas.
			Durante a executação do programa, podemos fazer uma alocação dinâmica de memória através do 'new' 
			utilizado para instanciar um objeto, que será armazenado no Heap		
			> Heap - aqui são criados objetos dinâmicos através da alocação dinâmica de memória feita através do 'new'.
			As variáveis x e y, mesmo que objetos no heap, também estarão no Stack, mas armazenando um endereço de 
			memória do objeto criado no Heap
		 
		 */
		
		//Começando a resolver um segundo problema exemplo
		
		/*
		 * Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque.) Em seguida: 
		 * - Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque) 
		 * - Realizar uma entrada no estoque e mostrar novamente os dados do produto 
		 * - Realizar uma saída no estoque e mostrar novamente os dados do produto
		 * 
		 * Para resolver este problema, você deve criar uma classe conforme projeto abaixo:
		 * 
		 * ------------------------------------ 
		 * Product
		 * ------------------------------------ 
		 * - Name: string 
		 * - Price: double 
		 * - Quantity: int 
		 * ------------------------------------ 
		 * + TotalValueInStock():double 
		 * + AddProducts(quantity:int):void 
		 * + RemoveProducts(quantity:int):void 
		 * ------------------------------------ 
		 */
		
		/*Object e toString
		*- Toda classe java é uma subclasse da classe Object
		*	- Qualquer variável que você tiver no seu programa, ela vai ser um tipo - ex.: Triangle, Product - 
		*e cada um desses também é do tipo Object, e o tipo Object tem alguns métodos padrão.
		*
		*- Object possui os seguintes métodos:
		*	- getClass - retorna o tipo do objeto
		*	- equals - compara se o objeto é igual ao outro
		*	- hashCode - retorna um código hash do objeto
		*	- toString - converte o objeto para string
		*/
		
//		Product product = new Product();
//		
//		System.out.println("Enter product data: ");
//		
//		System.out.print("Name: ");
//		product.name = sc.nextLine();
//		System.out.print("Price: ");
//		product.price = sc.nextDouble();
//		System.out.print("Quantity in stock: ");
//		product.quantity = sc.nextInt();				
//		
//		System.out.println();
//		System.out.println("Product data: " + product);
//		
//		System.out.println();
//		System.out.println("Enter the number of products to be added in stock: ");
//		int quantity = sc.nextInt();
//		product.addProducts(quantity);
//		
//		System.out.println();
//		System.out.println("Updated data: " + product);
//		
//		System.out.println();
//		System.out.println("Enter the number of products to be removed from stock: ");
//		quantity = sc.nextInt();
//		product.removeProducts(quantity);
//		
//		System.out.println();
//		System.out.println("Updated data: " + product);
//		
		// Exercícios
		
		/*
		 * 1) Fazer um programa para ler os valores da largura e altura de um retângulo.
		 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
		 * Usar uma classe como mostrado no UML abaixo:
		 * 
		 * ----------------------- 
		 * Rectangle 
		 * ----------------------- 
		 * - Width: double 
		 * - Height: double 
		 * ----------------------- 
		 * + Area(): double 
		 * + Perimeter(): double
		 * + Diagonal(): double 
		 * -----------------------
		 * 
		 * Exemplo: 
		 * Enter rectangle width and height: 
		 * 3.00 
		 * 4.00 
		 * AREA = 12.00 
		 * PERIMETER = 14.00 
		 * DIAGONAL = 5.00 
		 */
		
//		Rectangle rectangle = new Rectangle();
//		
//		System.out.println("Enter rectangle width and height:");
//		
//		rectangle.width = sc.nextDouble();
//		rectangle.height = sc.nextDouble();
//		
//		System.out.println(rectangle);
		
		/*
		 * 2) Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
		 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). 
		 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada 
		 * (somente o salário bruto é afetado pela porcentagem) e
		 * mostar novamente os dados do funcionário. Use a classe projetada abaixo:
		 * 
		 * ------------------------------------------- 
		 * Employee
		 * ------------------------------------------- 
		 * - Name: String 
		 * - GrossSalary: double 
		 * - Tax: double 
		 * ------------------------------------------- 
		 * + NetSalary(): double 
		 * + IncreaseSalary(percentage: double): void
		 * -------------------------------------------
		 * 
		 * Exemplo: 
		 * 
		 * Name: Joao Silva  
		 * Gross salary: 6000.00 
		 * Tax: 1000.00
		 * 
		 * Employee: Joao Silva, $ 5000.00
		 * 
		 * Which percentage to increase salary ? 10.0
		 * 
		 * Updated data: Joao Silva, $ 5600.00
		 * 
		 */
		
//		Employee employee = new Employee();
//		
//		System.out.print("Name: ");
//		employee.name = sc.nextLine();
//		System.out.print("Gross Salary: ");
//		employee.grossSalary = sc.nextDouble();
//		System.out.print("Tax: ");
//		employee.tax = sc.nextDouble();
//		System.out.println();
//				
//		System.out.println("Employee: " + employee);
//		System.out.println();
//		System.out.print("Which percentage to increase salary ? ");
//		double percentage = sc.nextDouble();
//		employee.increasySalary(percentage);
//		System.out.println();
//		
//		System.out.println("Updated data: " + employee);
		
		/*
		 * 3) Fazer um programa para ler o nome de um aluno e as três notas que ele
		 * obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e
		 * terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano.
		 * Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso
		 * negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado
		 * (que é 60% da nota). Você deve criar uma classe Student para resolver este
		 * problema. *elaborar diagrama de classe
		 * 
		 * ----------------------------
		 * Student
		 * ----------------------------
		 * - Name: String
		 * - Nota1: double
		 * - Nota2: double
		 * - Nota3: double
		 * ----------------------------
		 * + Media(): double
		 * + Faltante(): double
		 * ----------------------------
		 * 
		 * Exemplos: 
		 * ------------------- 
		 * Entrada: 
		 * Alex Green 
		 * 27.00
		 * 31.00
		 * 32.00
		 * 
		 * Saída: 
		 * FINAL GRADE = 90.00 
		 * PASS 
		 * -------------------- 
		 * Entrada: 
		 * Alex Green
		 * 17.00 
		 * 20.00 
		 * 15.00
		 * 
		 * Saída: 
		 * FINAL GRADE = 52.00 
		 * FAILED 
		 * MISSING 8.00 POINTS 
		 * ---------------------
		 */
		
//		Student student = new Student();
//		
//		student.name = sc.nextLine();
//		student.nota1 = sc.nextDouble();
//		student.nota2 = sc.nextDouble();
//		student.nota3 = sc.nextDouble();
//		
//		double media = student.media();
//		
//		System.out.printf("FINAL GRADE = %.2f%n", media);
 
		/* minha solução - sem o método faltante()
		if(media < 60) {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", 60 - media) + " POINTS");
		}else {
			System.out.println("PASS");
		}
		*/
		
//		if(media < 60.0) {
//			System.out.println("FAILED");
//			System.out.printf("MISSING %.2f POINTS%n", student.faltante());
//		}else {
//			System.out.println("PASS");
//		}
		
		/**
		 * Membros Estáticos I
		 * 
		 * Uma classe possui membros, que são os atributos e métodos.
		 * 
		 * Os membros estáticos, também chamados de membros de classe - em oposição a
		 * membros e instância. São membros que fazem sentido independentemente de
		 * objetos. Não precisam de objetos para serem chamados. São chamados a partir
		 * do próprio nome da classe. 
		 * No exemplo dos triângulos, x é uma instância e y é
		 * outra instância e é possível 'chamar' os membros mesmo em instancias
		 * diferentes, ou seja, independente do objeto.
		 * 
		 * Aplicações comuns: 
		 * - classes utilitárias (Math.sqrt()) 
		 * - declaração de
		 * constantes
		 * 
		 * Uma classe que possui somente membros estáticos, pode ser uma classe estática
		 * também. Esta classe não poderá ser instanciada.
		 * 
		 * Problema exemplo 
		 * Fazer um programa para ler um valor numérico qualquer, e daí
		 * mostrar quanto seria o valor de um circunferência e do volume de uma esfera
		 * para um raio daquele valor. Informar também o valor de PI com duas casas
		 * decimais.
		 * 
		 * Exemplo: 
		 * Enter radius: 3.0 
		 * Circumference: 18.84 
		 * Volume: 113.04 
		 * PI value: 3.14
		 * 
		 * Resolução em 3 versões: 
		 * 1: métodos na própria classe do programa - dentro de
		 * um método estático você não pode chamar membros de instância da mesma classe
		 * 2: classe Calculator com membros de instância - principio da delegação - precisa de um objeto (new) para utilizar o membros das classe
		 * 3: classe Calculator com método estático - referencia a classe direto (classe utilitária)
		 */
		
		//versão 2 métodos estáticos
		//Calculator calc = new Calculator();
		
//		System.out.print("Enter radius: ");
//		double radius = sc.nextDouble();
		
		//versão 1 métodos estáticos
		//double c = circumference(radius);
		//double v = volume(radius);
		
		//versão 2 métodos estáticos
		//double c = calc.circumference(radius);
		//double v = calc.volume(radius);
		
		//versão 3 métodos estáticos
//		double c = Calculator.circumference(radius);
//		double v = Calculator.volume(radius);
//		
//		System.out.printf("Circumference: %.2f%n", c);
//		System.out.printf("Volume: %.2f%n", v);
		
		//versão 1 métodos estáticos
		//System.out.printf("PI value: %.2f%n", PI);
		
		//versão 2 métodos estáticos
		//System.out.printf("PI value: %.2f%n", calc.PI);
		
		//versão 3 métodos estáticos
//		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		/*
		 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
		 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
		 * sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
		 * responsável pelos cálculos.
		 * 
		 * Exemplo: 
		 * What is the dollar price ? 3.10 
		 * How many dollars will be bought ? 200.00 
		 * Amount to be paid in reais = 657.20
		 */
		
		
//		System.out.print("What is the dollar price? ");
//		double dollarPrice = sc.nextDouble();		
//		System.out.print("How many dollars will be bought? ");
//		double dollarAmount = sc.nextDouble();
//		double convertion = CurrencyConverter.convertion(dollarPrice, dollarAmount);
//		System.out.printf("Amount to be paid in reais = ", convertion);
		
		
		/*
		 * Construtores
		 * 
		 * - É uma operação especial da classe, que executa no momento da instanciação
		 * do objeto
		 * 
		 * - Usos comuns: 
		 * - Iniciar valores dos atributos 
		 * - Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção da
		 * dependência)
		 * 
		 * - Se um construtor customizado não for especificado, a classe disponibiliza o
		 * construtor padrão: Product p = new Product();
		 * 
		 * - É possível especificar mais de um construtor na mesma classe (sobrecarga)
		 */
		
		//Proposta de melhoria para o exercício da class Product - this/construtor
		
		/* Quando executamos o comando abaixo, instanciamos um produto "product" com seus atributos "vazios":
		 * Na memória, os atributos dessa instancia (name, price, quantity) estão zerados.
		 * Entretanto, faz sentido um produto que não tem nome e não tem preço ?
		 * Com o intuito de evitar a existência de produtos sem nome e sem preço, é possível fazer
		 * com que seja obrigatória a iniciação desse valores ?
		 */
				
		//Primeiro é informado os dados através do scanner para que os parametros obrigatórios sejam recebidos pelo produto (objeto) depois
//		System.out.println("Enter product data: ");
//		
//		System.out.print("Name: ");
//		String name = sc.nextLine();
//		System.out.print("Price: ");
//		double price = sc.nextDouble();
//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt();	
//		
//		
//		Product product = new Product(name, price, quantity);
//		
//		System.out.println();
//		System.out.println("Product data: " + product);
//		
//		System.out.println();
//		System.out.println("Enter the number of products to be added in stock: ");
//		quantity = sc.nextInt();
//		product.addProducts(quantity);
//		
//		System.out.println();
//		System.out.println("Updated data: " + product);
//		
//		System.out.println();
//		System.out.println("Enter the number of products to be removed from stock: ");
//		quantity = sc.nextInt();
//		product.removeProducts(quantity);
//		
//		System.out.println();
//		System.out.println("Updated data: " + product);
		
		//Segunda proposta de melhoria para o exercício da class Product - sobrecarga
		
		/* Vamos criar um construtor opcional, o qual recebe apenas nome e preço do produto.
		 * A quantidade em estoque deste novo produto, por padrão, deverá então ser iniciada
		 * com o valor zero.
		 * Também é possível incluir um construtor padrão
		 */
		
//		System.out.println("Enter product data: ");
//		
//		System.out.print("Name: ");
//		String name = sc.nextLine();
//		System.out.print("Price: ");
//		double price = sc.nextDouble();	
//				
//		Product product = new Product(name, price);
//		
//		//encapsulamento
//		product.setName("Computer");
//		System.out.println("Updated name: " + product.getName());
//		product.setPrice(1200.00);
//		System.out.println("Updated price: " + product.getPrice());
//		
//		System.out.println();
//		System.out.println("Product data: " + product);
//		
//		System.out.println();
//		System.out.println("Enter the number of products to be added in stock: ");
//		int quantity = sc.nextInt();
//		product.addProducts(quantity);
//		
//		System.out.println();
//		System.out.println("Updated data: " + product);
//		
//		System.out.println();
//		System.out.println("Enter the number of products to be removed from stock: ");
//		quantity = sc.nextInt();
//		product.removeProducts(quantity);
//		
//		System.out.println();
//		System.out.println("Updated data: " + product);
		
		/* Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta,
		 * o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abria a conta.
		 * Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar
		 * no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, 
		 * naturalmente, zero.
		 * Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado.
		 * Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo.)
		 * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso.
		 * O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado,
		 * o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para
		 * realizar o saque e/ou pagar a taxa.
		 * Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado
		 * o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da
		 * conta após cada operação.
		 * 
		 * Enter account number: 8532*
		 * Enter account holder: Alex Green*
		 * Is there na initial deposit (y/n)? y*
		 * Enter initial deposit value: 500.00*
		 * 
		 * Account data:
		 * Account 8532, Holder: Alex Green, Balace: $ 500.00
		 * 
		 * Enter a deposit value: 200.00*
		 * Updated account data:
		 * Account 8532, Holder: Alex Green, Balance: $ 700.00
		 * 
		 * Enter a withdraw value: 300.00*
		 * Updated account data:
		 * Account 8532, Holder: Alex Green, Balance: $ 395.00
		 * 
		 * * - input do usuário
		 * 
		 * -----------------------------
		 * Account
		 * -----------------------------
		 * - number: Integer
		 * - holder: String
		 * - balance: Double
		 * -----------------------------
		 * + deposit(amount: double):void
		 * + withdraw(amount: double):void
		 * ------------------------------
		 */
		
//		BankAccount account;
//		
//		System.out.print("Enter account number: ");
//		int number = sc.nextInt();
//		System.out.print("Enter account holder: ");
//		sc.nextLine(); //esse nextLine é para consumir a quebra de linha do nextInt anterior e poder ser digitado mais de um nome
//		String holder = sc.nextLine();
//		System.out.print("Is there an initial deposit (y/n)?: ");
//		char res = sc.next().charAt(0);
//		if(res == 'y') {
//			System.out.print("Enter initial deposit value: ");
//			double initialDeposit = sc.nextDouble();
//			account = new BankAccount(number, holder, initialDeposit);
//		}else {
//			account = new BankAccount(number, holder);
//		}
//				
//		
//		System.out.println();
//		System.out.println("Account data: ");
//		System.out.println(account);
//		System.out.println();
//		
//		System.out.print("Enter a deposit value: ");
//		double depositValue = sc.nextDouble();
//		account.deposit(depositValue);
//		System.out.println("Updated account data:");
//		System.out.println(account);
//		System.out.println();
//		
//		System.out.print("Enter a withdraw value: ");
//		double withdrawValue = sc.nextDouble();
//		account.withdraw(withdrawValue);
//		System.out.println("Updated account data:");
//		System.out.println(account);
		

		// Vetores tipo valor (tipo primitivo)
		
		/*
		 * Em programação, "vetor" é o nome dado a arranjos unidimensionais. 
		 * Arranjo (array) é uma estrutura de dados: Homogênea (dados do mesmo tipo), Ordenada
		 * (elementos acessados por meio de posições) e Alocada de uma vez só, em um
		 * bloco contíguo de memória. 
		 * Vantagens: acesso imediato aos elementos pela sua posição. 
		 * Desvantagens: tamanho fixo, dificuldade para se realizar inserções e deleções.
		 * 
		 * Problema exemplo 1
		 * Fazer um programa para ler um número inteiro N e a altura de N pessoas.
		 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
		 */
			
		
//			int N = sc.nextInt();
//			
//			double[] vect = new double[N];
//			
//			for(int i = 0; i < N; i++) {				
//				vect[i] = sc.nextDouble();
//			}
//			
//			double sum = 0.0;
//			
//			for(int i = 0; i < N; i++) {				
//				sum += vect[i];
//			}
//			
//			double avg = sum / N;
//			
//			System.out.printf("AVERAGE HEIGHT: %.2f", avg);
		
		/*
		 * Problema exemplo 2 Fazer um programa para ler um número inteiro N e os dados
		 * (nome e preço) de N produtos. Armazene os N produtos em um vetor. Em seguida,
		 * mostrar preço médio dos produtos.
		 */
		
//		int n = sc.nextInt();		
//		Product[] vect = new Product[n];
//		
//		for(int i = 0; i < vect.length; i++) {
//			sc.nextLine();
//			String name = sc.next();
//			double price = sc.nextDouble();
//			vect[i] = new Product(name, price);
//		}
//		
//		double sum = 0.0;
//		
//		for(int i = 0; i < vect.length; i++) {				
//			sum += vect[i].getPrice();
//		}
//		
//		double avg = sum / vect.length;
//		
//		System.out.printf("AVERAGE PRICE: %.2f", avg);
		
		
		//Exercicios de fixação vetores
		
		/* A correção foi primeiro criar um vetor de 10 indices, indicar pelo scanner
		 * número de quartos a serem alugados, depois dentro do for iniciar o contador
		 * com 1 para que exclua o 0 como 'quarto', e então imprimir o número de quartos
		 * alugados indicados. Depois digitar o nome, email e o nº do quarto alugado
		 * pelo inquilino, e no fim do laço armazenar nome e email no vetor, sendo
		 * o número do quarto alugado representante do índice a armazenar cada inquilino.
		 * Depois foi feito outro laço for para passar por todos os 10 índices e
		 * imprimir somente os dados daquele que atender a condição de não ser nulo.
		 * A analogia seria um hotel de 10 quartos (vetor) onde 3 foram alugados
		 * e o restante está vazio (índices).
		 * Esse solução só foi possível pois sabia-se previamente o número mais alto
		 * dentre os 3 'quartos' a serem alugados.
		 */
		
//		Rent[] vect = new Rent[10];
//		
//		System.out.print("How many rooms will be rented? ");
//		int r = sc.nextInt();
//		
//		for(int i = 1; i <= r; i++) {
//			System.out.println();
//			System.out.println("Rent #" + i + ":");
//			System.out.print("Name: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Email: ");
//			String email = sc.nextLine();
//			System.out.print("Room: ");
//			int room = sc.nextInt();
//			vect[room] = new Rent(name, email);			
//		}		
//		
//		System.out.println();
//		System.out.println("Busy rooms:");
//		for(int i = 0; i < 10; i++) {
//			if(vect[i] != null) {
//				System.out.println(i + ": " + vect[i]);
//			}
//		}
		
		
		/*
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) 
		 * e depois N números inteiros e armazene-os em um vetor. 
		 * Em seguida, mostrar na tela todos os números negativos lidos.
		 */
		
		
//		System.out.println("QuantOs numero voce vai digitar? ");
//		int n = sc.nextInt();
//		
//		int[] vect = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print("Digite um número: ");
//			vect[i] = sc.nextInt();
//		}
//		
//		System.out.println("NUMEROS NEGATIVOS:");
//		for(int i = 0; i < vect.length; i++) {
//			if(vect[i] < 0) {				
//				System.out.println(vect[i]);
//			}
//		}
		
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. 
		 * Em seguida: 
		 * - Imprimir todos os elementos do vetor 
		 * - Mostrar na tela a soma e a média dos elementos do vetor
		 * corrigido
		 */
		
//		System.out.print("QuantOs numero voce vai digitar? ");
//		int n = sc.nextInt();	
//		
//		double[] vect = new double[n];
//		
//				
//		for(int i = 0; i < n; i++) {
//			System.out.print("Digite um número: ");
//			vect[i] = sc.nextDouble();		
//		}
//		
//		double soma, media;
//		
//		soma = 0;
//		
//		for(int i = 0; i < vect.length; i++) {
//			soma += vect[i];
//		}
//		
//		media = soma / vect.length;
//		
//		System.out.print("VALORES = ");
//		for(int i = 0; i < vect.length; i++) {
//			System.out.printf("%.1f ", vect[i]);			
//		}	
//		System.out.printf("\nSOMA = %.2f\n", soma);
//		System.out.printf("MEDIA = %.2f\n", media);
		
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, 
		 * conforme exemplo. Depois, mostrar na tela a altura média das pessoas, 
		 * e mostrar também a porcentagem de pessoas com menos de 16 anos, 
		 * bem como os nomes dessas pessoas caso houver. - corrigido
		 */
		
//		System.out.print("Quantas pessoas serão registradas? ");
//		int n = sc.nextInt();
//		
//		Pessoa[] pessoas = new Pessoa[n];
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println();
//			System.out.printf("Dados da %da pessoa:\n", i);
//			System.out.print("Nome: ");
//			sc.nextLine();
//			String name = sc.next();
//			System.out.print("Idade: ");
//			int age = sc.nextInt();
//			System.out.print("Altura: ");
//			double height = sc.nextDouble();
//			pessoas[i-1] = new Pessoa(name, age, height);	
//			System.out.println();
//		}
//		
//		double alturaMedia = 0;
//				
//		for(int i = 0; i < pessoas.length; i++) {
//			alturaMedia += pessoas[i].getHeight(); 
//		}
//		
//		alturaMedia /= (double) pessoas.length; 
//		
//		System.out.printf("Altura média: %.2f%n", alturaMedia);
//		
//		double menorDe16 = 0;
//		
//		for(int i = 0; i < pessoas.length; i++) {
//			if(pessoas[i].getAge() < 16) {	
//				menorDe16++;
//			}
//		}						
//		
//		menorDe16 = ((double) menorDe16 / pessoas.length) * 100.0;
//		
//		System.out.println("Pessoas com menos de 16 anos: " + menorDe16 + "%");
//
//		for(int i = 0; i < pessoas.length; i++) {
//			if(pessoas[i].getAge() < 16) {				
//				System.out.println(pessoas[i].getName());
//			}
//		}
		
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. 
		 * Em seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares. - corrigido
		 */
		
//		int n, qntdPares;  
//		
//		System.out.print("Quantos numeros você vai digitar? ");
//		n = sc.nextInt();
//		
//		int[] numeros = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print("Digite um numero: ");
//			numeros[i] = sc.nextInt();			
//		}
//		
//		System.out.println("\nNUMEROS PARES:");
//		
//		qntdPares = 0;		
//		for(int i = 0; i < numeros.length; i++) {
//			if(numeros[i] % 2 == 0) {
//				System.out.printf("%d ", numeros[i]);
//				qntdPares++;
//			}
//		}
//		
//		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qntdPares);	
		
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 * Mostrar também a posição do maior elemento, considerando a primeira posição
		 * como 0 (zero). - corrigido
		 */
			
		
//		int n, posmaior;
//		double maior;
//		
//		System.out.print("Quantos numeros você vai digitar? ");
//		n = sc.nextInt();
//		
//		double[] vetor = new double[n];
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print("Digite um número: ");
//			vetor[i] = sc.nextDouble();
//		}
//		
//		maior = vetor[0];
//		posmaior = 0;
//				
//		for(int i = 0; i < vetor.length; i++) {
//			if(vetor[i] > maior) {
//				maior = vetor[i];
//				posmaior = i;
//			}
//		}
//		
//		System.out.println();
//		System.out.printf("MAIOR VALOR = %.1f\n", maior);
//		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

		
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado. - ok
		 */
			
//		System.out.print("Quantos valores vai ter cada vetor? ");
//		int n = sc.nextInt();
//		
//		int[] vetorA = new int[n];
//		int[] vetorB = new int[n];
//		int[] vetorC = new int[n];
//		
//		System.out.println("Digite os valores do vetor A:");
//		for(int i = 0; i < n; i++) {
//			vetorA[i] = sc.nextInt();
//		}
//		
//		System.out.println("Digite os valores do vetor B:");
//		for(int i = 0; i < n; i++) {
//			vetorB[i] = sc.nextInt();
//		}
//				
//		System.out.println("VETOR RESULTANTE:");
//		for(int i = 0; i < n; i++) {
//			vetorC[i] = vetorA[i] + vetorB[i];
//			System.out.println(vetorC[i]);
//		}
		
		/*
		 * Fazer um programa para ler um número inteiro N e depois um vetor de N números
		 * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com
		 * três casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da média, com uma casa decimal cada. - ok
		 */
		
//		System.out.print("Quantos elementos vai ter o vetor? ");
//		int n = sc.nextInt();
//		
//		double[] vetor = new double[n];
//		
//		double media, soma;
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print("Digite um número: ");
//			vetor[i] = sc.nextDouble();
//		}
//			
//		soma = 0.0;
//		for(int i = 0; i < vetor.length; i++) {			
//			soma += vetor[i];
//		}
//		
//		media = (double) soma / vetor.length;
//		
//		System.out.println();
//		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
//		
//		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
//		for(int i = 0; i < vetor.length; i++) {
//			if(vetor[i] < media) {
//				System.out.printf("%.1f%n", vetor[i]);
//			}
//		}
		
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		 * mostrar na tela a média aritmética somente dos números pares lidos, com uma
		 * casa decimal. Se nenhum número par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR" - ok
		 */
		
//		double media;
//		int n, soma, qtdPares;
//		
//		System.out.print("Quantos elementos vai ter o vetor? ");
//		n = sc.nextInt();
//		
//		int[] vetor = new int[n];
//				
//		for(int i = 0; i < n; i++) {
//			vetor[i] = sc.nextInt();			
//		}
//		
//		soma = 0;
//		qtdPares = 0;
//		for(int i = 0; i < vetor.length; i++) {
//			if(vetor[i] % 2 == 0) {
//				soma += vetor[i];
//				qtdPares++;
//			}
//		}		
//		
//		if(soma > 0) {
//			media = soma / qtdPares;
//			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
//		}else {
//			System.out.println("NENHUM NUMERO PAR");
//		}
		
		
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
		 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
		 * vetor. Depois, mostrar na tela o nome da pessoa mais velha. - corrigido
		 */
			
//		int n, idadeMaior;
//		String posMaior;
//		
//		System.out.print("Quantas pessoas voce vai digitar? ");
//		n = sc.nextInt();
//		
//		String[] nomes = new String[n];		
//		int[] idades = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			System.out.printf("Dados da %da pessoa: %n", i + 1);
//			System.out.print("Nome: ");
//			nomes[i] = sc.next();
//			System.out.print("Idade: ");
//			idades[i] = sc.nextInt();			
//		}
//		
//		idadeMaior = 0;
//		posMaior = nomes[0];
//		
//		for(int i = 0; i < n; i++) {
//			if(idadeMaior < idades[i]) {
//				idadeMaior = idades[i];
//				posMaior = nomes[i];
//			}
//		}
//				
//		System.out.println("PESSOA MAIS VELHAS: " + posMaior);
		
		
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
		 * (seis). - corrigido
		 */
		
//		int n;
//		double media;
//		
//		System.out.print("Quantos alunos serao digitados? ");
//		n = sc.nextInt();
//		
//		String[] alunos = new String[n];
//		double[] notas1 = new double[n];
//		double[] notas2 = new double[n];
//		
//		for(int i = 0; i < n; i++) {
//			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
//			sc.nextLine();
//			alunos[i] = sc.nextLine();
//			notas1[i] = sc.nextDouble();
//			notas2[i] = sc.nextDouble();
//		}
//		
//				
//		for(int i = 0; i < n; i++) {
//			media = (notas1[i] + notas2[i]) / 2;
//			if(media >= 6.0) {
//				System.out.println(alunos[i]);
//			}
//		}
//							
		
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * média de altura das mulheres, e o número de homens. - corrigido
		 */
		
//		int n, homens, mulheres;
//		double menorAltura, maiorAltura, alturaMulheres, mediaAlturaMulheres;
//		
//		System.out.print("Quantas pessoas serao digitadas? ");
//		n = sc.nextInt();
//		
//		double[] altura = new double[n];
//		char[] genero = new char[n];
//		
//		for(int i = 0; i < n; i++) {
//			System.out.printf("Altura da %da pessoa: ", i + 1);
//			altura[i] = sc.nextDouble();
//			System.out.printf("Genero da %da pessoa: ", i + 1);
//			genero[i] = sc.next().charAt(0);
//		}
//		
//		
//		maiorAltura = altura[0];
//		for(int i = 0; i < altura.length; i++) {
//			if(altura[i] > maiorAltura) {
//				maiorAltura = altura[i];
//			}
//		}
//		
//		menorAltura = maiorAltura;
//		for(int i = 0; i < altura.length; i++) {
//			if(altura[i] < menorAltura) {
//				menorAltura = altura[i];
//			}
//		}
//			
//		
//		alturaMulheres = 0.0;
//		mulheres = 0;
//		homens = 0;
//		for(int i = 0; i < n; i++) {
//			if(genero[i] == 'F') {
//				alturaMulheres += altura[i];
//				mulheres++;
//			}else{
//				homens++;
//			}
//		}
//		
//		mediaAlturaMulheres = alturaMulheres / mulheres;
//		
//		
//		System.out.printf("Menor altura = %.2f\n", menorAltura);
//		System.out.printf("Maior altura = %.2f\n", maiorAltura);
//		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
//		System.out.printf("Numero de homens = %d\n", homens);
		
		/*
		 * Boxing, unboxing, wrapper classes
		 * 
		 * - Boxing é o processo de conversão de um objeto tipo valor para um objeto
		 * tipo referência compatível
		 * 
		 * int x = 20; 
		 * Object obj = x;
		 * 
		 * Object é a classe mais genérica do Java, todas as classes por padrão são
		 * 'filhas' dessa classe object. No caso acima, x passa a ser do tipo object e
		 * será alocado um objeto no heap contendo o valor 20 e a variável obj será
		 * ponteiro para essa alocação.
		 * 
		 * - Unboxing é o processo de conversão de um objeto tipo referência para um
		 * objeto tipo valor compatível
		 * 
		 * int y = (int) obj;
		 * 
		 * Será criada no stack uma alocação y tipo valor com valor 20
		 * 
		 * - Wrapper classes 
		 * São classes equivalentes aos tipos primitivos, para que
		 * boxing e unboxing seja feito de forma natural na linguagem. Para cada tipo
		 * primitivo, ele tem um tipo classe compatível com o mesmo tipo - 
		 * Exemplo:
		 * int(primitivo) = Integer(classe), 
		 * boolean(primitivo) = Boolean(classe),
		 * char(primitivo) = Character(classe), 
		 * byte(primitivo) = Byte(classe). 
		 * Elas tem o objetivo de tratar os tipos primitivos como classes, de forma transparente
		 * ao compilador, evitando conversões e castings. Uso comum de wrapper classes:
		 * campos de entidade em sistemas de informação (IMPORTANTE!) - pois tipos
		 * referência (classes) aceitam valor null e usufruem dos recursos OO
		 * 
		 * Sem wrapper 
		 * class int x = 20; 
		 * Object obj = x; 
		 * int y = (int) obj;
		 * 
		 * Com wrapper 
		 * class int x = 20; 
		 * Integer obj = x; 
		 * int y = obj;
		 * 
		 * Utilizar em atributos de classes e declaração de variáveis
		 */
		
		/* Laço "for each" 
		 * Sintaxe opcional e simplificada para percorrer coleções
		 * 
		 * Sintaxe:
		 * for (Tipo apelido : coleção){
		 *		<comando 1>
		 *		<comando 2>
		 * }
		 */

//		String[] vect = new String[]{"Maria", "Bob", "Joao"};
//		
//		System.out.println("laço for");
//		
//		//laço for
//		for(int i = 0; i < vect.length; i++) {
//			System.out.println(vect[i]);
//		}
//		
//		System.out.println("---------------------------");
//		
//		System.out.println("laço for each");
//		
//		//laço for each
//		for(String obj : vect) {
//			System.out.println(obj);
//		}
		
		/*
		 * Listas 
		 * - Conceito de lista: é uma estrutura de dados homogênea (dados do
		 * mesmo tipo), ordenada (elementos acessados por meio de posições), inicia
		 * vazia, e seus elementos sãoa locados sob demanda, cada elemento ocupa um "nó"
		 * (ou nodo) da lista 
		 * - Tipo (interface): List (! não é classe, é interface) ->
		 * interface é um tipo que define apenas as especificações das operações. 
		 * - Classes que implementam: ArrayList(mistura de vetor e lista), LinkedList,
		 * etc. -> utilizadas para implementar a interface List, pois ela sozinha não
		 * pode ser implementada pois não é classe. 
		 * - Vantagens: tamanho variável,facilidade para se realizar inserções e deleções 
		 * - Desvantagens: acesso sequencial aos elementos* -> dependendo da implementação da lista, a navegação
		 * é otimizada, como é o caso de ArrayList 
		 * Demo: 
		 * - Tamanho da lista: size() 
		 * - Inserir elemento na lista: add(obj), add(int, obj) 
		 * - Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate) 
		 * - Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj) 
		 * - Filtrar lista com base em predicado: 
		 * List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList()); 
		 * - Encontrar primeira ocorrência com base em predicado: 
		 * Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		 * - Assuntos pendentes: interfaces, generics, predicados (lambda)
		 */
		
		//List não aceita tipos primitivos, como int, char, etc
		//<Integer> é o generics, quando pode parametrizar a definição de um tipo informando um outro tipo específico
		//= new ArrayList<>(); é a classe que implementa a interface List
//		List<String> list = new ArrayList<>();
		
		//adicionando itens a lista
//		list.add("Maria");
//		list.add("Ana");
//		list.add("Bob");
//		list.add("Joao");
//		//adiciona elemento em uma posição específica
//		list.add(2, "Marco");
		
		//consultar tamanho da lista
//		System.out.println("Tamanho da lista: " + list.size());
		
		//percorrendo e imprimindo a lista
//		for(String x : list) {
//			System.out.println(x);
//		}
		
		//removendo da lista
			//list.remove("Ana");
			//list.remove(3);
//		System.out.println("--------------------");
		//removendo da lista por predicado atráves de função lambda (que retorna true or false)
		//remove todos os itens que o primeiro caractere é M - "x -> x.charAt(0) == 'M'" é uma função lambda
//		list.removeIf(x -> x.charAt(0) == 'M');
//		
//		for(String x : list) {
//			System.out.println(x);
//		}
//		System.out.println("--------------------");
		//encontrando a posição de um elemento
//		System.out.println("index of Bob: " + list.indexOf("Bob"));
		//encontrando a posição de um elemento que não existe
//		System.out.println("index of Felix: " + list.indexOf("Felix"));
//		System.out.println("--------------------");
		//filtrar a lista por predicado
		//Uma nova lista irá receber os resultados filtrados de list; list por sua vez deve ser convertido em stream para poder filtrar pela operação lambda e depois o stream é convertido em lista novamente através do collect e retorna o resultado para a nova lista 
//		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
//		for(String x : result) {
//			System.out.println(x);
//		}
//		System.out.println("--------------------");
		//encontrar elemento da lista que atenda a um certo predicado
		//a lista será filtrada para encontrar o primeiro elemento que tenha a letra 'A' e será armzenada na variável name, se o elemento não exisitr, ele retorna nulo
//		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
//		System.out.println(name);
//		System.out.println("--------------------");
//		
//		String name2 = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
//		System.out.println(name2);
		
		/*
		 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario)
		 * de N funcionários. Não deve haver repetição de id.
		 * Em seguida, efetuar o aumento de x por ceno no salário de um determinado funcionário.
		 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir,
		 * mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada
		 * dos funcionários, conforme exemplos.
		 * Lembre-se de aplicar a técnica de encapsulamento para não permitr que o salário possa
		 * ser mudado livremente. Um salário só pode ser aumentado com base em uma operação
		 * de aumento por porcentagem dada.
		 */
		

//		List<EmployeeList> list = new ArrayList<EmployeeList>();
//		
//		System.out.print("How many employees will be registered? ");
//		int n = sc.nextInt();
//				
//		for (int i = 0; i < n; i++) {
//			System.out.println();
//			System.out.printf("Employee #%d:\n", i + 1);
//			System.out.print("Id:");
//			Integer id = sc.nextInt();
//			System.out.print("Name:");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Salary:");
//			Double salary = sc.nextDouble();
//			
//			EmployeeList funcionario = new EmployeeList(id, name, salary);
//			
//			list.add(funcionario);
//		}
//		
//		System.out.println();
//		System.out.print("Enter the employee id that will have salary increase: ");
//		int idSalary = sc.nextInt();
//		
//		Integer pos = position(list, idSalary);
//		if(pos == null) {
//			System.out.println("This id does not exist!");
//		}else {
//			System.out.print("Enter the percentage: ");
//			double percent = sc.nextDouble();
//			list.get(pos).increaseSalary(percent);
//		}
//		
//		System.out.println();
//		System.out.println("List of employees: ");
//		
//		for(EmployeeList emp : list) {
//			System.out.println(emp);
//		}
		
		// Matrizes
		
		/*- Conceito de matriz: nome dado a arranjos (array) bidimensionais - linhas (1º indice) e colunas (2º indice) - 
		 * (ao contrário do vetor, que seria um arranjo unidimensional) - "vetor de vetores"; 
		 * Assim como todo array, ele é uma estrutura de dados homogênea, ordenada e é alocada de uma vez só, em um bloco contíguo de memória.
		 * - Vantagens: acesso imediato aos elementos pela sua posição.
		 * - Desvantagens: tamanho fixo e dificuldade para se realizar inserções e deleções
		 */
		
		/*
		 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N
		 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a
		 * quantidade de valores negativos da matriz.
		 * ------------
		 * ENTRADA:
		 * 3
		 * 5 -3 10
		 * 15 8 2
		 * 7 9 -4
		 * ------------
		 * SAÍDA:
		 * Main diagonal:
		 * 5 8 -4
		 * Negative numbers = 2 
		 * -------------
		 */
		
//		int n = sc.nextInt();
		//numero de colchetes de acordo com a dimensão (uni, bi, tri..)
//		int[][] mat = new int[n][n];
//		
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j++) {
//				mat[i][j] = sc.nextInt();
//			}
//		}
//		
//		System.out.println("Main diagonal:");
//		for(int i = 0; i < n; i++) {
//			System.out.print(mat[i][i] + " ");
//		}
//		System.out.println();
//		
//		int count = 0;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if(mat[i][j] < 0) {
//					count++;
//				}
//			}
//		}
//		System.out.println("Negative numbers = " + count);
		
		/*
		 * Fazer um programa para ler dois números inteiros M e N, e depois ler
		 * uma matriz M linhas por N colunas contendo números inteiros, podendo haver
		 * repetições. Em seguida, ler um número inteiro X que pertence à matriz.
		 * Para casa ocorrência de X, mostrar os valores à esquerda, acima, à direita e 
		 * abaixo de X, quando houver, conforme exemplo. - corrigido
		 * ---------------
		 * ENTRADA
		 * 3 4 
		 * 10 8 15 12
		 * 21 11 23 8
		 * 14 5 13 19
		 * 8
		 * ---------------
		 * SAÍDA
		 * Position 0,1:
		 * Left: 10
		 * Right: 15
		 * Down: 11
		 * Position 1,3:
		 * Left: 23
		 * Up: 12
		 * Down: 19
		 */
		
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		
//		int[][] mat = new int[m][n];
//		
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j++) {
//				mat[i][j] = sc.nextInt();
//			}
//		}
//		
//		int x = sc.nextInt();
//		//int posX = 0;
//		//int posY = 0;
//		for(int i = 0; i < mat.length; i++) {
//			for(int j = 0; j < mat[i].length; j++) {
//				if(mat[i][j] == x) {
//					//posX = i;
//					//posY = j;
//					System.out.println("Position " + i + "," + j + ":");
					//if(i == 0 && j > 0 && j < mat[i].length) {						
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i == 0 && j == 0) {
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);						
					//}else if(i > 0 && j == mat[i].length ) {
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);						
					//}else if(i > 0 && i < mat.length && j > 0 && j < mat[i].length) {
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i > 0 && i < mat.length && j == mat[i].length) {
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Left: " + mat[posX][posY - 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i > 0 && i < mat.length && j == 0) {
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Right: " + mat[posX][posY + 1]);
						//System.out.println("Down: " + mat[posX + 1][posY]);
					//}else if(i == mat.length && j == mat[i].length){
						//System.out.println("Up: " + mat[posX - 1][posY]);
						//System.out.println("Left: " + mat[posX][posY - 1]);
					//}	
//					if(j > 0) {
//						System.out.println("Left: " + mat[i][j - 1]);
//					}
//					if(i > 0) {
//						System.out.println("Up: " + mat[i - 1][j]);
//					}
//					if(j < mat[i].length-1) {
//						System.out.println("Right: " + mat[i][j + 1]);
//					}
//					if(i < mat.length-1) {
//						System.out.println("Down: " + mat[i+1][j]);
//					}
//				}
//			}
//		}
		
		// Operações data-hora
		
		//cria objeto modelo para formatar data
//		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//withZone(ZoneId.systemDefault())recupera o fuso horário do computador do usuário e o horario argumento será convertido para 
//		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//formato ISO
//		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
//		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		//Instanciação - agora
		
		//data local
//		LocalDate d01 = LocalDate.now();
//		System.out.println("d01 = " + d01);
		
		//data-hora local
//		LocalDateTime d02 = LocalDateTime.now();
//		System.out.println("d02 = " + d02);
		
		//data-hora global (GMT/Z/UTC - Londres)
//		Instant d03 = Instant.now();
//		System.out.println("d03 = " + d03);
		
		//Instanciação - ISO 8601
		
//		LocalDate d04 = LocalDate.parse("2021-08-15");
//		System.out.println("d04 = " + d04);
		//exemplos de formatação
//		System.out.println("d04 = " + d04.format(fmt1));
//		System.out.println("d04 = " + fmt1.format(d04));
//		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
//		LocalDateTime d05 = LocalDateTime.parse("2021-08-15T01:30:26");
//		System.out.println("d05 = " + d05);
		//exemplos de formatação
//		System.out.println("d05 = " + d05.format(fmt1));
//		System.out.println("d05 = " + d05.format(fmt2));
//		System.out.println("d05 = " + d05.format(fmt4));
		
//		Instant d06 = Instant.parse("2021-08-15T01:30:26Z");
//		System.out.println("d06 = " + d06);
		//exemplos de formatação
		//Instant não aceita .format direto
//		System.out.println("d06 = " + fmt3.format(d06));
//		System.out.println("d06 = " + fmt5.format(d06));

		// ERRO - Exception "could not be parsed"
		//Instant d07 = Instant.parse("2021-08-15T01:30:26-03:00");
		//System.out.println("d07 = " + d07);
		
		//Instanciação - Texto customizado (DateTimeFormatter)
		
//		LocalDate d08 = LocalDate.parse("15/08/2021", fmt1);
//		System.out.println("d08 = " + d08);

		// ERRO - não aparece horário
//		LocalDate d09 = LocalDate.parse("15/08/2021 01:30", fmt2);
//		System.out.println("d09 = " + d09);
//		
//		LocalDate d10 = LocalDate.parse("15/08/2021", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		System.out.println("d10 = " + d10);
//		
//		LocalDate d11 = LocalDate.of(2022, 7, 20);
//		System.out.println("d11 = " + d11);
//		
//		LocalDateTime d12 = LocalDateTime.of(2021, 8 , 15, 1, 30);
//		System.out.println("d12 = " + d12);
		
		
		//laço mostra todos os fusos horários disponíveis
//		System.out.println("\n---------- FUSO HORÁRIOS: ----------");
//		for(String s : ZoneId.getAvailableZoneIds()) {			
//			System.out.println(s);
//		}
		
		//converter data-hora global para local		
		//converte o obj d06 para uma data-hora local considerando o fuso horário da maquina atual
//		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());		
//		System.out.println(r1);
		//converte o obj d06 para uma data-hora local considerando o fuso horário como argumento
//		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));		
//		System.out.println(r2);
		
//		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
//		System.out.println(r3);
//		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
//		System.out.println(r4);
		
		//obter dados de uma data-hora local
//		System.out.println("d04 dia = " + d04.getDayOfMonth());
//		System.out.println("d04 mes = " + d04.getMonthValue());
//		System.out.println("d04 ano = " + d04.getYear());
//		System.out.println("d04 dia do ano = " + d04.getDayOfYear());
//		
//		System.out.println("d05 hora = " + d05.getHour());
//		System.out.println("d05 minuto = " + d05.getMinute());
		
		//calculos com data-hora
		
//		LocalDate d13 = LocalDate.parse("2024-06-03");
//		LocalDateTime d14 = LocalDateTime.parse("2024-06-03T16:27:15");
//		Instant d15 = Instant.parse("2024-06-03T16:27:15Z");
//		
//		LocalDate pastWeekLocalDate = d13.minusDays(7);
//		LocalDate nextWeekLocalDate = d13.plusDays(7);
//		LocalDate yearsLocalDate = d13.plusYears(7);
//		
//		System.out.println("a week ago = " + pastWeekLocalDate);
//		System.out.println("next week = " + nextWeekLocalDate);
//		System.out.println("in 7 years = " + yearsLocalDate);
//		
//		LocalDateTime pastWeekLocalDateTime = d14.minusDays(7);
//		LocalDateTime nextWeekLocalDateTime = d14.plusDays(7);
//		LocalDateTime yearsLocalDateTime = d14.plusYears(7);
//		
//		System.out.println("a week ago = " + pastWeekLocalDateTime);
//		System.out.println("next week = " + nextWeekLocalDateTime);
//		System.out.println("in 7 years = " + yearsLocalDateTime);
//		
//		Instant pastWeekInstant  = d15.minus(7, ChronoUnit.DAYS);
//		Instant nextWeekInstant = d15.plus(7, ChronoUnit.DAYS);
//		
//		System.out.println("a week ago = " + pastWeekInstant);
//		System.out.println("next week = " + nextWeekInstant);
		
		//duração - deve ser calculada entre mesmos tipos (! obrigatorio ser LocalDateTime - não LocalDate, ou, converter por para horas (atTime() ou similar))
//		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d13.atTime(0, 0));
//		System.out.println("t1 days = " + t1.toDays());
//		
//		Duration t2 = Duration.between(pastWeekLocalDateTime, d14);
//		System.out.println("t2 days = " + t2.toDays());
//		
//		Duration t3 = Duration.between(pastWeekInstant, d15);
//		System.out.println("t3 days = " + t3.toDays());
		
		//quando a primeira dara é maior que a segunda, o resultado é negativo
//		Duration t4 = Duration.between(d15, pastWeekInstant);
//		System.out.println("t4 days = " + t4.toDays());
		
		//enumerações, composição
		
		//utilizando classe que utiliza enum como atributo
//		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);		
//		System.out.println(order);
		
		//conversão de string para enum - ambos serão o mesmo valor enum caso a escrita esteja correta
		
//		OrderStatus os1 = OrderStatus.DELIVERED;		
//		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
//		
//		System.out.println(os1);
//		System.out.println(os2);
		
		//Notação UML para enum
		
		/*
		-----------------------
		<<enum>>
		OrderStatus
		-----------------------
		PENDING_PAYMENT: int = 0
		PROCESSING: int = 1
		SHIPPED: int = 2
		DELIVERED: int = 3
		-----------------------
		*/
		
		//design
		
		/* - Categoria de classes: em um sistema orientado a objetos, 
		 * de modo geral "tudo" é objeto.
		 * - Por questões de design tais como organização, flexibilidade, reuso, 
		 * delegação, etc. há várias categorias de classes: 
		 * Views - telas/front
		 * Controllers - mediador entre view e sistema
		 * Entities - classes entidades do negócio
		 * Services - classes serviços do negócio
		 * Repositories - objetos responsáveis por acessar DB
		 */
		
		//composição
		
		/* - É um tipo de associação que permite que um objeto contenha outro
		 * - Relação "tem-um" ou "tem-vários"
		 * - Vantagens: Organização (divisão de responsabilidades), coesão, 
		 * flexibilidade, reuso
		 * - Nota: embora o símbolo UML para composição (todo-parte) seja o diamante preto, 
		 * neste contexto estamos chamando de composição qualquer associação tipo "tem-um" e 
		 * "tem-vários"
		 */
		
		//Exercicio 1 - resolvido (https://github.com/acenelio/composition1-java)
		
		/* Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). 
		 * Depois, solicitar do usuário um mês e mostrar qual foi o salário do funcionário
		 * nesse mês, conforme exemplo
		 */	
		
//		System.out.print("Enter department's name: ");
//		String departmentName = sc.nextLine();
//		System.out.print("Enter worker data: ");
//		String workerName = sc.nextLine();
//		System.out.print("Enter worker level: ");
//		String workerLevel = sc.nextLine();
//		System.out.print("Base salary: ");
//		double baseSalary = sc.nextDouble();
		
		//WorkerLevel.valueOf(workerLevel) => para equiparar a string digitada a variavel da enumeração
		//new Department(departmentName) => foi instanciada pois esse argumento trata-se de outro objeto, recebendo a string digitada
		//na memória, criam-se 2 objetos relacionados: worker e department
//		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		
//		System.out.print("How many contracts to this worker? ");
//		int n = sc.nextInt();
		
		//mascara para data
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Enter contract #" + i + " data: ");
//			System.out.print("Date (DD/MM/YYYY): ");
//			Date contractDate = sdf.parse(sc.next());
//			System.out.print("Value per hour: ");
//			double valuePerHour = sc.nextDouble();
//			System.out.print("Duration (hours): ");
//			int hours = sc.nextInt();
//			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
//			worker.addContract(contract);
//		}
//		
//		System.out.println();
//		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
//		String monthAndYear = sc.next();
		//recebe a data monthAndYear em string, depois recorta o que diz respeito ao mês e armazena convertendo para int; o mesmo se repete para o ano
//		int month = Integer.parseInt(monthAndYear.substring(0, 2));
//		int year = Integer.parseInt(monthAndYear.substring(3));
//		
//		System.out.println("Name: " + worker.getName());
//		System.out.println("Department: " + worker.getDepartment().getName());
//		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		//Exercicio 2 - resolvido (https://github.com/acenelio/composition2-java)
		
		/*
		 * Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os na tela do terminal, 
		 * conforme exemplo
		 */
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		
//		Comment c1 = new Comment("Have a nice trip");
//		Comment c2 = new Comment("Wow that's awesome!");
//		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
//		
//		p1.addComment(c1);
//		p1.addComment(c2);
//		
//		System.out.println(p1);
//		
//		Comment c3 = new Comment("Good night");
//		Comment c4 = new Comment("May the force be with you");
//		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
//		
//		p2.addComment(c3);
//		p2.addComment(c4);
//		
//		System.out.println(p2);
		
		//Exercicio de fixação (https://github.com/acenelio/composition3-java)
		
		/*
		 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um sumário 
		 * do pedido conforme exemplo. Nota: o instante do pedido deve ser o instante do sistema: new Date();
		 */
		
//		SimpleDateFormat maskDate = new SimpleDateFormat("dd/MM/yyyy");
//		
//		
//		System.out.println("Enter client data:");
//		System.out.print("Name: ");
//		String name = sc.nextLine();
//		System.out.print("Email: ");
//		String email = sc.nextLine();
//		System.out.print("Birth date (DD/MM/YYYY): ");
//		Date birthDate = maskDate.parse(sc.next());
//		
//		Client client = new Client(name, email, birthDate);
//		
//		System.out.println("Enter order data: ");
//		System.out.print("Status: ");
//		sc.nextLine();
//		OrderStatus status = OrderStatus.valueOf(sc.next());
//		
//		OrderShop order = new OrderShop(new Date(), status, client);
//		
//		System.out.print("How many items to this order ? ");	
//		int n = sc.nextInt();
//								
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Enter #" + i + " item data:");
//			System.out.print("Product name: ");
//			sc.nextLine();
//			String productName = sc.nextLine();
//			System.out.print("Product price: ");
//			double price = sc.nextDouble();
//			
//			ProductShop product = new ProductShop(productName, price);
//			
//			System.out.print("Quantity: ");
//			int qtd = sc.nextInt();
//			
//			OrderItem item = new OrderItem(qtd, price, product);	
//			
//			order.addItem(item);
//		}
//	
//		
//		System.out.println();
//		System.out.println("ORDER SUMMARY:");
//		System.out.println(order);
		
		//Herança - class Account e class BusinessAccount
		
		/*
		 * - É um tipo de associação que permite que uma classe herde todos dados e 
		 * comportamento de outra
		 * - Definições importantes
		 * - Vantagens: reuso e polimorfismo
		 * - Sintaxe: class A extends B
		 * - Relação "é-um" - no exemplo, a conta empresarial também é uma conta comum 
		 * quando extende a super classe
		 * - Generalização/especialização - no exemplo, a conta comum é uma generalização 
		 * e a conta empresarial é uma especialização
		 * - superclasse (classe base) / subclasse (classe derivada)
		 * - Herança/extensão
		 * - Herança é uma associação entre classes (e não entre objetos)
		 * herança é associação entre classes e composição é associação entre objetos 
		 * - na memória, a herança teria apenas um objeto com todos os atributos de ambas 
		 * as classes e na composição criam-se objetos distintos
		 * Herança permite o reuso de atributos e métodos (dados e comportamento)
		 * 
		 * Exemplo na classe Account e BusinessAccount:
		 * suponha um negócio de banco que possui uma conta comum e uma conta para empresas,
		 * sendo que a conta para empresa possui todos membros da conta comum, mais um limite 
		 * de empréstimo e uma operação de realizar empréstimo.
		 * A classe conta comum será a super classe, que será extendida pela agora 
		 * subclasse conta para empresas e os atributos do construtor da super classe 
		 * serão atribuidos no construtor da subclasse através do método super(); junto com
		 * qualquer outra atribuição própria 

		 */
		
		//Upcasting e Downcasting
		
		/*
		 * Upcasting: casting da subclasse para a superclasse; 
		 * Uso comum: polimorfismo
		 * 
		 * Downcasting: casting da superclasse para subclasse; 
		 * Palavra instaceof; 
		 * Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)
		 * 
		 * Exemplo na classe Account, BusinessAccount e SavingsAccount:
		 */
		
//		Account acc = new Account(1001, "Bob", 0.0);
//		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING	- objeto da subclasse (bacc) sendo atribuido a objeto da superclasse (acc)
		//não é acusado erro nessa relação pois a herança é relação "é-um", tornando subclasse e superclasse um mesmo tipo
//		Account acc1 = bacc;
//		acc1.getBalance();	
//		
//		Account acc2 = new BusinessAccount(1003, "João", 0.0, 200.0);
//		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING - objeto da superclasse (acc2) sendo atribuido a objeto da subclasse (acc4)
		//para evitar erro, é necessário o casting manual
//		BusinessAccount acc4 = (BusinessAccount) acc2;
//		acc4.loan(100.0);
		
		//SIMULAÇÃO DE ERRO
		//SavingsAccount NÃO pode ser convertido para BusinessAccount
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		
		/* ! subclasses distintas que estendem a mesma superclasse não podem se instanciar uma a outra */
		
		//TESTE - se acc3 recebe um objeto que seja instancia do tipo BusinessAccount, ele então poderá realizar o casting
//		if(acc3 instanceof BusinessAccount) {
//			BusinessAccount acc5 = (BusinessAccount) acc3;
//			acc5.loan(200.0);
//			System.out.println("Loan");
//		}
//		
//		if(acc3 instanceof SavingsAccount) {
//			SavingsAccount acc5 = (SavingsAccount) acc3;
//			acc5.updateBalance();
//			System.out.println("Update");
//		}
		
		//Sobreposição ou sobrescrita
		
		/*
		 * É a implementação de um método de uma superclasse na subclasse; è fortemente recomendável usar 
		 * a anotação @Override em um método sobrescrito - facilita a leitura e compreensão do código; 
		 * Avisamos ao compilador (boa prática)
		 */
		
		/* Suponha que a operação de saque possui uma taxa no valor de 5.0. Entretanto, se a conta for do tipo
		 * poupança, esta taxa não deve ser cobrada.
		 * Para resolver, sobreescrevemos o método withdraw na subclasse SavingsAccount
		 * 
		 */
		
		//método withdraw original
//		Account acc1 = new Account(1001, "Bob", 1000.0);
//		acc1.withdraw(200.0);
//		System.out.println(acc1.getBalance());
		
		//Override do método withdraw
//		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
//		acc2.withdraw(200.0);
//		System.out.println(acc2.getBalance());
		
		//Override do método withdraw original c/ super
//		Account acc3 = new BusinessAccount(1003, "João", 1000.0, 500.0);
//		acc3.withdraw(200.0);
//		System.out.println(acc3.getBalance());
		
		//Polimorfismo
		
		/*
		 * Pilares da OOP:
		 * - Encapsulamento
		 * - Herança 
		 * - Polimorfismo
		 * Em programação orientada a objetos, polimorfismo é recurso que permite que variáveis de um mesmo tipo mais 
		 * genérico possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes 
		 * conforme cada tipo específico.
		 * 
		 * No exemplo acima, haverão objetos de tipos diferentes na memória, mas as variaveis que apontam para esses 
		 * objetos são de um mesmo tipo.
		 */
		
//		Account x = new Account(1020, "Bob", 1000.0);
//		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
//
//		x.withdraw(50.0);
//		y.withdraw(50.0);
//		
//		System.out.println(x.getBalance());
//		System.out.println(y.getBalance());
		
		/* No exemplo acima, haverão objetos de tipos diferentes na memória, mas as variaveis que apontam para esses 
		 * objetos são de um mesmo tipo.
		 * 
		 * IMPORTANTE ENTENDER:
		 * - A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting).
		 * - O compilador não sabe para qual tipo específico a chamada do método Withdraw está sendo feita (ele só
		 * sabe que são duas variáveis tipo Account);
		 */
		
		//Exercício resolvido - polimorfismo (https://github.com/acenelio/inheritance4-java)
		
		/*
		 * Uma empresa possui funcionparios próprios e terceirizados. Para cada funcionário, deseja-se registrar nome,
		 * horas trabalhadas e valor por hora. Funcionários terceirizados possuem ainda uma despesa adicional.
		 * O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que 
		 * os funcionários terceirizados ainda recebem um bonus correspondente a 110% de sua despesa adicional.
		 * Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista.
		 * Depois de ler todos os dados, mostrar nome e pagamento de casa funcionário na mesma ordem em que foram 
		 * digitados.
		 * Construa o programa conforme projeto UML (pdf)
		 * ----------------------
		 * Employee
		 * ----------------------
		 * - name: String
		 * - hours: Integer
		 * - valuePerHour: Double
		 * ----------------------
		 * + payment(): Double
		 * ----------------------
		 *  ^
		 * /_\
		 *  |
		 *  |
		 * ----------------------
		 * OutsourcedEmployee
		 * ----------------------
		 * - additionalCharge(): Double
		 * ---------------------
		 * 
		 */
		
//		List<Employee2> list = new ArrayList<>();
//		
//		System.out.print("Enter the number of employees: ");
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Employee #" + i + " data:");
//			System.out.print("Outsourced (y/n)? ");
//			char ch = sc.next().charAt(0);
//			System.out.print("Name: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Hours: ");
//			int hours = sc.nextInt();
//			System.out.print("Value per hour: ");
//			double valuePerHour = sc.nextDouble();
//			if(ch == 'y') {
//				System.out.print("Additional charge: ");
//				double additionalCharge = sc.nextDouble();
//				//forma altenativa de adição a lista
////				Employee2 emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
////				list.add(emp);
//				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
//			}else {
////				Employee2 emp = new Employee2(name, hours, valuePerHour);
////				list.add(emp);
//				list.add(new Employee2(name, hours, valuePerHour));
//			}
//			
//		}
//		
//		System.out.println();
//		System.out.println("PAYMENTS:");
//		for(Employee2 emp : list) {
//			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
//		}
		
		/* No exercício acima foi criada uma lista do tipo Employee2, mas a instancia de cada objeto pode ser tanto do tipo Employee2 quanto 
		 * do tipo OutsourcedEmployee; Quando é feita a chamada para imprimir o pagamento de cada objeto, o cálculo
		 * vai se comporta de acordo com o tipo de cada objeto, tendo então o polimorfismo.
		 *
		 */
		
		//Exercício de fixação - polimorfismo (https://github.com/acenelio/inheritance5-java)
		
		/* Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, mostar a etiqueta
		 * de preço de cada produto na mesma ordem em que foram digitados.
		 * Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados 
		 * possuem data de fabricação.
		 * Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo. Para produtos
		 * importados, a taxa de alfândega deve ser acrescentada ao preço final do produto. Favor implementar programa
		 * conforme projeto UML.
		 * 
		 */
		
//		List<Product2> list = new ArrayList<>();
//		SimpleDateFormat maskDate = new SimpleDateFormat("dd/MM/yyyy");
//		
//		System.out.print("Enter the number of products: ");;
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.printf("Product #%d data:\n", i);
//			System.out.print("Common, used or imported (c/u/i)? ");
//			char ch = sc.next().charAt(0);
//			System.out.print("Name: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Price: ");
//			double price = sc.nextDouble();			
//			if(ch == 'i') {
//				System.out.print("Customs fee: ");
//				double customsFee = sc.nextDouble();
//				list.add(new ImportedProduct(name, price, customsFee));				
//			}else if(ch == 'u') {
//				System.out.print("Manufacture date (DD/MM/YYYY): ");
//				Date date = maskDate.parse(sc.next());
//				list.add(new UsedProduct(name, price, date));
//			}else {
//				list.add(new Product2(name, price));
//			}
//		}
//		
//		System.out.println();
//		System.out.println("PRICE TAGS:");
//		
//		for(Product2 product : list) {
//			System.out.println(product.priceTag());
//		}
		
		//Classes abstratas
		
		/* São classes que não podem ser instanciadas;
		 * É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a 
		 * superclasse abstrata
		 * Exemplo: suponha que em um negócio relacionado a banco, apenas contas poupanças e contas para empresas são 
		 * permitidas. Não existe conta comum.
		 * Para garantir que contas comuns não possam ser instanciadas, basta acrescentarmos a palavra "abstract" na 
		 * declaração da classe => public abstratc class Account{}
		 * No desenho UML, ela é representada pelo titulo em itálico;
		 * Se a superclasse não pode ser instanciada, por que simplesmente não criar somente as subclasses ?
		 * - Reuso
		 * - Polimorfismo: a superclasse classe genérica nos permite tratar de forma fácil e uniforme todos os tipos de 
		 * conta, inclusive com polimorfismo se for o caso, nos nos exercicios anteriores. Po rexemplo, você pode 
		 * colocar todos os tipos de conta em uma mesma coleção.
		 */
		
		//caso a classe Account for "public abstract class Account", ela não pode ser instanciada como abaixo
		//Account acc1 = new Account(1001, "Bob", 1100.0);
//		Account acc2 = new SavingsAccount(1002, "Maria", 1100.0, 0.01);
//		Account acc3 = new BusinessAccount(1003, "João", 1100.0, 500.0);
		
		//Exercicio: totalizar o saldo de todas as contas e acrescentar 10.00 em todas as contas (https://github.com/acenelio/inheritance6-java)

		//Account - tipo genérico
//		List<Account> list = new ArrayList<>();
//		
//		list.add(new SavingsAccount(1001, "João", 500.0, 0.01));
//		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
//		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
//		list.add(new BusinessAccount(1004, "Ana", 500.0, 500.0));
		
		//soma do saldo de todas as contas
//		double sum = 0;		
//		for(Account acc : list) {
//			sum += acc.getBalance();
//		}		
//		System.out.printf("Total balance: %.2f%n", sum);
		
		//saldo de todas as contas acrescido de 10.00 e seus respectivos numeros
//		for(Account acc : list) {
//			acc.deposit(10.0);
//		}		
//		for(Account acc : list) {
//			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
//		}
		
		//Métodos abstratos
		
		/* São métodos que não possuem implementação. Métodos precisam ser abstratos quando a cl asse é genérica demais
		 * para conter sua implementação. Se uma classe possuir pelo menos um método abstrato, então esta classe também
		 * é abstrata. No UML, sua notação é em itálico.
		 */
		
		//Exercicio resolvido - (https://github.com/acenelio/inheritance7-java)
		
		/* Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), e 
		 * depois mostrar as áreas destas figuras na mesma ordem em que foram digitadas.
		 */
		
//		List<Shape> list = new ArrayList<>();	
//		
//		System.out.print("Enter the number of shapes: ");
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Shape #" + i + " data:");
//			System.out.print("Rectangle or Circle (r/c)? ");
//			char ch = sc.next().charAt(0);	
//			System.out.print("Color (BLACK/BLUE/RED): ");
//			//o que for digitado aqui será convertido para objeto do tipo enumerado Color
//			Color color = Color.valueOf(sc.next());
//			
//			if(ch == 'r') {
//				System.out.print("Width: ");
//				double width =  sc.nextDouble();
//				System.out.print("Height: ");
//				double height = sc.nextDouble();
//				list.add(new Rectangle2(color, width, height));
//			}else {
//				System.out.print("Radius: ");
//				double radius = sc.nextDouble();
//				list.add(new Circle(color, radius));				
//			}
//			
//		}		
//		
//		System.out.println();
//		System.out.println("SHAPES AREAS:");
//		for(Shape sh : list) {
//			System.out.println(String.format("%.2f", sh.area()));
//		}
		
		//Exercício de fixação (https://github.com/acenelio/inheritance8-java)
		
		/* Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
		 * podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
		 * bem como o total de imposto arrecadado.
		 * Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
		 * são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
		 * seguintes:
		 * Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
		 * renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
		 * destes gastos são abatidos no imposto.
		 * Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
		 * fica: (50000 * 25%) - (2000 * 50%) = 11500.00
		 * Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
		 * funcionários, ela paga 14% de imposto.
		 * Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
		 * 400000 * 14% = 56000.00
		 */
		
//		List<TaxPayer> list = new ArrayList<>();		
//		
//		System.out.print("Enter the number of tax payers: ");
//		int n = sc.nextInt();
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println("Tax payer #" + i + " data:");
//			System.out.print("Individual or company (i/c)? ");
//			char ch = sc.next().charAt(0);
//			System.out.print("Name: ");
//			sc.nextLine();
//			String name = sc.nextLine();
//			System.out.print("Anual income: ");
//			Double anualIncome = sc.nextDouble();
//			if(ch == 'c') {				
//				System.out.print("Number of employees: ");
//				int numberOfEmployees = sc.nextInt();
//				list.add(new Company(name, anualIncome, numberOfEmployees));
//			}else {
//				System.out.print("Health expenditures: ");
//				Double healthExpenditures = sc.nextDouble();
//				list.add(new Individual(name, anualIncome, healthExpenditures));
//			}
//		}
//		
//		System.out.println();		
//		System.out.println("TAXES PAID:");
//		
//		double sum = 0.0;
//		
//		for(TaxPayer taxPayer : list) {
//			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
//			sum += taxPayer.tax();
//		}
//		
//		System.out.printf("%nTOTAL TAXES: $ %.2f", sum);
		
		//Exceções - Try-catch
		
		/* - Bloco try: contem o código que representa a execução normal do trecho de código que 
		 * pode acarretar em uma exceção
		 * - Bloco catch: contém o código a ser executado caso uma exceção ocorra; Deve ser especificado o tipo da 
		 * exceção a ser tratada (upcasting é permitido)
		 * 
		 * Onde:
		 * - o bloco try{} tem o código que pode gerar uma ou mais exceções
		 * - 'ExceptionType' é o tipo da exceção que se quer capturar
		 * - 'e' é um apelido pra exceção
		 * - 'catch(){}' recebe alguma lógica a ser executada caso a exceção ocorra
		 */
		
		
//		try {
//			String[] vect = sc.nextLine().split(" ");
//			int position = sc.nextInt();
//			System.out.println(vect[position]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Invalid position");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Input error");
//		}
//			
//		System.out.println("End of program");
		
		/* No bloco de try é adicionado esse trecho que código que pode vir a apresentar exceções como excesso do 
		 * limite do vetor e tipo de input não correspondente e nos blocos catch a seguir são tratadas esas mesmas 
		 * exceções, onde será exibida uma mensagem especifica caso ocorram
		 * Sem o tratamento das exceções, a linha "End of program" nem seria impressa pois o programa 
		 * finalizaria antes em caso de exceção
		 */
		
		//Stack trace (pilha de chamadas de métodos)
		
//		method1();			
//		System.out.println("End of program");
		
		
		//Bloco finally
		
		/* É um bloco que contém código a ser executado independemente de ter corrido ou não uma execução com sucesso.
		 * Exemplo clássico: fechar um arquivo, conexão de DB ou outro recurso específico ao final do processamento.
		 * 
		 * Para testar o try sem erro, criar arquivo in.txt com duas linhas de texto nas pasta temp
		 */
		
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}

		
		//sc.close();	
		
	}
	
	// método p/stack trace
	
//	public static void method1(){
//		System.out.println("***METHOD1 START***");
//		method2();
//		System.out.println("***METHOD1 END***");
//	}
//	
//	public static void method2(){
//		System.out.println("***METHOD2 START***");
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			String[] vect = sc.nextLine().split(" ");
//			int position = sc.nextInt();
//			System.out.println(vect[position]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Invalid position");
//			//imprime o rastreamento do stack mostrando o tipo da exceção, a mensagem da exceção e a sequencia de chamadas que gerou a exceção
//			e.printStackTrace();
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Input error");
//		}
//		
//		sc.close();	
//		
//		System.out.println("***METHOD2 END***");
//	}
	
	
	// métodos versão 1 de métodos estáticos 
//	public static double circumference(double radius) {
//		return 2.0 * PI * radius;
//	}
//
//	public static double volume(double radius) {
//		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
//	}
//
//	public static Integer position(List<EmployeeList> list, int id) {
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getId() == id) {
//				return i;
//			}
//		}
//		// se esgotar o for, o método retorna nulo
//		return null;
//	}
}
