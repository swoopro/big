package 스태틱;

public class 계좌출금 {

	public static void main(String[] args) {
		계좌 출금1 = new 계좌();
		출금1.출금하다("20190829", 1000);
		System.out.println(출금1);
		System.out.println("계좌 잔액: " + 계좌.money);
		System.out.println("출금 횟수: " + 계좌.count);
		
		//클래스이름.변수이름은 스태틱이다
		
		계좌 출금2 = new 계좌();
		출금2.출금하다("20190830", 2000);
		System.out.println(출금2);
		System.out.println("계좌 잔액: " + 계좌.money);
		System.out.println("출금 횟수: " + 계좌.count);

	}

}
