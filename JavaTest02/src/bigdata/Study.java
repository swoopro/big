package bigdata;

public class Study {
	String id;
	String sub;
	String content;
	double price;
	int num;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "수강아이디:" + id + ", 수강과목: " + sub + ", 수강내용: " + content + ", 수강비용: " + price + "원, 수강가능인원: " + num ;
	}
}
