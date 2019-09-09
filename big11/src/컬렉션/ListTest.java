package 컬렉션;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		//배열과 유사
		//순서, 크기조절가능 ,다른타입 가능
		ArrayList list = new ArrayList();
		list.add("감자");
		list.add(100);
		list.add(11.22);
		list.add(true);
		list.add('A');
		
		System.out.println(list);
		System.out.println("------------------------");
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		
//		for (int i = 0; i < args.length; i++) {
//		}                    length는 배열 에서쓰는거임 arraylist는 따로있음 밑에 사이즈ㅇ
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.contains("감자")); //존재하는지 판단
	}

}
