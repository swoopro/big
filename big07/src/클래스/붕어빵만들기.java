package 클래스;

public class 붕어빵만들기 {

	public static void main(String[] args) {
		//붕어빵1,2 가 내가프로그래밍하려했던 대상(,Object,객체)!
		//붕어빵틀을 복사해서 만들었따  (생성) 
		//new : 객체생성키워드
		붕어빵틀 붕어빵1 = new 붕어빵틀();
		붕어빵1.field = "팥";
		붕어빵1.level = "바싹";
		
		붕어빵1.굽다();
		붕어빵1.먹다();
		System.out.println(붕어빵1.field);
		System.out.print(붕어빵1.level);
		
		System.out.println("\n---------------------");
		
		붕어빵틀 붕어빵2 = new 붕어빵틀();
		붕어빵2.field = "생크림";
		붕어빵2.level = "살짝";
		
		붕어빵2.굽다();
		붕어빵2.먹다();
		System.out.println(붕어빵2.field);
		System.out.println(붕어빵2.level);
	}

}
