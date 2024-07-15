package util;

import java.util.function.Predicate;

import entities.ProductFunctionalLambda;

public class ProductPredicate implements Predicate<ProductFunctionalLambda>{

	@Override
	public boolean test(ProductFunctionalLambda p) {
		return p.getPrice() >= 100.0;
	}

}
