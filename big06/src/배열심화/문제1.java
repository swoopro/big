package 배열심화;

import javax.swing.JOptionPane;

public class 문제1 {

	public static void main(String[] args) {
		// joption만 사용해서
		// 당신은 배가 고픈가요?
		// 맞아요: 점심 드시러 가시죠!
		// 아니요: 더 코딩 하시죠!
		// 취소: 다시 질문할게요.
		int result = JOptionPane.showConfirmDialog(null, "당신은 배가 고픈가요?");
		
		switch (result) {
		case 0:
			JOptionPane.showMessageDialog(null, "점심 드시러 가시죠!");			
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "더 코딩 하시죠!");
			break;
		default:
			JOptionPane.showMessageDialog(null, "다시 질문할게요!");
			break;
		}
		}
	}


