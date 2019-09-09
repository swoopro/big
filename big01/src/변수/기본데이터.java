package 변수;

public class 기본데이터 {

	public static void main(String[] args) {
		System.out.println("기본 데이터 연습");
		//블럭 안잡고 복사 : 컨트롤+알트+화살표아래
		//이동 : 알트+화살표
		System.out.println("-----------");
		int age;  //메모리 방 잡아줌. 선언!
				//변수명 : age, 타입:정수
		age = 100;
		System.out.println(age);
		
		double height = 186.9;
			//변수명: height, 타입: 실수
		System.out.println(height);
		
		//숫자는 기호를 안씀
		//문자는 기호를 반드시 씀
		//문자한개 => ' '
		//문자 여러개 =>" "
		
		char gender = '남';
			//변수명:gender, 타입: 문자 한개
		System.out.println(gender);
		
		boolean food = true;  //또는 false
			//변수명: food, 타입: 논리(boolean)
		System.out.println(food);
	}

}
