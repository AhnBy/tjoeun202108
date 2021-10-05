package java_project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class BookInsertTest {
	public static void main(String[] args) {
		
	BooksDao dao = BooksDaoImpl.GetInstance();
	
	Scanner scan = new Scanner(System.in);
	System.out.println("책 번호를 기입해주세요");
	int booksNumber = scan.nextInt();
	
	System.out.println("회원 번호를 기입해주세요");
	int personNumber = scan.nextInt();
	
	System.out.println("책의 제목을 기입해주세요");
	String title = scan.next();
	scan.nextLine();
	System.out.println("책의 부제목을 기입해주세요");
	String sub_title = scan.next();
	scan.nextLine();
	System.out.println("작가의 이름을 기입해주세요");
	String writer = scan.nextLine();
	
	System.out.println("출판사의 이름을 기입해주세요");
	String publisher = scan.next();
	
	System.out.println("책의 가격을 기입해주세요");
	int price = scan.nextInt();
	
	System.out.println("책의 출간일을 기입해주세요");
	String publication_date = scan.next();
	
	LocalDate publicationDate = LocalDate.parse(publication_date);
	
	BooksDto books = new BooksDto(booksNumber,personNumber,title,sub_title,writer,publisher,price,publicationDate);
	
//	BooksDto books = new BooksDto();
//	books.setBookNumber(booksNumber);
//	books.setPersonNumber(personNumber);
//	books.setTitle(title);
//	books.setSub_title(sub_title);
//	books.setWriter(writer);
//	books.setPublisher(publisher);
//	books.setPrice(price);
//	books.setPublication_date(publicationDate);
	
	System.out.println(books);
	
	try {
		
		int cnt = dao.bookinsert(books);
		if(cnt > 0) {
			System.out.println("삽입 성공");
		}else {
			System.out.println("삽입 실패");
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	}
}
