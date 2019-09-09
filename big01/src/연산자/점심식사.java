package 연산자;

import javax.swing.JOptionPane;

public class 점심식사 {

	public static void main(String[] args) {
		String data2 = JOptionPane.showInputDialog("입력: ");  
		
		//&&(and조건 둘다맞아야함), ||(or 둘중하나)
		//자장, 우동이면 "중국집으로 가요"
		//아니면  "다른집으로 가요"
		if(data2.equals("자장") || data2.equals("우동")){
			
			//조건에 맞을 때 처리내용
			System.out.println("중국집으로 가요.");
		}else {
			//조건에 안맞을 때 처리내용
			System.out.println("다른집으로 가요");		}
		
		}
	}


