package 변수;

import javax.swing.JOptionPane;

public class 그래픽연습 {

	public static void main(String[] args) {
		System.out.println("------------------------------");
		String subject = JOptionPane.showInputDialog("수강과목을 입력하세요.");
		String number = JOptionPane.showInputDialog("강의실 호수를 입력하세요.");
		String level = JOptionPane.showInputDialog("난이도를 입력하세요.");
		
		System.out.println("수강과목: " + subject );
		System.out.println("강의실: " + number );
		System.out.println("난이도: " + level );
		
	}

}
