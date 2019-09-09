package 형변환;

public class HeroUser {

	public static void main(String[] args) {		
		SuperMan s = new SuperMan(null, 0);
		HeroGroup hero1 = new HeroGroup(s);
	}

}
