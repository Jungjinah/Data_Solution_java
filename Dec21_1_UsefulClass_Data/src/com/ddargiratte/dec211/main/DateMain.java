package com.ddargiratte.dec211.main;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Locale;

/* Date.java : ��~~�� ���� (1900���) ������� Class
 *			Y2K�� ������ ���� ����..(Year 2000 Problem) >> k = 1000
 *			���� ������ ���� ����
 *			���� �뷮�� ������ ������ ���� ���� 2�ڸ���...
 *			1970��� ������ ��ǻ�� : �ӵ��� ������ ��ġ�� �뷮�� ������.
 *			�����ͷ��� �Ƴ��� ���ؼ� ������ 4byte�� �ƴ�, 2byte�� �Ҵ�(�������� 2�ڸ���..)
 *			������ ����
 *			1900��, 2000�� ���� ���ڸ��� 00���� ���� -> ������ �Ұ���
 *				-> ��ǻ���� ���۵� ���ɼ��� ������..!
 * 
 * deprecated
 *			������ �帣��, ��ǻ�͵� ���� -> ������ ����� ������ ����..
 *			���α׷��־� ������Ʈ�� �Ǿ��..
 *			���ְų� / ����� ������ ��ȹ�� ���ܹ���
 *			���� ���������� OK! / ���� ������ �������� �Ҹ� ��������!
 *
 */

// <������ ����>
// Date : ��¥ / �ð�

public class DateMain {
	public static void main(String[] args) {
		// �⺻���� -> ���� �ð�/��¥ �˷���
		Date now = new Date();								// Date �ι�°�� util ������!
		
		// ����ð� ��¥�� ���
		System.out.println(now);							// �̰� �� ���� ��Ÿ���ִ� �Լ������� (= now)
		
		// ����
		System.out.println(now.getYear() + 1900);				
		// ��
		System.out.println(now.getMonth() + 1);
		// ��
		System.out.println(now.getDate());
		// ����
		String[] day = {"��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println(day[now.getDay()]);
		// -> 0(��) 1(��) 2(ȭ) ... 6(��)
		
		System.out.println("=========================");
		// �ѱ�ó�� / ��¥ / �ð� : ���������� �����е��� ��������,,,,������
		
		// Date - �������� -> String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd E a hh:mm", Locale.FRANCE);
		String s1 = sdf.format(now);					// SimpleDateFormat�� Ŀ���� �θ�
		System.out.println(s1);							// + ���� �� �� �ð� ��� ���� ��� ������
														// Locale�� ���� �����ϸ� �׿� �´� ��� ������
		System.out.println("=========================");
		
		// Ư���� �ð���¥
		Date d2 = new Date(2000, 11, 11); 	// -> �̰� �� ����,,
		
		// �׷��� String - �������� -> Date
		
//		String s2 = "2021.06.25";					
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
//		Date d3 = sdf2.parse(s2);						// -> exception�� ���� try ����.
//														// -> pars���� ������ string�� dateŸ���� �ٲٷ���
		
		try {											// try�� ���� ������ ���Ͱ��� �ȵǱ� ������
			String s2 = "2021.06.25";					// -> �׷��� ����ó���Ѵ�.
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
			Date d3 = sdf2.parse(s2);					// -> �̰͵� ����ȯ �Ѱ���
			System.out.println(d3);
		} catch (Exception e) {
			e.printStackTrace();						// ���� ��� �ߴ��� �˰� �ϱ� ���� ���°���
		}												// ������ ���°� ���ٱ� ���� �����Ͻ�!
		
		System.out.println("========================");
		
		// <����1>
		// 10�� �� ũ���������� ���� �����ϱ��??
		try {
			String Christmas = "2011.12.25";
			SimpleDateFormat chs = new SimpleDateFormat("yyyy.MM.dd");
			Date dd = chs.parse(Christmas);
			System.out.println(dd);
			System.out.println(day[dd.getDay()]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
