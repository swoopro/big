package bean;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.DateTimeException;

public class boardDTO {
	
	private int bid;
	private int mid;
	private String id;
	private Timestamp date;
	private int score;
	private String writing;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getWriting() {
		return writing;
	}
	public void setWriting(String writing) {
		this.writing = writing;
	}
	

}