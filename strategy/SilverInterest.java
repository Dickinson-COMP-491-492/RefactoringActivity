public class SilverInterest implements InterestApplier {
	  private double rate;

	  public SilverInterest(double rate) {
	  	this.rate = rate;
  	}

  	@Override
  	public double getInterest(double balance) {
	  	return balance*rate;
	  }
}
