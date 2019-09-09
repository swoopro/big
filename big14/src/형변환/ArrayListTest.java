package 형변환;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//list에 값을 넣을 때는 업캐스팅(자동형변환)
		list.add("나는 나");
		list.add(88);
		list.add(77.55);
		list.add(true);
		list.add('고');
		//int(88)---auto-boxing--->Integer(88)-- upcasting-->Object
		//기본형-->WrapperClass(포장클래스)
		//기본형--- auto-boxing ---> 포장클래스
		//기본형<--- auto-unboxing --- 포장클래스
		//int --> Integer
		//double --> Double
		//char --> Character
		//boolean --> Boolean
		
		String me = (String)list.get(0);
		int jumsu = (Integer)list.get(1); //(int) (Integer) 둘다괜찮
		double avg = (double)list.get(2); //  자동으로 박싱언박싱돼서 ㅇㅇ
				
		System.out.println(list);
	}

}
