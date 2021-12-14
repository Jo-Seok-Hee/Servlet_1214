package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/ex04")
public class ex04 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		//회원 id , 이름 ,이메일 파라미터 받고, 테이블로 보여주기
		
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>회원정보</title></head><body>");
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<th>아이디</th> <td>" + userId + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>이름</th> <td>" + name + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>이메일</th> <td>" + email + "</td>");
		out.println("</tr></table></body></html>");
		
		
		
		
	}	
}
