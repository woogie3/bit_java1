package day21_ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class BookMgr { 
    List<Book> bookList = null;
    static int count = 0;
    
    public BookMgr() {
    	bookList = new ArrayList<Book>();
    	
    }

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
     
	public boolean addBook(Book book) {
		String fileName = "c:\\lib\\book.txt";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(bookList);
			oos.flush();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}finally {
			try {
				if(oos != null)oos.close();
				if(fos != null)fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		return bookList.add(book);
	
	}
	
	
	public void deleteBooks(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().equals(title)) {
				it.remove();
				return;
			}
		}System.out.println(title + " 도서가 없습니다.");
	}


		
	public List<Book> searchBookList(String title) {
		List<Book> slist	= new ArrayList<Book>();
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				slist.add(data);
			}
		}
		return slist;
	}
	
	public List<Book> bookListPrint() { 
		return bookList;
	}
	public List<Book> bookLoad(){
		String fileName = "c:\\lib\\book.txt";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			bookList = (List<Book>) ois.readObject();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}finally {
			try {
				if(ois != null)ois.close();
				if(fis != null)fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			} 
			
		}
		return bookList;
	}

	
	
}



	