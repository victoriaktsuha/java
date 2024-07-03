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
		 * Interface � um tipo que define um conjunto de opera��es que uma classe deve
		 * implementar. A interface estabelece um contrato que a classe deve cumprir.
		 * 
		 * Pra qu� interfaces ? Para criar sistemas com baixo acoplamento e flex�veis.
		 * 
		 */

		// Problema exemplo (https://github.com/acenelio/interfaces1-java)

		/*
		 * Uma locadorea brasileira de carros cobra um valor por hora para loca��es de
		 * ate 12 horas. Por�m, se a dura��o da loca��o ultrapassar 12 horas, a loca��o
		 * ser� cobrada com base em um valor di�rio. Al�m do valor da loca��o, �
		 * acrescido no pre�o o valor do imposto conforme regras do pa�s que, no caso do
		 * Brasil, � 20% para valores at� 100.00, ou 15% para valores acima de 100.00.
		 * Fazer um programa que l� os dados da loca��o (modelo do carro, instante
		 * inicial e final da loca��o), bem como o valor por hora e o valor di�rio de
		 * loca��o. O programa deve ent�o gerar a nota de pagamento (contendo valor da
		 * loca��o, valor do imposto e valor total do pagamento) e informar os dados na
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
		
		//criar servi�os para gerar a fatura (s/ interface) - BrazilTaxService (calcula a taxa) e 
		//RentalService (retorna a fatura com a taxa calculada com base nos valores fornecidos)
		
		System.out.print("Entre com o pre�o por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o pre�o por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento b�sico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " +String.format("%.2f",  cr.getInvoice().totalPayment()));
		
		sc.close();
		
		
		//229. Invers�o de controle e inje��o de depend�ncia
		
		/* O problema solucionado sem a interface tem:
		 * - acoplamento forte
		 * - A classe rentalService conhece a depend�ncia concreta
		 * - Se a classe concreta mudar, � preciso mudar a classe RentalService
		 * 
		 * J� o problema solucionado com a interface tem:
		 * - Acoplamento fraco
		 * - A classe RentalService n�o conhece a depend�ncia concreta
		 * - Se a classe concreta mudar, a classe RentalService n�o muda nada
		 */
		
		//inje��o de depend�ncia por meio de construtor - qualquer classe que implemente a TaxService poderia ser utilizada
		//RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		
		//Se a propria classe, no caso aqui, de servi�o, ficar respons�vel por instanciar suas pr�prias dependencias, gera um forte acoplamento e maior manuten��o
		
		/* Invers�o de controle: padr�o de desenvolvimento que consiste em retirar da classe a responsabilidade
		 * de instanciar suas depend�ncias
		 * 
		 * Inje��o de depend�ncia: � uma forma de realizar a invers�o de controle: um componente externo instancia a depend�ncia, que � ent�o injetada no objeto "pai".
		 * pode ser implementada de v�rias formas: construtor, classe de instancia��o (builder/factory), container / framework
		 * 
		 */
	}

}
