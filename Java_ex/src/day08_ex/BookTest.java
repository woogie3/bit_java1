package day08_ex;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr(5);
		mgr.addBook(new Book ("Java Program", 20000));
		mgr.addBook(new Book ("JSP Program", 15000));
		mgr.addBook(new Book ("SQL Fundamentals", 35000));
		mgr.addBook(new Book ("SQL Fundamentals", 35000));
		mgr.addBook(new Book ("EJB Program", 3000));
		
		mgr.bookListPrint();
		System.out.println("총합계 : "+mgr.bookTotalPrice());
		//System.out.println(Arrays.toString(mgr.getBookList()));
	/*	Book[] b = mgr.getBookList(); 
		for(int i=0; i<b.length; i++) {
			b[i].print();
		}
		*/
		
//		for(Book : mgr.getBookList(Arrays.toString(mgr.getBookList))) {
			
//			System.out.println(data);
		}
			/*	new BookMgr("Java Program", 20000);
				new BookMgr("JSP Program", 15000);
				new BookMgr("SQL Fundamentals", 35000);
//				new BookMgr("JDBC Program", 25000);
				new BookMgr("EJB Program", 3000);
		*/
		
		

	}
