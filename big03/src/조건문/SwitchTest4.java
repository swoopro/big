package 조건문;

import javax.swing.JOptionPane;

public class SwitchTest4 {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("사원번호"); // a100 를 넣으면 a가첫재값이니까 영엉부로나옴
		char c = data.charAt(0); // 첫번째 위치값
		switch (c) {
		case 'a':
			System.out.println("영업부");
			break;
		case 'b':
			System.out.println("기획부");
			break;
		case 'c':
			System.out.println("개발부");
			break;
		}

		char c2 = data.charAt(1);
		switch (c2) {
		case '1':
			System.out.println("과장");
			break;
		case '2':
			System.out.println("대리");
			break;
		case '3':
			System.out.println("사원");
			break;
		}

	}

}
