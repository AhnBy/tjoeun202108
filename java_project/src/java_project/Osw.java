package java_project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Osw {
	public static void main(String[] args) {


		Scanner scan =new Scanner(System.in);


		File file =new File("src/java_project/Review.txt");

		try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file))){
			
			while(true) {
				List<String> list = new ArrayList<String>();
				
				System.out.println("작성자 성함을 입력하세요");
				String s1=scan.nextLine();
				list.add(s1);
				
				System.out.println("리뷰하실 책 제목을 입력하세요");
				String s2=scan.nextLine();
				list.add(s2);
				
				System.out.println("별점을 작성해주세요 ex) *** ");
				String s3=scan.nextLine();
				list.add(s3);
				
				System.out.println("리뷰를 달아주세요");
				String s4=scan.nextLine();
				list.add(s4);
				
				
				for(int i=0; i<4; i++) {
					osw.write(list.get(i)+"\n");
					osw.flush();
				}
				
				System.out.println("입력 완료");
					
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
