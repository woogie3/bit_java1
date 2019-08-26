package test;

import dao.BookDao;
import vo.Book;

public class Test_book {

	public static void main(String[] args) {
		BookDao dao = new BookDao();
		int Icount = 0;
		int Ucount = 0;
		int Dcount = 0;
		System.out.println("------------------------------------------");
		
		dao.getAllBookRec().forEach(i->System.out.println(i));
		System.out.println("------------------------------------------");
		Book data = new Book(1,"java","김길동",16000); 
		Book data1 = new Book(2,"DB","james",8000);
		Book data2 = new Book(3,"SDK","홍길동",8000);

		
		
		Icount = dao.insertBook(data);
		Icount = dao.insertBook(data1);
		Icount = dao.insertBook(data2);

		System.out.println(Icount + " : insert");

		System.out.println("------------------------------------------");
		
		Book b = new Book();
		b.setBookId(2);
		b.setBookName("html");
		b.setPublisher("구준표");
		b.setPrice(7500);
		dao.updateBook(b);
		System.out.println(Ucount+" = >  갱신");
		System.out.println("------------------------------------------");
		dao.getAllBookRec().forEach(i->System.out.println(i));
		System.out.println("------------------------------------------");
		Book name = new Book();
		name.setBookName("java");
		dao.deleteBook(name);
		System.out.println(Dcount+" = >  삭제");
		System.out.println("------------------------------------------");
		dao.getAllBookRec().forEach(i->System.out.println(i));
		
	}

}
