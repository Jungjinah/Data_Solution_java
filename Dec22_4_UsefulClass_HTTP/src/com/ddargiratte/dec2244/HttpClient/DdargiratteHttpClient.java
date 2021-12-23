package com.ddargiratte.dec2244.HttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

public class DdargiratteHttpClient {

	// <����>
	// ������ ��û�ؼ� ������ �ٿ�ޱ�
	public static InputStream download(String address) throws IOException {
		URL u = new URL(address);
		if (address.startsWith("https")) {
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
			return huc.getInputStream();
		}else {
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			return huc.getInputStream();
		}
	}
	
	// huc.addRequestProperty("X-Naver-Client-Id", "_Udq0ues32VYk_0WHpUD");
	// huc.addRequestProperty("X-Naver-Client-Secret", "f3n8fPd4n0");
	// [], List, Set, Map
	
	// ������ ��û�ؼ� �ٿ�ޱ� (��û ���ó��)
		public static InputStream download(String address, HashMap<String, String> headers) throws IOException {		// ����ó��
				URL u = new URL(address);
				if (address.startsWith("https")) {
					HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
					Set<String> headerName = headers.keySet();
					for (String hn : headerName) {
						huc.addRequestProperty(hn, headers.get(hn));
					}
					return huc.getInputStream();
				}else {
					HttpURLConnection huc = (HttpURLConnection) u.openConnection();
					Set<String> headerName = headers.keySet();
					for (String hn : headerName) {
						huc.addRequestProperty(hn, headers.get(hn));
					}
					return huc.getInputStream();
				}
		}
	
	// �ٿ������ String ���� �ٲٱ�
	public static String convert(InputStream is, String charest) throws IOException {
		InputStreamReader isr = new InputStreamReader(is, charest);
		BufferedReader br = new BufferedReader(isr);
		
		String line = null;
		StringBuffer sb = new StringBuffer();
		
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		return sb.toString();
	}
}
