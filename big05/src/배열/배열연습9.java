package �迭;

public class �迭����9 {

	public static void main(String[] args) {
		//�ִ� ���ϱ�
		int[] num = {11, 77, 33, 22, 99, 66};
		for (int i = 0; i < num.length-1; i++) {
//			if(i == num.length -1) {break;}
			if(num[i] > num[i+1]) {
				int temp = num[i];
				num[i] = num[i+1];
				num[i+1] = temp;
			}
		}
		System.out.println("�ִ���: " + num[num.length - 1]);
		System.out.println("-----------------------");
		
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("�ִ���: " + max);
	}

}
