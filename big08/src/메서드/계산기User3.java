package 메서드;

import java.util.Scanner;

public class 계산기User3 {

	public static void main(String[] args) {
		계산기3 cal = new 계산기3();
		int result1 = cal.add(200, 100);
		double result2 = cal.add(200, 11.11);
		double result3 = cal.add(11.11, 22.22);
		String result4 = cal.add("hello", "java");
		double result5 = cal.add(22.22, 200);
		String result6 = cal.add("hello", 5, "java programmers.");
		//다형성,오버로드 
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);

	}

}
