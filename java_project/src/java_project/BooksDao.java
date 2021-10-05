package java_project;

import java.sql.SQLException;
import java.util.List;

public interface BooksDao {
	
	
	
	
	//1. 책 insert
	public int bookinsert(BooksDto books)  throws ClassNotFoundException, SQLException;
	
	//2. 책 번호로 select
	public BooksDto numberSelect(int bookNumber)throws ClassNotFoundException, SQLException;
	
	//3. 책 제목으로 select
	public List<BooksDto> titleSelect(String title)throws ClassNotFoundException, SQLException;
	
	//4. 책 update
	int bookupdate(BooksDto books) throws ClassNotFoundException, SQLException;
	
	//5. 책 정보 delete 
	public int bookdelete(int bookNumber) throws ClassNotFoundException, SQLException;
	
}
