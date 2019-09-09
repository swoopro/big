package 연습;

import javax.swing.JOptionPane;

public class 연습2 {

	public static void main(String[] args) {
		String name	= JOptionPane.showInputDialog("이름을 입력하세요.");
		String age = JOptionPane.showInputDialog("나이를 입력하세요.");
		System.out.println("나의 이름은 " + name + "이고, 나이는 " + age + "세 입니다." );
	}

}
