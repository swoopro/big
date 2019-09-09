package 상속;

public class Manager extends Employee {
	String addept;
	
	public void ad() {
		System.out.println("관리하다");
	}

	@Override
	public String toString() {
		return "Manager [addept=" + addept + ", name=" + name +
				", age=" + age + "]";
	}
}
