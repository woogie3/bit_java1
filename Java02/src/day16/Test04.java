package day16;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("main start");
		int jumsu = 90;
		try {
			if(!(jumsu >= 0 && jumsu <=100))
			throw new IOException("점수가 유효하지않습니다.");//에러메세지 
		}catch(IOException e) {
		System.out.println(e.getMessage());//에러메세지 등록
		}catch (Exception e) {
			
		}finally {
			
		}
		
		System.out.println("main end");
			
		}
	//	throw new RuntimeException("~~~문제발생~~~");
//		try {
//		throw new IOException("~~~고의로 문제발생~~~");//에러메세지 
//		}catch(IOException e) {
//			System.out.println(e.getMessage());//에러메세지 등록
//		}
//		System.out.println("main end");
//		
	}


