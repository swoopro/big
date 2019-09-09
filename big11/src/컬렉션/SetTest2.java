package 컬렉션;

import java.util.HashSet;

public class SetTest2 {

	public static void main(String[] args) {
		//중복을 허용하지 않는 모음!!
		HashSet bag = new HashSet();
		bag.add("디자이너");
		bag.add("프로그래머");
		bag.add("DB관리자");
		bag.add("디자이너");
		System.out.println(bag);  
	}

}
