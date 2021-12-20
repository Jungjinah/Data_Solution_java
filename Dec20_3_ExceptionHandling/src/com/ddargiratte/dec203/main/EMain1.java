package com.ddargiratte.dec203.main;

import java.util.Scanner;

import jdk.nashorn.internal.ir.CatchNode;

public class EMain1 {

	// 한국어 - 번역 -> 영어

	// 사과 apple
	// 띱퀭 ???? -> error

	// error : Java의 문법에 안맞게 써서 컴파일이 불가능한 상태
	// 개발자 잘못
	// 컴파일은 간으하니 완성본은 나옴 (실행하는데 문제 없음 o)
	// 이클립스가 잔소리함

	// warning : 지저분한 코드
	// 개발자 잘못
	// 컴파일은 가능하니 완성본은 나옴 (실행하는데 문제 없음 o)
	// 이클립스가 잔소리함

	// exception : 프로그램은 100% 완성
	// 실행할 때 뭔가 외부적인 요인에 의해서 작동이 제대로 안되는..
	// 개발자 잘못은 아님
	// 사용자 입장 -> 개발자가 상황을 예측해서 대책은 세워놓자

	public static void main(String[] args) {
		// x : ?, y : ? 입력 받아서
		// 더한값, 뺀 값, 곱한 값, 나눈 값을 출력

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
//			일단 여기 실행해서 내용이 들어오고~
//		} catch (예외유형명 변수명) {
//			try쪽을 실행하다가 해당 유형의 예외가 발생하면 여기가 실행
//			만약, 예외없이 정상적으로 실행됐을 경우, catch부분은 그냥 지나치고
//			그 다음 소스를 실행
//		}catch (Exception e) {
//			...		
//		}finally {
//			정상적으로 프로그램이 수행됐던지,
//			예외가 터졌던지 상관없이 실행
//			return보다 먼저 실행
//		}
		
		// 만약에 y값에다 0을 넣으면..?
		// 두가지 문제가 동시에 터진 경우, 먼저 나온 catch의 내용만 출력
		// Java의 입장에서 첫번째 예외가 터졌을 때
		// 즉시 실행 중지하고, 해당 예외처리 부분으로 넘어가기 때문입니다.
		
		// x : 10, y : 0 -> 72 - 73 (Arith) - 77 - 78		
		// x : 10, y : 1 -> 72 - 73 - 74 - 75 -76(array) - 79 - 80
		// x : 2, y : 1 -> 72 - 73 - 74 - 75 - 76
														// 72번줄에서 try를 시작했으므로 시작번호가 72
//		try {											// 0으로 나눴을때는 arith에 걸려서 77 78 출력	
//			int d = x / y;								// 나눴는데 배열 범위 넘어가면 array로 넘어와서 79 80 출력
//			System.out.println(d);						// 정상적으로 됐을때는 arith랑 array로 안넘어가고 그 전까지만 출력
//			int [] ar = {1, 2, 3};
//			System.out.println(ar[x]);
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 어떻게 나누냐고~~");
//		}catch (ArrayIndexOutOfBoundsException aoe) {		// 위아래 두개 걸리면 첫번째 상황만 나옴.
//			System.out.println("배열 인덱스 범위가 넘었다고요~");
//		}
		
				
		try {
			int d = x / y;
			System.out.println(d);
			int [] ar = {1, 2, 3};
			System.out.println(ar[x]);
		} catch (Exception e) {
			System.out.println("도지 떡쌍ㅎ");
			e.printStackTrace();	// 상황 출력 (개발자용)
		}finally {
			System.out.println("억ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		}
		
		
	}
}
