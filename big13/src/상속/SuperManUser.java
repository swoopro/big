package 상속;

public class SuperManUser {
	public static void main(String[] args) {
		SuperMan superM = new SuperMan();
		superM.age = 10; //Person
		superM.name ="클라크"; //
		superM.power ="신의영역";
		superM.fly= true;
		
		superM.eat();//Person
		superM.run();//Man
		superM.fly();//SuperMan
		System.out.println(superM);
	}
}
