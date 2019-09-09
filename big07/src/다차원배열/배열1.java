package 다차원배열;

public class 배열1 {

	public static void main(String[] args) {
		int[][] seat = new int[3][10];
		
		//2차원 배열에서의 length는 행의개수이다
		System.out.println(seat.length);
		//열의 개수는 행마다 다르게 지정가능
		//=>행마다 열의개수를 다 다르게 구해줘야함
		System.out.println(seat[0].length);
		System.out.println(seat[1].length);
		System.out.println(seat[2].length);
		
		System.out.print("   ");
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			
		}System.out.println("\n------------------------------");
		
		//바깥쪽 for => 행의 개수		
		//안쪽 for => 한 행의 열의 개수
		seat[0][0] = 1;
		seat[0][1] = 1;
		seat[0][2] = 1;
		seat[2][5] = 1;
		seat[1][6] = 1;
		seat[1][7] = 1;
		
		for (int i = 0; i < seat.length; i++) {
			System.out.print(i + ": ");
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j] + " ");
				
			}
			System.out.println();
		}
		
//		for (int i = 0; i < seat.length; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\n------------------------");
//		
//		for (int i = 0; i < 3; i++) {
//			
//			for (int j = 0; j < seat.length; j++) {
//				System.out.print(seat[j] + " ");
//		}
//		System.out.println();
//		}
					
		
		
	}

}
