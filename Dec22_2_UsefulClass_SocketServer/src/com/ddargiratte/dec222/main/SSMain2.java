package com.ddargiratte.dec222.main;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// <클라이언트편>
public class SSMain2 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(8899);
			System.out.println("연결됐다리~");
			
			Socket s = ss.accept();
			System.out.println("기다리세용...");
			
			Scanner key = new Scanner(System.in);
			OutputStream os = s.getOutputStream(); // socket에 있는것을 가져오게따
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			while (true) {
				System.out.print("진아씌] ");		
				String msg = key.next();
				bw.write(msg + "\r\n");
				bw.flush();						   // 빨대로 강제로 불어서 내보내게 하는 작업
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			try {	 							 // ss.close(); 를 catch로 따로 해주는 이유
				ss.close();						 // -> 에러가 떠서 새로운 catch에 넣어주기!
			} catch (Exception e2) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
