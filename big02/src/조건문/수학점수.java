package 조건문;

import java.util.Scanner;

public class 수학점수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 수학 점수 입력: ");
		int score = sc.nextInt();
		String level;
		
		if(score > 90) {
			System.out.println("A");
			level = "A";
		}else if(score > 80) {
			System.out.println("B");
			level = "B";
		}else if(score > 70) {
			System.out.println("C");
			level = "C";
		}else if(score > 60) {
			System.out.println("D");
			level = "D";
		}else {
			System.out.println("F");
			level = "F";
		}
		System.out.println("당신의 학점은 " + level + "학점입니다.");
	}

}
