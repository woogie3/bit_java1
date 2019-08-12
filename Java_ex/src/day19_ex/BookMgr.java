package day19_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr { 
    private List<Book> bookList;
    private int count = 0;
    
    public BookMgr() {
    	bookList = new ArrayList<Book>();
    }

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
     
	public void addBook(Book book) {
		if (!bookList.contains(book)) {
			bookList.add(book);
			System.out.println(" 등록되었습니다. ");
		}else
			System.out.println(" 중복등록된 책입니다. ");
		
	}
	public void bookListPrint() {
		System.out.println("========bookList==========");
		bookList.forEach(i->System.out.println(i));
		System.out.println("=========================");
	}

	
	public void deleteBooks(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			if (book.getTitle().equals(title)) {
				bookList.remove(book);
				System.out.println(title + " 삭제되었습니다.");
				return;
			}
		}System.out.println(title + " 도서가 없습니다.");
	}


		
	public void searchBookList(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			if (book.getTitle().toUpperCase().contains(title.toUpperCase())) {
				System.out.println(book);
			}
		}
	}
	
	
}



	