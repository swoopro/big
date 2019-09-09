package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 스티커 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("스티커 개수: ");
		int num = sc.nextInt();
		System.out.print("스티커 가격: ");
		int price = sc.nextInt();
		
		System.out.print("노트 개수: ");
		int num2 = sc.nextInt();
		System.out.print("노트 가격: ");
		int price2 = sc.nextInt();
		
		int total = num * price;
		System.out.println("스티커 총 가격: " + total + "원");
		int total2 = num2 * price2;
		System.out.println("노트 총 가격: " + total2 + "원");
		
		System.out.println("------------------------");
		if((total + total2) > 25000) {
			System.out.print("총 결제금액: " + ((total + total2) - 3000) + "원");
		}
		
		
		
		
	}

}
