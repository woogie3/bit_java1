package day23_ex;

import java.io.FileNotFoundException;
import java.util.List;

public class BookTest {

	public static void main(String[] args) throws FileNotFoundException {
		BookMgr bookMgr = new BookMgr();
//		bookMgr.getBookList().forEach(i -> System.out.println(i));
//		
//		bookMgr.add(new Book("java",900,1,"hk"));
//		bookMgr.add(new Book("jsp",2900,2,"hk"));
//		bookMgr.add(new Book("db",900,3,"hk"));
//		
//		bookMgr.save();
		
		bookMgr.getBookList().forEach(i -> System.out.println(i));
		
//		bookMgr.add(new Book("~~~",0,0,"~~"));
		
//		bookMgr.save();
	}

}
