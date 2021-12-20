package com.ddargiratte.dec203.calculator;

public class Calculator {
	// 1. ���⼭ �ƿ� ������ ����!! : try - catch - finally
	// ���������� ���ư��ٸ� : 7 - 8 - 9 - [14 - 15 - 16] - 10	([finally]�� retrun���� ���� �ȴ�!)
	// ���࿡ y�� 0�� �־ Arithmetic�� �ɸ��� : 7 - 8 - 9(Arith) - 11 - 12 - [14 - 15 - 16] - 13
	public static double divide(int x, double y) {
		try {
			double d = x / y;
			return d;
		} catch (Exception e) {
			System.out.println("����!");
			return -9999;
		}finally {
			System.out.println("�碌������������");
		}
	}
	
	// 2. �̷�� : throws -> try���� �� �ַ�
	// divide2�� �����ϴٰ� Arithmetic..�� ������
	// divide2�� ȣ���� �ʿ��� �ذ��ض�!
	public static double divide2(int x, double y) throws /* Arithmetic*/ Exception {
		double d = x / y;
		return d;
	}
	
	
}
