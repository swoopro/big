package 배열심화;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 참조형배열3 implements ActionListener {
	static JButton[] buttons;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		buttons = new JButton[200]; // 배열의 new : 버튼200개만든단의미가아님

		Color[] colors = { Color.blue, Color.yellow, Color.pink, Color.gray };
		Random r = new Random();

		for (int i = 0; i < buttons.length; i++) {
//			JButton b = new JButton(i + "");
//			buttons[i] = b;
			buttons[i] = new JButton(i + "");
			int index = r.nextInt(4);
			buttons[i].setBackground(colors[index]);
			f.add(buttons[i]);
			buttons[i].addActionListener(new 참조형배열3());

		}
		f.setSize(1000, 500);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		String action = e.getActionCommand();
		if(action.equals("예약")) { 
			JOptionPane.showMessageDialog(null, "예약이 이미완료되었습니다. 다른자리를선택해주세요.");
		}else {
		int index = Integer.parseInt(action);
		buttons[index].setText("예약");
		}

	}

}
