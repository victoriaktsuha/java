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
		
		
		//Segunda proposta de melhoria para o exercício da class Product - sobrecarga
		
		/* Vamos criar um construtor opcional, o qual recebe apenas nome e preço do produto.
		 * A quantidade em estoque deste novo produto, por padrão, deverá então ser iniciada
		 * com o valor zero.
		 * Também é possível incluir um construtor padrão
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
		
		/* Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta,
		 * o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abria a conta.
		 * Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar
		 * no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, 
		 * naturalmente, zero.
		 * Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado.
		 * Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo.)
		 * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso.
		 * O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado,
		 * o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para
		 * realizar o saque e/ou pagar a taxa.
		 * Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado
		 * o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da
		 * conta após cada operação.
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
		 * * - input do usuário
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
		sc.nextLine(); //esse nextLine é para consumir a quebra de linha do nextInt anterior e poder ser digitado mais de um nome
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
