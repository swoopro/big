package 컬렉션;

import java.util.ArrayList;

public class ListUser {

	public static void main(String[] args) {
		ListTest7 list7 = new ListTest7();
		ArrayList<BbsDTO> list = list7.selectALL();
		
		for (int i = 0; i < list.size(); i++) {
			BbsDTO dto = list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
			System.out.println(dto.getWriter());
			System.out.println("-------------------");
	}

}
}
