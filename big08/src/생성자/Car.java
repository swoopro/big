package 생성자;

public class Car {
	String color;
	int speed;
	
	//한꺼번에 멤버변수값을 넣어보자!
	//입력값이 없는 클래스와 동일한 이름을가진 메소드가 자동생성
	//객체생성시 꼭 해야할 것 같은 작업을 자동으로 처리하기위해!
	//객체생성시 자동으로 호출
	//클래스 이름과 동일한 이름의 메소드를 자동호출
	//생성자(Constructor):메소드
	//대문자로시작, 반환타입을 쓰지않음
	//생성자가 하나도 없을 대는 파라메터 없는
	//생성자 메서드를 자도으로 만들어준다.
	//파라메터없는 생성자 = 기본 생성자
	//다른파라메터 있는 생성자가 존재하는경우
	//기본생성자는 자동으로 만들어지지 않는다.
	public Car() {
		System.out.println("내가 객체생성할때마다 자동호출되는애");
		System.out.println("DB연결....");
	}
	
	public Car(String s, int sp) {
		color = s;
		speed = sp;
		
	}

	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + "]";
	}
	
	
}
