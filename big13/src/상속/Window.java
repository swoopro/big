package 상속;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	public Window() {
		setTitle("나의제이프레임");
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		Window name = new Window();
		
	}

}
