package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.ProductFunctionalLambda;

public class ProductService {

	public double filteredSum(List<ProductFunctionalLambda> list, Predicate<ProductFunctionalLambda> criteria) {
		double sum = 0.0;
		for(ProductFunctionalLambda p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
	
}
