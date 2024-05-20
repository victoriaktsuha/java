package entities;

public class Product {
	
	//encapsulamento
	private String name;
	private double price;
	private int quantity;
	
	//construtor padrão
	public Product() {
	}
	
	//construtor - executa no momento da instanciação do objeto
	public Product(String name, double price, int quantity) {
		//'this' para se referir ao atributo do objeto, não ao do parâmetro
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//sobrecarga - outra opção de construtopara utilizar ao instaciar
	public Product(String name, double price) {
		//'this' para se referir ao atributo do objeto, não ao do parâmetro
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
	
	//Não criaremos o setQuantity, pois esse atributo só pode mudar atráves dos métodos add e remove
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	//'void' pois o método não retorna valor, apenas adiciona no total de estoque
	public void addProducts(int quantity) {
		//o 'this' é para especificiar que se refere ao quantity atributo da classe, diferenciando do 'quantity' argumento do método - 'this' significa uma auto-referencia para o objeto
		this.quantity += quantity;
	}
	
	//'void' pois o método não retorna valor, apenas remove do total de estoque
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//como a classe Product também é um Object, estamos sobrepondo a classe padrão toString. Então todos os retornos que estiverem aqui dentro, serão automaticamente impressos no console quando o objeto do tipo Product estiver em um contexto de System.out.print, podem já ser formatado corretamente aqui para depois só ser 'chamado'.
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price) //formatação para imprimir 2 casas decimais
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f",totalValueInStock());
	}
}
