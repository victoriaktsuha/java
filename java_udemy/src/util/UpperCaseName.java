package util;

import java.util.function.Function;

import entities.ProductFunctionalLambda;

public class UpperCaseName implements Function<ProductFunctionalLambda, String>{

	@Override
	public String apply(ProductFunctionalLambda p) {
		return p.getName().toUpperCase();
	}

}
