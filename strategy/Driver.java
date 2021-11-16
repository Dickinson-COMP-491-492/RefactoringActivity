// Just a program that uses the Account class.
public class Driver {

	public static void main(String[] args) {
		Account g = new Account(new GoldInterest());
		g.deposit(10);
		g.addInterest();
		System.out.println("g: " + g.getBalance());

		Account s = new Account(new SilverInterest());
		s.deposit(10);
		s.addInterest();
		System.out.println("s: " + s.getBalance());

		Account b = new Account(new BronzeInterest());
		b.deposit(10);
		b.addInterest();
		System.out.println("b: " + b.getBalance());
	}
}
