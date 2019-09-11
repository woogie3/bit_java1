package test;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import Service.BookService;
import Service.BookServiceImpl;
import dao.BookDAO;
import dao.BookDAO_MySql;
import vo.BookVO;

public class Test11_BookService {

	BookService service = null;
	
	@Before
	public void setup() {//실행되기전에 설정을 잡아주는것
		System.out.println(" setUp() 수행 ");
		BookDAO dao = new BookDAO_MySql();
		service = new BookServiceImpl(dao);
		
	}
	
	@After
	public void tearDown() {
		service = null;
		System.out.println("==========tearDown()호출==============");
	}
	
//	@Test
	public void list() {//간단하게 테스트하기위해 사용함, main함수를 만들지 않고한다.
		System.out.println("=============== Book List ===============");
		service.bookList().forEach(i -> System.out.println(i));
		System.out.println("=========================================");
	}
	
//	@Test
	public void insert(BookVO vo) {
		vo.setBookid(5);
		vo.setBookname("~~~~~~");
		vo.setPublisher("영진");
		vo.setPrice(9000);
		
		int num = 0;
		try {
			num = service.addBook(vo);
		} catch (Exception e) {
			
		}
		if (num > 0) System.out.println("등록성공");
		else {
			System.out.println("실패");

		}
		
	}
//	@Test
	public void update() {
		BookVO vo = new BookVO();
		vo.setBookid(3);
		vo.setPrice(9900);
		
		service.updateBook(vo);
		
	}
	@Test
	public void delete() {
		service.deleteBook(6);
	}

}
