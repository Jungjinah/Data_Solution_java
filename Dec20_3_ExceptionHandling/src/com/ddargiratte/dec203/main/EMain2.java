package com.ddargiratte.dec203.main;

public class EMain2 {
	public static void main(String[] args) {
		// Exception�� ����
		
		// 1. NullPointerException
		//		��ü ������ ���� ��Ȳ���� ���
		//		null���� �ִ� ���������� .�� ����� �� �ַ� �߻�
//		String s = null;
//		System.out.println(s.toString());
		
		// 2. ArrayIndexOutBoundException
		//		�迭���� �ε����� ������ �ʰ��ϰ� �Ǵ� ��Ȳ���� �߻�
//		int[] ar = {1, 2, 3};
//		System.out.println(ar[3]);
		
		// 3. NumberFormatException
		// 		���ڿ�(String) -> ����(int, double)�� �ٲٴ� ��Ȳ����
		//		��ȯ�� �� ���� ���ڰ� �ִ� ��Ȳ���� �߻�
		String s = "a12345";
		int i = Integer.parseInt(s);
		System.out.println(i + 20);
		
		
	}
}
