package java_project;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
	
	
	
	//1. 회원 insert
	public int userinsert(UserDto user) throws ClassNotFoundException, SQLException;
	//2. 회원 번호로 select
	public UserDto idSelect(int id)throws ClassNotFoundException, SQLException;
	//3. 회원 번호로 책 조회 Selete
	public List<UserBookDto>idBookselect(int id)throws ClassNotFoundException, SQLException;
	//4. 회원 정보수정 update
	int userUpdate(UserDto user) throws ClassNotFoundException, SQLException;
	//5. 회원 삭제 delete
	public int userDelete(int id) throws ClassNotFoundException, SQLException;
	
}
