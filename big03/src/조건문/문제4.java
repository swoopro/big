package 조건문;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1: ");
		int data1 = sc.nextInt();
		System.out.print("숫자2: ");
		int data2 = sc.nextInt();
		System.out.print("연산자: ");
		String data3 = sc.next();
		
		if(data3.equals("+")) {
			System.out.println(data1 + data2);
		}else if(data3.equals("-")) {
			System.out.println(data1 - data2);
		}else if(data3.equals("*")) {
			System.out.println(data1 * data2);
		}else if(data3.equals("/")) {
			System.out.println(data1 / data2);
		}else {
			System.out.println("연산 할 수 없는 기호입니다.");
		}
		
	
	
		
		
		
	}

}
