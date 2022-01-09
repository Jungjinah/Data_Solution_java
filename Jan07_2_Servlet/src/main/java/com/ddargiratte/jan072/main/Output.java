package com.ddargiratte.jan072.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Output")
public class Output extends HttpServlet {
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//	
//	
//	
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("EUC-KR");
		response.setCharacterEncoding("EUC-KR");
		
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String pwa = request.getParameter("PWA");
		String gd = request.getParameter("Gd");
		String lc = request.getParameter("LC");
		String[] hb = request.getParameterValues("HB");
		String ind = request.getParameter("IND");
		
		// textarea���� ����ģ �� : \r\n
		// ������������ �ٹٲ۰� : <br>
		ind= ind.replace("\r\n", "<br>");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>����<meta charset='EUC-KR'></title></head>");
		out.print("<body>");
		out.print("<h1>���԰��</h1>");
		out.printf("<h2>ID : %s </h2>", id);
		out.printf("<h3>PW : %s </h3>", pw);
		out.printf("<h31>PW : %s </h31>", pwa);
		out.printf("<h4>���� : %s </h4>", gd);
		out.printf("<h5>���� : %s </h5>", lc);
		if (hb != null) {		// ��̸� �������� �ʾ������� ����ؼ�
			out.print("<h2>��� : ");
			for (String s : hb) {		// �迭 ��� �ϳ��� Ǯ��
				out.print(s + " ");
			}
			out.print("</h2>");
		}
		out.printf("<h2>�ڱ�Ұ� : %s</h2>", ind);
		out.print("</body>");
		out.print("</html>");
	}

}