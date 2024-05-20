package entities;

public class BankAccount {
	
	//encapsulamento atributos
	private int number;
	private String holder;
	private double balance;
	

	//constructor padrão
	public BankAccount() {}
	
	//constructor
	public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
		this.number = accountNumber;
		this.holder = accountHolder;
		deposit(initialDeposit); // isso pode ser tratado como encapsulamento de método
	}
	
	//sobrecarga
	public BankAccount(int accountNumber, String accountHolder) {
		this.number = accountNumber;
		this.holder = accountHolder;
	}
	
	//encapsulamento - get & set
	public int getAccountNumber() {
		return number;
	}

	public String getAccountHolder() {
		return holder;
	}

	public void setAccountHolder(String accountHolder) {
		this.holder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}
	
	
	//método para saques e depositos
	public void deposit(double deposit) {
		this.balance = balance + deposit;
	}
	
	public void withdraw(double withdraw) {
		this.balance = balance - withdraw - 5.00;
	}
	
	public String toString() {
		return "Account " 
		+ number 
		+ ", Holder: " 
		+ holder 
		+ ", Balance: $ "
		+ String.format("%.2f", balance);
	}

}
