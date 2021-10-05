package java_project;

import java.sql.SQLException;
import java.util.Scanner;

public class BookDelete {
	public static void main(String[] args) {
		
		BooksDao dao = BooksDaoImpl.GetInstance();
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("삭제할 책의 번호를 입력해주세요");
			int BookNum = scan.nextInt();
			
			dao.bookdelete(BookNum);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}