package 메서드;

public class CarUser {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "빨강";
		car1.speed = 100;
		
		car1.speedUp();
		car1.speedDown();
		
		
		System.out.println(car1.getSpeed());
		int result = car1.getSpeed();
		System.out.println("현재 스피드는 " + result);
		System.out.println(car1);
		//함수를 사용하는것을 호출한다 call
		//호출하고 나서는 return 있을수도 있고,
		// return 없을수도 있다.
		//return 이 없는 경우는 프린트 할 수없다.
		//메소드의 반환값이 void로 되어있는경우
		//프린트할수없다
//		System.out.println(car1.speedUp());
	
	}
	

}
