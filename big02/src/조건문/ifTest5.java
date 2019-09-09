package 조건문;

import java.util.Date;

public class ifTest5 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
//		int hour = 11;
		
		if(hour < 17) {
			System.out.println("집으로 갈 시간이 아직 멀었어요.");
		}else {
			System.out.println("집으로 갈 시간이 가까워졌어요.");
		}
	}

}
