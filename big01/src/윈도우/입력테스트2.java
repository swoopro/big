package 윈도우;

import java.util.Scanner;

public class 입력테스트2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력>>");
		String name = sc.next();
		
		System.out.print("나이 입력>>");
		int age = sc.nextInt();
		
		System.out.print("몸무게 입력>>");
		Double weight = sc.nextDouble();
		
		System.out.print("저녁 먹을지 입력>>");
		boolean food = sc.nextBoolean();
				
		System.out.print("한줄 입력>>");
		sc.nextLine();
		String line = sc.nextLine();
		
		System.out.println("내 이름은 " + name);
		System.out.println("내 내년 나이는  " + (age + 1));
		System.out.println("내 몸무게는  " + weight);
		System.out.println("나는 저녁을 먹을까요?  " + food);
		System.out.println("나의 좌우명은  " + line);
	}

}
