package day20_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class BookMgr2 { 
    Map<Integer,Book> map = null;//기존  배열선언방식에서 Map형으로 변환
    static int count = 0;
    
    public BookMgr2() {
    	map = new HashMap<Integer,Book>();
    }

	
	public void addBook(Book book) {
		map.put(book.getIsbn(),book);	
	}

	
	public void deleteBooks(String title) {
		Iterator<Integer> it = map.keySet().iterator();//
		while (it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);
			if(data.getTitle().equals(title)) {
				System.out.println(data+"삭제되었습니다.");
				it.remove();
			}
			
		}
		
	}


		
	public void searchBookList(String title) {
		System.out.println("제목 "+title+" 검색결과 ");
			Iterator<Integer> it = map.keySet().iterator();
			while (it.hasNext()) {
				Integer isbn = it.next();
				Book data = map.get(isbn);
				if (data.getTitle().toUpperCase().contains(title.toUpperCase())) {
					System.out.println(data);
				
			}
			}
		}
	
	
	public void bookListPrint() { //단순리스트출력시 간단하게 foreach문을 사용한다.
		System.out.println("========bookList foreach기반==========");
//		map.forEach(i->System.out.println(i));
//		map.forEach((Integer k, Book v) -> System.out.println(k + " : " + v)); 
		map.forEach((k, v) -> System.out.println(v)); 
		// BiConsumer는 @FunctionalInterface 갖고있어서 람다로 표현가능
		System.out.println("=========================");
	}
	
}



	