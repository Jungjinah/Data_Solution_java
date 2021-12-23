package com.ddargiratte.dec231.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.ddargiratte.dec2244.HttpClient.DdargiratteHttpClient;
import com.sun.org.apache.xerces.internal.xni.parser.XMLPullParserConfiguration;

/* ������ (Ŭ���̾�Ʈ�� ������Ʈ�� ��û -> ����Ʈ�� ����)
 * �ǽð� �����͸� XML Parsing -> AJAX (Ŭ���̾�Ʈ�� �����͸� ��û -> XML/SJON ����)
 *	������ �̹���ȭ�ؼ� ����
 *		data.seoul.co.kr
 *		data.naver.com
 *		dav.kakao.com
 *		...
 *
 * ���� ���������ͱ��� DB - �̼����� ������
 *
 * DB�� �ִ� �����͸� ����鿡�� ������� �ϴ� ���
 *	��κ��� ������� SQL�� �� �� ����...?
 *	SO, ������Ʈ : ���� ������� DB���� ���ϰ�~
 *
 * � �����ڰ� �����͸� �������� ����
 * �����͸� Ư���� �������� ǥ�������
 * DB�� �ִ� �����͸� ǥ���ϴ� ���� : XML, JSON (�ΰ��� ������)
 * 
 * Parsing(�����ϴ� ���) - kxm12.jar(Parsing�� ����ϱ� ���� / �ȵ���̵忡�� ���� o)
 *	�ʿ���� �����ʹ� �Ⱦ��, ���ϴ� ���·� �����ϴ�..
 *
 * XML
 * 	DB�� �ִ� �����͸� HML���·� ǥ���� ��
 * <xxx> : �����±� ( xxx : �±׸�)
 *     yyy : �� �±� �ȿ� �ִ� �ؽ�Ʈ
 * </xxx> : �����±� (���۰� ���� �˷��ִ� ��輱 ���� ����)
 * �� 3���� html�ϸ鼭 ���� ���ž�,, �׸��� 3������ �ٴ�!
 */


public class AirPolutionMina1 {
	public static void main(String[] args) {
		System.out.println("****************");
		System.out.println("����� �ǿ��� �ǽð� ���ȯ�� ��Ȳ");
		System.out.println("****************");

		try {
			String address =
			"http://openapi.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/RealtimeCityAir/1/25/";
																						// 1/25/ => 25���� �������ڴ�.
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
			// ���� �ֵ��� �������� �־�!
			
			while (type != XmlPullParser.END_DOCUMENT) {								
				if(type == XmlPullParser.START_TAG) {									
					tagName = xpp.getName();											
				}else if (type == XmlPullParser.TEXT) {									
					if (tagName.equals("MSRSTE_NM")) {										
						System.out.printf("���� �� : %s\n", xpp.getText());				
					}else if (tagName.equals("PM10")) {														
						System.out.printf("�̼����� :  %s��\n", xpp.getText());			
					}else if (tagName.equals("PM25")) {									
						System.out.printf("�ʹ̼����� : %smg/m2\n", xpp.getText());
					}else if (tagName.equals("03")) {
						System.out.printf("���� : %ssppm\n", xpp.getText());
					}else if (tagName.equals("NO2")) {
						System.out.printf("�̻�ȭ���� : %ssppm\n", xpp.getText());
					}else if (tagName.equals("IDEX_NW")) {
						System.out.printf("�ϻ�ȭź�� : %ssppm\n", xpp.getText());
					}else if (tagName.equals("IDEX_MVL")) {
						System.out.printf("�ƻ�ȭ���� : %ssppm\n", xpp.getText());
					}else if (tagName.equals("ARPLT_MAIN")) {
						System.out.printf("���մ��ȯ������ : %ssppm\n", xpp.getText());
						System.out.println("====================");
					}
					
				}else if (type == XmlPullParser.END_TAG) {
					tagName = "";	// ���� �ִ� ���� : Xml���� ���⸦ �ؽ�Ʈ�� �ν��ϴ� ��찡 ����
				}
				xpp.next(); // �����ɷ� �Ѿ
				type = xpp.getEventType();	// ���� �±��� ���� ����
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
