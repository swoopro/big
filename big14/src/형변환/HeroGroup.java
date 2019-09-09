package 형변환;

public class HeroGroup {
	IronMan i;
	SuperMan s;
	
	public HeroGroup(IronMan i) {
		this.i = i;
	}
	
	public HeroGroup(SuperMan s) {
		this.s = s;
	}
}
