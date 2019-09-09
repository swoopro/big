package 조건문;

public class SwitchTest {

	public static void main(String[] args) {
		int num = 100;
		//정수(byte, short, int,롱빼고 ㅇㅇ), 문자, 문자열(String)
		//실수값 조건 안됨
		switch(num) {
			case 0:
				System.out.println("아무것도 없어요.");
				break;
			case 100:
				System.out.println("나예요");
				break;		
			case 200: 
				System.out.println("2배네요");
				break;
			default:
				System.out.println("위 경우가 아니네요");
				break;
		}
	}

}
