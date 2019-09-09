package 조건문;

import java.util.Date;

public class 문제1 {

	public static void main(String[] args) {
		Date date = new Date();
		int day = date.getDay();
		
		switch (day) {
		case 0:
			System.out.println("일요일엔 0");
			break;
		case 1:
			System.out.println("월요일엔 1");
			break;
		case 2:
			System.out.println("화요일엔 2");
			break;
		case 3:
			System.out.println("수요일엔 3");
			break;
		case 4:
			System.out.println("목요일엔 4");
			break;
		case 5:
			System.out.println("금요일엔 5");
			break;
		case 6:
			System.out.println("토요일엔 6");
			break;
		
		}
		
	}

}
