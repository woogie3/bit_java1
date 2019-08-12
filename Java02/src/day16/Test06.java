package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
		System.out.println(" main start");
		FileInputStream fis = null;
		
		try {//자원호출 및 사용
			 fis = new FileInputStream("c://lib//samplessss.txt");
			//파일명을 찾기보다 경로를 지정해서 찾아야 가장 정확하게 예외처리핸들링을 할수있다.
			System.out.println("파일준비완료~~~");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("sample.txt파일을 확인해주세요");
		}catch(Exception e){//다른예외가 발생할경우 
			e.printStackTrace();
		}finally {//자원반납처리
			try {//try catch문을 사용한이유는 fis가 별도로 변수선언되지도 않았고, IOException 예외처리 해야하기에 사용한다.
				if(fis != null) {
					fis.close();//지정된파일이 달라 null처리될경우를 대비해 if문으로 처리한다.
				}
			System.out.println("자원반납OK");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		System.out.println(" main end ");

	}

}
