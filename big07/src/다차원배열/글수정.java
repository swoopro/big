package 다차원배열;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 글수정 {
	public 글수정() {
		JFrame f = new JFrame();
		f.setTitle("글수정화면");
		f.setSize(500, 500);
		f.getContentPane().setLayout(new FlowLayout());
		
		JButton dispose = new JButton("DISPOSE");
		dispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		JButton exit = new JButton("EXIT");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		f.getContentPane().add(dispose);
		f.getContentPane().add(exit);
		
		f.setVisible(true);
	}
}
