package 스태틱시험;

public class MoneyMain {
	public static void main(String[] args) {
		Money m1 = new Money();
		m1.용돈("홍길동", 15);
		System.out.println(m1);
		System.out.println("아빠지갑 남은돈: " + Money.money);
		System.out.println("용돈준 횟수:" + Money.count);
		
		Money m2 = new Money();
		m2.용돈("홍길순", 10);
		System.out.println(m2);
		System.out.println("아빠지갑 남은돈: " + Money.money);
		System.out.println("용돈준 횟수:" + Money.count);
		
	}
}
