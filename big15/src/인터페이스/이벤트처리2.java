package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class 이벤트처리2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "나에요!!또!!");
	}

}
