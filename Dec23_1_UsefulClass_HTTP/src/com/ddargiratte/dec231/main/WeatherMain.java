package com.ddargiratte.dec231.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.ddargiratte.dec2244.HttpClient.DdargiratteHttpClient;

public class WeatherMain {
	public static void main(String[] args) {
		// http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=5011057000
		// hour : 시간
		// temp : 온도
		// wfKor : 날씨
		// wdKor : 바람 방향
		
		try {
			String address =
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=5011057000";
																				// start doucument = 0 / start
			InputStream is = DdargiratteHttpClient.download(address);			// 주어진 주소를 다운로드하여 내 http에 넣은것을 is
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();		// 
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();										
			String tagName = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {					
				// System.out.println(type);								// type에는 뭐가 나오는지 알아보기위한 작업
				if (type == XmlPullParser.START_TAG) {						// start_tag는 맨 앞에 있는 '<내용>' 
					tagName = xpp.getName();								// xpp에 있는 이름들을 tagName이라함
				}else if (type == XmlPullParser.TEXT) {						// text는 검은색 글씨 모두
					if (tagName.equals("hour")) {							// 그래서 그 텍스트가 tagName과 일치하면 hour에 대한 내용 갖고옴
						System.out.printf("시간 : %s시\n", xpp.getText());	// 	시간이랑 온도가 숫자가 아닌이유
					}else if (tagName.equals("temp")) {						// 	-> 데이터를 그대로 가져왔기 때문에
						System.out.printf("온도 : %s℃\n", xpp.getText());	// 	-> 그래서 parsing 배우는거야! (형변환)
					}else if (tagName.equals("wfKor")) {
						System.out.printf("날씨 : %s\n", xpp.getText());
					}else if (tagName.equals("wdKor")) {
						System.out.printf("바람 방향 : %s향\n", xpp.getText());
						System.out.println("=====================");
					}
				}else if (type == XmlPullParser.END_TAG) {					// End_tag는 맨 뒤 있는 '<내용>'
					tagName = "";											// 이게 띄어쓰기로 나올 수 있으니 '빈'걸로 처리
				} 
				xpp.next();													// xpp 이어나가기
				type = xpp.getEventType();									// 이 때 type의 값은 다음 값을 나오게 한다 
			}																//		-> 이거 안쓰면 반복문 안돌아가유		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
