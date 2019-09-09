package db연결;

import java.util.Scanner;

public class DB입력화면5 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID입력: ");
		String id = sc.next();
		System.out.print("PW입력: ");
		String pw = sc.next();
		System.out.print("NAME입력: ");
		String name = sc.next();
		System.out.print("TEL입력: ");
		String tel = sc.next();
		
		DB연결테스트 db = new DB연결테스트();
//		db.insert(id, pw, name, tel);
		
		
	}

}
