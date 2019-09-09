package 반복문;

import java.util.Scanner;

public class StringSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sum = "";
		for (int i = 0; i < 5; i++) {
			System.out.print("입력: ");
			String data = sc.next();
			sum = sum + " " + data;
		}
		System.out.println(sum);
	}

}
