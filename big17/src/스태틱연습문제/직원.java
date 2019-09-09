package 스태틱연습문제;

public class 직원 {
	String name;
	int age;
	static int num = 5;
	static int sum;
	
	public 직원(String name, int age) {
		sum += age; //sum = sum + age;
		num++;
		this.name = name;
		this.age = age;
	}

	public static int getNum() {//스태틱 메소드
//		return num + name;
		return num; //num은 스태틱변수
		//메소드안에 스태틱변수가 들어가면 메소드도 스태틱으로 만들어줘야함
		//아니면 클래스이름.메소드이름 안되고 객체이름.메소드이름 으로 접근해야함
		//static 메소드내에는 static변수만 사용가능!
	}
	
	
	@Override
	public String toString() {
		return "직원 [name=" + name 
				+", age=" + age + ", 직원수=" + num + "]";
	}				//num은 저절로 복사되지 않기때문에 tostring에서 인식못함
					//필요하면 직접써줘야함
}
