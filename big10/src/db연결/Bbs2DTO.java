package db연결;

public class Bbs2DTO {
	String id;
	String title;
	String content;
	String writer;

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
		return "Bbs2DTO [id=" + id + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	

}
