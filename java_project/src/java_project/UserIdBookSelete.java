package java_project;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserIdBookSelete {
	public static void main(String[] args) {
		
		UserDao dao = UserDaoImpl.GetInstance();
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("회원 번호를 입력하세요");
			int id = scan.nextInt();
			List<UserDto> userList = dao.idBookselect(id);
			
			for (UserDto userDto : userList) {
				System.out.println(userDto);
			}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		}

