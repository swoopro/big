package 스태틱연습문제;

import javax.swing.JOptionPane;

public class 창업직원채용2 {

	public static void main(String[] args) {
		System.out.println("기존 직원 수: " + 직원.num);
		System.out.println(직원.getNum());
		
		//객체생성
		직원 직원1 = new 직원("홍길동", 25);
		System.out.println("현재 직원 수: " + 직원.num);
		System.out.println(직원1.getNum());
		
		System.out.println("나이의 평균은" + 직원.sum/직원.num);

//		JOptionPane.showMessageDialog(null, "내가바로 static 메소드");
		
		
	}

}
