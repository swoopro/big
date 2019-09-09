package 상속;

public final class 중요한알고리즘 { //클래스 앞에 파이널 붙이면 상속할수없다. (종단클래스)
								//메서드앞에 파이널 지정하면 재정의(오버라이딩)할수없다.
	int x = 3;					//변수앞에 파이널 오면 상수처리한것
	int y = 5;
	int z = 2;
	int result = x + y + z  * x * y * y;
}
