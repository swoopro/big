package 윈도우;

import java.util.Scanner;

public class 입력테스트 {

	public static void main(String[] args) {
		//모든 입력데이터는 String 이다.!!
		//String --> int로 변환해줘야 한다.
		
		//입력한String을 원하는 타입으로 변환
		//키보드, 파일, 네트워크
		Scanner sc = new Scanner(System.in);
		//하나의 클래스에서 한번 복사하고 계속 쓸 수 있음.
		System.out.print("이름입력>> ");
		
		String s1 = sc.next(); //String입력
		System.out.println("당신의 이름은 " + s1);
		
			
		System.out.print("소속 입력");
		String company = sc.next();
		
		System.out.println("당신의 이름은 " + s1);
		System.out.println("당신의 소속은 " + company);
		
	}

}
