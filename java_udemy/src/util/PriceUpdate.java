package util;

import java.util.function.Consumer;

import entities.ProductFunctionalLambda;

public class PriceUpdate implements Consumer<ProductFunctionalLambda>{

	@Override
	public void accept(ProductFunctionalLambda p) {
		p.setPrice(p.getPrice() * 1.1);
		
	}

}
