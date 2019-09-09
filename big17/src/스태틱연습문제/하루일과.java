package 스태틱연습문제;

public class 하루일과 {

	public static void main(String[] args) {
		하루 d1 = new 하루();
		d1.Day("자바공부", 10, "강남");	
		System.out.println(d1);
		System.out.println("하는일의 총시간: " + 하루.sum);
		System.out.println("하는일의 평균시간: " + 하루.sum / 하루.count);
		
		하루 d2 = new 하루();
		d2.Day("여행", 15, "강원도");
		System.out.println(d2);
		System.out.println("하는일의 총시간: " + 하루.sum);
		System.out.println("하는일의 평균시간: " + 하루.sum / 하루.count);
		
		하루 d3 = new 하루();
		d3.Day("운동", 11, "피트니스");	
		System.out.println(d3);
		System.out.println("하는일의 총시간: " + 하루.sum);
		System.out.println("하는일의 평균시간: " + 하루.sum / 하루.count);

	}

}
