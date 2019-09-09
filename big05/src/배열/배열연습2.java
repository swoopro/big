package 배열;

public class 배열연습2 {

	public static void main(String[] args) {
		
		int[] num = new int[5];  //5는 개수
		
		for (int i = 0; i < 5; i++) {
			num[i] = i + 1;
			//num[0] = 1;
			//num[1] = 2;
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		
		

	}

}
