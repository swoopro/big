package 반복문;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("처음값: ");
		int data = sc.nextInt();
		System.out.print("마지막값: ");
		int data2 = sc.nextInt();

		int sum = 0;
		for (int i = data; i <= data2; i++) {
		
			sum = sum + i;
		}
		
		System.out.println("다 합한 값은>> " + sum);
	}

}
