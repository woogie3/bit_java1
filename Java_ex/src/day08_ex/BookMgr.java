package day08_ex;

public class BookMgr { //기능 클래스
    private Book[] bookList;
    int count = 0;
    
    public BookMgr() {
    	this(10);
    	//bookList = new Book[10];
    }
    public BookMgr(int size) {
    	bookList = new Book[size];
    }
	public Book[] getBookList() {//책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드
		return bookList;
	}
	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}
     
	public void addBook(Book book) {//Book 객체를 booklist에 등록하는 addBook(Book book) 메서드
		if(count == bookList.length) {
			Book[] copy = new Book[bookList.length*2];
			System.arraycopy(bookList, 0, copy, 0, bookList.length);
			bookList = copy;
		}
		bookList[count] = book;
		count++;
	}
	public void bookListPrint() {//책 목록을 화면에 출력하는 printBookList() 메서드
		for(int i=0; i<count; i++) {
			bookList[i].print();
		}
	}
	public int bookTotalPrice() {//모든 책 가격의 합을 출력하는 printTotalPrice() 메서드
		int sum =0;
		for(int i=0; i<count; i++) {
			sum += bookList[i].getPrice();
		}
		return sum;
	}
     
}