<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- jstl/core 자바스크립트 라이브러리중 핵심적인 라이브러리를 의미한다. -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test el foreach</title>
</head>
<body>
	<%
		String[] names = {"홍길동","고길동"};
		request.setAttribute("listname", names);
	
	%>
	
	<c:forEach var="data" items="${listname}">
		<h3> ${data} </h3>
	
	</c:forEach>
	
	<hr>
	
	<c:foreach begin="1" end="9" step="2" var="data"> <!-- for루프를 표현함 -->
		${data}
	</c:foreach>
	
	<%-- <%=request.getAttribute("listname") %> --%>
	
	
	
	
	
	<hr>
	${listname} <!-- 이런표현식을 el표현식이라고 한다. -->
	
	<hr>
	${2+3+6}
	<hr>
	${2 lt 3} <!-- lt는 비교연산자이다 -->
	<hr>
	<%=request.getParameter("id") %>
	<hr>
	${param.name} <!-- param은 name을 받아오는 역할을 한다. --> 
	<hr>
	
	

</body>
</html>