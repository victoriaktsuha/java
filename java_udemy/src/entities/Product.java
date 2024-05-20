package entities;

public class Product {
	
	//encapsulamento
	private String name;
	private double price;
	private int quantity;
	
	//construtor padr�o
	public Product() {
	}
	
	//construtor - executa no momento da instancia��o do objeto
	public Product(String name, double price, int quantity) {
		//'this' para se referir ao atributo do objeto, n�o ao do par�metro
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//sobrecarga - outra op��o de construtopara utilizar ao instaciar
	public Product(String name, double price) {
		//'this' para se referir ao atributo do objeto, n�o ao do par�metro
		this.name = name;
		this.price = price;
	}
	 
	//encapsulamento - get e set
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	//N�o criaremos o setQuantity, pois esse atributo s� pode mudar atr�ves dos m�todos add e remove
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	//'void' pois o m�todo n�o retorna valor, apenas adiciona no total de estoque
	public void addProducts(int quantity) {
		//o 'this' � para especificiar que se refere ao quantity atributo da classe, diferenciando do 'quantity' argumento do m�todo - 'this' significa uma auto-referencia para o objeto
		this.quantity += quantity;
	}
	
	//'void' pois o m�todo n�o retorna valor, apenas remove do total de estoque
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//como a classe Product tamb�m � um Object, estamos sobrepondo a classe padr�o toString. Ent�o todos os retornos que estiverem aqui dentro, ser�o automaticamente impressos no console quando o objeto do tipo Product estiver em um contexto de System.out.print, podem j� ser formatado corretamente aqui para depois s� ser 'chamado'.
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price) //formata��o para imprimir 2 casas decimais
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f",totalValueInStock());
	}
}
