<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- html 주석 -->
	<%-- jsp 주석 : 페이지 소스보기에는 안보임 jsp는 서버처리 --%>
	
	
	<%
		// 1~10까지 합
		int sum = 0;
		for(int i = 1; i <= 10; i++){
			sum = sum + i;
		}
	%>
	
	합계 : <strong><%= sum %> </strong>
	
	<% 
		List<String> animals = new ArrayList<>();
		animals.add("dog");
		animals.add("cat");
	%>
	
	<%=animals.get(0) %>
	<%=animals.get(1) %>
</body>
</html>