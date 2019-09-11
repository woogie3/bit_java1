package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.Book;
import vo.Department;

public class BookDao_test {
	//Department 테이블의 모든 레코드정보
	
		public List<Book> getAllBookRec() {
			String sql = "select * from Book order by bookid";
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			List<Book> list = new ArrayList<Book>();
			try {
				System.out.println("**********con할당*********");
				con = JDBCUtil.getConnection();
				ps = con.prepareStatement(sql);
				// ? 세팅
				
				//실행 및 결과값 핸들링
				rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new Book(rs.getInt("bookid"), //department안에 정보를 list에 추가해야한다.
								   rs.getString("bookname"),
								   rs.getString("publisher"),
								   rs.getInt("price")));
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, rs);
				System.out.println("**********con반납*********");
			}
			return list;
		
		
		}
		
		
		//Department 테이블의 업데이트
		public int updateBook(Book book){

			String sql = "update Book set bookname = ?,  publisher = ?, price = ? where bookid = ?";
			Connection con = null;
			PreparedStatement ps = null;
			int result = 0;
			
			try {
				con = JDBCUtil.getConnection();
				ps = con.prepareStatement(sql);
				// ? 세팅
				ps.setString(1, book.getBookName());
				ps.setString(2, book.getPublisher());
				ps.setInt(3, book.getPrice());
				ps.setInt(4, book.getBookId());
				//실행 및 결과값 핸들링
				result = ps.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, null);
			}
			
			return result;
		}
		
//		Department 테이블에 정보삽입
		public int insertBook(Book book) {

			String sql = "insert into Book(bookid,bookname,publisher,price) values(?,?,?,?)";
			Connection con = null;
			PreparedStatement ps = null;
			int result = 0;
			
			try {
				con = JDBCUtil.getConnection();
				ps = con.prepareStatement(sql);
				// ? 세팅
				ps.setInt(1, book.getBookId());
				ps.setString(2, book.getBookName());
				ps.setString(3, book.getPublisher());
				ps.setInt(4, book.getPrice());
				
				
				//실행 및 결과값 핸들링
				result = ps.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, null);
			}
			return result;
			
		}
		public int deleteBook(Book book) {

			String sql = "delete from book where lower(bookname) like ? ";
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			int result = 0;
			
			try {
				con = JDBCUtil.getConnection();
				ps = con.prepareStatement(sql);
				// ? 세팅
				ps.setString(1, "%"+book.getBookName().toLowerCase()+"%");
			
				
				//실행 및 결과값 핸들링
				rs = ps.executeQuery();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(con, ps, rs);
			}
			return result;
			
		}
	}


