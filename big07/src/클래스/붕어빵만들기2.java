package 클래스;

public class 붕어빵만들기2 {

	public static void main(String[] args) {
		붕어빵틀2 붕1 = new 붕어빵틀2();
		붕1.field = "팥";
		붕1.level = "바싹";
		System.out.println(붕1);
		
		붕1.먹다();
		붕1.굽다();
		
		붕어빵틀2 붕2 = new 붕어빵틀2();
		붕2.field = "생크림";
		붕2.level = "살짝";
		System.out.println(붕2);
		붕2.먹다();
		붕2.굽다();
	}
}
