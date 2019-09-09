package 상속;

public class BankUser {

	public static void main(String[] args) {
		BadBank bad = new BadBank();
		NormalBank normal = new NormalBank();
		GoodBank good = new GoodBank();
		
		System.out.println("BadBank의 이자율: " + bad.getInterestRate());		
		System.out.println("NormalBand의 이자율: " +normal.getInterestRate());
		System.out.println("GoodBank의 이자율: " + good.getInterestRate());
	}

}
