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
		
		
		//Herança - class Account e class BusinessAccount
		
		/*
		 * - É um tipo de associação que permite que uma classe herde todos dados e 
		 * comportamento de outra
		 * - Definições importantes
		 * - Vantagens: reuso e polimorfismo
		 * - Sintaxe: class A extends B
		 * - Relação "é-um" - no exemplo, a conta empresarial também é uma conta comum 
		 * quando extende a super classe
		 * - Generalização/especialização - no exemplo, a conta comum é uma generalização 
		 * e a conta empresarial é uma especialização
		 * - superclasse (classe base) / subclasse (classe derivada)
		 * - Herança/extensão
		 * - Herança é uma associação entre classes (e não entre objetos)
		 * herança é associação entre classes e composição é associação entre objetos 
		 * - na memória, a herança teria apenas um objeto com todos os atributos de ambas 
		 * as classes e na composição criam-se objetos distintos
		 * Herança permite o reuso de atributos e métodos (dados e comportamento)
		 * 
		 * Exemplo na classe Account e BusinessAccount:
		 * suponha um negócio de banco que possui uma conta comum e uma conta para empresas,
		 * sendo que a conta para empresa possui todos membros da conta comum, mais um limite 
		 * de empréstimo e uma operação de realizar empréstimo.
		 * A classe conta comum será a super classe, que será extendida pela agora 
		 * subclasse conta para empresas e os atributos do construtor da super classe 
		 * serão atribuidos no construtor da subclasse através do método super(); junto com
		 * qualquer outra atribuição própria 

		 */
		
		//Upcasting e Downcasting
		
		/*
		 * Upcasting: casting da subclasse para a superclasse; 
		 * Uso comum: polimorfismo
		 * 
		 * Downcasting: casting da superclasse para subclasse; 
		 * Palavra instaceof; 
		 * Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)
		 * 
		 * Exemplo na classe Account, BusinessAccount e SavingsAccount:
		 */
		
		Account acc = new Account(1001, "Bob", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING	- objeto da subclasse (bacc) sendo atribuido a objeto da superclasse (acc)
		//não é acusado erro nessa relação pois a herança é relação "é-um", tornando subclasse e superclasse um mesmo tipo
		Account acc1 = bacc;
		acc1.getBalance();	
		
		Account acc2 = new BusinessAccount(1003, "João", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING - objeto da superclasse (acc2) sendo atribuido a objeto da subclasse (acc4)
		//para evitar erro, é necessário o casting manual
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		//SIMULAÇÃO DE ERRO
		//SavingsAccount NÃO pode ser convertido para BusinessAccount
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		
		/* ! subclasses distintas que estendem a mesma superclasse não podem se instanciar uma a outra */
		
		//TESTE - se acc3 recebe um objeto que seja instancia do tipo BusinessAccount, ele então poderá realizar o casting
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
