package com.ddargiratte.dec211.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExampleMain2 {

	// �л��� (�̸�/�������(yyyyMMdd)/����/����/����)�� �Է¹޾Ƽ�
	// �л��� ����(�ѱ�����), ����, ��� ���� ���
	// stringTokenizer
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("�̸�/�������(yyyyMMdd)/����/����/����");
		String s = key.next();
		
		StringTokenizer st = new StringTokenizer(s, "/");
		
		// ���� ��.��.�� ����
		int sum = 0;
		int kor = 0;
		int math = 0;
		int eng = 0;
		String birthday = null;			// ���ڿ� �⺻���� null
		String name = null;				// ���ڴ� �⺻�� 0
		
		while (st.hasMoreTokens()) {					// while �ȿ� ��ū ������ true
			
			try {
				// �̸�
				name = st.nextToken();
				
				// ����
				birthday = st.nextToken();
				
				//������
				kor = Integer.parseInt(st.nextToken());
				math = Integer.parseInt(st.nextToken());
				eng = Integer.parseInt(st.nextToken());
				sum += kor + math + eng;				// count++�� ���ڰ� ������ ������ ������ ����ϹǷ�
														// ����� 3�� ������ �����Ƿ� �� �ʿ� ����!
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		//birthday = 19980801
		Date nowYear = new Date();								// Date(util��) : ���� ��¥ ���
		int stYear = Integer.parseInt(birthday.substring(0, 4));// substring ���� ����
		int stAge = (nowYear.getYear()+1900) - stYear + 1;		//  -> �־��� ���ڿ��� Ư�����ڸ� ������ ������ ��
		System.out.printf("�̸� : %s\n", name);					// 52����-> nowyear�� Date(�ڷ���)�̹Ƿ�
		System.out.printf("���� : %d\n", stAge);					// + parse���� ����ȯ�� ������ϴ�
		System.out.printf("�հ� : %d\n", sum);					// Date�� getYear ����� ������ ���� ������ ������ ����~
		double avg = (double) sum / 3;
		System.out.printf("��� : %.1f\n", avg);
		
	}
	
}
