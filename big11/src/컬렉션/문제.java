package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 문제 {

	public static void main(String[] args) {
		//카페에 문제있음
		ArrayList list = new ArrayList();
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		list.remove(1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "등: " + list.get(i));
		}
		System.out.println("-----------------------");
		HashMap dic = new HashMap();
	
		dic.put(100, "김데이");
		dic.put(200, "김사전");
		dic.put(300, "김구조");
		dic.put(400, "김자료");
		dic.remove(dic.get(1));
		dic.put(300, "김충성");  //수정할때arraylist 는 set해주면되는데 매핑은 put으로해준다
		System.out.println(dic);
		System.out.println("-----------------------");

		HashSet bag = new HashSet();
		bag.add("프로그래머");
		bag.add("DB관리자");
		bag.add("프로젝트매니저");
		bag.add("웹디자이너");
		bag.add("프로젝트매니저");
		System.out.println(bag);
		
		
		
		
		
		
		
		
	}

}
