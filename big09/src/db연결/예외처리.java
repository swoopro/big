package db연결;

public class 예외처리 {

	public static void main(String[] args) {
		try {
			int[] num = {1, 2, 3};
			num[3] = 4;
			
		}catch (Exception e) {
//			e.printStackTrace(); 안써도댐
		}
		
		System.out.println("나는실행 될까말까");
		
	}

}
