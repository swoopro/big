package 연산자;

import javax.swing.JOptionPane;

public class 네이버로그인3 {

	public static void main(String[] args) {
		String id = "root";  //만든id
		String data = JOptionPane.showInputDialog("ID입력: ");  //입련한id
		
		if(id.equals(data)) {
			//조건에 맞을 때 처리내용
			System.out.println("로그인OK");
		}else {
			//조건에 안맞을 때 처리내용
			System.out.println("로그인NOT");
		}
		
		}
	}


