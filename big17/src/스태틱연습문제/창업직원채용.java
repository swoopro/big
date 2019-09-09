package 스태틱연습문제;

public class 창업직원채용 {

	public static void main(String[] args) {
		직원 직원1 = new 직원("홍길동", 25);
		System.out.println(직원1);
		System.out.println("직원수: " + 직원.num);
		
		직원 직원2 = new 직원("김삿갓", 30);
		System.out.println(직원2);
		System.out.println("직원수: " + 직원.num);
		
		직원 직원3 = new 직원("이순신", 26);
		System.out.println(직원3);
		System.out.println("직원수: " + 직원.num);
		
		System.out.println("나이의 평균은" + 직원.sum/직원.num);
		
	}

}
