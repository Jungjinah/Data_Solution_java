package com.ddargiratte.dec224.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// 통신
//	HTTP통신 - 클라이언트가 요청을 하면 서버가 그 요청에 맞게 응답
//	Socket통신 - 실시간통신 (내 의지와는 상관없이 강제적 전송가능)

// Java에는 HTTPClient 기능이 없었음. -> 그래서 개발을 했어야 했눈데,,
// 다른 개발자가 개발해서 공개를 해놨음 ㅎㅅㅎ
// 남이 만들어놓은거 잘 쓰면 됩니다!

// apache.org - httpcomponents - download 4.5.13.zip (binary)

public class HMain1 {
	// 서버에 접속
	public static void main(String[] args) {
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();
			
			// 접속을 해서 요청 (클라이언트가 서버에게 요청) - 2가지방법[GET방식(기본), POST방식]
			HttpGet hg = new HttpGet("https://www.naver.com/");
			
			// 응답
			HttpResponse hr = dhc.execute(hg);
			
			// 응답 내용
			HttpEntity he = hr.getEntity();
			
			// 그 내용을 가져갈 수 있는 빨대 만들기
			InputStream is = he.getContent();		// he에 있는 내용을 뽑아가겠다
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
