package day11;

public class test04 {

	public static void main(String[] args) {
		String	msg1 = "hello";
		String	msg2 = "hello";
		System.out.println(msg1);
		System.out.println(msg2);
		
		
		Book b1 = new Book("Java", 700);
		Book b2 = new Book("Java", 700);
		System.out.println(b1);
		System.out.println(b2);

	}

	
	
}
class Book extends Object{//오브젝트를 사용시에 toString과 equals사용시 어느정도 오버라이딩 필요!!
	String title;
	int price;
	
	public Book() {	}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "[Book제목 : "+title+"/가격 : "+price+"]";
	}
	
}
