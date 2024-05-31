package application;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	/**
	 * @param args
	 */
	
	//versão 1 de métodos estáticos
	//public final double PI = 3.14159; // 'final' para constantes, e o padrão de nomes para constante é letra maiúscula
	
	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
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
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Instanciação - agora
		
		//data local
		LocalDate d01 = LocalDate.now();
		System.out.println(d01.toString());
		
		//data-hora local
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02.toString());
		
		//data-hora global (GMT/Z/UTC - Londres)
		Instant d03 = Instant.now();
		System.out.println(d03.toString());
		
		//Instanciação - ISO 8601
		
		LocalDate d04 = LocalDate.parse("2021-08-15");
		System.out.println(d04.toString());
		
		LocalDateTime d05 = LocalDateTime.parse("2021-08-15T01:30:26");
		System.out.println(d05.toString());
		
		Instant d06 = Instant.parse("2021-08-15T01:30:26Z");
		System.out.println(d06.toString());

		// ERRO - Exception "could not be parsed"
		//Instant d07 = Instant.parse("2021-08-15T01:30:26-03:00");
		//System.out.println(d07.toString());
		
		//Instanciação - Texto customizado (DateTimeFormatter)
		
		LocalDate d08 = LocalDate.parse("15/08/2021", fmt1);
		System.out.println(d08.toString());

		// ERRO - não aparece horário
		LocalDate d09 = LocalDate.parse("15/08/2021 01:30", fmt2);
		System.out.println(d09.toString());
		
		LocalDate d10 = LocalDate.parse("25/01/2019", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(d10.toString());
		
		LocalDate d11 = LocalDate.of(2022, 7, 20);
		System.out.println(d11.toString());
		
		LocalDateTime d12 = LocalDateTime.of(2022, 7 , 20, 1, 30);
		System.out.println(d12.toString());
		
		sc.close();	
		
	}
	
	// funções versão 1 de métodos estáticos
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
