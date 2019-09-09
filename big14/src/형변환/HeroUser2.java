package 형변환;

public class HeroUser2 {

	public static void main(String[] args) {		
		Man man = new IronMan("아이언맨", 20);
		HeroGroup2 hero1 = new HeroGroup2(man);
		man.eat();
		man.sleep();
		hero1.getName();
	}

}
