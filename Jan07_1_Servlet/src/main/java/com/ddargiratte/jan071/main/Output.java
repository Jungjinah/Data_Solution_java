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
	
	// 사용자가 입력한 데이터가 주소에
	// 인터넷 주소에 한글 - X
	//		ㅋ -> %2B%AC (URL인코딩)
	
	// 사용자가 입력한 ㅋ(EUC-KR) -M5949-> %2B%AC
	// 사용자로부터 받아온 %2B%AC -M5949 -> ㅋ
	
	// GET방식 요청파라미터 한글처리
	//	EUC-KR로 맞추자!
	//	Tomcat server.xml 에서 설정도 바꿨음
	
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request.setCharacterEncoding("EUC-KR"); // 아래방식과 같이 쓸 수 있는데 여기선 안먹힘,,
		// 클라이언트가 서버에게 euc-kr로 요청할때 
		response.setCharacterEncoding("EUC-KR");	// 클라이언트가 요청한걸 서버가 받을테니 클라이언트 너도 "euc-kr"로 보내!
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
	
	// GET방식요청 vs POST방식요청
	// GET : 요청파라미터에 주소가 있음
	// 		 대부분 GET방식 사용 o
	// POST : 요청파라미터에 주소가 없고, 내부적으로 전달
	//		  보안성 높음 - 로그인, 회원가입 등에 이용
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		
		response.setCharacterEncoding("EUC-KR");	// 클라이언트가 요청한걸 서버가 받을테니 클라이언트 너도 "euc-kr"로 보내!
		
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








