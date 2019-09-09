package 윈도우;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 내첫윈도우 {

	public static void main(String[] args) {
		//frame부품 복사

		JFrame f1 = new JFrame();
		f1.setTitle("나의 윈도우");
		f1.setSize(500, 500);
					
		JButton b1 = new JButton("나를 눌러요.");
		f1.add(b1);
		f1.setVisible(true);
		
		JFrame f2 = new JFrame();
		f2.setTitle("나의 윈도우2");
		f2.setSize(300, 300);
		f2.setVisible(true);
		
		JFrame f3 = new JFrame();
		f3.setTitle("나의 윈도우3");
		f3.setSize(170, 250);
		f3.setVisible(true);
		//부품에서 제공하는 기능사용
		
	}

}
