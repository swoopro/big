package 조건문;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JFrame;

public class 랜덤3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("RANDOM");
		f.setSize(650, 700);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Random r = new Random();
		int r1 = r.nextInt(100);
		
		
		
		f.setVisible(true);
		
	}

}
