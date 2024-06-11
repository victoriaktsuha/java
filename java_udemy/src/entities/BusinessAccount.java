package entities;

//herança - a classe BusinessAccount (agora subclasse) herda (extends) todos os atributos e métodos da classe (agora super classe) Account
public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		// super() adc para caso o construtor padrão da super classe receba algum tipo
		// de lógica
		super();
	}

	// ao criar um construtor de uma classe que extende outra (super classe) via
	// gerador de código, você pode escolher qual construtor da super classe quer
	// utilizar - padrão (vazio) ou com argumentos
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		// o super() substitui a necessidade de repetir a atribuição dos argumentos
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
