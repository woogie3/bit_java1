package day12;

import java.util.Date;

public class BookTest {

	public static void main(String[] args) {
		String msg1 = "hello";
		String msg2 = "hello";
		System.out.println(msg1.toString());//자동으로 .toString()생성
		System.out.println(msg1.equals(msg2));
		System.out.println(msg2.toString());
		
		
		Book b1 = new Book("java", 2200);
		Book b2 = new Book("java", 2200);
		System.out.println(b1.toString());
		System.out.println(b1.equals(b2));
		System.out.println(b2);
		//System.out.println(b1.equals(new Date()));
		
		b1.close();
		b2.close();
		
		b1 = null;
		b2 = null;//null할당하기 -> gabage의 대상이됨.
		
		System.gc();//가비지콜렉터 호출
		
		System.out.println("====main end====");
		
		
		

	}

}
