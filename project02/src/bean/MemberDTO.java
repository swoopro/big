package bean;

public class MemberDTO {
	String id;
	String pw;
	String name;
	int birth;
	String tel;
	String email;
	String fJenre1;
	String fJenre2;
	String fJenre3;
	
	public MemberDTO() {
		super();
	}

	public MemberDTO(String id, String pw, String name, int birth, String tel, String email, String fJenre1,
			String fJenre2, String fJenre3) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.tel = tel;
		this.email = email;
		this.fJenre1 = fJenre1;
		this.fJenre2 = fJenre2;
		this.fJenre3 = fJenre3;
	}

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

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getfJenre1() {
		return fJenre1;
	}

	public void setfJenre1(String fJenre1) {
		this.fJenre1 = fJenre1;
	}

	public String getfJenre2() {
		return fJenre2;
	}

	public void setfJenre2(String fJenre2) {
		this.fJenre2 = fJenre2;
	}

	public String getfJenre3() {
		return fJenre3;
	}

	public void setfJenre3(String fJenre3) {
		this.fJenre3 = fJenre3;
	}
	
	
	
	
	
}
