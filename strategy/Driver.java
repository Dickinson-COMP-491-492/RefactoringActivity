// Just a program that uses the Account class.
public class Driver {

	public static void main(String[] args) {
		Account g = new Account(new GoldInterest(0.05, 0.5));
		g.deposit(10);
		g.addInterest();
		System.out.println("g: " + g.getBalance());

		Account s = new Account(new SilverInterest(0.025));
		s.deposit(10);
		s.addInterest();
		System.out.println("s: " + s.getBalance());

		Account b = new Account(new BronzeInterest(1000,0.2,0.1));
		b.deposit(10);
		b.addInterest();
		System.out.println("b: " + b.getBalance());
	}
}
