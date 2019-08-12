package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("c://lib//sample.txt");) {
		//implements closable이 생략되어있음
		//.close처리하지 않는다. 즉, 오토클로징 진행
			System.out.println("file처리~~~~");
			
		}catch(Exception e) {//모든예외처리핸들링
			e.printStackTrace();
		}finally {
			
		}
		System.out.println("-----------------------------------");
		try(Scanner scanner = new Scanner(new File("c://lib//sample.txt"));) {
			//implements closable이 생략되어있음 
			//.close처리하지 않는다. 즉, 오토클로징 진행
			while(scanner.hasNextLine()) {//while문을 주어 파일내용을 읽어오게한다.
				String[] data = scanner.nextLine().replace('_', '/').split("/");
				//sample파일안에 텍스트들을 쪼개서 배열화한다.
				System.out.println(Arrays.toString(data));
				//배열화된 데이터출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
