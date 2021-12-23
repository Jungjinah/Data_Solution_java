package com.ddargiratte.dec224.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Java에 HTTP통신기능이 생겼음! -> HTTPClient 필요없음,,ㅎㅎ

// http
// https -> 보안차이인데 https가 더 보안이 세.

public class HMain2 {
	public static void main(String[] args) {
		try {
			String address = "https://www.naver.com";
			URL u = new URL(address);
			HttpURLConnection huc = (HttpURLConnection) u.openConnection(); // 형변환
			
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String line = null;
			while ((line=br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
