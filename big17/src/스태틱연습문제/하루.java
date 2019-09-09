package 스태틱연습문제;

public class 하루 {
	String what;
	int hour;
	String place;
	static int sum;
	static int count;
	
	public void Day(String what, int hour, String place) {
		count++;
		sum += hour;
		this.what = what;
		this.hour = hour;
		this.place = place;
	}

	@Override
	public String toString() {
		return "하루 [what=" + what + ", hour=" + hour + ", place=" + place + "]";
	}
}
