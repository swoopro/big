package 인터페이스연습;

public class KoreanCook implements ICook {
	@Override
	public void makeRice() {
		System.out.println("김치볶음밥");
	}

	@Override
	public void makeSoup() {
		System.out.println("된장찌개");
	}

	@Override
	public void makeSalad() {
		System.out.println("파채");
	}

	@Override
	public void makeSource() {
		System.out.println("고추장");
	}
}
