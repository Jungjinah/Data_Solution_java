package com.ddargiratte.jan072.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/Output2")
public class Output2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 기존(주황색)방식으로 전송된 파라미터 한글처리
		// request.setCharacterEncoding("EUC-KR");
		
		response.setCharacterEncoding("EUC-KR");
		// 기존(주황색)방식으로 전송된 파라미터 읽기
		// String title =  request.getParameter("Title");
		
		// 파일이 ㅣ업로드 될 서버상의 폴더 절대경로
		String path = request.getServletContext().getRealPath("img");
		System.out.println(path);	// 절대경로의 위치
		
		// 파일 업로드
		MultipartRequest mr = new MultipartRequest(
				request, path,
					// 허용해줄 파일의 최대크기(byte)
					10 * 1024 * 1024,
					// 요청파라미터 인코딩 방식
					"EUC-KR",
					// 사용자가 업로드한 파일명 중복될 때 처리할 수 있는 방법
					// 중복시에 파일명 뒤에 숫자를 넣어!
					new DefaultFileRenamePolicy()
		);
		String title = mr.getParameter("Title");
		
		// 업로드 한 파일명(중복처리된)
		String fileName = mr.getFilesystemName("photo");
		
		// DB에 파일명 저장할때 -> 상당히 여유있게 해야함!!!
		// 		f_name varchar2(200 char)
		
		
		// 톰캣이 한글로 된 파일명을 인식 못함
		// 		ㅋ.png -> %2A.png (URL인코딩이면 인식 o!)
		fileName = URLEncoder.encode(fileName, "EUC-KR");
		
		String fileName2 = mr.getFilesystemName("etc");
		fileName2 = URLEncoder.encode(fileName2, "euc-kr");
		fileName2 = fileName2.replace("+", " ");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.printf("<h1>제목 : %s</h1>", title);
		out.printf("<h1>파일명 : %s</h1>", fileName);
		out.printf("<img src='img/%s'>", fileName2);	// 상대경로 o
		out.printf("<h1>%s</h1>", fileName2);
		out.printf("<a href = 'img/%s'>다운</a>", fileName2);
		out.print("/<body>");
		out.print("</html>");
		
	}

}