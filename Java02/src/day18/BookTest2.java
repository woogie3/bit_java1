package day18;
import day16.Book;
import day17.PriceException;
import day17.TitleException;
public class BookTest2 {

	public static void main(String[] args) {
		Book b1 = new Book();
		try {
			b1.setTitle("java");
		} catch (TitleException e) {
			
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		try {
			b1.setPrice(-9000);
		} catch (PriceException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		System.out.println(b1);
		System.out.println("----------------------");
		Book b2 = null;
		
			try {
				b2 = new Book("jsp",-9990);
			} catch (Exception e) {
				System.out.println(e.getMessage());
		
		System.out.println(b2);
	}

	}
	}

