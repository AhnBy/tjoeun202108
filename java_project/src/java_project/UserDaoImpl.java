package java_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserDaoImpl implements UserDao{
	
	private static UserDaoImpl instance = new UserDaoImpl();
	
	private UserDaoImpl() {}
	
	public static UserDaoImpl GetInstance(){
		return instance;
	}
	
	private UserDto convert(ResultSet rs) throws SQLException{
		return new UserDto(rs.getInt("id"),
				rs.getString("name"),
				rs.getString("address"),
				rs.getString("phoneNumber"),
				rs.getDate("birth").toLocalDate(),
				rs.getTimestamp("rental_date").toLocalDateTime(),
				rs.getTimestamp("return_date").toLocalDateTime());
	}
	
	//id,name,address,phoneNumber,birth,rental_date,return_date
	@Override
	public int userinsert(UserDto user) throws ClassNotFoundException, SQLException {
		String sql = "insert into user(id,name,address,phoneNumber,birth,rental_date,return_date)"
				+ " value(?,?,?,?,?,?,?)";
		
		try(Connection conn = projectConn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, user.getId());
			pst.setString(2, user.getName());
			pst.setString(3, user.getAddress());
			pst.setString(4, user.getPhoneNumber());
			pst.setString(5, user.getBirth().toString());
			pst.setString(6, user.getRental_date().toString());
			pst.setString(7, user.getReturn_date().toString());
			
			return pst.executeUpdate();
		}
		
		
	}

	@Override
	public UserDto idSelect(int id) throws ClassNotFoundException, SQLException {
		
		String sql = "select * from user where id =?";
		
		try(Connection conn = projectConn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, id);
			try(ResultSet rs = pst.executeQuery()){
				UserDto user = null;
				if(rs.next()) {
					user = convert(rs);
				}
				return user;
			}
		}
	}

	@Override
	public List<UserBookDto> idBookselect(int id) throws ClassNotFoundException, SQLException {
		String sql = "select u.name, b.bookNumber,b.title,u.phoneNumber, u.rental_date, u.return_date from user u join book b on u.id = b.personNumber where u.id = ?";
		
		try(Connection conn = projectConn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, id);
			try(ResultSet rs = pst.executeQuery()){
				List<UserBookDto> userList = new ArrayList<UserBookDto>();
				
				while(rs.next()) {
					userList.add(new UserBookDto(rs.getString("name"),
							rs.getInt("bookNumber"),
							rs.getString("title"),
							rs.getString("phoneNumber"),
							rs.getTimestamp("rental_date").toLocalDateTime(),
							rs.getTimestamp("return_date").toLocalDateTime()));
				}
				return userList;
			}
		}
		
	}

	@Override
	public int userUpdate(UserDto user) throws ClassNotFoundException, SQLException {
		
		String sql = "update user set name=?, address=?,phoneNumber=?,birth=?,rental_date=?,return_date=?"
				+ "where id = ?";
		
		try(Connection conn = projectConn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setString(1, user.getName());
			pst.setString(2, user.getAddress());
			pst.setString(3, user.getPhoneNumber());
			pst.setString(4, user.getBirth().toString());
			pst.setString(5, user.getRental_date().toString());
			pst.setString(6, user.getReturn_date().toString());
			pst.setInt(7, user.getId());
			
			return pst.executeUpdate();
		}
		
	}

	@Override
	public int userDelete(int id) throws ClassNotFoundException, SQLException {
		String sql = "delete from user where id = ?";
		
		try(Connection conn = projectConn.getConn();
			PreparedStatement pst = conn.prepareStatement(sql)){
			pst.setInt(1, id);
			return pst.executeUpdate();
		}
		
		
	}

}
