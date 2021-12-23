package com.ddargiratte.dec223.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SCMain {
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("192.168.1.46", 8899);	// ip주소는 윈도우에 cmd 쳐서 'ipconfig' 침
			System.out.println("연결됨!");
			
			Scanner key = new Scanner(System.in);
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			while (true) {
				System.out.printf("효섭] %s\n", br.readLine());
			
				System.out.print("진아] ");
				String msg = key.next();
				bw.write(msg + "\r\n");
				bw.flush();
			}
			
		} catch (Exception e) {						
			e.printStackTrace();
		}
		
		
	}
}
