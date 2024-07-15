package entities;

//public class ProductFunctionalLambda implements Comparator<ProductFunctionalLambda>{
public class ProductFunctionalLambda{

	private String name;
	private Double price;

	public ProductFunctionalLambda(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//para aula 257. Consumer - reference method com método estático
	public static void staticPriceUpdate(ProductFunctionalLambda p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	//para aula 257. Consumer - reference method com método não estático
	public void nonStaticPriceUpdate() {
		setPrice(getPrice() * 1.1);
		//price = price * 1.1;
	}
	
	//para aula 256. Predicate - reference method com método estático - trabalha com argumento
	public static boolean staticProductPredicate(ProductFunctionalLambda p) {
		return  p.getPrice() >= 100.0;
	}
	
	//para aula 256. Predicate - reference method com método não estático - trabalha com o proprio objeto onde se encontra, sem argumento
	public boolean nonStaticProductPredicate() {
		return  price >= 100.0;
	}
	
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
	//para aula 253. Uma experiência com Comparator - com Collection.sort()
//	@Override
//	public int compareTo(ProductFunctionalLambda other) {
//		return name.toUpperCase().compareTo(other.getName().toUpperCase());
//	}

}
