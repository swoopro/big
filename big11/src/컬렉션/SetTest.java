package 컬렉션;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		//중복을 허용하지 않는 모음!!
		HashSet bag = new HashSet();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("휴지");
		System.out.println(bag);  
	}

}
