package 상속;

public class Owner extends Employee {
	int num;
	
	public void run() {
		System.out.println("운영하다");
	}

	@Override
	public String toString() {
		return "Owner [num=" + num + ", name=" + name + ","
				+ " age=" + age + "]";
	}
}
