package db연결;

import java.util.Scanner;

public class DB입력화면2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("탈퇴할 ID 입력: ");
		String id = sc.next();
	
		
		DB처리 db = new DB처리 ();
		db.delete(id);
	}

}
