package 다차원배열;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 배열5 {

	public static void main(String[] args) {
		String[] items = {"번호", "제목", "내용", "날짜"};
		Object[][] data = {
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
		};
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 1100);
		f.getContentPane().setLayout(new FlowLayout());
		
		JLabel l1 = new JLabel("");
		l1.setIcon(new ImageIcon("java123.jpg"));
		f.getContentPane().add(l1);
//		ImageIcon icon = new ImageIcon("java123.jpg");

//		Image image = icon.getImage();
//
//		Image img = image.getScaledInstance(50, 10, Image.SCALE_SMOOTH);
//
//		ImageIcon icon2 = new ImageIcon(img);
//
//		t1.setIcon(icon);
//
//		t1.setIcon(icon2);


		
		JPanel panel_1 = new JPanel();
		f.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		JLabel label = new JLabel("게시판");
		panel_1.add(label);
		label.setFont(new Font("굴림", Font.BOLD, 40));
		label.setBackground(Color.RED);
		
		JTable table = new JTable(data, items);
		JScrollPane scroll = new JScrollPane(table);
		f.getContentPane().add(scroll);
		
		JButton push = new JButton("닫기");
		push.setBackground(Color.RED);
		push.setFont(new Font("굴림", Font.BOLD, 60));
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();	
			}
		});
		f.getContentPane().add(push);
		
		JPanel panel = new JPanel();
		f.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton b1 = new JButton("글쓰기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				글쓰기 name = new 글쓰기();
			}
		});
		b1.setBackground(Color.YELLOW);
		b1.setFont(new Font("굴림", Font.BOLD, 35));
		JButton b2 = new JButton("글삭제");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				글삭제 name = new 글삭제();
			}
		});
		b2.setBackground(Color.YELLOW);
		b2.setFont(new Font("굴림", Font.BOLD, 35));
		JButton b3 = new JButton("글수정");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				글수정 name = new 글수정();
				
			}
		});
		b3.setBackground(Color.YELLOW);
		b3.setFont(new Font("굴림", Font.BOLD, 35));
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		
		
		f.setVisible(true);
		
	}
		
}
