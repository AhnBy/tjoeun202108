package java_project;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BookTitleSelect {
	public static void main(String[] args) {
		
	BooksDao dao = BooksDaoImpl.GetInstance();
	
	try {
		Scanner scan = new Scanner(System.in);
		System.out.println("책의 제목을 입력하세요");
		String title = scan.next();
		List<BooksDto> bookList = dao.titleSelect(title);
		
		for( BooksDto bookDto : bookList) {
			System.out.println(bookDto);
		}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	}

