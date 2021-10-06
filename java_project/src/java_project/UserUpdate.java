package java_project;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserUpdate {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		UserDto user = new UserDto();
		UserDao dao = UserDaoImpl.GetInstance();

		System.out.println("어떤 회원의 정보를 수정하시겠습니까? 회원번호를 입력해주세요");
		String userid = scan.nextLine();
		int id = Integer.parseInt(userid);

		try {
			user = dao.idSelect(id);
		}
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		System.out.println("어떤 정보를 수정할 지 (,)로 구분지어 수정하세요");
		System.out.println("정보 : name, address, phoneNumber, birth, rental_date, return_date");

		String column = scan.nextLine();
		String[] col = column.split(",");

		for(int i = 0; i < col.length; i++) {
			col[i] = col[i].trim();
		}

		List<String> columnList = new ArrayList<String>();
		for (String columns : col) {
			System.out.println("변경할 "+columns+"을 입력하세요");
			columnList.add(scan.nextLine());

		}

		for(int i=0; i<col.length; i++) {
			switch (col[i]) {
			case "name": 
				user.setName(columnList.get(i));
				break;

			case "address":
				user.setAddress(columnList.get(i));
				break;

			case "phoneNumber":
				user.setPhoneNumber(columnList.get(i));
				break;

			case "birth":
				user.setBirth(LocalDate.parse(columnList.get(i)));
				break;

			case "rental_date":
				user.setRental_date(LocalDateTime.parse(columnList.get(i)));
				break;

			case "return_date":
				user.setReturn_date(LocalDateTime.parse(columnList.get(i)));
				break;


			}
		}

		try {
			int update = dao.userUpdate(user);

			if(update > 0 ) {
				System.out.println("수정 완료");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}
}