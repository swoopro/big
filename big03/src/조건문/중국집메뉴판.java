package 조건문;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class 중국집메뉴판 {
	private static JTextField t2;
	private static JTextField t1;
	static int count, price = 0;
	
	
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("중국집 메뉴판");
		f.setSize(500, 500);

		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.SOUTH);

		JLabel lblNewLabel = new JLabel("지불할 총 금액: ");
		panel.add(lblNewLabel);
		JLabel img = new JLabel("");

		t2 = new JTextField();
		t2.setForeground(Color.RED);
		panel.add(t2);
		t2.setColumns(10);

		JPanel panel_1 = new JPanel();
		f.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		JButton btnNewButton = new JButton("자장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(count + "개");

				price = price + 5000;
				t2.setText(price + "원");

				ImageIcon icon = new ImageIcon("자장.png");
				img.setIcon(icon);

			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setBounds(12, 27, 97, 23);
		panel_1.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("짬뽕");
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(count + "개");

				price = price + 5000;
				t2.setText(price + "원");

				ImageIcon icon = new ImageIcon("짬뽕.jpg");
				img.setIcon(icon);
			}
		});
		btnNewButton_1.setBounds(116, 27, 97, 23);
		panel_1.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("우동");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(count + "개");

				price = price + 5000;
				t2.setText(price + "원");

				ImageIcon icon = new ImageIcon("우동.jpg");
				img.setIcon(icon);
			}
		});
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setBounds(219, 27, 97, 23);
		panel_1.add(btnNewButton_2);

		JLabel lblNewLabel_1 = new JLabel("개수");
		lblNewLabel_1.setBounds(328, 31, 57, 15);
		panel_1.add(lblNewLabel_1);

		t1 = new JTextField();
		t1.setBackground(Color.PINK);
		t1.setForeground(Color.BLUE);
		t1.setBounds(356, 28, 116, 21);
		panel_1.add(t1);
		t1.setColumns(10);

		img.setBounds(12, 60, 460, 360);
		panel_1.add(img);

		f.setVisible(true);
	}
}
