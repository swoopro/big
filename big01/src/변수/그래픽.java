package 변수;

import javax.swing.JOptionPane;

public class 그래픽 {

	public static void main(String[] args) {
		String name	= JOptionPane.showInputDialog("이름을 입력하세요.");
		String company = JOptionPane.showInputDialog("소속을 입력하세요.");
		System.out.println("당신의 이름은: " + name);
		System.out.println("당신의 소속은: " + company);
		
	}

}
