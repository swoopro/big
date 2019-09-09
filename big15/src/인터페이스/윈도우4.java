package 인터페이스;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우4 extends JFrame {
	JButton b, b2, b3; //선언의 위치가 사용할수 있는 범위이다
			   //전역변수로 선언해주면 클래스내 모든곳에서사용가능
	public 윈도우4() {
		setTitle("이벤트 처리 연습");
		setSize(500, 500);
		setLayout(new FlowLayout());
		
		b = new JButton("나를 눌러요.");
		b2 = new JButton("나를 눌러요2.");
		b3 = new JButton("나를 눌러요3.");
		
		add(b);
		add(b2);
		add(b3);
		
		
		//익명클래스
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("첫번째버튼 클릭함.");
			}
		});		
		
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("두번째버튼 클릭함.");
				
			}
		});		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("세번째버튼 클릭함.");
			}
		});		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		윈도우4 name = new 윈도우4();
		
	}



}
