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
			s = new Socket("192.168.1.46", 8899);	// ip�ּҴ� �����쿡 cmd �ļ� 'ipconfig' ħ
			System.out.println("�����!");
			
			Scanner key = new Scanner(System.in);
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			while (true) {
				System.out.printf("ȿ��] %s\n", br.readLine());
			
				System.out.print("����] ");
				String msg = key.next();
				bw.write(msg + "\r\n");
				bw.flush();
			}
			
		} catch (Exception e) {						
			e.printStackTrace();
		}
		
		
	}
}
