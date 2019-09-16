<%@page import="vo.BookVO"%>
<%@page import="java.util.List"%>
<%@page import="Service.BookService"%>
<%@page import="Service.BookServiceImpl"%>
<%@page import="dao.BookDAO_Oracle"%>
<%@page import="dao.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="./css/table.css">
<title>book list</title>
</head>
<body>
	<h3>book list</h3>
	<table class="tablea">
	<tr><th>bookid</th><th>bookname</th><th>publisher</th><th>price</th></tr>
	<% 
//	BookDAO dao = new BookDAO_Oracle();
//	BookService service = new BookServiceImpl(dao);
//	List<BookVO> list = service.bookList();
	
	List<BookVO> list = (List<BookVO>)request.getAttribute("booklist"); 
	for(BookVO data:list){

	%>
	<tr><th><%=data.getBookid() %> </th>
	<th><%=data.getBookname() %> </th>
	<th><%=data.getPublisher() %> </th>
	<th><%=data.getPrice() %> </th></tr>
	<%} %>
	</table>
	
</body>
</html>