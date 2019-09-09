package 상속;

public class SuperMan extends Man{
	//멤버변수 3개, 메소드3개
	boolean fly;
	
	
	public SuperMan() {
		
	}
	
	public SuperMan(boolean fly) { //alt+shift +s+o
		super();// 부모클래스의 기본생성자
		//자식클래스의 생성자가 호출될때는
		//부모클래스의 기본생성자가 무조건 호출되게 되어있다.
		this.fly = fly;
	}
	public SuperMan(int age, String name, String power, boolean fly) {
		super(age, name, power);
		this.fly = fly;
	}

	public void fly() {
		System.out.println("하늘을 날다");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
}

