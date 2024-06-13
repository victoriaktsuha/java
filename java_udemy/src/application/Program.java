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
	
	//vers�o 1 de m�todos est�ticos
	//public final double PI = 3.14159; // 'final' para constantes, e o padr�o de nomes para constante � letra mai�scula
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		
		
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
		
		
//		System.out.println("QuantOs numero voce vai digitar? ");
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
		 * corrigido
		 */
		
//		System.out.print("QuantOs numero voce vai digitar? ");
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
		 * bem como os nomes dessas pessoas caso houver. - corrigido
		 */
		
//		System.out.print("Quantas pessoas ser�o registradas? ");
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
		 * n�meros pares. - corrigido
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
			
		
//		int n, posmaior;
//		double maior;
//		
//		System.out.print("Quantos numeros voc� vai digitar? ");
//		n = sc.nextInt();
//		
//		double[] vetor = new double[n];
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print("Digite um n�mero: ");
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
		 * Fa�a um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C � a soma dos
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
		 * Fazer um programa para ler um n�mero inteiro N e depois um vetor de N n�meros
		 * reais. Em seguida, mostrar na tela a m�dia aritm�tica de todos elementos com
		 * tr�s casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da m�dia, com uma casa decimal cada. - ok
		 */
		
//		System.out.print("Quantos elementos vai ter o vetor? ");
//		int n = sc.nextInt();
//		
//		double[] vetor = new double[n];
//		
//		double media, soma;
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print("Digite um n�mero: ");
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
		 * Fazer um programa para ler um vetor de N n�meros inteiros. Em seguida,
		 * mostrar na tela a m�dia aritm�tica somente dos n�meros pares lidos, com uma
		 * casa decimal. Se nenhum n�mero par for digitado, mostrar a mensagem
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
		 * notas que eles tiraram no 1� e 2� semestres. Cada uma dessas informa��es deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja m�dia das notas seja maior ou igual a 6.0
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
		 * Tem-se um conjunto de dados contendo a altura e o g�nero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * m�dia de altura das mulheres, e o n�mero de homens. - corrigido
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
		 * - Boxing � o processo de convers�o de um objeto tipo valor para um objeto
		 * tipo refer�ncia compat�vel
		 * 
		 * int x = 20; 
		 * Object obj = x;
		 * 
		 * Object � a classe mais gen�rica do Java, todas as classes por padr�o s�o
		 * 'filhas' dessa classe object. No caso acima, x passa a ser do tipo object e
		 * ser� alocado um objeto no heap contendo o valor 20 e a vari�vel obj ser�
		 * ponteiro para essa aloca��o.
		 * 
		 * - Unboxing � o processo de convers�o de um objeto tipo refer�ncia para um
		 * objeto tipo valor compat�vel
		 * 
		 * int y = (int) obj;
		 * 
		 * Ser� criada no stack uma aloca��o y tipo valor com valor 20
		 * 
		 * - Wrapper classes 
		 * S�o classes equivalentes aos tipos primitivos, para que
		 * boxing e unboxing seja feito de forma natural na linguagem. Para cada tipo
		 * primitivo, ele tem um tipo classe compat�vel com o mesmo tipo - 
		 * Exemplo:
		 * int(primitivo) = Integer(classe), 
		 * boolean(primitivo) = Boolean(classe),
		 * char(primitivo) = Character(classe), 
		 * byte(primitivo) = Byte(classe). 
		 * Elas tem o objetivo de tratar os tipos primitivos como classes, de forma transparente
		 * ao compilador, evitando convers�es e castings. Uso comum de wrapper classes:
		 * campos de entidade em sistemas de informa��o (IMPORTANTE!) - pois tipos
		 * refer�ncia (classes) aceitam valor null e usufruem dos recursos OO
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
		 * Utilizar em atributos de classes e declara��o de vari�veis
		 */
		
		/* La�o "for each" 
		 * Sintaxe opcional e simplificada para percorrer cole��es
		 * 
		 * Sintaxe:
		 * for (Tipo apelido : cole��o){
		 *		<comando 1>
		 *		<comando 2>
		 * }
		 */

//		String[] vect = new String[]{"Maria", "Bob", "Joao"};
//		
//		System.out.println("la�o for");
//		
//		//la�o for
//		for(int i = 0; i < vect.length; i++) {
//			System.out.println(vect[i]);
//		}
//		
//		System.out.println("---------------------------");
//		
//		System.out.println("la�o for each");
//		
//		//la�o for each
//		for(String obj : vect) {
//			System.out.println(obj);
//		}
		
		/*
		 * Listas 
		 * - Conceito de lista: � uma estrutura de dados homog�nea (dados do
		 * mesmo tipo), ordenada (elementos acessados por meio de posi��es), inicia
		 * vazia, e seus elementos s�oa locados sob demanda, cada elemento ocupa um "n�"
		 * (ou nodo) da lista 
		 * - Tipo (interface): List (! n�o � classe, � interface) ->
		 * interface � um tipo que define apenas as especifica��es das opera��es. 
		 * - Classes que implementam: ArrayList(mistura de vetor e lista), LinkedList,
		 * etc. -> utilizadas para implementar a interface List, pois ela sozinha n�o
		 * pode ser implementada pois n�o � classe. 
		 * - Vantagens: tamanho vari�vel,facilidade para se realizar inser��es e dele��es 
		 * - Desvantagens: acesso sequencial aos elementos* -> dependendo da implementa��o da lista, a navega��o
		 * � otimizada, como � o caso de ArrayList 
		 * Demo: 
		 * - Tamanho da lista: size() 
		 * - Inserir elemento na lista: add(obj), add(int, obj) 
		 * - Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate) 
		 * - Encontrar posi��o de elemento: indexOf(obj), lastIndexOf(obj) 
		 * - Filtrar lista com base em predicado: 
		 * List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList()); 
		 * - Encontrar primeira ocorr�ncia com base em predicado: 
		 * Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
		 * - Assuntos pendentes: interfaces, generics, predicados (lambda)
		 */
		
		//List n�o aceita tipos primitivos, como int, char, etc
		//<Integer> � o generics, quando pode parametrizar a defini��o de um tipo informando um outro tipo espec�fico
		//= new ArrayList<>(); � a classe que implementa a interface List
//		List<String> list = new ArrayList<>();
		
		//adicionando itens a lista
//		list.add("Maria");
//		list.add("Ana");
//		list.add("Bob");
//		list.add("Joao");
//		//adiciona elemento em uma posi��o espec�fica
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
		//removendo da lista por predicado atr�ves de fun��o lambda (que retorna true or false)
		//remove todos os itens que o primeiro caractere � M - "x -> x.charAt(0) == 'M'" � uma fun��o lambda
//		list.removeIf(x -> x.charAt(0) == 'M');
//		
//		for(String x : list) {
//			System.out.println(x);
//		}
//		System.out.println("--------------------");
		//encontrando a posi��o de um elemento
//		System.out.println("index of Bob: " + list.indexOf("Bob"));
		//encontrando a posi��o de um elemento que n�o existe
//		System.out.println("index of Felix: " + list.indexOf("Felix"));
//		System.out.println("--------------------");
		//filtrar a lista por predicado
		//Uma nova lista ir� receber os resultados filtrados de list; list por sua vez deve ser convertido em stream para poder filtrar pela opera��o lambda e depois o stream � convertido em lista novamente atrav�s do collect e retorna o resultado para a nova lista 
//		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
//		for(String x : result) {
//			System.out.println(x);
//		}
//		System.out.println("--------------------");
		//encontrar elemento da lista que atenda a um certo predicado
		//a lista ser� filtrada para encontrar o primeiro elemento que tenha a letra 'A' e ser� armzenada na vari�vel name, se o elemento n�o exisitr, ele retorna nulo
//		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
//		System.out.println(name);
//		System.out.println("--------------------");
//		
//		String name2 = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
//		System.out.println(name2);
		
		/*
		 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario)
		 * de N funcion�rios. N�o deve haver repeti��o de id.
		 * Em seguida, efetuar o aumento de x por ceno no sal�rio de um determinado funcion�rio.
		 * Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir,
		 * mostrar uma mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada
		 * dos funcion�rios, conforme exemplos.
		 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitr que o sal�rio possa
		 * ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o
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
		
		/*- Conceito de matriz: nome dado a arranjos (array) bidimensionais - linhas (1� indice) e colunas (2� indice) - 
		 * (ao contr�rio do vetor, que seria um arranjo unidimensional) - "vetor de vetores"; 
		 * Assim como todo array, ele � uma estrutura de dados homog�nea, ordenada e � alocada de uma vez s�, em um bloco cont�guo de mem�ria.
		 * - Vantagens: acesso imediato aos elementos pela sua posi��o.
		 * - Desvantagens: tamanho fixo e dificuldade para se realizar inser��es e dele��es
		 */
		
		/*
		 * Fazer um programa para ler um n�mero inteiro N e uma matriz de ordem N
		 * contendo n�meros inteiros. Em seguida, mostrar a diagonal principal e a
		 * quantidade de valores negativos da matriz.
		 * ------------
		 * ENTRADA:
		 * 3
		 * 5 -3 10
		 * 15 8 2
		 * 7 9 -4
		 * ------------
		 * SA�DA:
		 * Main diagonal:
		 * 5 8 -4
		 * Negative numbers = 2 
		 * -------------
		 */
		
//		int n = sc.nextInt();
		//numero de colchetes de acordo com a dimens�o (uni, bi, tri..)
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
		 * Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
		 * uma matriz M linhas por N colunas contendo n�meros inteiros, podendo haver
		 * repeti��es. Em seguida, ler um n�mero inteiro X que pertence � matriz.
		 * Para casa ocorr�ncia de X, mostrar os valores � esquerda, acima, � direita e 
		 * abaixo de X, quando houver, conforme exemplo. - corrigido
		 * ---------------
		 * ENTRADA
		 * 3 4 
		 * 10 8 15 12
		 * 21 11 23 8
		 * 14 5 13 19
		 * 8
		 * ---------------
		 * SA�DA
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
		
		// Opera��es data-hora
		
		//cria objeto modelo para formatar data
//		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//withZone(ZoneId.systemDefault())recupera o fuso hor�rio do computador do usu�rio e o horario argumento ser� convertido para 
//		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//formato ISO
//		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
//		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		//Instancia��o - agora
		
		//data local
//		LocalDate d01 = LocalDate.now();
//		System.out.println("d01 = " + d01);
		
		//data-hora local
//		LocalDateTime d02 = LocalDateTime.now();
//		System.out.println("d02 = " + d02);
		
		//data-hora global (GMT/Z/UTC - Londres)
//		Instant d03 = Instant.now();
//		System.out.println("d03 = " + d03);
		
		//Instancia��o - ISO 8601
		
//		LocalDate d04 = LocalDate.parse("2021-08-15");
//		System.out.println("d04 = " + d04);
		//exemplos de formata��o
//		System.out.println("d04 = " + d04.format(fmt1));
//		System.out.println("d04 = " + fmt1.format(d04));
//		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
//		LocalDateTime d05 = LocalDateTime.parse("2021-08-15T01:30:26");
//		System.out.println("d05 = " + d05);
		//exemplos de formata��o
//		System.out.println("d05 = " + d05.format(fmt1));
//		System.out.println("d05 = " + d05.format(fmt2));
//		System.out.println("d05 = " + d05.format(fmt4));
		
//		Instant d06 = Instant.parse("2021-08-15T01:30:26Z");
//		System.out.println("d06 = " + d06);
		//exemplos de formata��o
		//Instant n�o aceita .format direto
//		System.out.println("d06 = " + fmt3.format(d06));
//		System.out.println("d06 = " + fmt5.format(d06));

		// ERRO - Exception "could not be parsed"
		//Instant d07 = Instant.parse("2021-08-15T01:30:26-03:00");
		//System.out.println("d07 = " + d07);
		
		//Instancia��o - Texto customizado (DateTimeFormatter)
		
//		LocalDate d08 = LocalDate.parse("15/08/2021", fmt1);
//		System.out.println("d08 = " + d08);

		// ERRO - n�o aparece hor�rio
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
		
		
		//la�o mostra todos os fusos hor�rios dispon�veis
//		System.out.println("\n---------- FUSO HOR�RIOS: ----------");
//		for(String s : ZoneId.getAvailableZoneIds()) {			
//			System.out.println(s);
//		}
		
		//converter data-hora global para local		
		//converte o obj d06 para uma data-hora local considerando o fuso hor�rio da maquina atual
//		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());		
//		System.out.println(r1);
		//converte o obj d06 para uma data-hora local considerando o fuso hor�rio como argumento
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
		
		//dura��o - deve ser calculada entre mesmos tipos (! obrigatorio ser LocalDateTime - n�o LocalDate, ou, converter por para horas (atTime() ou similar))
//		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d13.atTime(0, 0));
//		System.out.println("t1 days = " + t1.toDays());
//		
//		Duration t2 = Duration.between(pastWeekLocalDateTime, d14);
//		System.out.println("t2 days = " + t2.toDays());
//		
//		Duration t3 = Duration.between(pastWeekInstant, d15);
//		System.out.println("t3 days = " + t3.toDays());
		
		//quando a primeira dara � maior que a segunda, o resultado � negativo
//		Duration t4 = Duration.between(d15, pastWeekInstant);
//		System.out.println("t4 days = " + t4.toDays());
		
		//enumera��es, composi��o
		
		//utilizando classe que utiliza enum como atributo
//		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);		
//		System.out.println(order);
		
		//convers�o de string para enum - ambos ser�o o mesmo valor enum caso a escrita esteja correta
		
//		OrderStatus os1 = OrderStatus.DELIVERED;		
//		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
//		
//		System.out.println(os1);
//		System.out.println(os2);
		
		//Nota��o UML para enum
		
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
		 * de modo geral "tudo" � objeto.
		 * - Por quest�es de design tais como organiza��o, flexibilidade, reuso, 
		 * delega��o, etc. h� v�rias categorias de classes: 
		 * Views - telas/front
		 * Controllers - mediador entre view e sistema
		 * Entities - classes entidades do neg�cio
		 * Services - classes servi�os do neg�cio
		 * Repositories - objetos respons�veis por acessar DB
		 */
		
		//composi��o
		
		/* - � um tipo de associa��o que permite que um objeto contenha outro
		 * - Rela��o "tem-um" ou "tem-v�rios"
		 * - Vantagens: Organiza��o (divis�o de responsabilidades), coes�o, 
		 * flexibilidade, reuso
		 * - Nota: embora o s�mbolo UML para composi��o (todo-parte) seja o diamante preto, 
		 * neste contexto estamos chamando de composi��o qualquer associa��o tipo "tem-um" e 
		 * "tem-v�rios"
		 */
		
		//Exercicio 1 - resolvido (https://github.com/acenelio/composition1-java)
		
		/* Ler os dados de um trabalhador com N contratos (N fornecido pelo usu�rio). 
		 * Depois, solicitar do usu�rio um m�s e mostrar qual foi o sal�rio do funcion�rio
		 * nesse m�s, conforme exemplo
		 */	
		
//		System.out.print("Enter department's name: ");
//		String departmentName = sc.nextLine();
//		System.out.print("Enter worker data: ");
//		String workerName = sc.nextLine();
//		System.out.print("Enter worker level: ");
//		String workerLevel = sc.nextLine();
//		System.out.print("Base salary: ");
//		double baseSalary = sc.nextDouble();
		
		//WorkerLevel.valueOf(workerLevel) => para equiparar a string digitada a variavel da enumera��o
		//new Department(departmentName) => foi instanciada pois esse argumento trata-se de outro objeto, recebendo a string digitada
		//na mem�ria, criam-se 2 objetos relacionados: worker e department
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
		//recebe a data monthAndYear em string, depois recorta o que diz respeito ao m�s e armazena convertendo para int; o mesmo se repete para o ano
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
		
		//Exercicio de fixa��o (https://github.com/acenelio/composition3-java)
		
		/*
		 * Ler os dados de um pedido com N itens (N fornecido pelo usu�rio). Depois, mostrar um sum�rio 
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
		
		//Heran�a - class Account e class BusinessAccount
		
		/*
		 * - � um tipo de associa��o que permite que uma classe herde todos dados e 
		 * comportamento de outra
		 * - Defini��es importantes
		 * - Vantagens: reuso e polimorfismo
		 * - Sintaxe: class A extends B
		 * - Rela��o "�-um" - no exemplo, a conta empresarial tamb�m � uma conta comum 
		 * quando extende a super classe
		 * - Generaliza��o/especializa��o - no exemplo, a conta comum � uma generaliza��o 
		 * e a conta empresarial � uma especializa��o
		 * - superclasse (classe base) / subclasse (classe derivada)
		 * - Heran�a/extens�o
		 * - Heran�a � uma associa��o entre classes (e n�o entre objetos)
		 * heran�a � associa��o entre classes e composi��o � associa��o entre objetos 
		 * - na mem�ria, a heran�a teria apenas um objeto com todos os atributos de ambas 
		 * as classes e na composi��o criam-se objetos distintos
		 * Heran�a permite o reuso de atributos e m�todos (dados e comportamento)
		 * 
		 * Exemplo na classe Account e BusinessAccount:
		 * suponha um neg�cio de banco que possui uma conta comum e uma conta para empresas,
		 * sendo que a conta para empresa possui todos membros da conta comum, mais um limite 
		 * de empr�stimo e uma opera��o de realizar empr�stimo.
		 * A classe conta comum ser� a super classe, que ser� extendida pela agora 
		 * subclasse conta para empresas e os atributos do construtor da super classe 
		 * ser�o atribuidos no construtor da subclasse atrav�s do m�todo super(); junto com
		 * qualquer outra atribui��o pr�pria 

		 */
		
		//Upcasting e Downcasting
		
		/*
		 * Upcasting: casting da subclasse para a superclasse; 
		 * Uso comum: polimorfismo
		 * 
		 * Downcasting: casting da superclasse para subclasse; 
		 * Palavra instaceof; 
		 * Uso comum: m�todos que recebem par�metros gen�ricos (ex: Equals)
		 * 
		 * Exemplo na classe Account, BusinessAccount e SavingsAccount:
		 */
		
//		Account acc = new Account(1001, "Bob", 0.0);
//		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING	- objeto da subclasse (bacc) sendo atribuido a objeto da superclasse (acc)
		//n�o � acusado erro nessa rela��o pois a heran�a � rela��o "�-um", tornando subclasse e superclasse um mesmo tipo
//		Account acc1 = bacc;
//		acc1.getBalance();	
//		
//		Account acc2 = new BusinessAccount(1003, "Jo�o", 0.0, 200.0);
//		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING - objeto da superclasse (acc2) sendo atribuido a objeto da subclasse (acc4)
		//para evitar erro, � necess�rio o casting manual
//		BusinessAccount acc4 = (BusinessAccount) acc2;
//		acc4.loan(100.0);
		
		//SIMULA��O DE ERRO
		//SavingsAccount N�O pode ser convertido para BusinessAccount
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		
		/* ! subclasses distintas que estendem a mesma superclasse n�o podem se instanciar uma a outra */
		
		//TESTE - se acc3 recebe um objeto que seja instancia do tipo BusinessAccount, ele ent�o poder� realizar o casting
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
		
		//Sobreposi��o ou sobrescrita
		
		/*
		 * � a implementa��o de um m�todo de uma superclasse na subclasse; � fortemente recomend�vel usar 
		 * a anota��o @Override em um m�todo sobrescrito - facilita a leitura e compreens�o do c�digo; 
		 * Avisamos ao compilador (boa pr�tica)
		 */
		
		/* Suponha que a opera��o de saque possui uma taxa no valor de 5.0. Entretanto, se a conta for do tipo
		 * poupan�a, esta taxa n�o deve ser cobrada.
		 * Para resolver, sobreescrevemos o m�todo withdraw na subclasse SavingsAccount
		 * 
		 */
		
		//m�todo withdraw original
//		Account acc1 = new Account(1001, "Bob", 1000.0);
//		acc1.withdraw(200.0);
//		System.out.println(acc1.getBalance());
		
		//Override do m�todo withdraw
//		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
//		acc2.withdraw(200.0);
//		System.out.println(acc2.getBalance());
		
		//Override do m�todo withdraw original c/ super
//		Account acc3 = new BusinessAccount(1003, "Jo�o", 1000.0, 500.0);
//		acc3.withdraw(200.0);
//		System.out.println(acc3.getBalance());
		
		//Polimorfismo
		
		/*
		 * Pilares da OOP:
		 * - Encapsulamento
		 * - Heran�a 
		 * - Polimorfismo
		 * Em programa��o orientada a objetos, polimorfismo � recurso que permite que vari�veis de um mesmo tipo mais 
		 * gen�rico possam apontar para objetos de tipos espec�ficos diferentes, tendo assim comportamentos diferentes 
		 * conforme cada tipo espec�fico.
		 * 
		 * No exemplo acima, haver�o objetos de tipos diferentes na mem�ria, mas as variaveis que apontam para esses 
		 * objetos s�o de um mesmo tipo.
		 */
		
//		Account x = new Account(1020, "Bob", 1000.0);
//		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
//
//		x.withdraw(50.0);
//		y.withdraw(50.0);
//		
//		System.out.println(x.getBalance());
//		System.out.println(y.getBalance());
		
		/* No exemplo acima, haver�o objetos de tipos diferentes na mem�ria, mas as variaveis que apontam para esses 
		 * objetos s�o de um mesmo tipo.
		 * 
		 * IMPORTANTE ENTENDER:
		 * - A associa��o do tipo espec�fico com o tipo gen�rico � feita em tempo de execu��o (upcasting).
		 * - O compilador n�o sabe para qual tipo espec�fico a chamada do m�todo Withdraw est� sendo feita (ele s�
		 * sabe que s�o duas vari�veis tipo Account);
		 */
		
		//Exerc�cio resolvido - polimorfismo (https://github.com/acenelio/inheritance4-java)
		
		/*
		 * Uma empresa possui funcionparios pr�prios e terceirizados. Para cada funcion�rio, deseja-se registrar nome,
		 * horas trabalhadas e valor por hora. Funcion�rios terceirizados possuem ainda uma despesa adicional.
		 * O pagamento dos funcion�rios corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que 
		 * os funcion�rios terceirizados ainda recebem um bonus correspondente a 110% de sua despesa adicional.
		 * Fazer um programa para ler os dados de N funcion�rios (N fornecido pelo usu�rio) e armazen�-los em uma lista.
		 * Depois de ler todos os dados, mostrar nome e pagamento de casa funcion�rio na mesma ordem em que foram 
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
//				//forma altenativa de adi��o a lista
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
		
		/* No exerc�cio acima foi criada uma lista do tipo Employee2, mas a instancia de cada objeto pode ser tanto do tipo Employee2 quanto 
		 * do tipo OutsourcedEmployee; Quando � feita a chamada para imprimir o pagamento de cada objeto, o c�lculo
		 * vai se comporta de acordo com o tipo de cada objeto, tendo ent�o o polimorfismo.
		 *
		 */
		
		//Exerc�cio de fixa��o - polimorfismo (https://github.com/acenelio/inheritance5-java)
		
		/* Fazer um programa para ler os dados de N produtos (N fornecido pelo usu�rio). Ao final, mostar a etiqueta
		 * de pre�o de cada produto na mesma ordem em que foram digitados.
		 * Todo produto possui nome e pre�o. Produtos importados possuem uma taxa de alf�ndega, e produtos usados 
		 * possuem data de fabrica��o.
		 * Estes dados espec�ficos devem ser acrescentados na etiqueta de pre�o conforme exemplo. Para produtos
		 * importados, a taxa de alf�ndega deve ser acrescentada ao pre�o final do produto. Favor implementar programa
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
		
		/* S�o classes que n�o podem ser instanciadas;
		 * � uma forma de garantir heran�a total: somente subclasses n�o abstratas podem ser instanciadas, mas nunca a 
		 * superclasse abstrata
		 * Exemplo: suponha que em um neg�cio relacionado a banco, apenas contas poupan�as e contas para empresas s�o 
		 * permitidas. N�o existe conta comum.
		 * Para garantir que contas comuns n�o possam ser instanciadas, basta acrescentarmos a palavra "abstract" na 
		 * declara��o da classe => public abstratc class Account{}
		 * No desenho UML, ela � representada pelo titulo em it�lico;
		 * Se a superclasse n�o pode ser instanciada, por que simplesmente n�o criar somente as subclasses ?
		 * - Reuso
		 * - Polimorfismo: a superclasse classe gen�rica nos permite tratar de forma f�cil e uniforme todos os tipos de 
		 * conta, inclusive com polimorfismo se for o caso, nos nos exercicios anteriores. Po rexemplo, voc� pode 
		 * colocar todos os tipos de conta em uma mesma cole��o.
		 */
		
		//caso a classe Account for "public abstract class Account", ela n�o pode ser instanciada como abaixo
		//Account acc1 = new Account(1001, "Bob", 1100.0);
//		Account acc2 = new SavingsAccount(1002, "Maria", 1100.0, 0.01);
//		Account acc3 = new BusinessAccount(1003, "Jo�o", 1100.0, 500.0);
		
		//Exercicio: totalizar o saldo de todas as contas e acrescentar 10.00 em todas as contas (https://github.com/acenelio/inheritance6-java)

		//Account - tipo gen�rico
//		List<Account> list = new ArrayList<>();
//		
//		list.add(new SavingsAccount(1001, "Jo�o", 500.0, 0.01));
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
		
		//M�todos abstratos
		
		/* S�o m�todos que n�o possuem implementa��o. M�todos precisam ser abstratos quando a cl asse � gen�rica demais
		 * para conter sua implementa��o. Se uma classe possuir pelo menos um m�todo abstrato, ent�o esta classe tamb�m
		 * � abstrata. No UML, sua nota��o � em it�lico.
		 */
		
		//Exercicio resolvido - (https://github.com/acenelio/inheritance7-java)
		
		/* Fazer um programa para ler os dados de N figuras (N fornecido pelo usu�rio), e 
		 * depois mostrar as �reas destas figuras na mesma ordem em que foram digitadas.
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
//			//o que for digitado aqui ser� convertido para objeto do tipo enumerado Color
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
		
		//Exerc�cio de fixa��o (https://github.com/acenelio/inheritance8-java)
		
		/* Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usu�rio), os quais
		 * podem ser pessoa f�sica ou pessoa jur�dica, e depois mostrar o valor do imposto pago por cada um,
		 * bem como o total de imposto arrecadado.
		 * Os dados de pessoa f�sica s�o: nome, renda anual e gastos com sa�de. Os dados de pessoa jur�dica
		 * s�o nome, renda anual e n�mero de funcion�rios. As regras para c�lculo de imposto s�o as
		 * seguintes:
		 * Pessoa f�sica: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
		 * renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com sa�de, 50%
		 * destes gastos s�o abatidos no imposto.
		 * Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com sa�de, o imposto
		 * fica: (50000 * 25%) - (2000 * 50%) = 11500.00
		 * Pessoa jur�dica: pessoas jur�dicas pagam 16% de imposto. Por�m, se a empresa possuir mais de 10
		 * funcion�rios, ela paga 14% de imposto.
		 * Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcion�rios, o imposto fica:
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
		
		//Exce��es - Try-catch
		
		/* - Bloco try: contem o c�digo que representa a execu��o normal do trecho de c�digo que 
		 * pode acarretar em uma exce��o
		 * - Bloco catch: cont�m o c�digo a ser executado caso uma exce��o ocorra; Deve ser especificado o tipo da 
		 * exce��o a ser tratada (upcasting � permitido)
		 * 
		 * Onde:
		 * - o bloco try{} tem o c�digo que pode gerar uma ou mais exce��es
		 * - 'ExceptionType' � o tipo da exce��o que se quer capturar
		 * - 'e' � um apelido pra exce��o
		 * - 'catch(){}' recebe alguma l�gica a ser executada caso a exce��o ocorra
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
		
		/* No bloco de try � adicionado esse trecho que c�digo que pode vir a apresentar exce��es como excesso do 
		 * limite do vetor e tipo de input n�o correspondente e nos blocos catch a seguir s�o tratadas esas mesmas 
		 * exce��es, onde ser� exibida uma mensagem especifica caso ocorram
		 * Sem o tratamento das exce��es, a linha "End of program" nem seria impressa pois o programa 
		 * finalizaria antes em caso de exce��o
		 */
		
		//Stack trace (pilha de chamadas de m�todos)
		
//		method1();			
//		System.out.println("End of program");
		
		
		//Bloco finally
		
		/* � um bloco que cont�m c�digo a ser executado independemente de ter corrido ou n�o uma execu��o com sucesso.
		 * Exemplo cl�ssico: fechar um arquivo, conex�o de DB ou outro recurso espec�fico ao final do processamento.
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
	
	// m�todo p/stack trace
	
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
//			//imprime o rastreamento do stack mostrando o tipo da exce��o, a mensagem da exce��o e a sequencia de chamadas que gerou a exce��o
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
	
	
	// m�todos vers�o 1 de m�todos est�ticos 
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
//		// se esgotar o for, o m�todo retorna nulo
//		return null;
//	}
}
