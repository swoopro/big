package 조건문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 랜덤2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	static int count = 0;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Random");
		f.setSize(611, 604);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		Random r = new Random(); //부품복사
		int target = r.nextInt(100);
		
		JLabel b1 = new JLabel("숫자를 입력하세요!");
		b1.setBackground(Color.WHITE);
		b1.setFont(new Font("굴림", Font.BOLD, 45));
		f.getContentPane().add(b1);
		
		t1 = new JTextField(); //입력
		t1.setBackground(Color.PINK);
		t1.setFont(new Font("굴림", Font.BOLD, 45));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		JLabel img = new JLabel();
		
		JButton btnNewButton = new JButton("두구두구두구두구");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1 = t1.getText();
				int data11 = Integer.parseInt(data1); 
				
								
				if(target == data11) {
					count++;
					t2.setText("정답입니다!");
					t3.setText(count + "번 만에 맞췄습니다!");
					ImageIcon icon = new ImageIcon("o.jpg");	
					img.setIcon(icon);
				}else if(target > data11) {
					count++;
					t2.setText("UP!");
					ImageIcon icon = new ImageIcon("x.jpg");
					img.setIcon(icon);
				}else if(target < data11) {
					count++;
					t2.setText("Down!");
					ImageIcon icon = new ImageIcon("x.jpg");
					img.setIcon(icon);
				}
				

				
				
				
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 45));
		f.getContentPane().add(btnNewButton);
		
		t2 = new JTextField();
		t2.setBackground(Color.PINK);
		t2.setFont(new Font("굴림", Font.BOLD, 45));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(t3);
		t3.setColumns(20);
		
		f.getContentPane().add(img);
		
		f.setVisible(true);
		
				
			
		
	
	}

}
