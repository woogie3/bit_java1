package day08;

public class Card {
	String kind = "다이아몬드";
	int number; //인스턴스자원으로
	
	final static int WIDTH = 100; //final사용시 수정 불가능!!
	final static int HEIGHT = 250;//스태틱자원으로
	
	
	public static void main(String args[]) {
		//Card.width=0; //final사용시 수정 불가능!!
		System.out.println(WIDTH*HEIGHT);
		System.out.println(new Card().kind);
	}
	
}

