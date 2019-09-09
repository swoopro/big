package 상속;

public class Person extends Object{ //extends Object는 모든 클래스의시초이다 
									//기본값으로 오브젝이익스텐드됨
	String name;
	int age;
	
		
	public Person() {
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void sleep() {
		System.out.println("잠자다");
	}
	public void eat() {
		System.out.println("먹다");
	}

	@Override //재정의
	public String toString() { // Object 의 toString을 재정의해준것
		return "Person [name=" + name + ", age=" + age + "]";
	}//기본형 => 값
	//참조형 => 주소

}
