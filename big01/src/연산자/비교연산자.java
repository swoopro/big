package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		int n1 = 200;
		int n2 = 100;
		//비교 연산자의 결과는 항상 boolean(논리): true or false
		//
		System.out.println(n1 > n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println("----------------");
		
		String s1 = "홍길동";
		String s2 = "김길동";
		System.out.println(s1.equals(s2));
		
	}

}
