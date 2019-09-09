package 컬렉션;

import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		//앞에 줄선 애가 먼저 나간다(제거됨).
		//First Input Fist Output(FIFO)
		//우유타입   카페에문제있음 
 		//어제 오늘 내일
		LinkedList milk = new LinkedList();
		milk.add("어제우유");
		milk.add("오늘우유");
		milk.add("내일우유");
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
		
	}

}
