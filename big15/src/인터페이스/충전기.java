package 인터페이스;

public interface 충전기 {
	//반드시 지켜야하는 규칙을 정의
	//불완전한 메소드(추상메소드)
	//일반메소드는 사용 불가
	//일반 변수 사용 불가
	//상수로 공유가능(비추천)
	//final static이 디폴트로 되어있다.
	public abstract void 납작하게만들다();
	//public abstract는 생략가능
	void pin개수를맞추다();
	
	// 규칙인터페이스에서을만들어놓으면 implement 한 클래스에서는 
	//꼭 재정의해줘야함 상속은 그다음문제
	//설계할때주로사용
}
