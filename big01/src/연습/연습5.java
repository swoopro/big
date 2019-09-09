package 연습;

public class 연습5 {

	public static void main(String[] args) {
		int keyPrice = 4000;
		int keyCount = 4;
		int mousePrice = 3000;
		int mouseCount = 2;
		
		System.out.println("제품 계산서 입니다.");
		System.out.println("--------------------");
		
		int keySum = keyPrice * keyCount;
		int mouseSum = mousePrice * mouseCount;
		
		System.out.println("키보드 총 가격: " + keySum + "원");
		System.out.println("마우스 총 가격: " + mouseSum + "원");
		System.out.println("제품 총 가격: " +(keySum + mouseSum)+ "원");
		
	}

}
