package com.ddargiratte.dec231.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.ddargiratte.dec2244.HttpClient.DdargiratteHttpClient;

public class WeatherMain {
	public static void main(String[] args) {
		// http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=5011057000
		// hour : �ð�
		// temp : �µ�
		// wfKor : ����
		// wdKor : �ٶ� ����
		
		try {
			String address =
					"http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=5011057000";
																				// start doucument = 0 / start
			InputStream is = DdargiratteHttpClient.download(address);			// �־��� �ּҸ� �ٿ�ε��Ͽ� �� http�� �������� is
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();		// 
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();										
			String tagName = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {					
				// System.out.println(type);								// type���� ���� �������� �˾ƺ������� �۾�
				if (type == XmlPullParser.START_TAG) {						// start_tag�� �� �տ� �ִ� '<����>' 
					tagName = xpp.getName();								// xpp�� �ִ� �̸����� tagName�̶���
				}else if (type == XmlPullParser.TEXT) {						// text�� ������ �۾� ���
					if (tagName.equals("hour")) {							// �׷��� �� �ؽ�Ʈ�� tagName�� ��ġ�ϸ� hour�� ���� ���� �����
						System.out.printf("�ð� : %s��\n", xpp.getText());	// 	�ð��̶� �µ��� ���ڰ� �ƴ�����
					}else if (tagName.equals("temp")) {						// 	-> �����͸� �״�� �����Ա� ������
						System.out.printf("�µ� : %s��\n", xpp.getText());	// 	-> �׷��� parsing ���°ž�! (����ȯ)
					}else if (tagName.equals("wfKor")) {
						System.out.printf("���� : %s\n", xpp.getText());
					}else if (tagName.equals("wdKor")) {
						System.out.printf("�ٶ� ���� : %s��\n", xpp.getText());
						System.out.println("=====================");
					}
				}else if (type == XmlPullParser.END_TAG) {					// End_tag�� �� �� �ִ� '<����>'
					tagName = "";											// �̰� ����� ���� �� ������ '��'�ɷ� ó��
				} 
				xpp.next();													// xpp �̾����
				type = xpp.getEventType();									// �� �� type�� ���� ���� ���� ������ �Ѵ� 
			}																//		-> �̰� �Ⱦ��� �ݺ��� �ȵ��ư���		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
