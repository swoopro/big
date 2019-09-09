package 클래스;

public class AccountManagerclass {

	public static void main(String[] args) {
		Accountclass a1 = new Accountclass();
		a1.type = "적금";
		a1.name = "홍길동";
		a1.sum = 10000;
		
		Accountclass a2 = new Accountclass();
		a2.type = "예금";
		a2.name = "홍길순";
		a2.sum = 20000;
		
		Accountclass a3 = new Accountclass();
		a3.type = "자유예금";
		a3.name = "홍길진";
		a3.sum = 15000;
		
		System.out.print("은행 계좌 관리 프로그램");
		System.out.println("\n--------------------");
		System.out.println("계좌종류     예금주       금액");
		System.out.println("      " + a1);
		System.out.println("      " + a2);
		System.out.println(a3);
	}

}
