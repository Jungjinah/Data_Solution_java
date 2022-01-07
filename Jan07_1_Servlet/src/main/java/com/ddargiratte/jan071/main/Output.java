package com.ddargiratte.jan071.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Output")
public class Output extends HttpServlet {
	
	// ����ڰ� �Է��� �����Ͱ� �ּҿ�
	// ���ͳ� �ּҿ� �ѱ� - X
	//		�� -> %2B%AC (URL���ڵ�)
	
	// ����ڰ� �Է��� ��(EUC-KR) -M5949-> %2B%AC
	// ����ڷκ��� �޾ƿ� %2B%AC -M5949 -> ��
	
	// GET��� ��û�Ķ���� �ѱ�ó��
	//	EUC-KR�� ������!
	//	Tomcat server.xml ���� ������ �ٲ���
	
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.setCharacterEncoding("EUC-KR"); // �Ʒ���İ� ���� �� �� �ִµ� ���⼱ �ȸ���,,
		// Ŭ���̾�Ʈ�� �������� euc-kr�� ��û�Ҷ� 
		response.setCharacterEncoding("EUC-KR");	// Ŭ���̾�Ʈ�� ��û�Ѱ� ������ �����״� Ŭ���̾�Ʈ �ʵ� "euc-kr"�� ����!
		String a = request.getParameter("a");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Input</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<h2>Output-GET</h2>");
		out.printf("<h2>%s</h2>", a);
		out.print("</body>");
		out.print("</html>");
	
	}
	
	// GET��Ŀ�û vs POST��Ŀ�û
	// GET : ��û�Ķ���Ϳ� �ּҰ� ����
	// 		 ��κ� GET��� ��� o
	// POST : ��û�Ķ���Ϳ� �ּҰ� ����, ���������� ����
	//		  ���ȼ� ���� - �α���, ȸ������ � �̿�
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		
		response.setCharacterEncoding("EUC-KR");	// Ŭ���̾�Ʈ�� ��û�Ѱ� ������ �����״� Ŭ���̾�Ʈ �ʵ� "euc-kr"�� ����!
		
		String a = request.getParameter("a");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Input</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<h2>Output-POST</h2>");
		out.printf("<h2>%s</h2>", a);
		out.print("</body>");
		out.print("</html>");
	
	}
}








