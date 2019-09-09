package 조건문;

import java.util.Date;

public class DateTset {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getHours();
		
		System.out.println("현재 시각은" +
							hour + "시 " +
							min + "분 " +
							sec + "초");
		date.getMonth();
		int month = date.getMonth() +1;
		int day = date.getDay(); //요일
		if(day == 0) {
			System.out.println("일요일");
		}else if(day ==1) {
			System.out.println("월요일");
		}else if(day ==2) {
			System.out.println("화요일");
		}else
			System.out.println("해당요일이 없습니다.");
		int year = date.getYear() + 1900;
		int date2 = date.getDate(); //일
		System.out.println("이번달은 " + month + "월");
		System.out.println("오늘은 " + day + "요일");
		System.out.println("이번해는 " + year + "년");
		System.out.println("오늘은 " + date2 + "일");
	}

}
