package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
		scanner = new Scanner(new File("c://lib//sample.txt"));
		while(scanner.hasNextLine()) {//while문을 주어 파일내용을 읽어오게한다.
			String[] data = scanner.nextLine().replace('_', '/').split("/");
			//sample파일안에 텍스트들을 쪼개서 배열화한다.
			Book book = new Book(data[0], Integer.parseInt(data[1]));
			System.out.println(book);
			System.out.println(Arrays.toString(data));
			//배열화된 데이터출력
		}
		}catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		} catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();//예외처리상세히
		} finally {
		
		if(scanner != null)
		scanner.close();
		scanner = null;
		System.out.println("반납완료~");
		}
		
		try {
			Book book = new Book("java",-9000);
			System.out.println(book);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("END");
	}

}
