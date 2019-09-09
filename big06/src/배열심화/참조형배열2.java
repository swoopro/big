package 배열심화;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 참조형배열2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton[] buttons = new JButton[200]; // 배열의 new : 버튼200개만든단의미가아님
		
		Color[] colors =  {Color.blue, Color.yellow, Color.pink, Color.gray};
		Random r = new Random();
		
		for (int i = 0; i < buttons.length; i++) {
//			JButton b = new JButton(i + "번");
//			buttons[i] = b;
			buttons[i] = new JButton(i + "번");
			int index = r.nextInt(4);
			buttons[i].setBackground(colors[index]);
			f.add(buttons[i]);

		}
		f.setSize(1000, 500);
		f.setVisible(true);

	}

}
