package bigdata;

import java.util.ArrayList;
import java.util.Scanner;

public class StudyManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 스캐너복사
		ArrayList<Study> list = new ArrayList<Study>();// Study주소값이있는 어레이리스트 부품복사
		while (true) { // 반복
			System.out.println("--------------------------------------");
			System.out.println("1.입력 | 2.출력 | 3. 수정 | 4.정리 | 5.종료 ");
			System.out.println("--------------------------------------");

			System.out.print("번호선택>> ");
			int data = sc.nextInt();

			if (data == 1) {// 1.입력
				Study stu = new Study();
				System.out.print("수강아이디를 입력하세요. : ");
				String id = sc.next();
				stu.setId(id); // 입력받은id값 stu에 넣어주기
				System.out.print("수강과목을 입력하세요. : ");
				String sub = sc.next();
				stu.setSub(sub);
				System.out.print("수강내용을 입력하세요. : ");
				String content = sc.next();
				stu.setContent(content);
				System.out.print("수강비용을 입력하세요. : ");
				double price = sc.nextDouble();
				stu.setPrice(price);
				System.out.print("수강가능인원을 입력하세요. : ");
				int num = sc.nextInt();
				stu.setNum(num);

				list.add(stu); // stu를 리스트에추가

				System.out.println("저장되었습니다.");
			} else if (data == 2) {// 2.출력
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i)); // for문 반복하는동안 리스트의 값들 출력
														// 이때 값들 각각은 stu로이루어짐
				}
			} else if (data == 3) {// 3.수정
				System.out.print("수강비용을 변경할 수강아이디를 입력하세요. : ");
				String s1 = sc.next(); // 입력받을 변수명 지정해주기
				for (int i = 0; i < list.size(); i++) { // for문 반복하는동안
					Study stu = list.get(i); // list의 값들(stu들)을 변수명지정
					if (s1.equals(stu.getId())) { // 입력받은id값이 for문반복하면서
													// list->stu->id값들 중에 같은게있으면
						System.out.print("변경할 수강비용을 입력하세요. : ");
						// double d1 = sc.nextDouble();
						// stu.setPrice(d1); 밑에꺼랑 같은식임 다만 밑에식은 변수명을 지정안하고 바로넣어준거
						stu.setPrice(sc.nextDouble()); // 입력받은 비용값을 stu의 price값에 넣어줌

					}
				}

			} else if (data == 4) {// 4. 정리 : 수강비용의 합계와 평균 프린트!
				double total = 0; //변수명 선언해주고 초기화
				double arg = 0;
				for (int i = 0; i < list.size(); i++) {
					total = total + list.get(i).getPrice(); // for문반복하는동안 price값 저장 식은항상 오른쪽부터계산
					arg = total / list.size();
				}
				System.out.println("수강비 합계: " + total + ",수강비 평균: " + arg);
			} else if (data == 5) {// 5.종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("다시입력하세요.");
			}

		}

	}

}
