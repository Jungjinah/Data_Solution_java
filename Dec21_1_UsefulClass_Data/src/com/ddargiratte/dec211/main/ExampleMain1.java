package com.ddargiratte.dec211.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleMain1 {
	// �л��� (�̸�/�������(yyyyMMdd)/����/����/����)�� �Է¹޾Ƽ�
	// �л��� ����(�ѱ�����), ����, ��� ���� ���
	// split
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("�̸�/�������(yyyyMMdd)/����/����/����");
		String s = key.next();
		String[] sData = s.split("/");							// sData��� �迭�� ����. (�� �ȿ� /�� ������ ä�� s������ ��)
		
		// �̸�
		String name = sData[0];									// �迭�� 0��° �ڸ� : �̸�
		System.out.printf("�̸� : %s\n", name);					// �̸� ���
		
		// ����																
		try {																		
			String bd = sData[1];											// bd �ȿ� 19980801 ��	
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");		// simpleDateFormat ���� ���� (String�϶��� �� �� ����)
			Date birthday = sdf.parse(bd);									// -> "(�� ������ �������־�)" ���ϴ� ������ ����� ���ؼ�				
			System.out.println(birthday);									// sdf�� �������� �̶�� ���·� �����Ѵٴ� ��
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E");
			String birthdayStr = sdf2.format(birthday);
			System.out.println(birthdayStr);

			Date now = new Date();											// ���� ��¥ ���
			SimpleDateFormat nowFmt = new SimpleDateFormat("yyyy");			// ������ ����´�
			String nowYr = nowFmt.format(now);								// ���� ����
			String birthdayYr = nowFmt.format(birthday);					// ź���� ����
			
			int ny = Integer.parseInt(nowYr);								// ����ȯó��
			int by = Integer.parseInt(birthdayYr);
			int age = ny - by + 1;
			System.out.printf("���� : %d��\n", age);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ���� ���� ���� ����
		int kor = Integer.parseInt(sData[2]);  // �������� ����ȯó�� ���� ��
		int math = Integer.parseInt(sData[3]);  // ��������
		int eng = Integer.parseInt(sData[4]);  // ��������
		
		System.out.printf("���� : %d��\n", kor);
		System.out.printf("���� : %d��\n", math);
		System.out.printf("���� : %d��\n", eng);
		
		int sum = kor + math + eng;
		System.out.printf("���� : %d��\n", sum);
		double avg = (double) sum / 3;
		System.out.printf("��� : %.1f��\n", avg);
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
