package java_project;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UserInsert {
	public static void main(String[] args) {

		//	id,name,address,phoneNumber,birth,rental_date,return_date

		UserDao dao = UserDaoImpl.GetInstance();

		Scanner scan = new Scanner(System.in);
		
		System.out.println("회원 아이디를 입력해주세요");
		int id = scan.nextInt();
		
		System.out.println("회원의 이름을 입력해주세요");
		String name = scan.next();
		
		System.out.println("회원의 주소를 입력해주세요");
		String address = scan.next();
		
		scan.nextLine();
		System.out.println("회원의 핸드폰 번호를 입력해주세요");
		String phoneNumber = scan.nextLine();
		
		System.out.println("회원의 생년월일을 입력해주세요");
		String birth = scan.next();
		LocalDate birth_date = LocalDate.parse(birth);

		System.out.println("대여 일을 입력해주세요");
		System.out.println("예시) 2020-01-01T00:00:00");
		String rental = scan.next();
		LocalDateTime rental_date = LocalDateTime.parse(rental);
		
		System.out.println("반납 일을 입력해주세요");
		System.out.println("예시) 2020-01-01T00:00:00");
		String returndate = scan.next();
		LocalDateTime return_date = LocalDateTime.parse(returndate);
		
		UserDto user = new UserDto(id,name,address,phoneNumber,birth_date,rental_date,return_date);
		
		
		try {
			int num = dao.userinsert(user);
			
			if(num >0) {
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