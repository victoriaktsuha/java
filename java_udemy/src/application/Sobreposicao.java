package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class Sobreposicao {

	
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
		
		
		//Sobreposi��o ou sobrescrita
		
		/*
		 * � a implementa��o de um m�todo de uma superclasse na subclasse; � fortemente recomend�vel usar 
		 * a anota��o @Override em um m�todo sobrescrito - facilita a leitura e compreens�o do c�digo; 
		 * Avisamos ao compilador (boa pr�tica)
		 */
		
		/* Suponha que a opera��o de saque possui uma taxa no valor de 5.0. Entretanto, se a conta for do tipo
		 * poupan�a, esta taxa n�o deve ser cobrada.
		 * Para resolver, sobreescrevemos o m�todo withdraw na subclasse SavingsAccount
		 * 
		 */
		
		//m�todo withdraw original
		Account acc1 = new Account(1001, "Bob", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		//Override do m�todo withdraw
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		//Override do m�todo withdraw original c/ super
		Account acc3 = new BusinessAccount(1003, "Jo�o", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		

	}
}
