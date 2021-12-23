package com.ddargiratte.dec211.main;

import java.util.StringTokenizer;

public class TextMain {
	
	/* ����
	 *		1.8.12������ �ִٰ� �����Ͽ�,
	 *		���ڸ� : major����(1)
	 *		���ڸ� : minor����(8.12)
	 *			�� ���ڸ��� ������ �� minor�� �����̴�~
	 *		�� minor�� ����..
	 *			�������� �ƴµ� (1.8.12 -> 1.8.13) : ��¦ ������ ������,, (�������� ���� ����)
	 *			�������� �ߴµ� (1.8.12 -> 1.9.0) : ��ȭ�� ������� ������ ���� �׷� ����,,
	 *			�������� �ٽ�..(1.8.12 -> 2.0.0) : ���ο� ���α׷��� § ����,,
	 */

	/* ��Ʈ��ũ�� ���ؼ� �����͸� �޾ƿ��� : �������·� �޾ƿ�
	 * ��Ʈ��ũ�� ���ؼ� �����͸� �ְԵǸ� : �������·� ������
	 * �ѱ�ó���ϱⰡ ��ٷο�,, 
	 */
	
	// String���� ��ɵ�
	public static void main(String[] args) {

		String s1 = "���ƾƾƾƾƾƾ�"; // �⺻��? NO! / ��� YE
		String s2 = new String("�� ������ ũ��������! �����̴���~~");
		
		// <����1>
		// s2���� 3��°�� �ִ� ���ڸ� ���
		// chatAt() : Ư����ġ�� �ִ� ���ڸ� �̾Ƴ���
		System.out.println(s2.charAt(3)); 
		
		// <����2>
		// s2�� �� ��������� ���
		// length() : �� ���ڼ��� �˰� ������
		System.out.println(s2.length());
		
		// <����3>
		// s2�� '��' �̶�� �ܾ�� �����ϴ���
		// startWith() : �����ϴ� �ܾ �´��� Ȯ�εɶ�, ����� (true / false)
		System.out.println(s2.startsWith("��"));
		
		// <����4>
		// s2�� '�ʹ�' ��� �ܾ �ִ���
		// contains() : ã�� ���ڰ� �ִ���
		System.out.println(s2.contains("�ʹ�"));
		
		// <����5>
		// s2���� 'ũ��������'�� '����!'�� �ٲ㼭 ���
		// replace() : Ư�� ���ڸ� �ٸ� ���ڷ� �ٲܶ�
		System.out.println(s2.replace("ũ��������!", "����!"));
		
		// <����6>
		// s2���� 2 ~ 5��° ���ڸ� ���
		// substring(������ġ, ����ġ-1) : ���ϴ� ������ ���ڸ� ����Ҷ�
		System.out.println(s2.substring(1, 5));
		
		System.out.println("======================");
		
		// String ��ü�� �����ϴµ� ������ ��Ƽ� 
		String s3 = String.format("���� : %.2fkg", 123.45678);
		System.out.println(s3);
		// System.out.printf();
		// -> printf�� f�� format�̴�!
		
		// s2�� ���� �߰�
		// ���� �߰�
		s2 = s2 + " \n���⿡�� ��� �� �� ������ ���ھ��!";
		System.out.println(s2);
		s2 += "��� ���ڵǼ���~~";
		System.out.println(s2);
		
		s2 = new String(s2 + "��������");
		System.out.println(s2);
				
		// String �뷮���� �߰� ===========
		// append() : �����̴�
		StringBuffer sb = new StringBuffer(s2);
		sb.append("���� �����ϵ� ���� ���� ���� ���ּ���!");
		sb.append("��������");
		sb.append("�ٵ� �ָ����� ���ؾ��ؿ�,,");
		System.out.println(sb);
		
		// ���ο� String �߰�
		String s4 = sb.toString();
		System.out.println(s4);
		
		// String �и� ============ 2�������
		String s5 = "����,�ں��,�ֺ��,�����";
		// 1. Split ============
		String[] s5Ar = s5.split(",");
		System.out.println(s5Ar[0]); // ù��°
		System.out.println(s5Ar[3]); // �׹�°
 		// split�� ������ ��� �ϳ��ϳ� �����ؼ� �и� ����
		
		// 2. StringTokenizer ==============
		// StringTokenizer st = new StringTokenizer(s5, ������ );
		StringTokenizer st = new StringTokenizer(s5, ",");
		// 4���� ������� ���
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		//  -> stringTokenizer�� ������� ����� ��
		
		// �ݺ��� ����(while��) + ������� ����
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		// <����1>
		System.out.println("========1=========");
		String a = "I,My,Me,Mine";
		
		System.out.println("========split=======");
		String[] aAr = a.split(",");
		System.out.println(aAr[0]);
		System.out.println(aAr[1]);
		
		String[]s =a.split(",");
		for (int i = 0; i < aAr.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("========Token=======");
		StringTokenizer ar = new StringTokenizer(a, ",");
		System.out.println(ar.nextToken());
		System.out.println(ar.nextToken());
		System.out.println(ar.nextToken());
		
		while (ar.hasMoreTokens()) {
			System.out.println(ar.nextToken());
		}
		
		// <����2>
		System.out.println("========2=========");
		String a1 = "I,My,,Me,Mine";
		
		System.out.println("========split=======");
		String[] a11 = a1.split(",");
		System.out.println(a11[0]);
		System.out.println(a11[1]);
		System.out.println(a11[2]);
		
		String[]a12 = a1.split(",");
		for (int i = 0; i < a12.length; i++) {
			System.out.println(a12[i]);
		}
		
		System.out.println("========Token=======");
		StringTokenizer a2 = new StringTokenizer(a1, ",");
		System.out.println(a2.nextToken());
		System.out.println(a2.nextToken());
		System.out.println(a2.nextToken());
		System.out.println(a2.nextToken());

		while (a2.hasMoreTokens()) {
			System.out.println(a2.nextToken());
		}
		// Tokenizer���� ,, �ΰ��� �ѹ��� ������ ���ϴ� ����
		// -> �ӵ��� �ʹ� ���� ������ ���ϴ� ����  
		
		// Split�� stirngTokenizer�� ������
		// �ӵ����θ� : StringTokenizer
		// data�ӿ��� ������ ���ٸ�(�߶󳾰� ���ٸ�) : Split
		
	}
		
}


