package day23;

import java.io.RandomAccessFile;

public class Test07 {

	public static void main(String[] args) throws Exception{//메인에서 예외처리하면 try catch문 작성이 안됨
		
		RandomAccessFile raf = new RandomAccessFile("rand.dat", "rw");
		//임의 접근이 가능하게 지원하는 클래스RandomAccessFile //읽고쓰기 다됨
		String msg = "Hello, RandomAccessFile ...";
		String result = null;
		
		raf.writeBytes(msg); //byte문자열 사용가능
		raf.seek(0); //seek로 위치조정
		while(true) {
			result = raf.readLine();
			if(result == null) break;
			System.out.println(result);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		raf.seek(raf.length());//cursor를 뒤로
		msg = "\n hi java test.. i/o test";
		raf.writeBytes(msg);
		raf.seek(7);
		while(true) {
			result = raf.readLine();
			if(result == null) break;
			System.out.println(result);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		raf.close();
		
		
	}

}
