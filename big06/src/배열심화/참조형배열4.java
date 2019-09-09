package 배열심화;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class 참조형배열4 implements ActionListener {
	static JButton b1, b2, b3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
//		FlowLayout flow = new FlowLayout();
//		f.setLayout(flow);
		f.setLayout(new FlowLayout());

		b1 = new JButton("가위");
		b2 = new JButton("바위");
		b3 = new JButton("보");

		// 버튼을 클릭하면,
		// actionPerformed() 호출되도록 세팅
		참조형배열4 참4 = new 참조형배열4();
		b1.addActionListener(참4);
		b2.addActionListener(참4);
		b3.addActionListener(참4);

		Random r = new Random();

		f.setSize(1000, 500);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int result = JOptionPane.showConfirmDialog(null, "가위가 확실합니까");
			System.out.println(result);
			switch (result) {
			case 0:
				JOptionPane.showMessageDialog(null, "가위가 확실하시군요.");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "다시고르세요.");

				break;
			case 2:
				JOptionPane.showMessageDialog(null, "취소.");

				break;

			default:
				break;
			}
		} else if (e.getSource() == b2) {
			JOptionPane.showConfirmDialog(null, "바위가 확실합니까");
		} else if (e.getSource() == b3) {
			JOptionPane.showConfirmDialog(null, "보가 확실합니까");
		}

	}

}
