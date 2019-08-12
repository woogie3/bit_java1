package day09;

import java.util.Scanner;

public class BookMgr { //기능 클래스
    private Book[] bookList;
    private int count = 0;
    
    public BookMgr() {
    	this(10);
    	//bookList = new Book[10];
    }
    public BookMgr(int size) {
    	bookList = new Book[size];
    }
//	public Book[] getBookList() {//책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드
//		return bookList;
//	}
	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}
     
	public void addBook(Book book) {//Book 객체를 booklist에 등록하는 addBook(Book book) 메서드
		if(count == bookList.length) {//배열이 꽉차서 리사이징을 해줘야한다.
			Book[] copy = new Book[bookList.length*2];//new를 사용해 복사할 배열길이설정
			System.arraycopy(bookList, 0, copy, 0, bookList.length); //System.arraycopy를 이용해 배열을 복사한다
			bookList = copy;
		}
		bookList[count] = book;
		count++;
	}
	public void bookListPrint() {//책 목록을 화면에 출력하는 printBookList() 메서드
		System.out.println("========bookList==========");
		for(int i=0; i<count; i++) {
			bookList[i].print();
		}
		System.out.println("총 "+count+" 권");
		System.out.println("=========================");
	}
	public int bookTotalPrice() {//모든 책 가격의 합을 출력하는 printTotalPrice() 메서드
		int sum =0;
		for(int i=0; i<count; i++) {
			sum += bookList[i].getPrice();
		}
		return sum;
	}
	public void deleteBooks(String title) {
		for(int i = 0; i < count; i++) {
			if(bookList[i].getTitle().equals(title)) {//제목의값과 배열이 일치하는경우
				System.arraycopy(bookList,i+1,bookList,i,count-i-1);//bookList배열 복사
				count--; //해당 배열 감산
				System.out.println(title+"삭제되었습니다.");// 메모리영역에서 지워지면 해당 출력문 발생
				return;
			}
		}
		System.out.println(title+"도서가 없습니다.");
	}
	public void searchBookList(String title) {//책제목을 검색해 그 책만 출력
		System.out.println(title+" 검색");
		for(Book data : bookList) {
			if(data == null) return; //공백이 있는경우는 돌아간다
			if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				//=>배열의 있는 문자와 내가 입력한 문자를 대문자로 변환후 비교한다.
				data.print();
			}
		}
	}
	
	
	/*	public void searchBookList(String title) {//책제목을 검색해 그 책만 출력
		for(int i = 0; i < count; i++) {
			if(bookList[i].getTitle().toUpperCase().contains(title.toUpperCase().trim())) {
				bookList[i].print();
	}
			
		}
}*/
	/*	public void deleteBooks(String title) {
			for(int i = 0; i < bookList.length; i++) {
				if(bookList[i] != null && bookList[i].getTitle().equals(title)) {
					for(int j = i; j < count-1; j++) {
						if(i == bookList.length-1) {
							bookList[i] = null;						
						}
						bookList[j] = bookList[j+1];
					}
					count--;
				}
				
			}
		}*/
}



	