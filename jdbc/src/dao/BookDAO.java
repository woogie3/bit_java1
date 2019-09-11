package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.BookVO;
/*
 *  DAO로 시작한다면 DB를 연동해 프로젝트를 진행하는데 정해진? 프로토콜? 규칙같은거다. 
 *  프로그래머들이 프로젝트에 들어갈시 DB를 연동해야하기에 _DAO,_SERVICE,_VO는
 *  항상 DB를 연동하고 있다는것을 염두해두자!! 
 *  
 *  반드시 DB를 연동하기 위해서는 DAO를 거쳐야 한다.
 *  
 *  serviceimpl는 서번트객체(server)에서 사용되기에 함부로 이름을 변경하면 안된다.
 *  
 *  Data access Layer < - > Data service Layer < - > Clients Layer
 *  DAO(재료들 & ETC),VO		SERVICE(=ex.메뉴판)		 APP(=ex.메뉴에만 있는 음식)
 */
public abstract class BookDAO {//상속을 강조하기위해 abstract추가
	
	public List<BookVO> getBookRec(){
		
		return null;
	}
	
	public int insertBook(BookVO vo) {
		
		return 0;
	}
	
	
	public int updateBook(BookVO vo) {
		
		return 0;
	}
	
	public int deleteBook(int bookid) {
		
		return 0;
		
	}
	
	/*
	 * INSERT INTO Book(bookid, bookname, publisher, price)
	 * VALUES(?,?,?,?);
	 * 
	 * delete from book where bookid = ?;
	 * 
	 * UPDATE Book SET proce = ? WHERE bookid = ?;
	 * 
	 * 
	 * select * from (  
				"select rownum row#, bookid, bookname, publisher, price "
				 "from (select * from dept order by deptno) "  
				) where row# between ? and ?
				
				select * from Book order by bookid
				
				select count(*) from book;
	 */
	

}
