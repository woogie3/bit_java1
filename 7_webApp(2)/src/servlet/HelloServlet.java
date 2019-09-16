package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet({ "/hello", "/hello.do" })
@WebServlet(urlPatterns = { "/hello", "/hello.do" },loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
        System.out.println("HelloServlet() 객체생성");
    }

	public void init(ServletConfig config) throws ServletException { //초기화
		System.out.println("init() 호출");
	}

	public void destroy() { //자원반납
		System.out.println("destroy() 호출");
	}
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8"); //encoding 타입을 변경해서 한글을 출력 가능하게함
//		System.out.println("doGet() 호출");
		System.out.println("service() 호출");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		out.print("<h1> HelloServlet Page 입니다.</h1>");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		out.print("<h1> "+ name +"||" + id +"</h1>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");	//post()함수에서는 꼭 request에 인코딩 타입을 UTF-8로 변경해서 한글을 적용시킬수있다.
		
		System.out.println("doPost() 호출");
		
		response.getWriter().append("Served at: ").append(request.getContextPath()); //request.getContextPath()는  7_webApp에서 받은 값을 경로로 잡는
		PrintWriter out = response.getWriter();
		out.print("<h1> HelloServlet Page 입니다.</h1>");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		out.print("<h1> " + name +"||" + id +" </h1>");
	}
	

}
