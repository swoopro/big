package 컬렉션;

import java.util.ArrayList;

public class ListTest8 {
	
	public ArrayList<MemberDTO> selectALL() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		MemberDTO dto1 = new MemberDTO();
		dto1.setId("100");
		dto1.setPw("100");
		dto1.setName("100");
		dto1.setTel("100");
		
		MemberDTO dto2 = new MemberDTO("200", "200", "200", "200");
		list.add(dto1);
		list.add(dto2);
		
		return list;
	
	}

}
