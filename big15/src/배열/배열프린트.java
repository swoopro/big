package 배열;

public class 배열프린트 {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5};
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		for (int i : num) {  //foreach는 무조건 배열끝까지 돈다.
							 //length를 적어줄 이유가없다
			System.out.println(i);
		}
		
		double[] num2 = new double[2];
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
		
		double sum = 0;
		for (double d : num2) {
//			sum = sum + d;
			sum += d;
		}
		
		float sum2 = 0.0f;
		float[] num3 = {1.2f, 4.5f};
		for (float f : num3) {
			sum2 += f;
		}
		System.out.println(sum2);
	}

}
