package 상속;

public class TruckCoffeeShop extends CoffeeShop {

	int location;

	public TruckCoffeeShop() {

	}

	public TruckCoffeeShop(String name, int price,
			String company, int location) {
		super(name, price, company);	
		this.location = location;
	}
	

	@Override
	public String toString() {
		return "TruckCoffeeShop [company=" + company + ", location=" + location + ", name=" + name + ", price=" + price
				+ "]";
	}

}
