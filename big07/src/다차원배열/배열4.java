package 다차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 배열4 {

	public static void main(String[] args) {
		String[] items = {"번호", "제목", "내용", "날짜"};
		Object[][] data = {
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
				{"1", "java", "fun java", "2019-08-09"},
				{"2", "jsp", "fun jsp", "2019-08-10"},
				{"3", "spring", "fun spring", "2019-08-11"},
		};
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		
		JTable table = new JTable(data, items);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
		
	}
		
}
