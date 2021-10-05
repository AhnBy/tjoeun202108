package java_project;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookUpdate {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BooksDto book = new BooksDto();
		BooksDao dao = BooksDaoImpl.GetInstance();

		System.out.println("어떤 번호의 책을 수정하시겠습니까?");
		int bookNum = scan.nextInt();

		try {
			book = dao.numberSelect(bookNum);
		}
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}


		System.out.println("어떤 컬럼을 수정할 지 (,)로 구분하여 기입하세요");
		System.out.println("컬럼 : bookNumber, personNumber, title, sub_title, writer, "
				+ "publisher, price, publication_date");

		String scancolumn = scan.nextLine();
		String[] col = scancolumn.split(",");

		for (int i = 0; i < col.length; i++) {
			col[i] = col[i].trim();
		}

		List<String> colstr = new ArrayList<String>();
		for (String column : colstr) {
			System.out.println("변경할 "+column+"을 입력하세요");
			colstr.add(scan.nextLine());
		}

		for(int i=0; i<col.length; i++) {
			switch (col[i]) {
			case "bookNumber": 
				book.setBookNumber(Integer.parseInt(colstr.get(i)));
				break;

			case "personNumber":
				book.setPersonNumber(Integer.parseInt(colstr.get(i)));
				break;
				
			case "title":
				book.setTitle(colstr.get(i));
				break;
				
			case "sub_title":
				book.setSub_title(colstr.get(i));
				break;
				
			case "writer":
				book.setWriter(colstr.get(i));
				break;
				
			case "publisher":
				book.setPublisher(colstr.get(i));
				break;
				
			case "price":
				book.setPrice(Integer.parseInt(colstr.get(i)));
				break;
				
			case "publication_date":
				book.setPublication_date(LocalDate.parse(colstr.get(i)));
				break;
			}
			}

		try {
			
			int update = dao.bookupdate(book);
			
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

