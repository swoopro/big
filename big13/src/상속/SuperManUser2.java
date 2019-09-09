package 상속;

public class SuperManUser2 {
	public static void main(String[] args) {
		SuperMan superM = new SuperMan(10, "클라크", "신의영역", true);
//		superM.age = 10; //Person
//		superM.name ="클라크"; //
//		superM.power ="신의영역";
//		superM.fly= true;
//		
		
		System.out.println(superM);
		
		superM.eat();//Person
		superM.run();//Man
		superM.fly();//SuperMan
	}
}
