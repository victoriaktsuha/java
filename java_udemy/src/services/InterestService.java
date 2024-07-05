package services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();

	//metodos default tira a necessidade de implementar o método nas classe que implementam a interface
	default double payment(double amount, int months) {
		if(months < 1) {
			throw new InvalidParameterException("Months must br greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}

}
