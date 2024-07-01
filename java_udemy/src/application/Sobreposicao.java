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
		
		
		//Sobreposição ou sobrescrita
		
		/*
		 * É a implementação de um método de uma superclasse na subclasse; è fortemente recomendável usar 
		 * a anotação @Override em um método sobrescrito - facilita a leitura e compreensão do código; 
		 * Avisamos ao compilador (boa prática)
		 */
		
		/* Suponha que a operação de saque possui uma taxa no valor de 5.0. Entretanto, se a conta for do tipo
		 * poupança, esta taxa não deve ser cobrada.
		 * Para resolver, sobreescrevemos o método withdraw na subclasse SavingsAccount
		 * 
		 */
		
		//método withdraw original
		Account acc1 = new Account(1001, "Bob", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		//Override do método withdraw
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		//Override do método withdraw original c/ super
		Account acc3 = new BusinessAccount(1003, "João", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		

	}
}
