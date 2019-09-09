package 배열;

import java.util.Scanner;

public class 배열연습10 {

	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0; //★★★총합할 변수 ,더할때는 0, 곱할때는 1 
		
		for (int i = 0; i < score.length; i++) {
			System.out.print("성적을 입력하시오:");
			score[i] = sc.nextInt();		
			sum = sum + score[i]; //★★★★★
		}
	
		System.out.println("평균값: " + (sum / score.length));
			
		
	}
}
