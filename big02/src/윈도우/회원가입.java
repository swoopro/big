package 윈도우;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원가입 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setTitle("회원가입");
		f.setSize(395, 342);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("아   이   디:");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(Color.GRAY);
		t1.setFont(new Font("Dialog", Font.BOLD, 25));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 25));
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setBackground(Color.GRAY);
		t2.setFont(new Font("Dialog", Font.BOLD, 25));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("이      름:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 25));
		f.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.setBackground(Color.GRAY);
		t3.setFont(new Font("Dialog", Font.BOLD, 25));
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 25));
		f.getContentPane().add(lblNewLabel_3);
		
		t4 = new JTextField();
		t4.setBackground(Color.GRAY);
		t4.setFont(new Font("Dialog", Font.BOLD, 25));
		f.getContentPane().add(t4);
		t4.setColumns(10);
		
		JButton btnNewButton = new JButton("회원가입 진행");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				
				String s2 = t2.getText();
				String s3 = t3.getText();
				String s4 = t4.getText();
				
				t5.setText(s1+s2+s3+s4);
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton);
		
		t5 = new JTextField();
		t5.setBackground(Color.GRAY);
		t5.setFont(new Font("Dialog", Font.BOLD, 25));
		f.getContentPane().add(t5);
		t5.setColumns(10);
		
		
		f.setVisible(true);
		
	}

}
