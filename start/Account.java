// 1. Refactor Account to use the strategy pattern.
// 2. Refactor that result to use the factory method pattern.

public class Account {
	private String type;
	private double balance;

	public Account(String type) {
		this.type = type;
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
		if (type.equals("Gold")) {
			balance = balance + balance*0.05 + 0.50;
		}
		else if (type.equals("Silver")) {
			balance = balance + balance*0.025;
		}
		else if (type.equals("Bronze")) {
			if (balance > 1000) {
				balance = balance + balance*0.02;
			}
			else {
				balance = balance + balance*0.01;
			}
		}
	}
}
