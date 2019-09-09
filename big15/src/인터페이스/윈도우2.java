package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우2 extends JFrame implements ActionListener{
	JButton b; //선언의 위치가 사용할수 있는 범위이다
			   //전역변수로 선언해주면 클래스내 모든곳에서사용가능
	public 윈도우2() {
		setTitle("이벤트 처리 연습");
		setSize(500, 500);
		
		b = new JButton("나를 눌러요.");
		add(b);

		b.addActionListener(this);		
		//b버튼에 이벤트 처리를 할것이라고 설정 하고
		//addActionListener(이벤트처리할객체);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		윈도우2 name = new 윈도우2();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		b.setText("나를 눌렀구나");
	}

}
