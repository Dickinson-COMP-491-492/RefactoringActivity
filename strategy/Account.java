public class Account {
	private double balance;
	private InterestApplier interestStrategy;

	public Account(InterestApplier interestStrategy) {
		this.interestStrategy = interestStrategy;
		balance = 0;
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
}
