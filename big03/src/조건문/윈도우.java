package 조건문;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class 윈도우 {
	private static JTextField pw;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("굴림", Font.PLAIN, 45));
		f.setTitle("나의 윈도우");
		f.setSize(550, 750);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel img = new JLabel("");
		
		JTextField id = new JTextField(10);
		id.setBackground(Color.ORANGE);
		id.setFont(new Font("굴림", Font.BOLD, 45));
		JButton t2 = new JButton("로그인처리");
		t2.setBackground(Color.RED);
		JTextField t3 = new JTextField(10);
		t2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1 = id.getText();
				String data2 = pw.getText();
				if(data1.equals("root") && data2.equals("1234")) {
					t3.setText("로그인 OK");
					ImageIcon icon = new ImageIcon("ok.png");
					img.setIcon(icon);
				}else {
					t3.setText("로그인 NOT");
					ImageIcon icon = new ImageIcon("notok.jpg");
					img.setIcon(icon);
				}
				
				
				
			}
		});
		t2.setFont(new Font("굴림", Font.BOLD, 45));
		t3.setFont(new Font("굴림", Font.BOLD, 45));
		
		JLabel lblId = new JLabel("ID :");
		lblId.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(lblId);
		f.getContentPane().add(id);
		
		JLabel lblPw = new JLabel("PW :");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(lblPw);
		
		pw = new JTextField(10);
		pw.setBackground(Color.ORANGE);
		pw.setFont(new Font("굴림", Font.BOLD, 45));
		f.getContentPane().add(pw);
		f.getContentPane().add(t2);
		f.getContentPane().add(t3);
		
		f.getContentPane().add(img);
		ImageIcon icon = new ImageIcon("car.jpg");
		img.setIcon(icon);
		
		f.setVisible(true);
		
	}

}
