package 전체검색;

import java.util.ArrayList;

public class Cal {
	public int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public String add(String x, String y) {
		String z = x + y;
		return z;
	}
	
	public double add(double x, double y) {
		double z = x + y;
		return z;
	}
	
	public ArrayList add() {
		ArrayList list = new ArrayList();
		list.add("pen");
		list.add("pencil");
		return list;
	}
	
	public ArrayList<String> add(String s1, String s2, String s3) {
		ArrayList<String> list = new ArrayList<String>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
			
		return list;
		
	}
}
