package 조건문;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력하세요: ");
		String data = sc.next();
		char c = data.charAt(0);

		switch (c) {
			case 'A': case 'a':
				System.out.println("최우수");
				break;
			case 'B': case 'b':
				System.out.println("우수");
				break;
			case 'C': case 'c':
				System.out.println("보통");
				break;
			default:
				System.out.println("불합격");
				break;
		}
	}

}
