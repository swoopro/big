package 형변환;
public class IronMan extends Man {

	public IronMan(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	boolean hand;
	
	public void bat() {
		System.out.println("배터리가 내장되어 있다.");
	}
}
