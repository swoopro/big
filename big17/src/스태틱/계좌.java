package 스태틱;

public class 계좌 {
	static int money = 10000;//예금한 금액 //static:복사안되고 객체들간공유가능
	String date;//출금날짜
	int out; //출금액
	static int count;
	
	public void 출금하다(String date, int out) {
		count++;
		this.date = date;
		this.out = out;
		money = money - out;
	}

	@Override
	public String toString() {
		return "계좌 [money=" + money + ", date=" + date + ", out=" + out + "]";
	}
}
