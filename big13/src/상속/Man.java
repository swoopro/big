package 상속;

public class Man extends Person{
	//멤버변수 2개, 메소드 2개
	
	String power;
	
	


	public Man() {
		super();
	}
	
	public Man(int age, String name) {
		super(age, name);
	}
	
	public Man(int age, String name, String power) {
		super(age, name);
		this.power = power;
	}



	@Override
	public String toString() {
		return "Man [power=" + power + ", name=" + name + ", age=" + age + "]";
	}

	public void run() {
		sleep();
		System.out.println("빨리 달리다");
	}
}
