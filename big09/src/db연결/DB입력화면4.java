package db연결;

import java.util.Scanner;

public class DB입력화면4 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID 입력: ");
		String id = sc.next();
		System.out.print("PW 입력: ");
		String pw = sc.next();
		System.out.print("NAME 입력: ");
		String name = sc.next();
		System.out.print("TEL 입력: ");
		String tel = sc.next();
		
		DB처리2 db = new DB처리2 ();
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);
		db.insert(dto);
		
	}

}
