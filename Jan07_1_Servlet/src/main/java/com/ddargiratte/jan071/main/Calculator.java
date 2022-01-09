package com.ddargiratte.jan071.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("EUC-KR");
		// Ŭ���̾�Ʈ�� ������ ��û�Ķ���� �� �б�
		int x = Integer.parseInt(request.getParameter("x"));	// -> ���ڿ��� ���������� ��ȯ�ϰԵ�!
		int y = Integer.parseInt(request.getParameter("y"));	// -> ���ڿ��� ���������� ��ȯ�ϰԵ�!
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>gugudan</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<table border='1'>");
		out.print("<tr><th>��Ģ����</th></tr>");
		out.printf("<tr><td><br>%d + %d = %d <br></td></tr>", x, y, x + y);
		out.printf("<tr><td><br>%d - %d = %d <br></td></tr>", x, y, x - y);
		out.printf("<tr><td><br>%d �� %d = %d <br></td></tr>", x, y, x * y);
		out.printf("<tr><td><br>%d �� %d = %d <br></td></tr>", x, y, x / y);
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}