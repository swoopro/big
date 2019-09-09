package 배열;

public class 배열연습 {

	public static void main(String[] args) {
		int[][] num = {
				{11, 12, 13},
				{14, 15, 16, 17},
				{18, 19}
		};
	System.out.println(num.length); //2차원배열에서 length는 행의개수를의미
	System.out.println(num[1].length);//두번째행의 요소의 개수를의미
	
	for (int[] is : num) {
		System.out.println(is.length);
	}
	
	
	}

}
