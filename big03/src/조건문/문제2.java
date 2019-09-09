package 조건문;

import java.util.Date;
import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear() + 1900;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요: ");
		int date2 = sc.nextInt();
		
		System.out.println("남은년도는" + (date2 - year) + "년 입니다.");
		
		
		
	}

}
