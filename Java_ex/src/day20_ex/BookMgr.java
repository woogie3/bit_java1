package day20_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr { 
    List<Book> bookList = null;//기존  배열선언방식에서 List형으로 변환
    static int count = 0;
    
    public BookMgr() {
    	bookList = new ArrayList<Book>();
    	//bookList = new Vector<Book>();  LinkedList<>로 구현가능하다. ArrayList는 배열기반(순회작업),  LinkedList(삽입,수정 작업) 노드기반이라는 점에서 차이점이 있다.
    	//bookList = new LinkedList<Book>();  LinkedList<>로 구현가능하다. ArrayList는 배열기반(순회작업),  LinkedList(삽입,수정 작업) 노드기반이라는 점에서 차이점이 있다.
    }

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
     
	public void addBook(Book book) {
		bookList.add(book);
//		if (!bookList.contains(book)) {
//			bookList.add(book);
//			System.out.println(" 등록되었습니다. ");
//		}else
//			System.out.println(" 중복등록된 책입니다. ");
//		
	}

	
	public void deleteBooks(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().equals(title)) {
				it.remove();
				System.out.println(data + " 삭제되었습니다.");
				return;
			}
		}System.out.println(title + " 도서가 없습니다.");
	}


		
	public void searchBookList(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				System.out.println(data);
			}
		}
	}
	
	public void bookListPrint() { //단순리스트출력시 간단하게 foreach문을 사용한다.
		System.out.println("========bookList==========");
		bookList.forEach(i->System.out.println(i));
		System.out.println("=========================");
	}
	
}



	