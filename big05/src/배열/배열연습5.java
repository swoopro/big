package 배열;

public class 배열연습5 {

	public static void main(String[] args) {
		int[] s;
		s = new int[10];
		System.out.println(s);
		
		int[] s2 = {1, 2, 3};
		s2[0] = 100;
		System.out.println(s2);
		for (int i = 0; i < 3; i++) {
			System.out.println(s2[i]);
		}
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		//배열을 만들면 lenth 변수가 자동생성됨 (읽기전용)
		System.out.println(s2.length);
		
		System.out.println("-----------------------");
		for (int x : s2) {
			System.out.println(x);
			
		}
	}

}
