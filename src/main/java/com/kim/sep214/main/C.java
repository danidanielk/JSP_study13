package com.kim.sep214.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/C")
public class C extends HttpServlet {
	//어떤 싸이트에 첫 접속 : 요청방식은 무조건 GET 방식
	//만약에 V1.html에서 버튼을 눌렀을때 Get 방식을 써야한다면?
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청파라미터 명이 없으면 이 사이트 첫 접속을 GET방식으로
		if(!request.getParameterNames().hasMoreElements()) {
			request.getRequestDispatcher("V1.html").forward(request, response);
		//요청파라미터 명이 있으면 - 사이트의 기능활용을 get방식으로 아..ㅆ 뭔소린가..
		}else {
			M.multiply(request);
			request.getRequestDispatcher("V2.jsp").forward(request, response);
		}
			
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
