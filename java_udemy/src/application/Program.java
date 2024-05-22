package application;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	/**
	 * @param args
	 */
	
	//vers�o 1 de m�todos est�ticos
	//public final double PI = 3.14159; // 'final' para constantes, e o padr�o de nomes para constante � letra mai�scula
	
	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Resolvendo problemas sem orienta��o a objetos

		/*
		 * Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y
		 * (suponha medidas v�lidas). Em seguida, mostrar o valor das �reas dos dois
		 * tri�ngulos e dizer qual dos dois tri�ngulos possui a maior �rea. A f�rmula
		 * para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b
		 * e c � a seguinte (f�rmula de Heron): area = raiz quadrada de
		 * p(p-a)(p-b)(p-c), onde p=(a+b+c)/2
		 */
		
//		double xA, xB, xC, yA, yB, yC;
//		
//		System.out.println("Digite as medidas do tri�ngulo X:");
//		xA = sc.nextDouble();
//		xB = sc.nextDouble();
//		xC = sc.nextDouble();
//		
//		System.out.println("Digite as medidas do tri�ngulo Y:");
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
//		System.out.printf("�rea do tri�ngulo X: %.4f%n", areaX);
//		
//		System.out.printf("�rea do tri�ngulo Y: %.4f%n", areaY);
//		
//		if(areaX > areaY) {
//			System.out.println("Maior �rea: X");
//		}else {
//			System.out.println("Maior �rea: Y");
//		}
		
		// Criando uma classe com 3 atributos para representar melhor o tri�ngulo
		
		/*
		 * Tri�ngulo � uma entidade com 3 atributos: a, b e c. Estamos usando 3 var�veis
		 * distintas para representar cada tri�ngulo: double xA, xB, xC, yA, yB, yC;
		 * Para melhorar isso, vamos usar uma classe para representar um tri�ngulo.
		 * 
		 * Classe: � um tipo estruturado que pode conter (membros): 
		 * - Atributos (dados/campos) 
		 * - M�todos (fun��es/opera��es)
		 * 
		 * A classe tamb�m pode prover muitos outros recursos, tais como: 
		 * - Construtores
		 * - Sobrecarga 
		 * - Encapsulamento 
		 * - Heran�a 
		 * - Polimorfismo
		 * 
		 * Exemplos: 
		 * - Entidades: Produto, Cliente, Triangulo 
		 * - Servi�os: ProdutoService, ClienteService, EmailService, StorageService 
		 * - Controladores: ProdutoController, ClienteController 
		 * - Utilit�rios: Calculadora, Compactador
		 * 
		 * Portanto, criaremos uma classe p�blica chamada 'Triangle' que conter� 3
		 * atributos tamb�m p�blicos de tipo double
		 * 
		 * package entities; 
		 * public class Triangle{ 
		 * 		public double a; 
		 * 		public double b;
		 * 		public double c; 
		 * }
		 * 
		 * Quando a vari�vel � do tipo classe, temos que instanciar a vari�vel.
		 * Ent�o poderemos instanciar a classe para criar os objetos de x e y:
		 * 
		 * Triangle x, y; 
		 * x = new Triangle(); 
		 * y = new Triangle();
		 * 
		 * X e Y ent�o poder�o conter os 3 atributos correspondentes as 3 medidas
		 */
		
		//Resolu��o com classe Triangle
		
//		Triangle x, y;
//		x = new Triangle();
//		y = new Triangle();
		
		//Para acessar e armazenar os valores nos atributos do objeto x:
//		System.out.println("Digite as medidas do tri�ngulo X:");
//		x.a = sc.nextDouble();
//		x.b = sc.nextDouble();
//		x.c = sc.nextDouble();
		
		//Para acessar e armazenar os valores nos atributos do objeto y:
//		System.out.println("Digite as medidas do tri�ngulo Y:");
//		y.a = sc.nextDouble();
//		y.b = sc.nextDouble();
//		y.c = sc.nextDouble();
		
		//Criando um m�todo para obtermos os benef�cios de reaproveitamento e delega��o
		
		/*
		 * Agora vamos melhorar nossa classe acrescentando nela um m�todo para calcular a �rea. 
		 * Quais s�o os benef�cios de se calcular a �rea de um tri�ngulo por meio de um m�todo dentro da classe Triangle ? 
		 * - Reaproveitamento de c�digo: n�s eliminamos o c�digo repetido (c�lculo das �reas dos tri�ngulos x e y) no
		 * programa principal. 
		 * - Delega��o das responsabilidades: quem deve ser respons�vel por saber como calcular a �rea de um tri�ngulo � o pr�prio
		 * tri�ngulo. A l�gica do c�lculo da �rea n�o deve estar em outro lugar.
		 */
		
		//utilizando m�todo area
//		double areaX = x.area();
//		double areaY = y.area();
//		
//		System.out.printf("�rea do tri�ngulo X: %.4f%n", areaX);
//		
//		System.out.printf("�rea do tri�ngulo Y: %.4f%n", areaY);
//		
//		if(areaX > areaY) {
//			System.out.println("Maior �rea: X");
//		}else {
//			System.out.println("Maior �rea: Y");
//		}
		
		//classe � a defini��o do tipo e objeto � a instancia��o da classe
		
		/*
		
		-- Instancia��o --
		
		Exemplo:
		double areaX, areaY, p;
		Triangle x, y;
		
		- Mem�ria
			> Stack - onde as vari�veis est�ticas como areaX, areaY e p s�o criadas.
			Durante a executa��o do programa, podemos fazer uma aloca��o din�mica de mem�ria atrav�s do 'new' 
			utilizado para instanciar um objeto, que ser� armazenado no Heap		
			> Heap - aqui s�o criados objetos din�micos atrav�s da aloca��o din�mica de mem�ria feita atrav�s do 'new'.
			As vari�veis x e y, mesmo que objetos no heap, tamb�m estar�o no Stack, mas armazenando um endere�o de 
			mem�ria do objeto criado no Heap
		 
		 */
		
		//Come�ando a resolver um segundo problema exemplo
		
		/*
		 * Fazer um programa para ler os dados de um produto em estoque (nome, pre�o e quantidade no estoque.) Em seguida: 
		 * - Mostrar os dados do produto (nome, pre�o, quantidade no estoque, valor total no estoque) 
		 * - Realizar uma entrada no estoque e mostrar novamente os dados do produto 
		 * - Realizar uma sa�da no estoque e mostrar novamente os dados do produto
		 * 
		 * Para resolver este problema, voc� deve criar uma classe conforme projeto abaixo:
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
		*- Toda classe java � uma subclasse da classe Object
		*	- Qualquer vari�vel que voc� tiver no seu programa, ela vai ser um tipo - ex.: Triangle, Product - 
		*e cada um desses tamb�m � do tipo Object, e o tipo Object tem alguns m�todos padr�o.
		*
		*- Object possui os seguintes m�todos:
		*	- getClass - retorna o tipo do objeto
		*	- equals - compara se o objeto � igual ao outro
		*	- hashCode - retorna um c�digo hash do objeto
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
		// Exerc�cios
		
		/*
		 * 1) Fazer um programa para ler os valores da largura e altura de um ret�ngulo.
		 * Em seguida, mostrar na tela o valor de sua �rea, per�metro e diagonal. 
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
		 * 2) Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). 
		 * Em seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). 
		 * Em seguida, aumentar o sal�rio do funcion�rio com base em uma porcentagem dada 
		 * (somente o sal�rio bruto � afetado pela porcentagem) e
		 * mostar novamente os dados do funcion�rio. Use a classe projetada abaixo:
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
		 * 3) Fazer um programa para ler o nome de um aluno e as tr�s notas que ele
		 * obteve nos tr�s trimestres do ano (primeiro trimestre vale 30 e o segundo e
		 * terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano.
		 * Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso
		 * negativo, quantos pontos faltam para o aluno obter o m�nimo para ser aprovado
		 * (que � 60% da nota). Voc� deve criar uma classe Student para resolver este
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
		 * Sa�da: 
		 * FINAL GRADE = 90.00 
		 * PASS 
		 * -------------------- 
		 * Entrada: 
		 * Alex Green
		 * 17.00 
		 * 20.00 
		 * 15.00
		 * 
		 * Sa�da: 
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
 
		/* minha solu��o - sem o m�todo faltante()
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
		 * Membros Est�ticos I
		 * 
		 * Uma classe possui membros, que s�o os atributos e m�todos.
		 * 
		 * Os membros est�ticos, tamb�m chamados de membros de classe - em oposi��o a
		 * membros e inst�ncia. S�o membros que fazem sentido independentemente de
		 * objetos. N�o precisam de objetos para serem chamados. S�o chamados a partir
		 * do pr�prio nome da classe. 
		 * No exemplo dos tri�ngulos, x � uma inst�ncia e y �
		 * outra inst�ncia e � poss�vel 'chamar' os membros mesmo em instancias
		 * diferentes, ou seja, independente do objeto.
		 * 
		 * Aplica��es comuns: 
		 * - classes utilit�rias (Math.sqrt()) 
		 * - declara��o de
		 * constantes
		 * 
		 * Uma classe que possui somente membros est�ticos, pode ser uma classe est�tica
		 * tamb�m. Esta classe n�o poder� ser instanciada.
		 * 
		 * Problema exemplo 
		 * Fazer um programa para ler um valor num�rico qualquer, e da�
		 * mostrar quanto seria o valor de um circunfer�ncia e do volume de uma esfera
		 * para um raio daquele valor. Informar tamb�m o valor de PI com duas casas
		 * decimais.
		 * 
		 * Exemplo: 
		 * Enter radius: 3.0 
		 * Circumference: 18.84 
		 * Volume: 113.04 
		 * PI value: 3.14
		 * 
		 * Resolu��o em 3 vers�es: 
		 * 1: m�todos na pr�pria classe do programa - dentro de
		 * um m�todo est�tico voc� n�o pode chamar membros de inst�ncia da mesma classe
		 * 2: classe Calculator com membros de inst�ncia - principio da delega��o - precisa de um objeto (new) para utilizar o membros das classe
		 * 3: classe Calculator com m�todo est�tico - referencia a classe direto (classe utilit�ria)
		 */
		
		//vers�o 2 m�todos est�ticos
		//Calculator calc = new Calculator();
		
//		System.out.print("Enter radius: ");
//		double radius = sc.nextDouble();
		
		//vers�o 1 m�todos est�ticos
		//double c = circumference(radius);
		//double v = volume(radius);
		
		//vers�o 2 m�todos est�ticos
		//double c = calc.circumference(radius);
		//double v = calc.volume(radius);
		
		//vers�o 3 m�todos est�ticos
//		double c = Calculator.circumference(radius);
//		double v = Calculator.volume(radius);
//		
//		System.out.printf("Circumference: %.2f%n", c);
//		System.out.printf("Volume: %.2f%n", v);
		
		//vers�o 1 m�todos est�ticos
		//System.out.printf("PI value: %.2f%n", PI);
		
		//vers�o 2 m�todos est�ticos
		//System.out.printf("PI value: %.2f%n", calc.PI);
		
		//vers�o 3 m�todos est�ticos
//		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		/*
		 * Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a
		 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 * pagar pelos d�lares, considerando ainda que a pessoa ter� que pagar 6% de IOF
		 * sobre o valor em d�lar. Criar uma classe CurrencyConverter para ser
		 * respons�vel pelos c�lculos.
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
		 * - � uma opera��o especial da classe, que executa no momento da instancia��o
		 * do objeto
		 * 
		 * - Usos comuns: 
		 * - Iniciar valores dos atributos 
		 * - Permitir ou obrigar que o objeto receba dados / depend�ncias no momento de sua instancia��o (inje��o da
		 * depend�ncia)
		 * 
		 * - Se um construtor customizado n�o for especificado, a classe disponibiliza o
		 * construtor padr�o: Product p = new Product();
		 * 
		 * - � poss�vel especificar mais de um construtor na mesma classe (sobrecarga)
		 */
		
		//Proposta de melhoria para o exerc�cio da class Product - this/construtor
		
		/* Quando executamos o comando abaixo, instanciamos um produto "product" com seus atributos "vazios":
		 * Na mem�ria, os atributos dessa instancia (name, price, quantity) est�o zerados.
		 * Entretanto, faz sentido um produto que n�o tem nome e n�o tem pre�o ?
		 * Com o intuito de evitar a exist�ncia de produtos sem nome e sem pre�o, � poss�vel fazer
		 * com que seja obrigat�ria a inicia��o desse valores ?
		 */
				
		//Primeiro � informado os dados atrav�s do scanner para que os parametros obrigat�rios sejam recebidos pelo produto (objeto) depois
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
		
		//Segunda proposta de melhoria para o exerc�cio da class Product - sobrecarga
		
		/* Vamos criar um construtor opcional, o qual recebe apenas nome e pre�o do produto.
		 * A quantidade em estoque deste novo produto, por padr�o, dever� ent�o ser iniciada
		 * com o valor zero.
		 * Tamb�m � poss�vel incluir um construtor padr�o
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
		
		/* Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta,
		 * o nome do titular da conta, e o valor de dep�sito inicial que o titular depositou ao abria a conta.
		 * Este valor de dep�sito inicial, entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar
		 * no momento de abrir sua conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�, 
		 * naturalmente, zero.
		 * Importante: uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado.
		 * J� o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por exemplo.)
		 * Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger isso.
		 * O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque realizado,
		 * o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for suficiente para
		 * realizar o saque e/ou pagar a taxa.
		 * Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o informado
		 * o valor de dep�sito inicial. Em seguida, realizar um dep�sito e depois um saque, sempre mostrando os dados da
		 * conta ap�s cada opera��o.
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
		 * * - input do usu�rio
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
//		sc.nextLine(); //esse nextLine � para consumir a quebra de linha do nextInt anterior e poder ser digitado mais de um nome
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
		 * Em programa��o, "vetor" � o nome dado a arranjos unidimensionais. 
		 * Arranjo (array) � uma estrutura de dados: Homog�nea (dados do mesmo tipo), Ordenada
		 * (elementos acessados por meio de posi��es) e Alocada de uma vez s�, em um
		 * bloco cont�guo de mem�ria. 
		 * Vantagens: acesso imediato aos elementos pela sua posi��o. 
		 * Desvantagens: tamanho fixo, dificuldade para se realizar inser��es e dele��es.
		 * 
		 * Problema exemplo 1
		 * Fazer um programa para ler um n�mero inteiro N e a altura de N pessoas.
		 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura m�dia dessas pessoas.
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
		 * Problema exemplo 2 Fazer um programa para ler um n�mero inteiro N e os dados
		 * (nome e pre�o) de N produtos. Armazene os N produtos em um vetor. Em seguida,
		 * mostrar pre�o m�dio dos produtos.
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
		
		
		//Exercicios de fixa��o vetores
		
		/* A corre��o foi primeiro criar um vetor de 10 indices, indicar pelo scanner
		 * n�mero de quartos a serem alugados, depois dentro do for iniciar o contador
		 * com 1 para que exclua o 0 como 'quarto', e ent�o imprimir o n�mero de quartos
		 * alugados indicados. Depois digitar o nome, email e o n� do quarto alugado
		 * pelo inquilino, e no fim do la�o armazenar nome e email no vetor, sendo
		 * o n�mero do quarto alugado representante do �ndice a armazenar cada inquilino.
		 * Depois foi feito outro la�o for para passar por todos os 10 �ndices e
		 * imprimir somente os dados daquele que atender a condi��o de n�o ser nulo.
		 * A analogia seria um hotel de 10 quartos (vetor) onde 3 foram alugados
		 * e o restante est� vazio (�ndices).
		 * Esse solu��o s� foi poss�vel pois sabia-se previamente o n�mero mais alto
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
		 * Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) 
		 * e depois N n�meros inteiros e armazene-os em um vetor. 
		 * Em seguida, mostrar na tela todos os n�meros negativos lidos.
		 */
		
		
//		System.out.println("Quants numero voce vai digitar? ");
//		int n = sc.nextInt();
//		
//		int[] vect = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print("Digite um n�mero: ");
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
		 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. 
		 * Em seguida: 
		 * - Imprimir todos os elementos do vetor 
		 * - Mostrar na tela a soma e a m�dia dos elementos do vetor
		 */
		
//		System.out.print("Quants numero voce vai digitar? ");
//		int n = sc.nextInt();	
//		
//		double[] vect = new double[n];
//		
//				
//		for(int i = 0; i < n; i++) {
//			System.out.print("Digite um n�mero: ");
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
		 * conforme exemplo. Depois, mostrar na tela a altura m�dia das pessoas, 
		 * e mostrar tamb�m a porcentagem de pessoas com menos de 16 anos, 
		 * bem como os nomes dessas pessoas caso houver.
		 */
		
//		System.out.print("Quantas pessoas ser�o registradas? ");
//		int n = sc.nextInt();
//		
//		Pessoa[] pessoas = new Pessoa[n];
//		
//		for(int i = 1; i <= n; i++) {
//			System.out.println();
//			System.out.printf("Dados da %sa pessoa:%n", i);
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
//		System.out.printf("Altura m�dia: %.2f%n", alturaMedia);
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
		 * Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor. 
		 * Em seguida, mostre na tela todos os n�meros pares, e tamb�m a quantidade de
		 * n�meros pares.
		 */
		
//		int n, qntdPares;  
//		
//		System.out.print("Quantos numeros voc� vai digitar? ");
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
		 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior n�mero do vetor (supor n�o haver empates).
		 * Mostrar tamb�m a posi��o do maior elemento, considerando a primeira posi��o
		 * como 0 (zero). - corrigido
		 */
			
		
		int n, posmaior;
		double maior;
		
		System.out.print("Quantos numeros voc� vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextDouble();
		}
		
		maior = vetor[0];
		posmaior = 0;
				
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posmaior = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
		
		sc.close();	
		
	}
	
	// fun��es vers�o 1 de m�todos est�ticos
	//	public static double circumference(double radius) {
	//		return 2.0 * PI * radius;
	//	}
	//
	//	public static double volume(double radius) {
	//		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	//	}
	

}
