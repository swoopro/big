package 조건문;

import java.util.Scanner;

public class 안전성속도연비 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("안전성 점수: ");
		double sta = sc.nextDouble();
		System.out.print("속도 점수: ");
		double spe = sc.nextDouble();
		System.out.print("연비 점수: ");
		double mil = sc.nextDouble();
		
		double sta2 = sta * 0.3;
		spe = spe * 0.5;
		mil = mil * 0.2;

//		Scanner sc = new Scanner(System.in);
//		System.out.print("안전성 점수: ");
//		double sta = sc.nextDouble() * 0.3;
//		System.out.print("속도 점수: ");
//		double spe = sc.nextDouble() * 0.5;
//		System.out.print("연비 점수: ");
//		double mil = sc.nextDouble() * 0.2;
//		
//		double total = sta + spe + mil;
//		int total1 = (int)total;
//		
		
		double total = sta2 + spe + mil;
		int total1 = (int)total;
		
		System.out.println("--------------------------");
		
		if(total >= 90) {
			System.out.println(total1 + "점 최우수입니다.");
		}else if (total >= 80) {
			System.out.println(total1 + "점 우수입니다.");
		}else if(total >= 70) {
			System.out.println(total1 + "점 보통입니다.");
		}else {
			System.out.println(total1 + "점 미달입니다.");
		}
		
		
	}

}
