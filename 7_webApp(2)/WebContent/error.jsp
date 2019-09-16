<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isErrorPage="true" %> <!-- 이 페이지는 오직 에러만을 핸들링 할 페이지라는걸 알려줌 -->  
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
<h3>error page</h3>
	<h4 style="color: red;"> 서버 점검중입니다. 다음에 이용해주세요. </h4>
	<div style="color: red;"> <%=exception %></div> <!-- 이렇게 사용시에 해킹에 위험우려가 있다. -->
	<div style="color: red;"> ${exception}</div>

</section>
<%@include file="../common/footer.jsp" %>

</body>
</html>