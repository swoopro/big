package 조건문;

import java.util.Random;
import java.util.Scanner;

public class 랜덤 {

	public static void main(String[] args) {
		Random r = new Random();
//		System.out.println(r.nextInt(100));
		int t1 = r.nextInt(100);
		System.out.println("숫자를 입력하세요");
		int count = 0; //시도한 횟수는 0부터
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int p1 = sc.nextInt();
			if(p1 == t1) {
				count++;
				System.out.println("정답!");
				System.out.println(count + "번 입력해서 맞춤");
				break;
			}else if(p1 > t1) {
				count++;
				System.out.println("Down!");
			}else if(p1 < t1) {
				count++;
				System.out.println("Up!");
			}else {
				
			}
		}
	
	}

}
