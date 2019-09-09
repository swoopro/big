package 메서드;

import java.util.Scanner;

public class 사칙연산User {

	public static void main(String[] args) {
		사칙연산 s = new 사칙연산();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1: ");
		int x = sc.nextInt();
		System.out.print("숫자2: ");
		int y = sc.nextInt();
		
		
		int result1 = s.add(x, y);
		int result2 = s.minus(x, y);
		int result3 = s.mul(x, y);
		int result4 = s.div(x, y);
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
	}

}
