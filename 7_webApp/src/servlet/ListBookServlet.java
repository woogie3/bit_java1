package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.BookService;
import Service.BookServiceImpl;
import dao.BookDAO;
import dao.BookDAO_Oracle;
import vo.BookVO;

/**
 * Servlet implementation class ListBookServlet
 */
@WebServlet("/listBook.do")
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		System.out.println("/listBook.do");
		
		BookDAO dao = new BookDAO_Oracle();
		BookService service = new BookServiceImpl(dao);
		List<BookVO> list = service.bookList();
		
		request.setAttribute("booklist", list); //booklist라는 request객체를 받음
		String view  = "/temp.jsp"; //booklist 정보를 받을 페이지
		
		getServletContext().getRequestDispatcher(view).forward(request, response);//view페이지로 제어권을 위임한다.
		
		
		
//		PrintWriter out = response.getWriter();
//		
//		for(BookVO data :list) {
//			out.print("<h3>"+data.getBookid()+"</h3>");
//			out.print("<h3>"+data.getBookname()+"</h3>");
//			out.print("<h3>"+data.getPublisher()+"</h3>");
//			out.print("<h3>"+data.getPrice()+"</h3>");
//			
//		}
		
	}

}
