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

/* ���
 *		�Ϲ����� ��� (��û�ϸ� �� ���°�) - HTTP ���
 *		�ǽð� ��� (���� �� ���°�) - Socket ���
 *
 * ���� - ���񽺸� �����ϴ� ��ǻ�� 
 *
 * Ŭ���̾�Ʈ - ���񽺸� �̿��ϴ� ��ǻ��
 * 
 * IP�ּ� - ��Ʈ��ũ ����� �� �� ����ϴ� ��ȭ��ȣ ����
 *		Ȯ�� : ���� - cmd - ipconfig
 *			192.168.1.42
 *
 * ��Ʈ��ȣ - ���� ���� �̿��Ϸ�..
 * 		 0 - 65535
 * 		 ������ : 80��
 * 		 �̹� ��ӵ� ��Ʈ��ȣ�� �־ 4�ڸ��� ���� (������ Ŭ���̾�Ʈ�� ������)
 */
// <������>
public class SSMain {
	public static void main(String[] args) {
		ServerSocket ss = null;				 // ��Ʈ��ȣ �׸� ����� (ServerSocket)
		try {
			// ���ϼ��� ����
			// ��밡 ��Ʈ��ȣ (��밡 ������ 4�ڸ�)
			ss = new ServerSocket(8899);		
			System.out.println("...");		// ����Ǳ� �������� �ߴ� ���� Ȯ��	
			
			Socket s = ss.accept();  		// ���������� ��밡 �����Ѵٴ� �۾�
			System.out.println("�����!");	// ��밡 �������� �� �˸��� ��Ʈ
			
			Scanner key = new Scanner(System.in);						 // �Է��� �� �ְ�
			OutputStream os = s.getOutputStream();						  	
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);	// 48.49.50 ���� bw�� ����� ���� �۾�			 
															// bw�� server�� �޼����� write(������) ���� �۾�
			InputStream is = s.getInputStream();						 
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");	 // utf-8 : �ܱ� �������������
			BufferedReader br = new BufferedReader(isr);				 // ���ڵ� ��ȯ ���� ������ ��ȸ�� �� �ִ�.		
			
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
							jta.append("ȿ��] " + br.readLine() + "\r\n");
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			};
			
			t.start();
			while (true) {
				System.out.print("����] ");
				String msg = key.next();			// �޼��� �� �� �ְ� ����
				bw.write(msg + "\r\n");				// �޼��� ���Ϳ���(\r\n) / bw.write�� �޼��� ������
				jta.append("����]" + msg + "\r\n");	// â�� �޼����� ���� ���� �۾�		
				bw.flush();							// flush : ���� ���ۿ� ����Ǿ� �ִ� ������ Ŭ���̾�Ʈ�� �����ϰ� ���۸� ����.
			}										//  -> �ѹ��� ���ٴ� ����,,
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
