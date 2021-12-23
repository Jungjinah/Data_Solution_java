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

// ���ͳ� �ּ� ü��
//		�ѱ�, Ư�����ڰ� �ٷ� ���� �ȵ�
//		ex) �� -> %2D (URL ���ڵ�)

// ��������:// (http, https) - ��Ź��
//		��ǻ���� �ּ�/
//		������/������/../���ϸ�

// https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EB%A7%91%EC%9D%84%EC%95%84&oquery=%EC%A7%84%EC%95%84&tqi=hNdfDwprvTossiG4R1hssssstRs-472408
// 		����=��&����=��&����=��&...
//			-> ��û �Ķ���� : Ŭ���̾�Ʈ�� �������� ���������� ������ ����

public class NaverNewsMain {
	public static void main(String[] args) {
	
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("�˻��� : ");
			String search = k.next();	// ���⼭ next�ڿ� line ������ '���� ġŲ' �̷��� ���� �ν� ������!
			// �˻�� URL ���ڵ��ϱ�
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);
			
			String address = "https://openapi.naver.com/v1/search/news.xml";
			address += "?query=" + search;		// ?�� �� ����? -> 
			
//			// InputStream is = DdargiratteHttpClient.download(address);
//			
//			URL u = new URL(address);
//			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
//			
//			// ��û ���
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
							System.out.printf("���� : %s\n", t);
						} else if (tagName.equals("description")) {
							t = xpp.getText();
							t = t.replace("<b>", "");
							t = t.replace("</b>", "");
							t = t.replace("&amp;", "&");
							t = t.replace("&quot;", "");
							System.out.printf("���� : %s\n", t);
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

// ctrl + n => xml ġ�� xmlFile => �̸� �ƹ��ų� �����ϰ�.xml => �� �Ʒ� source������ ���� �� ���������� ���� �ּҸ� ��Ʈ�� c �ؼ� �ٿ��ֱ�
// ctrl + shift + f ġ�� �¸��� �ڵ� ����!






