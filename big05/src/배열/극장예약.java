package �迭;

import java.util.Scanner;

public class ���忹�� {
	static int count, price, total;

	public static void main(String[] args) {
		// 1)ȭ���� ���弼��
		// 2)�¼���ȣ �Է�
		// 3) -1�� ���ѷ��� ����
		// 4)������ �̹� ���� �ʾҴٸ�
		// �ش��¼� 1�κ���(����Ϸ�)
		// 5)������ �̹� �Ǿ��ٸ�, ����Ұ� �޼��� ���

		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		price = 10000;

		while (true) {
			System.out.println("----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + " ");

			}
			System.out.println();
			System.out.println("-----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");

			}
			System.out.println();
			System.out.println("--------------------");

			System.out.println("������ �¼���ȣ�� �Է��ϼ���.(����� -1): ");
			int data = sc.nextInt();

			if (data == -1) {
				System.out.println("����.");
				total = count * price;
				System.out.println("�����Ͻ� �ݾ��� �� "+ total + "�� �Դϴ�.");
				break;
			} else if (seat[data - 1] == 0) {
				seat[data - 1] = 1;
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				count++;
			} else {
				System.out.println("�̹̿���� �ڸ��Դϴ�.");
			}

		}

	}

}
