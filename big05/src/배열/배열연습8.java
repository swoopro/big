package 배열;

public class 배열연습8 {

	public static void main(String[] args) {
		int[] num = {11, 55, 77, 22, 99};
		int temp = num[0]; //temp <- 11
		num[0] = num[1]; //num[0] <- 55
		num[1] = temp; //num[1] <- 11
		for (int i : num) {
			System.out.println(i);
			
		} System.out.println("---------------------");
		
		int temp2 = num[2];
		num[2] = num[4];
		num[4] = temp2;
		for (int i : num) {
			System.out.println(i);
			
		}
	}

}
