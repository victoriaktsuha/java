package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

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

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel:");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		//criar serviços para gerar a fatura (s/ interface) - BrazilTaxService (calcula a taxa) e 
		//RentalService (retorna a fatura com a taxa calculada com base nos valores fornecidos)
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " +String.format("%.2f",  cr.getInvoice().totalPayment()));
		
		sc.close();
		
		
		//229. Inversão de controle e injeção de dependência
		
		/* O problema solucionado sem a interface tem:
		 * - acoplamento forte
		 * - A classe rentalService conhece a dependência concreta
		 * - Se a classe concreta mudar, é preciso mudar a classe RentalService
		 * 
		 * Já o problema solucionado com a interface tem:
		 * - Acoplamento fraco
		 * - A classe RentalService não conhece a dependência concreta
		 * - Se a classe concreta mudar, a classe RentalService não muda nada
		 */
		
		//injeção de dependência por meio de construtor - qualquer classe que implemente a TaxService poderia ser utilizada
		//RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		
		//Se a propria classe, no caso aqui, de serviço, ficar responsável por instanciar suas próprias dependencias, gera um forte acoplamento e maior manutenção
		
		/* Inversão de controle: padrão de desenvolvimento que consiste em retirar da classe a responsabilidade
		 * de instanciar suas dependências
		 * 
		 * Injeção de dependência: é uma forma de realizar a inversão de controle: um componente externo instancia a dependência, que é então injetada no objeto "pai".
		 * pode ser implementada de várias formas: construtor, classe de instanciação (builder/factory), container / framework
		 * 
		 */
	}

}
