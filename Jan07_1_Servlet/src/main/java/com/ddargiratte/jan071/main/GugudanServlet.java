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
       	
	// 인터넷 주소 체계
	//	 http or https://  - 프로토콜(통신방식)
	//	 IP주소 or 도메인	   - 컴퓨터의 주소
	// 	 :포트번호 (콜론이랑 같이 주소 옆에 붙음)	  	- 80번이면 생략이 가능
	//	 /폴더명(상위)/폴더명(하위)/.../파일명	- 여기에 요청	-> 여기까지 '주소'라고 함
	//	 ?(구분자)
	//	 변수명=값&변수명=값&변수명=값... - 요청파라미터
	//		-> 클라이언트가 서버에게 뭔가를 보냄

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트에게 서버측이 무슨 방식을 써서 인코딩했는지 알려줘야! (항상!)
		response.setCharacterEncoding("EUC-KR");
		// 클라이언트가 보내준 요청파라미터 값 읽기
		String dansu = request.getParameter("dansu"); // ?dansu=3 (이런식으로 읽어오겠다!)
		int dansu2 = Integer.parseInt(dansu);	// -> 문자열을 정수형으로 변환하게따!
		
		int to = Integer.parseInt(request.getParameter("to")); // ?dan=3&to=2 (몇까지 곱할지)
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>gugudan</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<table border='1'>");
		out.printf("<tr><th>%d단</th></tr>", dansu2);
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
