package 컬렉션;

public class BbsDTO {
	String id;
	String title;
	String content;
	String writer;
	//==> set/get (알트+쉬프트+s+r)

	//기본생성자는 파라메터없는 생성자
	
	public BbsDTO() {
	}
	//파라메터있는 생성자 알트+쉬프트+s+o
	//set메소드와 역할같다
	
	public BbsDTO(String id, String title, String content, String writer) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "BbsDTO [id=" + id + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
}
