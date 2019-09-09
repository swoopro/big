package 다차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 배열3 {

	public static void main(String[] args) {
		String[] items = {"수학", "국어", "영어", "일어"}; 
		Object[][] data = {
				{3, 2, 1, 0},
				{6, 7, 8, 9},
				{1, 2, 3, 4},
				{3, 2, 1, 0},
				{6, 7, 8, 9},
				{1, 2, 3, 4},
				{3, 2, 1, 0},
				{6, 7, 8, 9},
				{1, 2, 3, 4},
				{3, 2, 1, 0},
				{6, 7, 8, 9},
				{1, 2, 3, 4},
				{3, 2, 1, 0},
				{6, 7, 8, 9},
				{1, 2, 3, 4},
				{3, 2, 1, 0},
				{6, 7, 8, 9},
				{1, 2, 3, 4},
				{3, 2, 1, 0},
				{6, 7, 8, 9},
				{1, 2, 3, 4},
				{3, 2, 1, 0},
				{6, 7, 8, 9},
				{1, 2, 3, 4},
				{3, 2, 1, 0},
				{6, 7, 8, 9},
				{1, 2, 3, 4},
				{3, 2, 1, 0},
				{6, 7, 8, 9},
				{1, 2, 3, 4},
				{3, 2, 1, 0},
				{6, 7, 8, 9},
				{1, 2, 3, 4}
		};
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		
		JTable table = new JTable(data, items);
		JScrollPane scroll = new JScrollPane(table);
		
		f.add(scroll);	
		
		f.setVisible(true);

		
	}
		
}
