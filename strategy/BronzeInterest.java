public class BronzeInterest implements InterestApplier {
	private double threshold;
	private double hiRate;
	private double loRate;

	public BronzeInterest(double threshold, double hiRate, double loRate) {
			this.threshold = threshold;
			this.hiRate = hiRate;
			this.loRate = loRate;
	}

	@Override
	public double getInterest(double balance) {
		  if (balance > threshold) {
			  return balance*hiRate;
		  }
		  else {
		  	return balance*loRate;
		  }
	  }
}
