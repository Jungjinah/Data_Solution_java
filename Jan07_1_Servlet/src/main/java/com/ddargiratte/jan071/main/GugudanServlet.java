package com.ddargiratte.jan071.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GugudanServlet")
public class GugudanServlet extends HttpServlet {
       	
	// ���ͳ� �ּ� ü��
	//	 http or https://  - ��������(��Ź��)
	//	 IP�ּ� or ������	   - ��ǻ���� �ּ�
	// 	 :��Ʈ��ȣ (�ݷ��̶� ���� �ּ� ���� ����)	  	- 80���̸� ������ ����
	//	 /������(����)/������(����)/.../���ϸ�	- ���⿡ ��û	-> ������� '�ּ�'��� ��
	//	 ?(������)
	//	 ������=��&������=��&������=��... - ��û�Ķ����
	//		-> Ŭ���̾�Ʈ�� �������� ������ ����

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Ŭ���̾�Ʈ���� �������� ���� ����� �Ἥ ���ڵ��ߴ��� �˷����! (�׻�!)
		response.setCharacterEncoding("EUC-KR");
		// Ŭ���̾�Ʈ�� ������ ��û�Ķ���� �� �б�
		String dansu = request.getParameter("dansu"); // ?dansu=3 (�̷������� �о���ڴ�!)
		int dansu2 = Integer.parseInt(dansu);	// -> ���ڿ��� ���������� ��ȯ�ϰԵ�!
		
		int to = Integer.parseInt(request.getParameter("to")); // ?dan=3&to=2 (����� ������)
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>gugudan</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<table border='1'>");
		out.printf("<tr><th>%d��</th></tr>", dansu2);
		for (int i = 2; i < to; i++) {
				out.printf("<tr><td><br>%d x %d = %d <br></td></tr>", dansu2, i, dansu2 * i);
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
