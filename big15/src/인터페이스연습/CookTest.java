package 인터페이스연습;

public class CookTest {

	public static void main(String[] args) {
		ChineseCook c = new ChineseCook();
		c.makeRice();
		c.makeSoup();
		c.makeSalad();
		c.makeSource();
		
		System.out.println();
		KoreanCook k = new KoreanCook();		
		k.makeRice();
		k.makeSoup();
		k.makeSalad();
		k.makeSource();
	}

}
