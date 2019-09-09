package 컬렉션;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		//map: mapping(매핑) , 사전타입
		//apple - 사과
		HashMap dic = new HashMap();
		dic.put("apple", "사과");
		dic.put("banana", "바나나");
		dic.put("melon", "메론");   //값넣어줄때 put사용
		System.out.println(dic);
		System.out.println(dic.get("apple"));
		//같이써줄때 사용 , 인덱스없어서 겟으로찾으면댐
		
		HashMap dic2 = new HashMap();
		dic2.put("이름", "홍길동");
		dic2.put("나이", "100");
		dic2.put("키", "188");
		System.out.println(dic2.get("나이"));
		
	}

}
