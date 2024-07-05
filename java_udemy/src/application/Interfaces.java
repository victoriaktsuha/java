package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import entities.EmployeeInterfaces;

public class Interfaces {

	public static void main(String[] args) {

		/*
		 * Interface é um tipo que define um conjunto de operações que uma classe deve
		 * implementar. A interface estabelece um contrato que a classe deve cumprir.
		 * 
		 * Pra quê interfaces ? Para criar sistemas com baixo acoplamento e flexíveis.
		 * 
		 */

		// Problema exemplo (https://github.com/acenelio/interfaces1-java)

		/*
		 * Uma locadorea brasileira de carros cobra um valor por hora para locações de
		 * ate 12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação
		 * será cobrada com base em um valor diário. Além do valor da locação, é
		 * acrescido no preço o valor do imposto conforme regras do país que, no caso do
		 * Brasil, é 20% para valores até 100.00, ou 15% para valores acima de 100.00.
		 * Fazer um programa que lê os dados da locação (modelo do carro, instante
		 * inicial e final da locação), bem como o valor por hora e o valor diário de
		 * locação. O programa deve então gerar a nota de pagamento (contendo valor da
		 * locação, valor do imposto e valor total do pagamento) e informar os dados na
		 * tela.
		 */

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//
//		System.out.println("Entre com os dados do aluguel:");
//		System.out.print("Modelo do carro: ");
//		String carModel = sc.nextLine();
//		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
//		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
//		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
//		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
//
//		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
//
//		// criar serviços para gerar a fatura (s/ interface) - BrazilTaxService (calcula
//		// a taxa) e
//		// RentalService (retorna a fatura com a taxa calculada com base nos valores
//		// fornecidos)
//
//		System.out.print("Entre com o preço por hora: ");
//		double pricePerHour = sc.nextDouble();
//		System.out.print("Entre com o preço por dia: ");
//		double pricePerDay = sc.nextDouble();
//
//		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
//
//		rentalService.processInvoice(cr);
//
//		System.out.println("FATURA:");
//		System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
//		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
//		System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().totalPayment()));
//
//		sc.close();

		// 229. Inversão de controle e injeção de dependência

		/*
		 * O problema solucionado sem a interface tem: - acoplamento forte - A classe
		 * rentalService conhece a dependência concreta - Se a classe concreta mudar, é
		 * preciso mudar a classe RentalService
		 * 
		 * Já o problema solucionado com a interface tem: - Acoplamento fraco - A classe
		 * RentalService não conhece a dependência concreta - Se a classe concreta
		 * mudar, a classe RentalService não muda nada
		 */

		// injeção de dependência por meio de construtor - qualquer classe que
		// implemente a TaxService poderia ser utilizada
		// RentalService rentalService = new RentalService(pricePerHour, pricePerDay,
		// new BrazilTaxService());

		// Se a propria classe, no caso aqui, de serviço, ficar responsável por
		// instanciar suas próprias dependencias, gera um forte acoplamento e maior
		// manutenção

		/*
		 * Inversão de controle: padrão de desenvolvimento que consiste em retirar da
		 * classe a responsabilidade de instanciar suas dependências
		 * 
		 * Injeção de dependência: é uma forma de realizar a inversão de controle: um
		 * componente externo instancia a dependência, que é então injetada no objeto
		 * "pai". pode ser implementada de várias formas: construtor, classe de
		 * instanciação (builder/factory), container / framework
		 * 
		 */

		// 230. Exercicio de fixação (https://github.com/acenelio/interfaces4-java)

		/*
		 * Uma empresa deseja automatizar o processamento de seus contratos. O
		 * processamento de um contrato consiste em gerar as parcelas a serem pagas para
		 * aquele contrato, com base no número de meses desejado. A empresa utiliza um
		 * serviço de pagamento online para realizar o pagamento das parcelas. Os
		 * serviços de pagamento online tipicamente cobram um juro mensal, bem como uma
		 * taxa por pagamento. Por enquanto, o serviço contratado pela empresa é o do
		 * Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de
		 * pagamento de 2%. Fazer um programa para ler os dados de um contrato (número
		 * do contrato, data do contrato, e valor total do contrato). Em seguida, o
		 * programa deve ler o número de meses para parcelamento do contrato, e daí
		 * gerar os registros de parcelas a serem pagas (data e valor), sendo a primeira
		 * parcela a ser paga um mês após a data do contrato, a segunda parcela dois
		 * meses após o contrato e assim por diante. Mostrar os dados das parcelas na
		 * tela.
		 * 
		 */

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//		System.out.println("Entre com os dados do contrato:");
//		System.out.print("Numero: ");
//		int number = sc.nextInt();
//		System.out.print("Data (dd/MM/yyyy): ");
//		LocalDate date = LocalDate.parse(sc.next(), fmt);
//		System.out.print("Valor do contrato: ");
//		double totalValue = sc.nextDouble();
//		
//		Contract ct = new Contract(number, date, totalValue);
//		
//		System.out.print("Entre com o numero de parcelas: ");
//		int installments = sc.nextInt();
//
//		ContractService service = new ContractService(new PaypalService());
//
//		service.processContract(ct, installments);
//
//		System.out.println("Parcelas:");
//		for(Installment installment : ct.getInstallments()) {
//			System.out.println(installment);
//		}
//
//		sc.close();

		
		//233. Herdar vs. cumprir contrato (https://github.com/acenelio/interfaces2-java)
		
		/* Aspectos em comum entre herança e interface:
		 * - Relação é-um
		 * - Generalização/especialização
		 * - Polimorfismo
		 * 
		 * Diferença fundamental:
		 * - herança => reuso
		 * - interface => contrato a ser cumprido
		 * 
		 * E se quiser implementar a superclasse como interface, porém também quiser 
		 * definir uma estrutura comum reutilizável para todas subclasses ?
		 * - interface com classe abstrata: interface irá definir o contrato do método X,
		 * então criar uma classe abstrata definindo o atributo, e depois as classes concretas
		 * que implementarão o método do contrato => interface para definir o contrato e 
		 * abstrata para reuso; No exemplo, nem toda classe concreta Retângulo e Círculo
		 * tem uma classe abstrata Cor, mas toda classe concreta tem uma interface Forma, que
		 * por sua vez, define um contrato de método Area
		 */
		
		//Sem interface + abstract
		
//		Shape s1 = new Circle(Color.BLACK, 2.0);
//		Shape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
//		
//		System.out.println("Circle color: " + s1.getColor());
//		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
//		System.out.println("Rectangle color: " + s2.getColor());
//		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
		
		//com interface + abstract
		
//		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
//		AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
//		
//		System.out.println("Circle color: " + s1.getColor());
//		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
//		System.out.println("Rectangle color: " + s2.getColor());
//		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
		
		
		//234. Herança múltipla e o problema do diamante (https://github.com/acenelio/interfaces3-java)
		
		/* A herança múltipla pode gerar o problema do diamante:
		 * uma ambiguidade causada pela existência do mesmo método
		 * em mais de uma superclasse.
		 * Herança múltipla não é permitida na maioria das linguagens
		 * 
		 * Mas uma classe pode implementar mais de uma interface.
		 */
		
		//sem resolução para problema do diamante 
		
//		Printer p = new Printer("1080");
//		p.processDoc("My Letter");
//		p.print("My Letter");
//		
//		Scanner s = new Scanner("2003");
//		s.processDoc("My Email");
//		System.out.println("Scan result: " + s.scan());
		
		
		//com resolução para problema do diamante
		
//		ConcretePrinter p = new ConcretePrinter("1080");
//		p.processDoc("My Letter");
//		p.print("My Letter");
//		
//		System.out.println();
//		ConcreteScanner s = new ConcreteScanner("2003");
//		s.processDoc("My Email");
//		System.out.println("Scan result: " + s.scan());
//		
//		System.out.println();
//		ComboDevice c = new ComboDevice("2081");
//		c.processDoc("My dissertation");
//		c.print("My dissertation");
//		System.out.println("Scan result: " + c.scan());
		
		/* Isso não é herança múltipla, pois não há reuso na relação
		 * entre ComboDevice e as interfaces Scanner e Printer.
		 * ComboDevice não herda, mas sim implementa as interface
		 * (cumpre o contrato).
		 * 
		 */
		
		//235. Interface comparable
		
		/* Implementação:
		 * public interface Comparable<T>{
		 * 		int compareTo(T o);
		 * }
		 * 
		 * Faça um programa para ler um arquivo contendo nomes de 
		 * pessoas (um nome por linha), armazenando-os em uma lista.
		 * Depois, ordenar os dados dessa lista e mostrá-los
		 * ordenadamente na tela. O path pode ser harcoded
		 */
		
//		List<String> list = new ArrayList<>();
//		String path = "C:\\tmp\\in.txt";
//		
//		try (BufferedReader br = new BufferedReader(new FileReader(path))){
//			String name = br.readLine();
//			while (name != null) {
//				list.add(name);
//				name = br.readLine();
//			}
//			Collections.sort(list);
//			for(String s : list) {
//				System.out.println(s);
//			}
//		}
//		catch(IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
		
		/* Faça um programa para ler um arquivo contendo funcionários
		 * (nome e salário) no formato .csv, armazenando-os em uma lista.
		 * Depois, ordenar a lista por nome e mostrar o resultado na tela.
		 */
		
		List<EmployeeInterfaces> list = new ArrayList<>();
		String path = "C:\\tmp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
 				list.add(new EmployeeInterfaces(fields[0], Double.parseDouble(fields[1])));
 				employeeCsv = br.readLine();
			}
			//aqui entre a implementação da classe comparable
			Collections.sort(list);
			for(EmployeeInterfaces emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
			
	}

}
