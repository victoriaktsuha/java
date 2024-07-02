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
		
		/* No bloco de try � adicionado esse trecho que c�digo que pode vir a apresentar exce��es como excesso do 
		 * limite do vetor e tipo de input n�o correspondente e nos blocos catch a seguir s�o tratadas esas mesmas 
		 * exce��es, onde ser� exibida uma mensagem especifica caso ocorram
		 * Sem o tratamento das exce��es, a linha "End of program" nem seria impressa pois o programa 
		 * finalizaria antes em caso de exce��o
		 */
		
		//Stack trace (pilha de chamadas de m�todos)
		
		method1();			
		System.out.println("End of program");
		
		
		//Bloco finally
		
		/* � um bloco que cont�m c�digo a ser executado independemente de ter corrido ou n�o uma execu��o com sucesso.
		 * Exemplo cl�ssico: fechar um arquivo, conex�o de DB ou outro recurso espec�fico ao final do processamento.
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
		
		//Exce��es personalizadas + Model package (https://github.com/acenelio/exceptions1-java)
		
		/* Fazer um programa para ler os dados de uma reserva de hotel (n�mero do quarto, 
		 * data de entrada e data de sa�da) e mostar os dados da reserva, inclusive sua
		 * dura��o. Em seguida, ler novas datas de entrada e sa�da, atualizar a reserva,
		 * e mostrar novamente a reserva com os dados atualizados. O programa n�o deve
		 * aceitar dados inv�lidos para a reserva, conforme as seguintes regras:
		 * - Altera��es de reserva s� podem ocorrer para datas futuras
		 * - A data de sa�da deve ser maior que a data de entrada
		 * 
		 * Solu��o 1 (muito ruim): l�gica de valida��o no programa principal
		 * - L�gica de valida��o n�o delegada � reserva
		 * 
		 * Solu��o 2 (ruim): m�todo retornando string
		 * - A sem�ntica da opera��o � prejudicada
		 * 		- Retornar string n�o tem nada a ver com atualiza��o de reserva
		 * 		- E se a opera��o tivesse que retornar um string ?
		 * - Ainda n�o � poss�vel tratar exce��es em construtores
		 * - Ainda n�o h� aux�lio do compilador: o programador deve "lembrar" de verificar se houve erro
		 * - A l�gica fica estruturada em condicionais aninhadas
		 * 
		 * Solu��o 3 (boa): tratamento de exce��es
		 */
		
		//Solu��o 1
		
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

			//Date tem o m�todo .after() que testa se uma data depois da outra
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
		
		
		//Solu��o 2 
		
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
		
		//Solu��o 3
		
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
		//trata exce��o de formato de data inv�lido
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		//trata a exce��o com uma mensagem personalizada
		catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		//trata exce��o gen�rica - qualquer outra exce��o n�o mapeada
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		
		//Exerc�cio de fixa��o - (https://github.com/acenelio/exceptions2-java)
		
		/* fazer um porgrama para ler os dados de uma conta banc�ria e depois realizar um
		 * saque nesta conta banc�ria, mostrando o novo saldo. Um saque n�o pode ocorrer
		 * ou se n�o houver saldo na conta, ou se o valor do saque for superior ao limite
		 * de saque da conta. Implemente a conta banc�ria conforme projeto.
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
	
	// m�todo p/stack trace
	
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
			//imprime o rastreamento do stack mostrando o tipo da exce��o, a mensagem da exce��o e a sequencia de chamadas que gerou a exce��o
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();	
		
		System.out.println("***METHOD2 END***");
	}
	
	
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
