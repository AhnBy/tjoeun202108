package java_project;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDto {
	private int id;
	private String name;
	private String address;
	private String phoneNumber;
	private LocalDate birth;
	private LocalDateTime rental_date;
	private LocalDateTime return_date;
	public UserDto(int id, String name, String address, String phoneNumber, LocalDate birth, LocalDateTime rental_date,
			LocalDateTime return_date) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
		this.rental_date = rental_date;
		this.return_date = return_date;
	}
	public UserDto() {
		super();
	}
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
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", birth=" + birth + ", rental_date=" + rental_date + ", return_date=" + return_date + "]";
	}
	
	
	
	
}
