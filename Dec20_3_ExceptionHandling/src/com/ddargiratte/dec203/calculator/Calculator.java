package com.ddargiratte.dec203.calculator;

public class Calculator {
	// 1. 여기서 아예 끝장을 보자!! : try - catch - finally
	// 정상적으로 돌아갔다면 : 7 - 8 - 9 - [14 - 15 - 16] - 10	([finally]는 retrun보다 빨리 된다!)
	// 만약에 y에 0을 넣어서 Arithmetic이 걸리면 : 7 - 8 - 9(Arith) - 11 - 12 - [14 - 15 - 16] - 13
	public static double divide(int x, double y) {
		try {
			double d = x / y;
			return d;
		} catch (Exception e) {
			System.out.println("으엑!");
			return -9999;
		}finally {
			System.out.println("억ㅋㅋㅋㅋㅋㅋㅋ");
		}
	}
	
	// 2. 미루기 : throws -> try보다 더 주력
	// divide2를 실행하다가 Arithmetic..가 터지면
	// divide2를 호출한 쪽에서 해결해라!
	public static double divide2(int x, double y) throws /* Arithmetic*/ Exception {
		double d = x / y;
		return d;
	}
	
	
}
