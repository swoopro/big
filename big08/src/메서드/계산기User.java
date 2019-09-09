package 메서드;

public class 계산기User {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		//메소드를 사용하는 것 : 호출한다 (call)
		cal.add();
		int total = cal.mul();
		
		if (total >= 20000) {
			System.out.println(total - 5000);
			
		}else {
			System.out.println(total);
		}
	
		String s= cal.add2();
		System.out.println(s + " programmer");
		
		cal.minus();
		double d = cal.div();
		
	}

}
