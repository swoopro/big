package 컬렉션;

import java.util.ArrayList;

public class ListTest5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("지우개");
		list.add("샤프");
		list.add("연필");
		System.out.println(list);
		String s1 = list.get(0);
		//꺽새안에 타입지정해주면 꺼내올때 따로 안써줘도 된다 대신 다른타입은 쓰면안댐
		
		ArrayList<Integer> money = new ArrayList<Integer>();
		money.add(1000);
		money.add(2000);
		money.add(3000);
		System.out.println(money);
		int i1 = money.get(0);
		
		ArrayList<Double> eye = new ArrayList<Double>();
		eye.add(0.9);
		eye.add(0.5);
		eye.add(0.1);
		System.out.println(eye);
		double d1 = eye.get(0);
	}

}
