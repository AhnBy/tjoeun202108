package java_project;

import java.sql.SQLException;
import java.util.Scanner;

public class BookNumSelect {
	public static void main(String[] args) {
		
		BooksDao dao = BooksDaoImpl.GetInstance();
		
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 책의 번호를 기입해주세요");
			int bookNum = scan.nextInt();
			BooksDto book = dao.numberSelect(bookNum);
			
			System.out.println(book);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}