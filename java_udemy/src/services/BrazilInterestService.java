package services;

public class BrazilInterestService implements InterestService{
	
	private double interestRate;

	public BrazilInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	
}
