package 조건문;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class 원하는곳에넣기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("원하는데넣자");
		f.setSize(500,500);
		
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(39, 43, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(209, 43, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		f.setVisible(true);
	}
}
