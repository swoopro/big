package 메서드;

import java.util.Scanner;

public class 계산기User2 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		
		final int PRICE = 6000;
//		price = 7000; 상수는 변경불가.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇잔 시키나요? >> ");
		int count = sc.nextInt();
		
		int total = cal.mul(PRICE, count);
		
		if (total >= 40000) {
			System.out.println(total - 10000 + "원을 내세요." );			
		}else if (total >= 20000) {
			System.out.println(total - 5000 + "원을 내세요.");
		}else {
			System.out.println(total + "원을 내세요.");
		}
		
	}

}
