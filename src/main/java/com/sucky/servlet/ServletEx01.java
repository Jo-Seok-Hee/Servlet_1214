package com.sucky.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx01 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		
		//한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		
		//MIME
		response.setContentType("text/plain");
		out.println("안녕하세요");
		
		
		// 날짜 저장하는 클래스
		Date now = new Date();
		out.println(now);
		
		//formatter 
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String dataString = format.format(now);
		out.println(dataString);
	}
}
