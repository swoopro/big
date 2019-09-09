package 반복문;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 단수를 입력하세요>> ");
		int num = sc.nextInt();
		
		for (int i=1; i<10; i++) {
			
			System.out.println(num + " * " + i + " = " + (num * i));
			
		}
	}

}
