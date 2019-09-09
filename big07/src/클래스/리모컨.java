package 클래스;

public class 리모컨 {

	public static void main(String[] args) {
		리모컨버튼 r1 = new 리모컨버튼();
		
		r1.shape = "네모";
		r1.text = "전원켜기";
		r1.push();
		System.out.println(r1.shape);
		System.out.println(r1.text);
		
		// 버튼 하나더 만들기
		// 모양은 타원, 텍스트는 채널고르기
		// 버튼을 눌러볼 것.
		// 두번째 버튼의 모양과 텍스트를 프린트
		리모컨버튼 r2 = new 리모컨버튼();
		r2.shape = "타원";
		r2.text = "채널고르기";
		r2.push();
		System.out.println(r2.shape);
		System.out.println(r2.text);
	}

}
