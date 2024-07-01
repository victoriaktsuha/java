package application;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class InheritanceAndCasting {

	
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
		
		
		//Heran�a - class Account e class BusinessAccount
		
		/*
		 * - � um tipo de associa��o que permite que uma classe herde todos dados e 
		 * comportamento de outra
		 * - Defini��es importantes
		 * - Vantagens: reuso e polimorfismo
		 * - Sintaxe: class A extends B
		 * - Rela��o "�-um" - no exemplo, a conta empresarial tamb�m � uma conta comum 
		 * quando extende a super classe
		 * - Generaliza��o/especializa��o - no exemplo, a conta comum � uma generaliza��o 
		 * e a conta empresarial � uma especializa��o
		 * - superclasse (classe base) / subclasse (classe derivada)
		 * - Heran�a/extens�o
		 * - Heran�a � uma associa��o entre classes (e n�o entre objetos)
		 * heran�a � associa��o entre classes e composi��o � associa��o entre objetos 
		 * - na mem�ria, a heran�a teria apenas um objeto com todos os atributos de ambas 
		 * as classes e na composi��o criam-se objetos distintos
		 * Heran�a permite o reuso de atributos e m�todos (dados e comportamento)
		 * 
		 * Exemplo na classe Account e BusinessAccount:
		 * suponha um neg�cio de banco que possui uma conta comum e uma conta para empresas,
		 * sendo que a conta para empresa possui todos membros da conta comum, mais um limite 
		 * de empr�stimo e uma opera��o de realizar empr�stimo.
		 * A classe conta comum ser� a super classe, que ser� extendida pela agora 
		 * subclasse conta para empresas e os atributos do construtor da super classe 
		 * ser�o atribuidos no construtor da subclasse atrav�s do m�todo super(); junto com
		 * qualquer outra atribui��o pr�pria 

		 */
		
		//Upcasting e Downcasting
		
		/*
		 * Upcasting: casting da subclasse para a superclasse; 
		 * Uso comum: polimorfismo
		 * 
		 * Downcasting: casting da superclasse para subclasse; 
		 * Palavra instaceof; 
		 * Uso comum: m�todos que recebem par�metros gen�ricos (ex: Equals)
		 * 
		 * Exemplo na classe Account, BusinessAccount e SavingsAccount:
		 */
		
		Account acc = new Account(1001, "Bob", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING	- objeto da subclasse (bacc) sendo atribuido a objeto da superclasse (acc)
		//n�o � acusado erro nessa rela��o pois a heran�a � rela��o "�-um", tornando subclasse e superclasse um mesmo tipo
		Account acc1 = bacc;
		acc1.getBalance();	
		
		Account acc2 = new BusinessAccount(1003, "Jo�o", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING - objeto da superclasse (acc2) sendo atribuido a objeto da subclasse (acc4)
		//para evitar erro, � necess�rio o casting manual
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		//SIMULA��O DE ERRO
		//SavingsAccount N�O pode ser convertido para BusinessAccount
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		
		/* ! subclasses distintas que estendem a mesma superclasse n�o podem se instanciar uma a outra */
		
		//TESTE - se acc3 recebe um objeto que seja instancia do tipo BusinessAccount, ele ent�o poder� realizar o casting
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		

	}
}
