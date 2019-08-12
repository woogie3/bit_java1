package day12;

import java.util.StringTokenizer;

public class Book {
	private int price;
	private String title;
	
	
	public Book() {	}
	public Book(int price, String title) {
		super();
		this.price = price;
		this.title = title;
	}
	public Book(String title,int price) { //오버라이딩 가능
		super();
		this.price = price;
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {//toString메소드 오버라이딩
		StringBuilder sb = new StringBuilder();
		sb.append("Book 정보 / title :");
		sb.append(title);
		sb.append(", 가격:");
		sb.append(price);
		
		//return new String(sb);
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {//equals메소드의 오버라이딩
		boolean flag = false;
		if(!(obj instanceof Book)|| obj == null) {
			return false;
		}
		Book data = (Book)obj;
		if(price == data.price && title.equals(data.title)) {
			return true;
		}
		return flag;
	}
	
	@Override  //finalize는 자원반납의 기능을 하는 메소드, 객체가 소멸되기 직전에 호출됨
	protected void finalize() throws Throwable {
		//객체가 소멸되기 직전에 호출되는 메소드이지만 자바에서는 사용안하고
		//별도의 자원반납기능을 만들어 사용. ex) close()
		System.out.println("자원반납코드~~~~");
	}
	
	
	public void close() {
		System.out.println("close() 자원반납코드~~~~~~~~~~~~~~");
	}
	
	
	
	
}