package 메서드;

import java.util.Random;
import java.util.Scanner;

public class 스캐너 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.>> ");
		String name = sc.next();
		System.out.println("당신의 이름은 " + name);
		
		Random r = new Random();
		int i = r.nextInt();
		System.out.println(i);

		
	}

}
