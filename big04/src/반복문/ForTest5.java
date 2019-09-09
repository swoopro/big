package 반복문;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) { //짝수
				sum = sum + i;
			}
		} System.out.println(sum);
	} 

}
