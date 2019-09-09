package 배열;

import java.util.Scanner;

public class 극장예약 {
	static int count, price, total;

	public static void main(String[] args) {
		// 1)화면을 만드세요
		// 2)좌석번호 입력
		// 3) -1은 무한루프 종료
		// 4)예약이 이미 되지 않았다면
		// 해당좌석 1로변경(예약완료)
		// 5)예약이 이미 되었다면, 예약불가 메세지 출력

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

			System.out.println("예약할 좌석번호를 입력하세요.(종료는 -1): ");
			int data = sc.nextInt();

			if (data == -1) {
				System.out.println("종료.");
				total = count * price;
				System.out.println("결제하실 금액은 총 "+ total + "원 입니다.");
				break;
			} else if (seat[data - 1] == 0) {
				seat[data - 1] = 1;
				System.out.println("예약이 완료되었습니다.");
				count++;
			} else {
				System.out.println("이미예약된 자리입니다.");
			}

		}

	}

}
