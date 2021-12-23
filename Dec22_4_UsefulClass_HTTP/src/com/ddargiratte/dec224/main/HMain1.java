package com.ddargiratte.dec224.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// ���
//	HTTP��� - Ŭ���̾�Ʈ�� ��û�� �ϸ� ������ �� ��û�� �°� ����
//	Socket��� - �ǽð���� (�� �����ʹ� ������� ������ ���۰���)

// Java���� HTTPClient ����� ������. -> �׷��� ������ �߾�� �ߴ���,,
// �ٸ� �����ڰ� �����ؼ� ������ �س��� ������
// ���� ���������� �� ���� �˴ϴ�!

// apache.org - httpcomponents - download 4.5.13.zip (binary)

public class HMain1 {
	// ������ ����
	public static void main(String[] args) {
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();
			
			// ������ �ؼ� ��û (Ŭ���̾�Ʈ�� �������� ��û) - 2�������[GET���(�⺻), POST���]
			HttpGet hg = new HttpGet("https://www.naver.com/");
			
			// ����
			HttpResponse hr = dhc.execute(hg);
			
			// ���� ����
			HttpEntity he = hr.getEntity();
			
			// �� ������ ������ �� �ִ� ���� �����
			InputStream is = he.getContent();		// he�� �ִ� ������ �̾ư��ڴ�
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
