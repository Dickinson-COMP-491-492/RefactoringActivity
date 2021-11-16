package strategy;

public class GoldInterest implements InterestApplier {

	@Override
	public double getInterest(double balance) {
		return balance*0.05 + 0.50;
	}
}
