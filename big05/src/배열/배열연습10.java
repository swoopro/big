package �迭;

import java.util.Scanner;

public class �迭����10 {

	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0; //�ڡڡ������� ���� ,���Ҷ��� 0, ���Ҷ��� 1 
		
		for (int i = 0; i < score.length; i++) {
			System.out.print("������ �Է��Ͻÿ�:");
			score[i] = sc.nextInt();		
			sum = sum + score[i]; //�ڡڡڡڡ�
		}
	
		System.out.println("��հ�: " + (sum / score.length));
			
		
	}
}
