package 조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SwitchTest3 {

	public static void main(String[] args) {
		String data =JOptionPane.showInputDialog("먹고 싶은 음식");
		switch (data) {
		case "자장":
			System.out.println("중국집으로가요");
			break;
		case "라면":
			System.out.println("분식집으로가요");
			break;	
		case "스시":
			System.out.println("일식집으로가요");
			break;
		default:
			System.out.println("집으로");
			break;
		}
		
		
		
		
		
	}

}
