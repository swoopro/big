package 상속;

public class Main {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.work();
		m.ad();
		m.name = "홍길동";
		m.age = 20;
		m.addept = "개발부서";
		System.out.println(m);
		
		Owner o = new Owner();
		o.work();
		o.run();
		o.name = "김길동";
		o.age = 21;
		o.num = 100;
		System.out.println(o);
		
	}

}
