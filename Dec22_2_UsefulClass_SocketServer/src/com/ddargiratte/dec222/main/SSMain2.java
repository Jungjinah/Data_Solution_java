package com.ddargiratte.dec222.main;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// <Ŭ���̾�Ʈ��>
public class SSMain2 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(8899);
			System.out.println("����ƴٸ�~");
			
			Socket s = ss.accept();
			System.out.println("��ٸ�����...");
			
			Scanner key = new Scanner(System.in);
			OutputStream os = s.getOutputStream(); // socket�� �ִ°��� �������Ե�
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			while (true) {
				System.out.print("���ƾ�] ");		
				String msg = key.next();
				bw.write(msg + "\r\n");
				bw.flush();						   // ����� ������ �Ҿ �������� �ϴ� �۾�
			}
		
		} catch (Exception e) {
			e.printStackTrace();
			try {	 							 // ss.close(); �� catch�� ���� ���ִ� ����
				ss.close();						 // -> ������ ���� ���ο� catch�� �־��ֱ�!
			} catch (Exception e2) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
