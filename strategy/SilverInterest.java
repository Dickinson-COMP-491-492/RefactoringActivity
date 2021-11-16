package strategy;

public class SilverInterest implements InterestApplier {

	@Override
	public double getInterest(double balance) {
		return balance*0.025;
	}
}
