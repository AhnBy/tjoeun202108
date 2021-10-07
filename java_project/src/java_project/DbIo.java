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
                System.out.println(list);
 
            }

            StringBuffer query = new StringBuffer();
            query.append("INSERT INTO review VALUES (?,?,?,?)");
            Connection conn = projectConn.getConn();
            PreparedStatement pst = conn.prepareStatement(query.toString());
 
//            pst.setString(1, list.);
            
            
            for (int i = 0; i < count; i++) { // 데이터 길이만큼
                pst.setInt(1, i + 1);
                pst.setString(2, list.get((3 * i) + 0));
                pst.setString(3, list.get((3 * i) + 1));
                pst.setString(4, list.get((3 * i) + 2));
                pst.executeUpdate();
            }
               
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
}




