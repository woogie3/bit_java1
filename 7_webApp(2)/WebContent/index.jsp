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
<h3> menu를 클릭하세요</h3>

<p><a href="./login.jsp">login</a></p>
<p><a href="./logout.do">logout</a></p>
<p><a href="./bookform.jsp">도서등록</a></p>
<p><a href="./listBook.do">도서목록</a></p>

</section>
<%@include file="../common/footer.jsp" %>

</body>
</html>