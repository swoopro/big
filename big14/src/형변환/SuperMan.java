package 형변환;
public class SuperMan extends Man {

	public SuperMan(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	boolean fly;
	
	public void fly() {
		System.out.println("날 수 있다.");
	}
}
