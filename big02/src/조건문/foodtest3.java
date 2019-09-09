package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class foodtest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("먹고 싶은 음식 입력>> ");
		String food = sc.next(); //한단어
		
		System.out.print("몇 개 먹은지 입력>>");
		int count = sc.nextInt();
		System.out.println(count + "개 먹으러 가요");
		
		System.out.print("가격 입력>>");
		int price = sc.nextInt();
		
		int total = count * price;
		System.out.print("당신은 " + total + "원 내셔야 해요.");
		
		//6000원 넘으면 500원 깎아주세요.
		if (total >= 6000) {
			System.out.println("당신이 최종 낼 금액은 " + (total -500) + "원 입니다.");
		}
		// 당신이 최종 낼 금액은 5500원 입니다.
		//아니면,
		// 당신이 최종 낼 금액은 5000원 입니다.
		
		
		if(food.equals("자장")) {
			System.out.println("중국집으로 가요.");
		}else if(food.equals("라면")) {
			System.out.println("분식집으로 가요.");
		}else if(food.equals("스시")) {
			System.out.println("일식집으로 가요.");
		}
	}

}
