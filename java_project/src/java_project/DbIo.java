package java_project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DbIo {
    public static void main(String[] args) {
        
        
        int count =0;
        try(Reader r = new FileReader("src/java_project/Review.txt"); BufferedReader reader = new BufferedReader(r);) {
        	
            List<String> list = new ArrayList<String>();
            while (true) {
                String data = reader.readLine();
                if (data == null) 
                    break;
                String[] arr = data.split(",");
                count++;
 
                for (String string : arr) {
                    list.add(string);
 
                }
 
            }
            System.out.println(list);

            StringBuffer query = new StringBuffer();
            query.append("INSERT INTO review VALUES (?,?,?,?,?)");
            Connection conn = projectConn.getConn();
            PreparedStatement pst = conn.prepareStatement(query.toString());         
            
            for (int i = 0; i < count; i++) {
            	pst.setInt(1, 0);
            	pst.setString(i+2, list.get((i)));             	
               
            }
            int rows = pst.executeUpdate();
            if(rows > 0) {
            	System.out.println("데이터베이스 삽입 완료");
            }
               
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			
		}
    }
}




