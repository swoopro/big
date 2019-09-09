package 메서드;

public class 계산기 {
	public void add() {
		System.out.println("더하는 기능 처리");	
	}
	
	public String add2() {
		String s1 = "hello";
		String s2 = "java";
		return s1 + " " + s2;
		
	}
	
	public int mul() {
		int price = 5000;
		int count = 5;
		return price * count;
		
	}
	
	//minus() => void
	//div() => return
	public void minus() {
		System.out.println("빼기");		
	}
	public double div() {
		int a = 100;
		int b = 3;
		return a / b;
		
	}
}
