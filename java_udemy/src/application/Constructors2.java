package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;
import entities.Product;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class Constructors2 {

	
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
		
		
		//Segunda proposta de melhoria para o exerc�cio da class Product - sobrecarga
		
		/* Vamos criar um construtor opcional, o qual recebe apenas nome e pre�o do produto.
		 * A quantidade em estoque deste novo produto, por padr�o, dever� ent�o ser iniciada
		 * com o valor zero.
		 * Tamb�m � poss�vel incluir um construtor padr�o
		 */
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();	
				
		Product product = new Product(name, price);
		
		//encapsulamento
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
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
		
		BankAccount account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine(); //esse nextLine � para consumir a quebra de linha do nextInt anterior e poder ser digitado mais de um nome
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)?: ");
		char res = sc.next().charAt(0);
		if(res == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new BankAccount(number, holder, initialDeposit);
		}else {
			account = new BankAccount(number, holder);
		}
				
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		


	}
}
