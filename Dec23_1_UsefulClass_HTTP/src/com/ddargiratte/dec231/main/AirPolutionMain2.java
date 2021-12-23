package com.ddargiratte.dec231.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.ddargiratte.dec2244.HttpClient.DdargiratteHttpClient;

// 미세먼지 -> 파싱 -> 값들을 -> txt파일에 담기
// yyyy-MM-dd-a-hh E
// 측정 구, 미세먼지, 초미세먼지, 오존, 통합대기환경지수
// [날짜, 측정 구, 미세먼지, 초미세먼지, 오존, 통합대기환경지수
// 날짜, 측정 구, 미세먼지, 초미세먼지, 오존, 통합대기환경지수
// 날짜, 측정 구, 미세먼지, 초미세먼지, 오존, 통합대기환경지수
// 날짜, 측정 구, 미세먼지, 초미세먼지, 오존, 통합대기환경지수
// 이런식으로 txt파일 나오게!

public class AirPolutionMain2 {
	public static void main(String[] args) {
		
		System.out.println("****************");
		System.out.println("서울시 권역별 실시간 대기환경 현황");
		System.out.println("****************");

		BufferedWriter bw = null;
		try {
			String address =
				 "http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/RealtimeCityAir/1/25/";    // 1/25/ => 25개를 가져오겠다.
			InputStream is = DdargiratteHttpClient.download(address);
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-a-hh E");
			String s1 = sdf.format(now);
			
			FileWriter fw = new FileWriter("C:\\Users\\wtime\\Desktop\\test\\weather.txt");
			bw = new BufferedWriter(fw);
			
			
			while (type != XmlPullParser.END_DOCUMENT) {								
				if(type == XmlPullParser.START_TAG) {									
					tagName = xpp.getName();
				}else if (type == XmlPullParser.TEXT) {
					
					if (tagName.equals("MSRSTE_NM")) {	
						bw.write(s1 + " ");
						System.out.print(s1 + ", ");
						System.out.printf("%s, ", xpp.getText());	
						bw.write(xpp.getText()+ ",");
					}else if (tagName.equals("PM10")) {														
						System.out.printf("%s㎍/㎥, ", xpp.getText());			
						bw.write(xpp.getText()+ ",");
					}else if (tagName.equals("PM25")) {									
						System.out.printf("%s㎍/㎥, ", xpp.getText());
						bw.write(xpp.getText()+ ",");
					}else if (tagName.equals("03")) {
						System.out.printf("%ssppm, ", xpp.getText());
						bw.write(xpp.getText()+ ",");
					}else if (tagName.equals("ARPLT_MAIN")) {
						System.out.printf("%s\n", xpp.getText());
						bw.write(xpp.getText()+ "\n");
						bw.write("======================\n");
						System.out.println();
					}
					
				}else if (type == XmlPullParser.END_TAG) {
					tagName = "";	// 빈값을 넣는 이유 : Xml에서 띄어쓰기를 텍스트로 인식하는 경우가 있음
				}
				xpp.next(); // 다음걸로 넘어감
				type = xpp.getEventType();	// 다음 태그의 값을 가짐
				bw.flush();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
