package 배열;

public class 배열1차원 {
	int[] num4; //전역변수, 자동초기화
				//null로초기화(참조형이라)
	int num5; //전역변수, 자동초기화
			  //0으로 초기화(기본형이라)
	public static void main(String[] args) {
		//배열은 자동초기화 
		int[] num = new int[10];
		int num2; //쓰레기값이 들어있음
		int[] num3;//쓰레기값이 들어있음
//		System.out.println(num3);
		
		int[][] num5 = new int[3][2];
		//num5는 무슨타입?  int[][]
		//num5는 무슨 타입? int[]
		//num[0][0]은 무슨 타입? int
		
		int[][] num6 = {
				{0, 0, 0},
				{0, 0}
		};
		
		System.out.println(num6.length); //행의개수
		System.out.println(num6[0].length);//열의개수
		System.out.println(num6[1].length);//열의개수
		
		
}

}
