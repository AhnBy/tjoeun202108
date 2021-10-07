package java_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Isr {
	public static void main(String[] args) {
		File file =new File("src/java_project/Review.txt");
		
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8")){
			int data = -1;
			while((data = isr.read()) != -1) {
				System.out.print((char)data);
			}
			
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
