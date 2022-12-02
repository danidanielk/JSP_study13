package com.kim.sep214.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/C")
public class C extends HttpServlet {
	//� ����Ʈ�� ù ���� : ��û����� ������ GET ���
	//���࿡ V1.html���� ��ư�� �������� Get ����� ����Ѵٸ�?
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��û�Ķ���� ���� ������ �� ����Ʈ ù ������ GET�������
		if(!request.getParameterNames().hasMoreElements()) {
			request.getRequestDispatcher("V1.html").forward(request, response);
		//��û�Ķ���� ���� ������ - ����Ʈ�� ���Ȱ���� get������� ��..�� ���Ҹ���..
		}else {
			M.multiply(request);
			request.getRequestDispatcher("V2.jsp").forward(request, response);
		}
			
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
