package oi;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


import java.util.Scanner;



public class Oops {
	public static void main(String[] args) {


		Scanner scan =new Scanner(System.in);


		File file =new File("src/re_projectIo/Review.txt");


		while(true) {

			System.out.println("작성자 성함을 입력하세요");
			String userName=scan.nextLine();

			System.out.println("리뷰하실 책 제목을 입력하세요");
			String title=scan.nextLine();

			System.out.println("별점을 작성해주세요 ex) *** ");
			String stars=scan.nextLine();

			System.out.println("리뷰를 달아주세요");
			String comments=scan.nextLine();


			Review review=new Review(userName, title, stars, comments);

			System.out.println("입력 완료");  //user 한테 입력 받고

			System.out.println(review);




			try(ObjectOutputStream oout=
					new ObjectOutputStream(new FileOutputStream(file))) {
				oout.writeObject(review);





			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}






	}






}






