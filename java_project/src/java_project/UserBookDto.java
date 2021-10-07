package java_project;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserBookDto {
	private int id;
	private String name;
	private String address;
	private String phoneNumber;
	private LocalDate birth;
	private LocalDateTime rental_date;
	private LocalDateTime return_date;
	private int bookNumber;
	private int personNumber;
	private String title;
	private String sub_title;
	private String writer;
	private String publisher;
	private int price;
	private LocalDate publication_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	public LocalDateTime getRental_date() {
		return rental_date;
	}
	public void setRental_date(LocalDateTime rental_date) {
		this.rental_date = rental_date;
	}
	public LocalDateTime getReturn_date() {
		return return_date;
	}
	public void setReturn_date(LocalDateTime return_date) {
		this.return_date = return_date;
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
		return "UserBookDto [id=" + id + ", phoneNumber=" + phoneNumber + ", rental_date=" + rental_date
				+ ", bookNumber=" + bookNumber + ", title=" + title + "]";
	}
	public UserBookDto(String name, int bookNumber, String title, String phoneNumber, LocalDateTime rental_date, LocalDateTime return_date) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.rental_date = rental_date;
		this.return_date = return_date;
		this.bookNumber = bookNumber;
		this.title = title;
	}

	
	
}
