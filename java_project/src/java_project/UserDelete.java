package java_project;

import java.sql.SQLException;
import java.util.Scanner;

public class UserDelete {
	public static void main(String[] args) {
		
		UserDao dao = UserDaoImpl.GetInstance();
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("삭제할 회원 번호를 입력해주세요");
			int id = scan.nextInt();
			
			dao.userDelete(id);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}