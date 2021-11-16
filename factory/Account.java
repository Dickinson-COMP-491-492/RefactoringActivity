public class Account {
	private double balance;
	private InterestApplier interestStrategy;

	private Account(InterestApplier interestStrategy) {
		this.interestStrategy = interestStrategy;
		balance = 0;
	}

	public static Account getAccount(String type) {
		if (type.equals("Gold")) {
			return new Account(new GoldInterest(0.05, 0.5));
		}
		else if (type.equals("Silver")) {
			return new Account(new SilverInterest(0.025));
		}
		else if (type.equals("Bronze")) {
			return new Account(new BronzeInterest(1000, 0.02, 0.01));
		}
		else {
			throw new IllegalArgumentException("Unrecognized type.");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public void addInterest() {
		balance = balance + interestStrategy.getInterest(balance);
	}

	private static class GoldInterest implements InterestApplier {
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

	private static class SilverInterest implements InterestApplier {
		private double rate;

		public SilverInterest(double rate) {
			this.rate = rate;
		}

		@Override
		public double getInterest(double balance) {
			return balance*rate;
		}
	}

	private static class BronzeInterest implements InterestApplier {
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
}
