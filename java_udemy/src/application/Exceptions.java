package application;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.NewAccount;
import model.entities.Reservation;
import model.exceptions.AccountException;
import model.exceptions.DomainException;

public class Exceptions {

	
	public static void main(String[] args) throws ParseException, DomainException {
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
		
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
		}
		catch(InputMismatchException e) {
			System.out.println("Input error");
		}
			
		System.out.println("End of program");
		
		/* No bloco de try é adicionado esse trecho que código que pode vir a apresentar exceções como excesso do 
		 * limite do vetor e tipo de input não correspondente e nos blocos catch a seguir são tratadas esas mesmas 
		 * exceções, onde será exibida uma mensagem especifica caso ocorram
		 * Sem o tratamento das exceções, a linha "End of program" nem seria impressa pois o programa 
		 * finalizaria antes em caso de exceção
		 */
		
		//Stack trace (pilha de chamadas de métodos)
		
		method1();			
		System.out.println("End of program");
		
		
		//Bloco finally
		
		/* É um bloco que contém código a ser executado independemente de ter corrido ou não uma execução com sucesso.
		 * Exemplo clássico: fechar um arquivo, conexão de DB ou outro recurso específico ao final do processamento.
		 * 
		 * Para testar o try sem erro, criar arquivo in.txt com duas linhas de texto nas pasta temp
		 */
		
		File file = new File("C:\\temp\\in.txt");
		Scanner sc1 = null; //descomentar para executar
		try {
			sc1 = new Scanner(file);
			while (sc1.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc1 != null) {
				sc1.close();
			}
			System.out.println("Finally block executed");
		}
		
		//Exceções personalizadas + Model package (https://github.com/acenelio/exceptions1-java)
		
		/* Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, 
		 * data de entrada e data de saída) e mostar os dados da reserva, inclusive sua
		 * duração. Em seguida, ler novas datas de entrada e saída, atualizar a reserva,
		 * e mostrar novamente a reserva com os dados atualizados. O programa não deve
		 * aceitar dados inválidos para a reserva, conforme as seguintes regras:
		 * - Alterações de reserva só podem ocorrer para datas futuras
		 * - A data de saída deve ser maior que a data de entrada
		 * 
		 * Solução 1 (muito ruim): lógica de validação no programa principal
		 * - Lógica de validação não delegada à reserva
		 * 
		 * Solução 2 (ruim): método retornando string
		 * - A semântica da operação é prejudicada
		 * 		- Retornar string não tem nada a ver com atualização de reserva
		 * 		- E se a operação tivesse que retornar um string ?
		 * - Ainda não é possível tratar exceções em construtores
		 * - Ainda não há auxílio do compilador: o programador deve "lembrar" de verificar se houve erro
		 * - A lógica fica estruturada em condicionais aninhadas
		 * 
		 * Solução 3 (boa): tratamento de exceções
		 */
		
		//Solução 1
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number1 = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn1 = sdf1.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut1 = sdf1.parse(sc.next());
		
		if(!checkOut1.after(checkIn1)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(number1, checkIn1, checkOut1);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn1 = sdf1.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut1 = sdf1.parse(sc.next());
			
			Date now = new Date();

			//Date tem o método .after() que testa se uma data depois da outra
			if(checkIn1.before(now) || checkOut1.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			}
			else if(!checkOut1.after(checkIn1)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			}
			else {
				reservation.updateDates(checkIn1, checkOut1);
				System.out.println("Reservation: " + reservation);
			}
			
		}
		
		
		//Solução 2 
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number2 = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn2 = sdf2.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut2 = sdf2.parse(sc.next());
		
		if(!checkOut2.after(checkIn2)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(number2, checkIn2, checkOut2);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn2 = sdf2.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut2 = sdf2.parse(sc.next());			
			
			String error = reservation.updateDates(checkIn2, checkOut2);			
			if(error != null) {
				System.out.println("Error in reservation: " + error);
			}
			else {
				System.out.println("Reservation: " + reservation);		
			}
		}
		
		//Solução 3
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
		
		
		try {
			System.out.print("Room number: ");
			int number3 = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn3 = sdf3.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut3 = sdf3.parse(sc.next());
			
			Reservation reservation = new Reservation(number3, checkIn3, checkOut3);
			System.out.println("Reservation: " + reservation);
	
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn3 = sdf3.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut3 = sdf3.parse(sc.next());
	
			reservation.updateDatesException(checkIn3, checkOut3);
			System.out.println("Reservation: " + reservation);
		}
		//trata exceção de formato de data inválido
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		//trata a exceção com uma mensagem personalizada
		catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		//trata exceção genérica - qualquer outra exceção não mapeada
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		
		//Exercício de fixação - (https://github.com/acenelio/exceptions2-java)
		
		/* fazer um porgrama para ler os dados de uma conta bancária e depois realizar um
		 * saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
		 * ou se não houver saldo na conta, ou se o valor do saque for superior ao limite
		 * de saque da conta. Implemente a conta bancária conforme projeto.
		 */
		
//		try {
//			System.out.println("Enter account data");
//			System.out.print("Number: ");
//			int number = sc.nextInt();
//			System.out.print("Holder: ");
//			sc.next();
//			String holder = sc.nextLine();
//			System.out.print("Initial balance: ");
//			double initialBalance = sc.nextDouble();
//			System.out.print("Withdraw limit: ");
//			double withdrawLimit = sc.nextDouble();
//			
//			NewAccount acc = new NewAccount(number, holder, initialBalance, withdrawLimit);	
//			
//			System.out.println();
//			System.out.print("Enter amount for withdraw: ");
//			double withdraw = sc.nextDouble();				
//			acc.withdraw(withdraw);			
//			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
//			
//		}
//		catch(AccountException e) {
//			System.out.println("Withdraw error: " + e.getMessage());
//		}
//		catch(RuntimeException e) {
//			System.out.println("Unexpected error");
//		}
		
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number4 = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		NewAccount acc = new NewAccount(number4, holder, initialBalance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
			
		try {
			acc.withdraw(withdraw);			
			System.out.println("New balance: " + String.format("%.2f%n", acc.getBalance()));
			
		}
		catch(AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		sc.close();	
				
	}
	
	// método p/stack trace
	
	public static void method1(){
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2(){
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			//imprime o rastreamento do stack mostrando o tipo da exceção, a mensagem da exceção e a sequencia de chamadas que gerou a exceção
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();	
		
		System.out.println("***METHOD2 END***");
	}
	
	
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
