package db연결;

import java.util.Scanner;

public class Bbs2입력화면 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID입력: ");
		String id = sc.next();
		
		
		DAO db = new DAO();
		Bbs2DTO dto = db.select(id); //id의 검색결과값을 dto로
		System.out.println(dto.getId());
		System.out.println(dto.getTitle());
		System.out.println(dto.getContent());
		System.out.println(dto.getWriter());
		
		
	}

}
