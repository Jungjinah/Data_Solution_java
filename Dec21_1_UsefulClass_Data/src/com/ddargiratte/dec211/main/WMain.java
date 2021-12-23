package com.ddargiratte.dec211.main;

public class WMain {

	/* Wrapper Class : (�ڷ���) �⺻������ ��ü�� (���尴ü��� ��)
	 *		ex) Integer, Double, Long, Void, Boolean,,
	 *		�⺻ �ڷ����� ��ü�� �ٷ�� ���� ����ϴ� Class
	 *		Java�� �⺻���� ���� ������ �ִ� ��ü ������ ����
	 *		�⺻���� ������ �ִ� ���� ���ο� �ΰ� �� ���� �����ϴ� ���
	 * Boxing : �⺻�� -> ����Ŭ����
	 * UnBoxing : ����Ŭ���� -> �⺻��
	 * 
	 * - ���� ����ϳ�?
	 * 1. ��ü�� Ŭ������ �����ϴ� method ����� ��
	 * 2. Ŭ������ �����ϴ� ����� ����ϰ� ���� ��(MIN_VALUE, MAX_VALUE,...)
	 * 3. ����, ���ڷ� ����ȯ�� �� �� (v, �츮�� �� �����! üũüũ~)
	 *  
	 */

	public static void main(String[] args) {
	
		int a = 10;
		String a1 = "100";
		// int b = (int) a1; ��� �Ұ���,,
		// �׷��� �Ʒ�ó�� ����������
		
		// Integer ��ü�� ���� -> �������� �־ -> int������ return
		Integer b = new Integer(a1);	// * �ڷ����� integer�̶�� (b = ��ü)�� ����
		b.intValue();					// ���尴ü(b)�� �� int������ ��(Value)�ٲ��ֱ�
		System.out.println(b);			// a1�� ���� ����ϰ�
		System.out.println(b.TYPE);		// a1�� ���� int������ �� �ٲ����� Ȯ����
		// -> ��ü�� -> �⺻��
		
		// �⺻�� -> ��ü��
		double c = 123.456;
		Double d= new Double(c);		// * 
		
		// ��ü�� -> �⺻��
		Boolean e = new Boolean(true);  // * 
		Boolean f = e.booleanValue();	
		
		// ��ü�� -> �⺻�� (�� ���� ���) -> ���� ������ �ڵ��������� : Auto-UnBoxing
		Integer g = 10;
		
		// �⺻�� -> ��ü�� (�� ���� ���) -> ���� ������ �ڵ��������� : AutoBoxing
		int h = g;
		
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		
		// int �ڷ����� ���� -> String(������)����
		String num1 = Integer.toString(321);
		
		// int �ڷ����� �� -> 2������ ���·�(String)
		String num2 = Integer.toBinaryString(5); 
		 
		// String -> �⺻�� (���̷�Ʈ�δ� ����� ��ü�� ���ľ�..)
		// String -> ��ü�� -> �⺻�� (�� ���·� ������)
		String k = "345.67";
	 // double d = k.pars -> �̷��� �ȵǴϱ� �Ʒ�ó��!
		// <1>���
		Double k2 = Double.parseDouble(k);
		double k3 = k2.doubleValue();
		
		// <2>���
		String m = "150";						// parse ���� ����
		int m2 = Integer.parseInt(m);			// ������ ���ڿ� �����͸� ����ϱ� ���� ���ڷ� ��ȯ�ϴ� �۾� ����
		
	}
}

// parse[x]-> �⺻�� �ڷ��� /  ���� ->  ���ڷ� => toString

// ��ü �⺻�� ������  
// boolean �⺻��
// Boolean ��ü
// Integer -> int
// String -> String (������)
// Double -> double
// Void -> void (return�ҰԾ���.)
// Char -> char	(�ѱ��ڸ� ��Ÿ���� ����.) -> ���ڿ��� �ƴ϶� ���ڿ��� string