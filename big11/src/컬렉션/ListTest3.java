package 컬렉션;

import java.util.ArrayList;

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박스키");  //카페문제
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		System.out.println(list);
		list.remove(1); //삭제!!
		System.out.println(list);
	}

}
