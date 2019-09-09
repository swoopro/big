package 연습;

import javax.swing.JOptionPane;

public class 연습1 {

	public static void main(String[] args) {
		String java = JOptionPane.showInputDialog("'자바'를 입력하세요.");
		String Spring = JOptionPane.showInputDialog("'Spring'을 입력하세요.");
	
		System.out.println("*** love " + java + "!, " + "실적 " + Spring + "! ***");
	}

}
