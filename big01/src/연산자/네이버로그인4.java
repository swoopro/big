package 연산자;

import javax.swing.JOptionPane;

public class 네이버로그인4 {

	public static void main(String[] args) {
		String id = "root";  //만든id
		String data = JOptionPane.showInputDialog("ID입력: ");  //입련한id
		String pw = "1234";  //만든pw
		String data2 = JOptionPane.showInputDialog("PW입력: ");  //입련한pw
		
		if(id.equals(data) && pw.equals(data2)) {
			
			//조건에 맞을 때 처리내용
			System.out.println("로그인OK");
		}else {
			//조건에 안맞을 때 처리내용
			System.out.println("로그인NOT");
		}
		
		}
	}


