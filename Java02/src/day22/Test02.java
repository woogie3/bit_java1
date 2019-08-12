package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {//fileCopy

	public static void main(String[] args) {
		String src = "c://lib//Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		System.out.println(" 파일복사 시작합니다. ");
		
		try {
			fis = new FileInputStream(src);
//			fos = new FileOutputStream("c://lib//copy.mp3",false);
//			fos = new FileOutputStream("c://lib//copy.mp3",true);//크기2배
			fos = new FileOutputStream("c://lib//copy2.mp3",false);
			
			int read = 0;
			int count = 0;
			
			
			
			while((read = fis.read()) != -1) {//read값이 -1이될때까지 읽는다.
				fos.write(read);
				count++;
			}
			System.out.println("I/O횟수 "+count);
			System.out.println(" 파일 복사 완료 ");
			
		} catch (FileNotFoundException e) {
			System.out.println(src+" 파일(복사원본) 확인해주세요. ");
		} catch (Exception e) {
			
		} finally {
			try {
				if(fis != null)fis.close();
				if(fos != null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("  main end  ");
		
		
	}

}
