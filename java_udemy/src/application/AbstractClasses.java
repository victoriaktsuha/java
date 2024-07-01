package application;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class AbstractClasses {

	
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
	
		
		//Classes abstratas
		
		/* S�o classes que n�o podem ser instanciadas;
		 * � uma forma de garantir heran�a total: somente subclasses n�o abstratas podem ser instanciadas, mas nunca a 
		 * superclasse abstrata
		 * Exemplo: suponha que em um neg�cio relacionado a banco, apenas contas poupan�as e contas para empresas s�o 
		 * permitidas. N�o existe conta comum.
		 * Para garantir que contas comuns n�o possam ser instanciadas, basta acrescentarmos a palavra "abstract" na 
		 * declara��o da classe => public abstratc class Account{}
		 * No desenho UML, ela � representada pelo titulo em it�lico;
		 * Se a superclasse n�o pode ser instanciada, por que simplesmente n�o criar somente as subclasses ?
		 * - Reuso
		 * - Polimorfismo: a superclasse classe gen�rica nos permite tratar de forma f�cil e uniforme todos os tipos de 
		 * conta, inclusive com polimorfismo se for o caso, nos nos exercicios anteriores. Po rexemplo, voc� pode 
		 * colocar todos os tipos de conta em uma mesma cole��o.
		 */
		
		//caso a classe Account for "public abstract class Account", ela n�o pode ser instanciada como abaixo
		//Account acc1 = new Account(1001, "Bob", 1100.0);
		Account acc2 = new SavingsAccount(1002, "Maria", 1100.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Jo�o", 1100.0, 500.0);
		
		//Exercicio: totalizar o saldo de todas as contas e acrescentar 10.00 em todas as contas (https://github.com/acenelio/inheritance6-java)

		//Account - tipo gen�rico
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Jo�o", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Ana", 500.0, 500.0));
		
		//soma do saldo de todas as contas
		double sum = 0;		
		for(Account acc : list) {
			sum += acc.getBalance();
		}		
		System.out.printf("Total balance: %.2f%n", sum);
		
		//saldo de todas as contas acrescido de 10.00 e seus respectivos numeros
		for(Account acc : list) {
			acc.deposit(10.0);
		}		
		for(Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		

	}
}
