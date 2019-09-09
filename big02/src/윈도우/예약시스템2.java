package 윈도우;

import java.awt.FlowLayout;
import java.nio.FloatBuffer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 예약시스템2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setTitle("예약시스템2");
		f.setSize(599, 553);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("단어1");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("단어2");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton btnNewButton = new JButton("단어를 합해라!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				t3.setText(s1+s2);
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton);
		
		
		
		f.setVisible(true);
		
	}

}
