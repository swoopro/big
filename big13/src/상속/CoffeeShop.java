package 상속;

public class CoffeeShop extends Shop {
	String company;
	

	public CoffeeShop() {
		
	}

	public CoffeeShop(String name, int price, String company) {
		super(name, price);
		this.company = company;
	}
}
