package db연결;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingBbs {
	private JTextField input;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JButton btnNewButton_1;
	public SwingBbs() {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("굴림", Font.BOLD, 30));
		f.setTitle("게시판 검색 화면");
		f.setSize(439, 607);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("SEARCH");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 55));
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("SEARCH ID:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(lblNewLabel);
		
		input = new JTextField();
		input.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(input);
		input.setColumns(10);
		
		JButton btnNewButton = new JButton("검색하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				DAO db = new DAO();
				Bbs2DTO dto;
				try {
					dto = db.select(data);
					t1.setText(dto.getId());
					t2.setText(dto.getTitle());
					t3.setText(dto.getContent());
					t4.setText(dto.getWriter());
				} catch (Exception e1) {
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("검색내용");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 59));
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(t4);
		t4.setColumns(10);
		
		btnNewButton_1 = new JButton("저장");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();
				
				DAO db = new DAO();
				Bbs2DTO dto = new Bbs2DTO();
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setWriter(writer);
				System.out.println(dto);
				try {
					db.insert(dto);
					
				} catch (Exception e2) {
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_1);
		
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SwingBbs name = new SwingBbs();
	}
}
