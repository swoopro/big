package 전체검색;

import java.util.ArrayList;

public class Cal2 {
	public int add(int x, int y) {
		int z = x + y;
		return z;
}
	public double add(double x, double y) {
		return x + y;
	}
	
	public MemberDTO add(String id) {
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		return dto;
	}
	
	public int[] add() {
		int[] num = {1,2,3};
		return num;
	}
	
	
	
}
