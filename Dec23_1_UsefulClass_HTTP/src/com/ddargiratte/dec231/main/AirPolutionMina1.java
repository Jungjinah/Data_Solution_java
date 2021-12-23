package com.ddargiratte.dec231.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.ddargiratte.dec2244.HttpClient.DdargiratteHttpClient;
import com.sun.org.apache.xerces.internal.xni.parser.XMLPullParserConfiguration;

/* 웹서버 (클라이언트가 웹사이트에 요청 -> 사이트가 응답)
 * 실시간 데이터를 XML Parsing -> AJAX (클라이언트가 데이터를 요청 -> XML/SJON 응답)
 *	웹으로 이미지화해서 구현
 *		data.seoul.co.kr
 *		data.naver.com
 *		dav.kakao.com
 *		...
 *
 * 서울 열린데이터광장 DB - 미세먼지 데이터
 *
 * DB에 있는 데이터를 사람들에게 보여줘야 하는 경우
 *	대부분의 사람들이 SQL을 할 줄 모르죠...?
 *	SO, 웹사이트 : 보통 사람들이 DB쓰기 편하게~
 *
 * 어떤 개발자가 데이터만 가져오고 싶음
 * 데이터를 특정한 형식으로 표현헤줘야
 * DB에 있는 데이터를 표현하는 형식 : XML, JSON (두가지 존재함)
 * 
 * Parsing(가공하는 방식) - kxm12.jar(Parsing을 사용하기 위해 / 안드로이드에는 내장 o)
 *	필요없는 데이터는 걷어내고, 원하는 형태로 가공하는..
 *
 * XML
 * 	DB에 있는 데이터를 HML형태로 표현한 것
 * <xxx> : 시작태그 ( xxx : 태그명)
 *     yyy : 이 태그 안에 있는 텍스트
 * </xxx> : 종료태그 (시작과 끝을 알려주는 경계선 같은 아이)
 * 위 3개는 html하면서 많이 쓸거야,, 그리구 3쌍으로 다님!
 */


public class AirPolutionMina1 {
	public static void main(String[] args) {
		System.out.println("****************");
		System.out.println("서울시 권역별 실시간 대기환경 현황");
		System.out.println("****************");

		try {
			String address =
			"http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/RealtimeCityAir/1/25/";
																						// 1/25/ => 25개를 가져오겠다.
			InputStream is = DdargiratteHttpClient.download(address);
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			
			System.out.println(XmlPullParser.START_DOCUMENT);	// 0
			System.out.println(XmlPullParser.START_TAG);		// 1
			System.out.println(XmlPullParser.TEXT);				// 4
			System.out.println(XmlPullParser.END_DOCUMENT);		// 2
			System.out.println(XmlPullParser.END_TAG);			// 3
			// 위에 애들은 고정값이 있어!
			
			while (type != XmlPullParser.END_DOCUMENT) {								
				if(type == XmlPullParser.START_TAG) {									
					tagName = xpp.getName();											
				}else if (type == XmlPullParser.TEXT) {									
					if (tagName.equals("MSRSTE_NM")) {										
						System.out.printf("측정 구 : %s\n", xpp.getText());				
					}else if (tagName.equals("PM10")) {														
						System.out.printf("미세먼지 :  %s㎍\n", xpp.getText());			
					}else if (tagName.equals("PM25")) {									
						System.out.printf("초미세먼지 : %smg/m2\n", xpp.getText());
					}else if (tagName.equals("03")) {
						System.out.printf("오존 : %ssppm\n", xpp.getText());
					}else if (tagName.equals("NO2")) {
						System.out.printf("이산화질소 : %ssppm\n", xpp.getText());
					}else if (tagName.equals("IDEX_NW")) {
						System.out.printf("일산화탄소 : %ssppm\n", xpp.getText());
					}else if (tagName.equals("IDEX_MVL")) {
						System.out.printf("아산화가스 : %ssppm\n", xpp.getText());
					}else if (tagName.equals("ARPLT_MAIN")) {
						System.out.printf("통합대기환경지수 : %ssppm\n", xpp.getText());
						System.out.println("====================");
					}
					
				}else if (type == XmlPullParser.END_TAG) {
					tagName = "";	// 빈값을 넣는 이유 : Xml에서 띄어쓰기를 텍스트로 인식하는 경우가 있음
				}
				xpp.next(); // 다음걸로 넘어감
				type = xpp.getEventType();	// 다음 태그의 값을 가짐
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
