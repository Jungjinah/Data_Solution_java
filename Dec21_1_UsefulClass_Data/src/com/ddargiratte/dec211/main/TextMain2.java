package com.ddargiratte.dec211.main;

import java.util.Scanner;
import java.util.StringTokenizer;

import org.w3c.dom.css.Counter;

public class TextMain2 {
	
	// <예제>
	// 뭔가 입력을 받을건데..
	// a/b/c/d...
	// 1/2/a/3	-> 총합 : 6 / 평균 : 2
	// 숫자라면.. 총합을 구하고 + 평균까지 출력
	// 글자라면.. 넘기게
	
	public static void main(String[] args) {
		
		// 내가한거야,,,,
//		Scanner key = new Scanner(System.in);
//		System.out.print("입력(a/b/c/d/...) : ");
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
		System.out.print("입력(a/b/c/d/...)");				// 
		String s = key.next();								// int를 안쓰는 이유는 문자열 받아서,,
															//	-> /슬래시가 들어가서 int 불가능
		StringTokenizer st = new StringTokenizer(s, "/");	// 슬래시 빼기 위한 작업
		
		int n = 0;							// 여러개 늘어놓은것을 하나로 뭉쳐놓은거 (sum을 간단하게 구하려고)
		int sum = 0;						// 합을 넣기위한 그릇
		int count = 0;						// 숫자랑 글자 섞여있는것 중에 숫자 개수 알기 위한 그릇
		
		while (st.hasMoreTokens()) {						// while 쓰는 이유는 정해진 개수 없이
			try {											// + 하나씩 나열하기 위한 반복 작업
				n = Integer .parseInt(st.nextToken());		// 참조형(string) -> 기본형(int)으로 바꾸기
				count++;									// 숫자 세기위한 작업
				sum += n;									// 넣은 숫자 더하기 작업
			} catch (Exception e) {							// 문자를 빼기위한 catch작업
				// e.printStackTrace();						// 에러메시지 확인
			}
		}													// 예외처리
		
		System.out.printf("합계 : %d\n", sum);				// 합계 구하기
		double avg = (double) sum / count;					// 평균 구하는 작업	
		System.out.printf("평균 : %.2f\n", avg);				// 평균 구하기
		
		
		
	}
	
}
