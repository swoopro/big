package 컬렉션;

import java.util.ArrayList;

public class ListTest4 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("지우개");
		list.add(1000);
		
		System.out.println(list);
		String s = (String)list.get(0); //어레이리스트는 스트링타입이 아니라
		int i = (int)list.get(1); 	    //그냥막집어넣은거다
		                         		//꺼내줄때는 ()안에 타입써주고꺼내오자
		
	}

}
