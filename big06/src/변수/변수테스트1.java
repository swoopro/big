package 변수;

public class 변수테스트1 {
	static int sum;
	// int sum = 0;
	// 기본형변수, 전역변수는 자동초기화
	// 선언의 위치에서 전역,지역변수결졍
	static String name; // String 은 초기값안잡으면 null

	public static void main(String[] args) {
		sum = 200;  //기본형,전역변수 :만들어진위치가중요!
		
		int num = 100;
		// 기본형변수, 지역변수

		String s = "감사합니다.";
		// 참조형변수, 지역변수

		
		int[] data = new int[5];
		System.out.println(data);
		// 참조형변수, 지역변수

		int sum2 = 0; // 지역변수는 자동초기화X
		// 지역변순는 프로그래머가 초기화 시켜줘야함
		System.out.println(sum); // 전역변수
		System.out.println(sum2); // 지역변수
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(i);
			// i =>기본형, 지역(for문안에 {}안에서만존재)
			
		}

	}

}
