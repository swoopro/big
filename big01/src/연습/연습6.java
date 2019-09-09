package 연습;

public class 연습6 {

	public static void main(String[] args) {
		int sum = 345;
		double count = 4;
		
		double avg = sum / count;
		
//        int avg2 = sum / count;
//		연산에서 하나라도 double이 있으면 결과도 double이어야함.
		int result = (int)avg;
		System.out.println(avg);
		System.out.println(result);
	}

}
