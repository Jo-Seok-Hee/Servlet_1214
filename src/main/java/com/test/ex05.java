package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class ex05 extends HttpServlet{
	 
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter(); 
		
		
		
		
		
		
	}
}
