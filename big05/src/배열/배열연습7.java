package �迭;

import java.util.Arrays;
import java.util.Scanner;

public class �迭����7 {

	public static void main(String[] args) {
		//1.����
		//��� => �ڹٺ��ٴ� ������
		String[] sub = {"�ڹ�", "JSP", "������"};
		System.out.println(sub[0] + "���ٴ� " + sub[2]);
		System.out.println("-------------------------");  
		
		//2.����
		//10,20,30,40,50�� �� �迭����
		//ù��°���� �׹�°�� ���ؼ� ���
		int[] num = {10, 20, 30, 40, 50};
		System.out.println(num[0] + num[3]);
		System.out.println("-------------------------");  
//		int[] num4 = new int[5];
//		for (int i = 0; i < num4.length; i++) {
//			num4[i] = 10 * (10 + i);
//		}
//		System.out.println("ù°+��°����: " + (num[0] + num[3]));		
		
		//3.¦���̶� ����
		//33�� ��ġ�� ã������
		int[] num2 = {11, 22, 33, 44};
		for (int i = 0; i < num.length; i++) {
			if (num2[i] == 33) {
				System.out.println("0�����ͽ����ؼ�" + i + "��°");
				break;
			}
		}		System.out.println("-------------------------");  

		
		//4.
		//�Է��� �޾Ƽ� 10,20,30�� �迭�� ���� ��,
		//�Է��� ���� ��ġ�� ã������
		//1)�迭�� ����, 2)�Է��Ͽ� �迭���� ����
		//3) ã�����ϴ� �� �Է�, 4) ��ġã��
		int[] num3 = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < num3.length; i++) {
			System.out.print("�����Է�(" + (i+1) + "/" + 3 + "): ");
			num3[i] = sc.nextInt();
		}
		System.out.print("ã�����ϴ°�: ");
		int finddata = sc.nextInt();
		for (int i = 0; i < num3.length; i++) {
			if(num3[i] == finddata) {
				System.out.println("0��°���ͽ����ؼ�" + i + "��°");	
			}
		}
		
		Arrays.sort(num3); //�ı����Լ�, ������������
		for (int i : num3) {
			System.out.println(i);
			
		}
		int index = Arrays.binarySearch(num3, 10);
				System.out.println(index);

	}

}
