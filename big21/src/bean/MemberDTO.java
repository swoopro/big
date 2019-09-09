package bean;

public class MemberDTO {
	private String id; //private 클래스 밖에서 접근불가능, 메소드를통해서접근가능
	private String pw; // 개인정보같은거 있으니까 밖에서접근불가능하게하려고
	private String name;
	private String tel;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
