package java_project;

import java.time.LocalDate;

public class BooksDto {
	
	
	private int bookNumber;
	private int personNumber;
	private String title;
	private String sub_title;
	private String writer;
	private String publisher;
	private int price;
	private LocalDate publication_date;
	
	
	
	public BooksDto(int bookNumber, int personNumber, String title, String sub_title, String writer, String publisher,
			int price, LocalDate publication_date) {
		super();
		this.bookNumber = bookNumber;
		this.personNumber = personNumber;
		this.title = title;
		this.sub_title = sub_title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.publication_date = publication_date;
	}
	public BooksDto() {
		super();
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public int getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSub_title() {
		return sub_title;
	}
	public void setSub_title(String sub_title) {
		this.sub_title = sub_title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getPublication_date() {
		return publication_date;
	}
	public void setPublication_date(LocalDate publication_date) {
		this.publication_date = publication_date;
	}
	@Override
	public String toString() {
		return "BooksDto [bookNumber=" + bookNumber + ", personNumber=" + personNumber + ", title=" + title
				+ ", sub_title=" + sub_title + ", writer=" + writer + ", publisher=" + publisher + ", price=" + price
				+ ", publication_date=" + publication_date + "]";
	}
	
	
	
	
	
	
}
