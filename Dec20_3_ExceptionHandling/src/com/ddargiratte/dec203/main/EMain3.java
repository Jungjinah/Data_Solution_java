package com.ddargiratte.dec203.main;

import java.io.FileReader;
import java.util.Scanner;

import com.ddargiratte.dec203.calculator.Calculator;

// <�������̾�>
// Java
//		����ó���� ����
// Python
//		ó���ϱ� ������ ���ص� ��,,


public class EMain3 {	
	public static void main(String[] args) {
		// txt������ �޾ƿͼ� ���� �Ұǵ�.. ���࿡!
		// �� �ؽ�Ʈ������ �����ų� ������?
		
		try {
			FileReader fr = new FileReader("");		// "" �ȿ��� ���� �ؽ�Ʈ ���� ������ �����س����� ���
			System.out.println(fr.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		// ���� / ���Ը� �Է� �޾Ƽ�
		// g�� ������ ������ ���
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("����(��) : ");
		int price = key.nextInt();
		System.out.print("����(g) : ");
		double weight = key.nextDouble();
		System.out.println("============");
		double z1 = Calculator.divide(price, weight);
		System.out.printf("g�� ������ :  %.2f��\n", z1);
		
		try {
			double z2 = Calculator.divide2(price, weight);
			System.out.printf("g�� ������ : %.2f��\n", z2);
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		// g�� ������
		// �ٸ� �޼ҵ忡�� try... -> ���� ����..! / main�޼ҵ� o
		// throws : �̰� �� ���� ���µ�,,
		// 		-> main�޼ҵ� �̿��� �޼ҵ忡�� ���� ���̹Ƿ�!
		
		
		
		
		
		
		
	}

}
