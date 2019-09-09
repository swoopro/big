package db연결;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 회원가입화면 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("회원가입 화면");
		f.setSize(500,500);
		f.getContentPane().setLayout(new FlowLayout());
		
		JLabel lblNewLabel = new JLabel("I D");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 38));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 38));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("P W");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 38));
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 38));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 38));
		f.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 38));
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("TEL");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 38));
		f.getContentPane().add(lblNewLabel_3);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 38));
		f.getContentPane().add(t4);
		t4.setColumns(10);
		
		JButton btnNewButton = new JButton("회원가입처리");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				DB처리 db = new DB처리();
				try {
					db.insert(id, pw, name ,tel);
				} catch (Exception e1) {
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 38));
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("회원정보수정");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String tel = t4.getText();
				DB처리 db = new DB처리();
				try {
					db.update(id, tel);
					
				} catch (Exception e1) {
				}
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 38));
		f.getContentPane().add(button);
		
		
		
		f.setVisible(true);
	}

}
