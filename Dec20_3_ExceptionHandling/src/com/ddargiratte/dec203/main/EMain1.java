package com.ddargiratte.dec203.main;

import java.util.Scanner;

import jdk.nashorn.internal.ir.CatchNode;

public class EMain1 {

	// �ѱ��� - ���� -> ����

	// ��� apple
	// ���� ???? -> error

	// error : Java�� ������ �ȸ°� �Ἥ �������� �Ұ����� ����
	// ������ �߸�
	// �������� �����ϴ� �ϼ����� ���� (�����ϴµ� ���� ���� o)
	// ��Ŭ������ �ܼҸ���

	// warning : �������� �ڵ�
	// ������ �߸�
	// �������� �����ϴ� �ϼ����� ���� (�����ϴµ� ���� ���� o)
	// ��Ŭ������ �ܼҸ���

	// exception : ���α׷��� 100% �ϼ�
	// ������ �� ���� �ܺ����� ���ο� ���ؼ� �۵��� ����� �ȵǴ�..
	// ������ �߸��� �ƴ�
	// ����� ���� -> �����ڰ� ��Ȳ�� �����ؼ� ��å�� ��������

	public static void main(String[] args) {
		// x : ?, y : ? �Է� �޾Ƽ�
		// ���Ѱ�, �� ��, ���� ��, ���� ���� ���

		Scanner key = new Scanner(System.in);

		System.out.print("x : ");
		int x = key.nextInt();

		System.out.print("y : ");
		int y = key.nextInt();

		System.out.println("-----------");

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println((double) x / y);
		
		
//		try {
//			�ϴ� ���� �����ؼ� ������ ������~
//		} catch (���������� ������) {
//			try���� �����ϴٰ� �ش� ������ ���ܰ� �߻��ϸ� ���Ⱑ ����
//			����, ���ܾ��� ���������� ������� ���, catch�κ��� �׳� ����ġ��
//			�� ���� �ҽ��� ����
//		}catch (Exception e) {
//			...		
//		}finally {
//			���������� ���α׷��� ����ƴ���,
//			���ܰ� �������� ������� ����
//			return���� ���� ����
//		}
		
		// ���࿡ y������ 0�� ������..?
		// �ΰ��� ������ ���ÿ� ���� ���, ���� ���� catch�� ���븸 ���
		// Java�� ���忡�� ù��° ���ܰ� ������ ��
		// ��� ���� �����ϰ�, �ش� ����ó�� �κ����� �Ѿ�� �����Դϴ�.
		
		// x : 10, y : 0 -> 72 - 73 (Arith) - 77 - 78		
		// x : 10, y : 1 -> 72 - 73 - 74 - 75 -76(array) - 79 - 80
		// x : 2, y : 1 -> 72 - 73 - 74 - 75 - 76
														// 72���ٿ��� try�� ���������Ƿ� ���۹�ȣ�� 72
//		try {											// 0���� ���������� arith�� �ɷ��� 77 78 ���	
//			int d = x / y;								// �����µ� �迭 ���� �Ѿ�� array�� �Ѿ�ͼ� 79 80 ���
//			System.out.println(d);						// ���������� �������� arith�� array�� �ȳѾ�� �� �������� ���
//			int [] ar = {1, 2, 3};
//			System.out.println(ar[x]);
//		} catch (ArithmeticException e) {
//			System.out.println("0���� ��� �����İ�~~");
//		}catch (ArrayIndexOutOfBoundsException aoe) {		// ���Ʒ� �ΰ� �ɸ��� ù��° ��Ȳ�� ����.
//			System.out.println("�迭 �ε��� ������ �Ѿ��ٰ��~");
//		}
		
				
		try {
			int d = x / y;
			System.out.println(d);
			int [] ar = {1, 2, 3};
			System.out.println(ar[x]);
		} catch (Exception e) {
			System.out.println("���� ���֤�");
			e.printStackTrace();	// ��Ȳ ��� (�����ڿ�)
		}finally {
			System.out.println("�碌��������������������");
		}
		
		
	}
}
