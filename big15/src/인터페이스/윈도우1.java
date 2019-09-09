package 인터페이스;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우1 extends JFrame {

	public 윈도우1() {
		setTitle("이벤트 처리 연습");
		setSize(500, 500);
		
		JButton b = new JButton("나를 눌러요.");
		add(b);
		
		이벤트처리2 이벤트2 = new 이벤트처리2();
		b.addActionListener(이벤트2);		
		//b버튼에 이벤트 처리를 할것이라고 설정 하고
		//addActionListener(이벤트처리할객체);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		윈도우1 name = new 윈도우1();
		
	}

}
