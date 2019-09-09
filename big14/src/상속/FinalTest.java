package 상속;

public class FinalTest {

	public static void main(String[] args) {
		int width = 5;
		int height = 5;
		System.out.println("사각형의 넓이는" + width*height);
	
		//변수 앞에 final 사용 -> 변수의 값을 변경할 수 없게함(상수로만듬)
		//상수처리 : 값을 변경 불가, 보통 상수변수는 변수명을 대문자처리하여 가독성을 높인다.
		
		final double PI = 3.14;
		int r = 10;
		System.out.println("원의 넓이는: "+ PI * r * r);
		
	}

}
