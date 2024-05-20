package util;

public class CurrencyConverter {
	
	public static final double IOF = 6.0;

	public static double convertion(double dollarPrice, double dollarAmount) {
		double value = dollarPrice * dollarAmount;
		return value += value * IOF/100;
	}
}
