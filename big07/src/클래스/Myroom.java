package 클래스;

public class Myroom {

	public static void main(String[] args) {
		휴대폰 phone1 = new 휴대폰();
		phone1.shape = "네모";
		phone1.size = 7;
		
		phone1.문자하다();
		phone1.인터넷하다();
		
		System.out.println(phone1.shape);
		System.out.println(phone1.size);
	}

}
