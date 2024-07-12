package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<ProductFunctionalLambda> {

	@Override
	public int compare(ProductFunctionalLambda p1, ProductFunctionalLambda p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
