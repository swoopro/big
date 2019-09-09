package 전체검색;

public class Caluser {

	public static void main(String[] args) {
		Cal2 cal = new Cal2();
		cal.add(200, 100);
		System.out.println(cal.add(200, 100));
		int result = cal.add(500, 100);
	
		System.out.println(cal.add(22.11, 33.44));
		double result2 = cal.add(22.11, 33.44);
	
		MemberDTO dto = cal.add("홍길동");
		System.out.println(dto.getId());
		
		int[] num = cal.add();
		for (int i : num) {
			System.out.println(i);			
		}
	}

}
