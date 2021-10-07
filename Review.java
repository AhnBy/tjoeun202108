package oi;

import java.io.Serializable;

public class Review implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4452003614970580657L;
	private String userName;
	private String title;
	private String stars;
	private String comments;
	public Review(String userName, String title, String stars, String comments) {
		super();
		this.userName = userName;
		this.title = title;
		this.stars = stars;
		this.comments = comments;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStars() {
		return stars;
	}
	public void setStars(String stars) {
		this.stars = stars;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Review [등록자 성함=" + userName + ", 책 제목=" + title + ", 별점=" + stars + ", 한줄평=" + comments
				+ "]";
	}
	

}
