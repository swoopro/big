package 반복문;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 != 0) { //홀수
				//홀수일때는 더하지마!
				continue; //skip
			}
			sum = sum + i;
		} 
		System.out.println(sum);
	} 

}
