package 조건문;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 가위바위보 {
	private static JTextField t1;
	private static JTextField t2;
	static int meWin, comWin, equal, total;

	public static void main(String[] args) {
		Random r = new Random();
		
		JFrame f = new JFrame();
		f.setTitle("가위~바위~보!");
		f.setSize(850, 588);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.GREEN);
		t2.setFont(new Font("굴림", Font.BOLD, 55));
		f.getContentPane().add(t2, BorderLayout.SOUTH);
		t2.setColumns(10);
		
		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total++;
				//나는 가위
				int computer = r.nextInt(3);
				//computer = 0(가위), 1(바위), 2(보)
				switch(computer) {
				case 0: //가위
					t2.setText("비겼음.");
					equal++;
					break;
				case 1: //바위
					t2.setText("컴퓨터가 승리.");
					computer++;
					break;
				case 2: //보
					t2.setText("내가승리.");
					meWin++;
					break;
				}
				t1.setText("컴승리: " + comWin + ", 내가승리: " + meWin 
						+ ", 무승부 " + equal + ", 전체횟수: " + total);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\조은이\\Desktop\\가위.png"));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total++;
				//나는 바위
				int computer = r.nextInt(3);
				//computer = 0(가위), 1(바위), 2(보)
				switch(computer) {
				case 1: //바위
					t2.setText("비겼음.");
					equal++;
					break;
				case 2: //보
					t2.setText("컴퓨터가 승리.");
					computer++;
					break;
				case 0: //가위
					t2.setText("내가승리.");
					meWin++;
					break;
				}
				t1.setText("컴승리: " + comWin + ", 내가승리: " + meWin 
						+ ", 무승부 " + equal + ", 전체횟수: " + total);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\조은이\\Desktop\\바위.png"));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\조은이\\Desktop\\보.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				total++;
				//나는 보
				int computer = r.nextInt(3);
				//computer = 0(가위), 1(바위), 2(보)
				switch(computer) {
				case 2: //보
					t2.setText("비겼음.");
					equal++;
					break;
				case 0: //가위
					t2.setText("컴퓨터가 승리.");
					computer++;
					break;
				case 1: //바위
					t2.setText("내가승리.");
					meWin++;
					break;
				}
				t1.setText("컴승리: " + comWin + ", 내가승리: " + meWin 
						+ ", 무승부 " + equal + ", 전체횟수: " + total);

			}
		});
		panel.add(btnNewButton_2);
		
		f.setVisible(true);
	}

}
