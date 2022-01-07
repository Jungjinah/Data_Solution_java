package com.ddargiratte.jan065.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DdargiratteServlet")
public class DdargiratteServlet extends HttpServlet {
    
	// GET방식 요쳥(기본) 받으면
	// 주소를 알고 있어서 직접 타이핑해서 접속 o
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// 랜선에 붙어있는 응답용 빨대 (PrintWriter)
//			PrintWriter out = response.getWriter();
//			out.print("<html>");
//			out.print("<head><title>Hello!</title><meta charset='euc-kr'></head>");
//			out.print("<body>");
//			for (int i = 0; i < 5; i++) {
//				out.print("<marquee>Hello!</marquee>");
//			}
//			out.print("</body>");
//			out.print("</html>");
			//<예제> 웹에서 실행해보고싶다!
			// 실행했을때.. 주소창 파라미터 lang의 값으로
			// korean을 입력하면 '네'
			// english를 입력하면 'yes'
			// 그 외에는 '몰라'
			
			// 클라이언트에게 서버측이 무슨 방식을 써서 인코딩했는지 알려줘야(항상!)
			response.setCharacterEncoding("EUC-KR");
			
			// 변수명=값&변수명=값&...
			String language = request.getParameter("lang");	// lang이라는 파라미터를 요구한다.
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<head><title>asdf</title><meta charset='EUC-KR'></head>");
			out.print("<body");
			out.print("<h1>");
			if (language.equals("korean")) {
				out.print("네");
			} else if (language.equals("english")) {
				out.print("yes");
			} else {
				out.print("몰라");
			}
			out.print("</h1>");
			out.print("</body>");
			out.print("</html>");
	
	
	}
	
	// POST방식 요청 받으면
	// 프로그램을 통해서만 가능 (계정의 비밀번호 같이 주소값에 숨기고 싶은것들...)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
