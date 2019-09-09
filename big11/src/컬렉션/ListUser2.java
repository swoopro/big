package 컬렉션;

import java.util.ArrayList;

public class ListUser2 {

	public static void main(String[] args) {
		ListTest8 list8 = new ListTest8();
		ArrayList<MemberDTO> list = list8.selectALL();
		
		for (int i = 0; i < list.size(); i++) {
			MemberDTO dto = list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getPw());
			System.out.println(dto.getName());
			System.out.println(dto.getTel());
			System.out.println("-------------------");
	}

}
}
