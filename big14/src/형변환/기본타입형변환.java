package 형변환;

public class 기본타입형변환 {
	public static void main(String[] args) {
		//정수
		// byte(1) -> short(2) -> int(4) -> long(8)
		// 127         3만                   21억		  그이상
		byte b = 127; //byte는 127까지
		int i = b;
		//작 ----> 큰  (자동으로 데이터타입 변환)
		//                  (자료)형  변환
		//자동 형변환
		
		int i2 = 127;
		byte b2 = (byte)i2;
		//큰--->작 (자동으로 데이터타입 변환이 안된다.)
		//강제 형변환 해줘야함
		
	}
}
