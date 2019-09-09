package 클래스;

public class TV {

	public static void main(String[] args) {
		TV버튼 tv1 = new TV버튼();

		tv1.ch = 11;
		tv1.vol = 3;
		tv1.onoff = true;

		tv1.on();
		tv1.off();
		System.out.println(tv1.ch);
		System.out.println(tv1.vol);
		System.out.println(tv1.onoff);

		System.out.println("\n----------------");
		
		TV버튼 tv2 = new TV버튼();

		tv2.ch = 22;
		tv1.vol = 4;
		tv1.onoff = false;

		tv1.on();
		tv1.off();
		System.out.println(tv2.ch);
		System.out.println(tv2.vol);
		System.out.println(tv2.onoff);

	}

}
