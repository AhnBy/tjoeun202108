package java_project;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserIdBookSelect {
	public static void main(String[] args) {
		
		UserDao dao = UserDaoImpl.GetInstance();
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("회원 번호를 입력하세요");
			int id = scan.nextInt();
			List<UserBookDto> userList = dao.idBookselect(id);
			
			for (UserBookDto userDto : userList) {
				System.out.println(userDto);
			}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		}

