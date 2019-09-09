package 윈도우;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 메인 {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("예약 시스템");
		f.setSize(500, 500);
		
		JLabel t2 = new JLabel("여기글씨 들어가요");
		t2.setFont(new Font("굴림", Font.BOLD, 45));
		f.getContentPane().add(t2, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("나를 눌러요");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String data = t1.getText();
				System.out.println(data);
				t2.setText(data);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 45));
		f.getContentPane().add(btnNewButton_1, BorderLayout.SOUTH);
		
		t1 = new JTextField();
		t1.setText("글씨");
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 45));
		f.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);

		f.setVisible(true);
	}

}
