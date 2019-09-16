package servlet;

import java.io.IOException;
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

@WebServlet("/insertBook.do")
public class insertBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		System.out.println("/insertBook.do");
		
		BookDAO dao = new BookDAO_Oracle();
		BookService service = new BookServiceImpl(dao);
		
		BookVO vo = new BookVO();
		vo.setPrice(Integer.parseInt(request.getParameter("price")));
		vo.setBookname(request.getParameter("bookname"));
		vo.setPublisher(request.getParameter("publisher"));
		
		try {
		service.addBook(vo);
		response.sendRedirect("listBook.do");//등록한 책을 리스트에 넣어 출력 redirect는 응답하고 요청이고, sendRedirect는 응답하고 요청하지않는다.
		} catch (Exception e) {
			request.setAttribute("exception", e);
			getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);
		}
		
	}

}
