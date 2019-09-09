package 스태틱시험;

public class Money {
	String name;
	int age;
	static int money = 10000;
	static int out = 1000;
	static int count;
	
	public void 용돈(String name, int age) {
		
		count++;
		money = money - out;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Money [name=" + name + ", age=" + age + "]";
	}
		

}
