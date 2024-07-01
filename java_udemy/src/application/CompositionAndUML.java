package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Comment;
import entities.Department;
import entities.HourContract;
import entities.OrderItem;
import entities.OrderShop;
import entities.Post;
import entities.ProductShop;
import entities.Worker;
import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class CompositionAndUML {

	
	public static void main(String[] args) throws ParseException {
	//public static void main(String[] args) throws ParseException {
		
		/* quando "throws ParseException" n�o � acrescentado ao m�todo principal, estamos
		 * informando ao programa que esse m�todo n�o lan�a nenhuma exce��o/erro. Mas se 
		 * utilizarmos uma chamada dentro de Main que pode lan�ar uma exce��o, como � o 
		 * caso do .parse(), o compilador vai indicar erro para que essa exce��o seja 
		 * tratada ou propagada("jogada" para outro metodo resolver) no m�todo que ela se encontra. Acrescentando esse termo, 
		 * indicdos que essa exce��o n�o precisa ser tratada pelo m�todo que ela est� 
		 * inserida.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		
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
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.print("Enter worker data: ");
		String workerName = sc.nextLine();
		System.out.print("Enter worker level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		//WorkerLevel.valueOf(workerLevel) => para equiparar a string digitada a variavel da enumera��o
		//new Department(departmentName) => foi instanciada pois esse argumento trata-se de outro objeto, recebendo a string digitada
		//na mem�ria, criam-se 2 objetos relacionados: worker e department
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		
		System.out.print("How many contracts to this worker? ");
		int n1 = sc.nextInt();
		
		//mascara para data
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
						
		for(int i = 1; i <= n1; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf1.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		//recebe a data monthAndYear em string, depois recorta o que diz respeito ao m�s e armazena convertendo para int; o mesmo se repete para o ano
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		//Exercicio 2 - resolvido (https://github.com/acenelio/composition2-java)
		
		/*
		 * Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os na tela do terminal, 
		 * conforme exemplo
		 */
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(sdf2.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the force be with you");
		Post p2 = new Post(sdf2.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
		
		//Exercicio de fixa��o (https://github.com/acenelio/composition3-java)
		
		/*
		 * Ler os dados de um pedido com N itens (N fornecido pelo usu�rio). Depois, mostrar um sum�rio 
		 * do pedido conforme exemplo. Nota: o instante do pedido deve ser o instante do sistema: new Date();
		 */
		
		SimpleDateFormat maskDate = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = maskDate.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		sc.nextLine();
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		OrderShop order = new OrderShop(new Date(), status, client);
		
		System.out.print("How many items to this order ? ");	
		int n = sc.nextInt();
								
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			ProductShop product = new ProductShop(productName, price);
			
			System.out.print("Quantity: ");
			int qtd = sc.nextInt();
			
			OrderItem item = new OrderItem(qtd, price, product);	
			
			order.addItem(item);
		}
	
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		

	}
}
