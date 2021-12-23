package com.ddargiratte.dec231.main;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.ddargiratte.dec2244.HttpClient.DdargiratteHttpClient;

// ID : _Udq0ues32VYk_0WHpUD
// Secret : f3n8fPd4n0

// 인터넷 주소 체계
//		한글, 특수문자가 바로 들어가면 안됨
//		ex) ㅋ -> %2D (URL 인코딩)

// 프로토콜:// (http, https) - 통신방식
//		컴퓨터의 주소/
//		폴더명/폴더명/../파일명

// https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%A7%91%EC%9D%84%EC%95%84&oquery=%EC%A7%84%EC%95%84&tqi=hNdfDwprvTossiG4R1hssssstRs-472408
// 		변수=값&변수=값&변수=값&...
//			-> 요청 파라미터 : 클라이언트가 서버에게 공개적으로 전달할 정보

public class NaverNewsMain {
	public static void main(String[] args) {
	
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("검색어 : ");
			String search = k.next();	// 여기서 next뒤에 line 넣으면 '피자 치킨' 이렇게 띄어쓰기 인식 가능함!
			// 검색어를 URL 인코딩하기
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);
			
			String address = "https://openapi.naver.com/v1/search/news.xml";
			address += "?query=" + search;		// ?는 왜 쓰나? -> 
			
//			// InputStream is = DdargiratteHttpClient.download(address);
//			
//			URL u = new URL(address);
//			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
//			
//			// 요청 헤더
//			huc.addRequestProperty("X-Naver-Client-Id", "_Udq0ues32VYk_0WHpUD");
//			huc.addRequestProperty("X-Naver-Client-Secret", "f3n8fPd4n0");
//			InputStream is = huc.getInputStream();
//			
//			String t = DdargiratteHttpClient.convert(is, "UTF-8");
//			System.out.println(t);
/////////////////////////////////////////////////////////////////////////////////////////////
			
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("X-Naver-Client-Id", "_Udq0ues32VYk_0WHpUD");
			headers.put("X-Naver-Client-Secret", "f3n8fPd4n0");
			InputStream is = DdargiratteHttpClient.download(address, headers);
//			String t = DdargiratteHttpClient.convert(is, "UTF-8");
//			System.out.println(t);
////////////////////////////////////////////////////////////////////////////////////////////
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			
			boolean data = false;
			
			String t = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					if (tagName.equals("item")) {
						data = true;
					}
				}else if (type == XmlPullParser.TEXT) {
					if (data) {
						if (tagName.equals("title")) {
							t = xpp.getText();
							t = t.replace("<b>", "");
							t = t.replace("</b>", "");
							System.out.printf("제목 : %s\n", t);
						} else if (tagName.equals("description")) {
							t = xpp.getText();
							t = t.replace("<b>", "");
							t = t.replace("</b>", "");
							t = t.replace("&amp;", "&");
							t = t.replace("&quot;", "");
							System.out.printf("내용 : %s\n", t);
							System.out.println("=========================");
						}
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

// ctrl + n => xml 치고 xmlFile => 이름 아무거나 지정하고.xml => 맨 아래 source편으로 가서 이 페이지에서 나온 주소를 컨트롤 c 해서 붙여넣기
// ctrl + shift + f 치면 좌르륵 코드 나옴!






