package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	//associa��o
	private ProductShop product;
	
	public OrderItem() {
		
	}
		
	public OrderItem(Integer quantity, Double price, ProductShop product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}


	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public ProductShop getProduct() {
		return product;
	}
	public void setProduct(ProductShop product) {
		this.product = product;
	}
	public Double subTotal() {
		return quantity * price;
	}
	@Override
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
