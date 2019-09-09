package 형변환;

public class ManUser {

	public static void main(String[] args) {
		Man man = new Man(null, 0);
		SuperMan superM = new SuperMan(null, 0);
		IronMan ironM = new IronMan(null, 0);
		
		//형변환 = 캐스팅(casting)
		//클래스간의 형변환
		//클래스간의 형변환은 상속관계에 있을 때만 가능!
		//작--->큰 (자동형변환, 업캐스팅)		
		man = superM;
		man = ironM;
		
		
		//큰--->작 (강제형변환, 다운캐스팅)
		superM = (SuperMan)man;
		ironM = (IronMan)man;
		
	}

}
