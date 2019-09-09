package 형변환;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame {//Jframe 상속받음
	JButton b;
	//전역변수로 선언만 한 상태, 참조형이므로 현재값은 null
	
	public Window() {
		setSize(500, 500);
		b = new JButton("나를 눌러요...");
		add(b);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Window name = new Window();
	}

}
