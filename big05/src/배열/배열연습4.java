package 배열;

public class 배열연습4 {

	public static void main(String[] args) {
		String[] names = new String[3];
	 // String names[] 둘다상관없음
		names[0] = "홍길동";
		names[1] = "박길동";
		names[2] = "송길동";
		for (int i = 0; i < 3; i++) {
			System.out.println(names[i]);
		}
		System.out.println("--------------------");
		
		char[] gender = new char[3];
		gender[0] = '남';
		gender[1] = '여';
		gender[2] = '남';
		for (int i = 0; i < 3; i++) {
			System.out.println(gender[i]);
		}
		System.out.println("---------------------------");
		char[] gender2 = {'남', '여', '남'};
		for (int i = 0; i < 3; i++) {
			System.out.println(gender2[i]);
		
		}
	}

}
