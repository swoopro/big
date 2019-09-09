package 메서드;

public class Car {
	//상태에 대한 정의
	String color;
	int speed;
	
	//기능을 정의할때는 -> function(함수)
	//메소드(method : 방법)
	//동작에 대한 정의
	public void speedUp() {
		System.out.println("속도 Up 처리");
	}
	public void speedDown() {
		System.out.println("속도 Down 처리");
		
	}
	public int getSpeed() {
		return speed;
		
	}
	
	@Override
	public String toString() {
		return color + ", " + speed;
	}
	
	

}
