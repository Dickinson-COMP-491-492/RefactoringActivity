public class GoldInterest implements InterestApplier {
  	private double rate;
	  private double bonus;

  	public GoldInterest(double rate, double bonus) {
	  	this.rate = rate;
	  	this.bonus = bonus;
	  }

  	@Override
  	public double getInterest(double balance) {
	  	return balance*rate + bonus;
	  }
}
