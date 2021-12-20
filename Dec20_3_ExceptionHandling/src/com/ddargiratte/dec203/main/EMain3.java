package com.ddargiratte.dec203.main;

import java.io.FileReader;
import java.util.Scanner;

import com.ddargiratte.dec203.calculator.Calculator;

// <차이점이양>
// Java
//		예외처리가 강제
// Python
//		처리하기 싫으면 안해도 됨,,


public class EMain3 {	
	public static void main(String[] args) {
		// txt파일을 받아와서 뭔가 할건데.. 만약에!
		// 이 텍스트파일을 지웠거나 없으면?
		
		try {
			FileReader fr = new FileReader("");		// "" 안에는 내가 텍스트 파일 적은거 저장해놓은거 경로
			System.out.println(fr.read());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		// 가격 / 무게를 입력 받아서
		// g당 가격이 얼마인지 출력
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("가격(원) : ");
		int price = key.nextInt();
		System.out.print("무게(g) : ");
		double weight = key.nextDouble();
		System.out.println("============");
		double z1 = Calculator.divide(price, weight);
		System.out.printf("g당 가격은 :  %.2f원\n", z1);
		
		try {
			double z2 = Calculator.divide2(price, weight);
			System.out.printf("g당 가격은 : %.2f원\n", z2);
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		// g당 얼마인지
		// 다른 메소드에서 try... -> 월권 행위..! / main메소드 o
		// throws : 이걸 더 많이 쓰는데,,
		// 		-> main메소드 이외의 메소드에서 많이 쓰이므로!
		
		
		
		
		
		
		
	}

}
