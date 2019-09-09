package db연결;

import java.util.Scanner;

public class DB입력화면3 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("TEL수정할 ID입력: ");
		String id = sc.next();
		System.out.print("TEL 수정값입력: ");
		String tel = sc.next();
	
		
		DB처리 db = new DB처리 ();
		db.update(id, tel);
	}

}
