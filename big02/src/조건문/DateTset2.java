package 조건문;

import java.util.Date;

import javax.swing.JOptionPane;

public class DateTset2 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		
		
		if(hour < 11) {
			System.out.println("굿모닝");
		}else if(hour <17) {
			System.out.println("굿애프터눈");
		}else if(hour < 20) {
			System.out.println("굿이브닝");
		}else
			System.out.println("굿나잇");
		
		String food = JOptionPane.showInputDialog("먹고 싶은 음식 입력");
		
		if(food.equals("자장")) {
			System.out.println("중국집으로 가요.");
		}else if(food.equals("라면")) {
			System.out.println("분식집으로 가요.");
		}else if(food.equals("스시")) {
			System.out.println("일식집으로 가요.");
		}
	}

}
