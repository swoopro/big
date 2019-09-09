package 인터페이스연습;

public class ChineseCook implements ICook{
	@Override
	public void makeRice() {
		System.out.println("자장밥");
	}
	
	@Override
	public void makeSoup() {
		System.out.println("토마토계란국");
	}
	@Override
	public void makeSalad() {
		System.out.println("청경채샐러드");
	}
	@Override
	public void makeSource() {
		System.out.println("춘장");
	}
}
