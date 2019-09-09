package 배열;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 극장예약2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("예매");
		f.setSize(531, 500);
		
		JLabel l1 = new JLabel("l");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("굴림", Font.BOLD, 30));
		int[] seat = new int[10];
		
		JLabel lblNewLabel = new JLabel("       \uADF9\uC7A5 \uC608\uB9E4 \uC2DC\uC2A4\uD15C");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel.setBackground(Color.PINK);
		f.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(b1.getText().equals("예약")) {
					l1.setText("이미 예약된 좌석입니다.");
				}else {b1.setText("예약");
					   l1.setText("예약완료.");
				}
			}
		});
		b1.setBounds(12, 50, 97, 23);
		panel.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setBounds(113, 50, 97, 23);
		panel.add(b2);
		
		JButton b3 = new JButton("3");
		b3.setBounds(213, 50, 97, 23);
		panel.add(b3);
		
		JButton b4 = new JButton("4");
		b4.setBounds(313, 50, 97, 23);
		panel.add(b4);
		
		JButton b5 = new JButton("5");
		b5.setBounds(413, 50, 97, 23);
		panel.add(b5);
		
		JButton b6 = new JButton("6");
		b6.setBounds(12, 109, 97, 23);
		panel.add(b6);
		
		JButton b7 = new JButton("7");
		b7.setBounds(113, 109, 97, 23);
		panel.add(b7);
		
		JButton b8 = new JButton("8");
		b8.setBounds(213, 109, 97, 23);
		panel.add(b8);
		
		JButton b9 = new JButton("9");
		b9.setBounds(313, 109, 97, 23);
		panel.add(b9);
		
		JButton b10 = new JButton("10");
		b10.setBounds(413, 109, 97, 23);
		panel.add(b10);
		
		l1.setForeground(SystemColor.textHighlight);
		l1.setBounds(41, 188, 437, 76);
		panel.add(l1);
		
		
		f.setVisible(true);
		
	}
}
