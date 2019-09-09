package 컬렉션;

import java.util.ArrayList;

public class ListTest7 {

	public ArrayList<BbsDTO> selectALL() {
		ArrayList<BbsDTO> list = new ArrayList<BbsDTO>();
		BbsDTO dto1 = new BbsDTO("1", "java", "fun java", "park");
		BbsDTO dto2 = new BbsDTO("2", "jsp", "fun jsp", "kim");
		list.add(dto1);
		list.add(dto2);

		return list;
	}

}
