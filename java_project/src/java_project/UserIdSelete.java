package java_project;

import java.sql.SQLException;
import java.util.Scanner;

public class UserIdSelete {
	public static void main(String[] args) {
		
		UserDao dao = UserDaoImpl.GetInstance();
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("회원번호를 입력해주세요");
			int id = scan.nextInt();
			UserDto user = dao.idSelect(id);
			
			System.out.println(user);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}