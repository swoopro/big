package 전체검색;

import java.util.ArrayList;

public class MemberMain2 {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		
		try {		
			
			ArrayList<MemberDTO> list = dao.selectAll();
			for (int i = 0; i < list.size(); i++) {
				MemberDTO dto = list.get(i); // 
				System.out.println(dto.getId());
				System.out.println(dto.getPw());
				System.out.println(dto.getName());
				System.out.println(dto.getTel());
				System.out.println("----------------------");
			}
		} catch (Exception e) {
		}
		
	}

}
