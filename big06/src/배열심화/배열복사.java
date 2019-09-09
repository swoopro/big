package 배열심화;

public class 배열복사 {

	public static void main(String[] args) {
		int[] n1 = {1, 2, 3, 4, 5};
//		int[] n2 = n1; //"얕은복사"  주소값이 복사되어 이렇게되면 n1[0],n2[0] 두값이 다 9
		
		int[] n2 = n1.clone(); //"깊은복사" 그대로복사됨 보통이거사용.
		n1[0] = 9; 
		
		System.out.println(n1);
		System.out.println(n2);
		
		for (int i : n2) {
			System.out.print(i + " ");
			
		}
		System.out.println("\n-----------------");
		
		for (int i : n2) {
			System.out.print(i + " ");
			
		}
	}

}
