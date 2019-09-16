<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="css/prob1.css">
<link rel="stylesheet" href="css/table.css">
<link rel="stylesheet" href="css/button.css">
<link rel="stylesheet" href="css/mycss.css">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@include file="../common/header.jsp" %>
<div id = "output">
<section>
<h3>book list</h3>
	<table class="tablea">
	<tr><th>bookid</th><th>bookname</th><th>publisher</th><th>price</th></tr>

<c:forEach var="data" items="${booklist}"> <!-- el표현식으로 작성해서 서블릿에서 넘겨주지 못하기 때문에 서블릿도 el표현식으로 바꿔서 작성해야한다. -->

<tr>
	<td>${data.bookid}</td>
	<td>${data.bookname}</td>
	<td>${data.publisher}</td>
	<td>${data.price}</td>
</tr>

</c:forEach>

	</table>

</section>
<%@include file="../common/footer.jsp" %>

</body>
</html>