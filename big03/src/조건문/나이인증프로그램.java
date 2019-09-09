package 조건문;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class 나이인증프로그램 {
	private static JTextField textField;
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("Dialog", Font.BOLD, 28));
		f.setTitle("나이 인증 프로그램");
		f.setSize(600, 450);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		textField = new JTextField();
		textField.setBackground(Color.GREEN);
		textField.setText("**********성인인증 프로그램입니다. 이름과 생년월일을 입력하세요**********");
		textField.setFont(new Font("Dialog", Font.BOLD, 15));
		textField.setHorizontalAlignment(JTextField.CENTER);
		f.getContentPane().add(textField);
		textField.setColumns(47);

		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 45));
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setFont(new Font("Dialog", Font.BOLD, 45));
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("생년");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 45));
		f.getContentPane().add(lblNewLabel_1);

		t2 = new JTextField();
		t2.setFont(new Font("Dialog", Font.BOLD, 45));
		f.getContentPane().add(t2);
		t2.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("나이");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 45));
		f.getContentPane().add(lblNewLabel_2);

		t3 = new JTextField();
		t3.setFont(new Font("Dialog", Font.BOLD, 45));
		f.getContentPane().add(t3);
		t3.setColumns(10);

		JButton btnNewButton = new JButton("인증");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int s3 = Integer.parseInt(s2); //스트링 인트로바꾸기
				Date date = new Date();
				int y1 = date.getYear() + 1900;
				int y2 = y1 - s3;
				t3.setText(y2 + "세"); //텍스트는 스트링으로넣자

				if (y2 >= 19) {
					t4.setText(s1 + "씨는 " + "  성인입니다. ");
				} else if (y2 < 19) {
					t4.setText(s1 + "씨는 " + "  성인이 아닙니다.");
				}

			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton);

		t4 = new JTextField(20);
		t4.setBackground(Color.PINK);
		t4.setFont(new Font("Dialog", Font.BOLD, 20));
		f.getContentPane().add(t4);

		f.setVisible(true);
	}

}
