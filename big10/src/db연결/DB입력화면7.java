package db연결;

import java.util.Scanner;

public class DB입력화면7 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID입력: ");
		String id = sc.next();
	

	
		DB연결테스트 db = new DB연결테스트();
		MemberDTO dto = db.select(id);
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getName());
		System.out.println(dto.getTel());
	}

}
