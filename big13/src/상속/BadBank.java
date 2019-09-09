package 상속;

public class BadBank extends Bank {
	@Override
	public double getInterestRate() {
		return 10;
	}
}
