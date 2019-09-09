package 배열;

public class 배열연습1 {

	public static void main(String[] args) {
		int[] num = new int[200];
		
		//첫번째 num =>num[0]
		//위치값 index
		//자바의 위치값은 0부터시작
		//자바의 맨마지막 위치값은 개수-1
		//배열은 자동 초기화 =>0
		
		System.out.println(num[0]);
		System.out.println(num[199]);
		num[100] = 1;
		System.out.println(num[100]);
		
		
		int[] num2 = new int[5];  //5는 개수
		num2[0] = 1;
		num2[1] = 2;
		num2[2] = 3;
		num2[3] = 4;
		num2[4] = 5;
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2[2]);
		System.out.println(num2[3]);
		System.out.println(num2[4]);
		
		
//		int a; //쓰레기값
//		a = 100; //초기화(처음값 대입)
//		System.out.println(a);
	}

}
