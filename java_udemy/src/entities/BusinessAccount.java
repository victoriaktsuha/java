package entities;

//heran�a - a classe BusinessAccount (agora subclasse) herda (extends) todos os atributos e m�todos da classe (agora super classe) Account
public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		// super() adc para caso o construtor padr�o da super classe receba algum tipo
		// de l�gica
		super();
	}

	// ao criar um construtor de uma classe que extende outra (super classe) via
	// gerador de c�digo, voc� pode escolher qual construtor da super classe quer
	// utilizar - padr�o (vazio) ou com argumentos
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		// o super() substitui a necessidade de repetir a atribui��o dos argumentos
		// 'copiados' da classe extendida, o construtor da super classe, declarando
		// apenas o argumento que foi criado exclusivamente na classe extensora
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit)
			balance += amount - 10.0;
	}
	
	@Override
	public final void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
