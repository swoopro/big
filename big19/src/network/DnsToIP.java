package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DnsToIP {

	public static void main(String[] args) {
		String dns = "www.daum.net";
		
		try {//시도하다가 오류나면
			InetAddress ip = InetAddress.getByName(dns);
			//객체화 
			//스트링을 ip로 인식해주게한다
			System.out.println(ip);
			System.out.println(ip.getHostAddress());
			System.out.println(ip.getHostName());
		} catch (UnknownHostException e) {//오류잡아줘
			System.out.println(dns + "에 해당하는 ip주소를 알 수 없습니다.");
		}finally { //에러발생여부과 상관없이 
				   //꼭 실행시키고 싶은 내용
			System.out.println("dns서비스 받음.");
			
		}
	}

}
