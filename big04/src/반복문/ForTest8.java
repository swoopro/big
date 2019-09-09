package 반복문;

import java.util.Scanner;

public class ForTest8 {

	public static void main(String[] args) {
		//1부터10까지 수 중에서 4의배수만 곱하시오
		int multi = 1; //곱하기는 1부터시작  0으로해놓으면 값이 무조건 0되니까
		for (int i = 1; i <= 10; i++) {
			if(i % 4 == 0) {
				
				multi = multi * i;
			}
			
			}
		System.out.println(multi);
		} 
	} 


