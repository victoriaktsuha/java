package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.Employee2;
import entities.ImportedProduct;
import entities.OutsourcedEmployee;
import entities.Product2;
import entities.SavingsAccount;
import entities.UsedProduct;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class Polimorfismo {

	
	public static void main(String[] args) throws ParseException {
	//public static void main(String[] args) throws ParseException {
		
		/* quando "throws ParseException" não é acrescentado ao método principal, estamos
		 * informando ao programa que esse método não lança nenhuma exceção/erro. Mas se 
		 * utilizarmos uma chamada dentro de Main que pode lançar uma exceção, como é o 
		 * caso do .parse(), o compilador vai indicar erro para que essa exceção seja 
		 * tratada ou propagada("jogada" para outro metodo resolver) no método que ela se encontra. Acrescentando esse termo, 
		 * indicdos que essa exceção não precisa ser tratada pelo método que ela está 
		 * inserida.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
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
		
		Account x = new Account(1020, "Bob", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
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
		
		List<Employee2> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				//forma altenativa de adição a lista
//				Employee2 emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
//				list.add(emp);
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
//				Employee2 emp = new Employee2(name, hours, valuePerHour);
//				list.add(emp);
				list.add(new Employee2(name, hours, valuePerHour));
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee2 emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
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
		
		List<Product2> list2 = new ArrayList<>();
		SimpleDateFormat maskDate = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");;
		int n2 = sc.nextInt();
		
		for(int i = 1; i <= n2; i++) {
			System.out.printf("Product #%d data:\n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();			
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list2.add(new ImportedProduct(name, price, customsFee));				
			}else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = maskDate.parse(sc.next());
				list2.add(new UsedProduct(name, price, date));
			}else {
				list2.add(new Product2(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product2 product : list2) {
			System.out.println(product.priceTag());
		}
		

	}
}
