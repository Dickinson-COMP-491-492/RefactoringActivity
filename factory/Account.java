package factory;

public class Account {
	private double balance;
	private InterestApplier interestStrategy;
	
	private Account(InterestApplier interestStrategy) {
		this.interestStrategy = interestStrategy;
		balance = 0;
	}
	
	public static Account getAccount(String type) {
		if (type.equals("Gold")) {
			return new Account(new GoldInterest());
		}
		else if (type.equals("Silver")) {
			return new Account(new SilverInterest());
		}
		else if (type.equals("Bronze")) {
			return new Account(new BronzeInterest());
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

		@Override
		public double getInterest(double balance) {
			return balance*0.05 + 0.50;
		}
	}
	
	private static class SilverInterest implements InterestApplier {

		@Override
		public double getInterest(double balance) {
			return balance*0.025;
		}
	}
	
	private static class BronzeInterest implements InterestApplier {
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
	
	
	
	
}
