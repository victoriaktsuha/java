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
	
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	//com Collection.sort()
//	@Override
//	public int compareTo(ProductFunctionalLambda other) {
//		return name.toUpperCase().compareTo(other.getName().toUpperCase());
//	}

}
