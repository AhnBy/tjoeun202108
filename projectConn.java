package java_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class projectConn {
	public static Connection getConn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/tj?"
				+ "characterEncoding=utf-8&serverTimezone=Asia/Seoul";
		
		return DriverManager.getConnection(url,user,password);
		
	}
}
