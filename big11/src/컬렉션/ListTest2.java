package 컬렉션;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		//배열과 유사
		//순서, 크기조절가능 ,다른타입 가능
		ArrayList list = new ArrayList();
		list.add("하");
		list.add(2424);
		list.add(100);
		list.add(33.3);
		list.add("점심을 맛있게 드셧나요");
		list.add('남');
		
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		System.out.println(list);
	}

}
