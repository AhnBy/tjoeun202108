package java_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class BooksDaoImpl implements BooksDao{
	
	private static BooksDaoImpl instance = new BooksDaoImpl();
	
	private BooksDaoImpl() {}
	
	public static BooksDaoImpl GetInstance() {
		return instance;
	}
	
	private BooksDto convert(ResultSet rs) throws SQLException {
		return new BooksDto(rs.getInt("bookNumber"),
				rs.getInt("PersonNumber"),
				rs.getString("title"),
				rs.getString("sub_title"),
				rs.getString("writer"),
				rs.getString("publisher"),
				rs.getInt("price"),
				rs.getDate("publication_date").toLocalDate());
	}
	
	@Override
	//책 정보 넣기
	public int bookinsert(BooksDto books) throws ClassNotFoundException, SQLException {
		String sql = "insert into book(bookNumber, personNumber, title, sub_title"
				+ ",writer, publisher, price, publication_date)"
				+ "value(?,?,?,?,?,?,?,?)";
		
		try(Connection conn = projectConn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, books.getBookNumber());
			pst.setInt(2, books.getPersonNumber());
			pst.setString(3, books.getTitle());
			pst.setString(4, books.getSub_title());
			pst.setString(5, books.getWriter());
			pst.setString(6, books.getPublisher());
			pst.setInt(7, books.getPrice());
			pst.setString(3, books.getPublisher().toString());
			
			return pst.executeUpdate(); 
		}
		
	}

	@Override
	public BooksDto numberSelect(int bookNumber) throws ClassNotFoundException, SQLException {
		String sql = "select * from book where bookNumber =?";
		
		try(Connection conn = projectConn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql)){
		pst.setInt(1, bookNumber);
		try(ResultSet rs = pst.executeQuery()){
			BooksDto books = null;
			if(rs.next()) {
				books = convert(rs);
			}
			return books;
		}
	}
	}

	@Override
	public List<BooksDto> titleSelect(String title) throws ClassNotFoundException, SQLException {
		String sql = "select * from book where title like ?";
		
		try(Connection conn = projectConn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql)){
			
			pst.setString(1, "%"+title+"%");
			try(ResultSet rs = pst.executeQuery()){
				List<BooksDto> bookList = new ArrayList<BooksDto>();
				
				while(rs.next()) {
					bookList.add(convert(rs));
				}
				return bookList;
			}
		}
		
	}

	@Override
	public int bookupdate(BooksDto books) throws ClassNotFoundException, SQLException {
		
		String sql = "update book set personNumber=?,"
				+ " title=?, sub_title=?,writer=?, publisher=?, price=?,"
				+ " publication_date=? where bookNumber=?";
		
		try(Connection conn = projectConn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql)){
			
			pst.setInt(1, books.getPersonNumber());
			pst.setString(2, books.getTitle());
			pst.setString(3, books.getSub_title());
			pst.setString(4, books.getWriter());
			pst.setString(5, books.getPublisher());
			pst.setInt(6, books.getPrice());
			pst.setString(7, books.getPublication_date().toString());
			pst.setInt(8, books.getBookNumber());
			
			
			return pst.executeUpdate();
		}
	}

	@Override
	public int bookdelete(int bookNumber) throws ClassNotFoundException, SQLException {
		String sql = "delete from book where bookNumber =?";
		
		try(Connection conn = projectConn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, bookNumber);
			return pst.executeUpdate();
		
		}
	}

}
