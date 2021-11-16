package strategy;

public class BronzeInterest implements InterestApplier {

	@Override
	public double getInterest(double balance) {
		if (balance > 1000) {
			return balance*0.02;
		}
		else {
			return balance*0.01;
		}
	}
}
