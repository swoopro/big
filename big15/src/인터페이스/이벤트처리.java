package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class 이벤트처리 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("인터페이스 처리된게 나에요");
	
	}
	
}
