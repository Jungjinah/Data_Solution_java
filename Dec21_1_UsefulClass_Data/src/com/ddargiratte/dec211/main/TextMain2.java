package com.ddargiratte.dec211.main;

import java.util.Scanner;
import java.util.StringTokenizer;

import org.w3c.dom.css.Counter;

public class TextMain2 {
	
	// <����>
	// ���� �Է��� �����ǵ�..
	// a/b/c/d...
	// 1/2/a/3	-> ���� : 6 / ��� : 2
	// ���ڶ��.. ������ ���ϰ� + ��ձ��� ���
	// ���ڶ��.. �ѱ��
	
	public static void main(String[] args) {
		
		// �����Ѱž�,,,,
//		Scanner key = new Scanner(System.in);
//		System.out.print("�Է�(a/b/c/d/...) : ");
//		
//		String s = key.next();
//		System.out.println(s);
//		int a = key.nextInt();
//		System.out.println(a);
//		
//		String[] slashMinus = s.split("/");
//		for (int i = 0; i < slashMinus.length; i++) {
//			System.out.println(slashMinus[i]);
//		}
//		
//		int sum = 0;
//		sum = (int) slashMinus++;
//		System.out.println(sum);
//		
//		int average;
//		average = sum / (slashMinus);
		
		Scanner key = new Scanner(System.in);
		System.out.print("�Է�(a/b/c/d/...)");				// 
		String s = key.next();								// int�� �Ⱦ��� ������ ���ڿ� �޾Ƽ�,,
															//	-> /�����ð� ���� int �Ұ���
		StringTokenizer st = new StringTokenizer(s, "/");	// ������ ���� ���� �۾�
		
		int n = 0;							// ������ �þ�������� �ϳ��� ���ĳ����� (sum�� �����ϰ� ���Ϸ���)
		int sum = 0;						// ���� �ֱ����� �׸�
		int count = 0;						// ���ڶ� ���� �����ִ°� �߿� ���� ���� �˱� ���� �׸�
		
		while (st.hasMoreTokens()) {						// while ���� ������ ������ ���� ����
			try {											// + �ϳ��� �����ϱ� ���� �ݺ� �۾�
				n = Integer .parseInt(st.nextToken());		// ������(string) -> �⺻��(int)���� �ٲٱ�
				count++;									// ���� �������� �۾�
				sum += n;									// ���� ���� ���ϱ� �۾�
			} catch (Exception e) {							// ���ڸ� �������� catch�۾�
				// e.printStackTrace();						// �����޽��� Ȯ��
			}
		}													// ����ó��
		
		System.out.printf("�հ� : %d\n", sum);				// �հ� ���ϱ�
		double avg = (double) sum / count;					// ��� ���ϴ� �۾�	
		System.out.printf("��� : %.2f\n", avg);				// ��� ���ϱ�
		
		
		
	}
	
}
