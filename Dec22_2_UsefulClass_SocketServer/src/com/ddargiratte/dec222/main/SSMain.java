package com.ddargiratte.dec222.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/* 통신
 *		일반적인 통신 (요청하면 답 오는거) - HTTP 통신
 *		실시간 통신 (냅다 답 오는거) - Socket 통신
 *
 * 서버 - 서비스를 제공하는 컴퓨터 
 *
 * 클라이언트 - 서비스를 이용하는 컴퓨터
 * 
 * IP주소 - 네트워크 통신을 할 때 사용하는 전화번호 같은
 *		확인 : 시작 - cmd - ipconfig
 *			192.168.1.42
 *
 * 포트번호 - 무슨 서비스 이용하러..
 * 		 0 - 65535
 * 		 웹서비스 : 80번
 * 		 이미 약속된 포트번호가 있어서 4자리로 지정 (서버와 클라이언트가 지정해)
 */
// <서버편>
public class SSMain {
	public static void main(String[] args) {
		ServerSocket ss = null;				 // 포트번호 그릇 만들기 (ServerSocket)
		try {
			// 소켓서비스 시작
			// 상대가 포트번호 (상대가 지정한 4자리)
			ss = new ServerSocket(8899);		
			System.out.println("...");		// 연결되기 직전까지 뜨는 것을 확인	
			
			Socket s = ss.accept();  		// 연결했을때 상대가 수락한다는 작업
			System.out.println("연결됨!");	// 상대가 수락했을 때 알리는 멘트
			
			Scanner key = new Scanner(System.in);						 // 입력할 수 있게
			OutputStream os = s.getOutputStream();						  	
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);	// 48.49.50 줄은 bw를 만들기 위한 작업			 
															// bw는 server가 메세지를 write(보내기) 위한 작업
			InputStream is = s.getInputStream();						 
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");	 // utf-8 : 외국 어느국가에서만
			BufferedReader br = new BufferedReader(isr);				 // 인코딩 변환 없이 문서를 조회할 수 있다.		
			
			JFrame jf = new JFrame();									 
			JTextArea jta = new JTextArea();							 
			jf.add(jta);												 
			jf.setSize(500, 500);										 
			jf.setVisible(true);										 
			Thread t = new Thread() { 									 
				@Override
				public void run() {
					// TODO Auto-generated method stub
					super.run();
					while (true) {
						try {
							jta.append("효섭] " + br.readLine() + "\r\n");
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			};
			
			t.start();
			while (true) {
				System.out.print("진아] ");
				String msg = key.next();			// 메세지 쓸 수 있게 시작
				bw.write(msg + "\r\n");				// 메세지 엔터역할(\r\n) / bw.write는 메세지 보내기
				jta.append("진아]" + msg + "\r\n");	// 창에 메세지를 띄우기 위한 작업		
				bw.flush();							// flush : 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
			}										//  -> 한번에 비운다는 느낌,,
		} catch (Exception e) {
			e.printStackTrace();
			try {
				ss.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
		
	}
	
}
