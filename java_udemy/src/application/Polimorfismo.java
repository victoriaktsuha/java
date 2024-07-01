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
		
		Account x = new Account(1020, "Bob", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
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
				//forma altenativa de adi��o a lista
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
