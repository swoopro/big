package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class 배열연습7 {

	public static void main(String[] args) {
		//1.개인
		//출력 => 자바보다는 스프링
		String[] sub = {"자바", "JSP", "스프링"};
		System.out.println(sub[0] + "보다는 " + sub[2]);
		System.out.println("-------------------------");  
		
		//2.개인
		//10,20,30,40,50이 들어간 배열생성
		//첫번째값과 네번째값 더해서 출력
		int[] num = {10, 20, 30, 40, 50};
		System.out.println(num[0] + num[3]);
		System.out.println("-------------------------");  
//		int[] num4 = new int[5];
//		for (int i = 0; i < num4.length; i++) {
//			num4[i] = 10 * (10 + i);
//		}
//		System.out.println("첫째+넷째값은: " + (num[0] + num[3]));		
		
		//3.짝궁이랑 ㄱㄱ
		//33의 위치를 찾으세요
		int[] num2 = {11, 22, 33, 44};
		for (int i = 0; i < num.length; i++) {
			if (num2[i] == 33) {
				System.out.println("0번부터시작해서" + i + "번째");
				break;
			}
		}		System.out.println("-------------------------");  

		
		//4.
		//입력을 받아서 10,20,30을 배열어 넣은 후,
		//입력한 값의 위치를 찾으세요
		//1)배열을 생성, 2)입력하여 배열값을 대입
		//3) 찾고자하는 값 입력, 4) 위치찾기
		int[] num3 = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < num3.length; i++) {
			System.out.print("숫자입력(" + (i+1) + "/" + 3 + "): ");
			num3[i] = sc.nextInt();
		}
		System.out.print("찾고자하는값: ");
		int finddata = sc.nextInt();
		for (int i = 0; i < num3.length; i++) {
			if(num3[i] == finddata) {
				System.out.println("0번째부터시작해서" + i + "번째");	
			}
		}
		
		Arrays.sort(num3); //파괴적함수, 오름차순정리
		for (int i : num3) {
			System.out.println(i);
			
		}
		int index = Arrays.binarySearch(num3, 10);
				System.out.println(index);

	}

}
