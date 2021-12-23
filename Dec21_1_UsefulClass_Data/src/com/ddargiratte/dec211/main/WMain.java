package com.ddargiratte.dec211.main;

public class WMain {

	/* Wrapper Class : (자료형) 기본형들의 객체형 (포장객체라고도 함)
	 *		ex) Integer, Double, Long, Void, Boolean,,
	 *		기본 자료형을 객체로 다루기 위해 사용하는 Class
	 *		Java의 기본형은 값을 가지고 있는 객체 생성이 가능
	 *		기본형이 가지고 있는 값을 내부에 두고 그 위를 포장하는 방식
	 * Boxing : 기본형 -> 래퍼클래스
	 * UnBoxing : 래퍼클래스 -> 기본형
	 * 
	 * - 언제 사용하나?
	 * 1. 객체나 클래스가 제공하는 method 사용할 때
	 * 2. 클래스가 제공하는 상수를 사용하고 싶을 때(MIN_VALUE, MAX_VALUE,...)
	 * 3. 숫자, 문자로 형변환을 할 때 (v, 우리가 잘 사용해! 체크체크~)
	 *  
	 */

	public static void main(String[] args) {
	
		int a = 10;
		String a1 = "100";
		// int b = (int) a1; 얘는 불가능,,
		// 그래서 아래처럼 만들어줘야해
		
		// Integer 객체를 생성 -> 정수값을 넣어서 -> int형으로 return
		Integer b = new Integer(a1);	// * 자료형이 integer이라는 (b = 객체)를 생성
		b.intValue();					// 포장객체(b)를 뜯어서 int형으로 값(Value)바꿔주기
		System.out.println(b);			// a1의 값을 출력하고
		System.out.println(b.TYPE);		// a1의 값이 int형으로 잘 바꼈는지 확인차
		// -> 객체형 -> 기본형
		
		// 기본형 -> 객체형
		double c = 123.456;
		Double d= new Double(c);		// * 
		
		// 객체형 -> 기본형
		Boolean e = new Boolean(true);  // * 
		Boolean f = e.booleanValue();	
		
		// 객체형 -> 기본형 (더 쉬운 방법) -> 위의 과정을 자동으로해줌 : Auto-UnBoxing
		Integer g = 10;
		
		// 기본형 -> 객체형 (더 쉬운 방법) -> 위의 과정을 자동으로해줌 : AutoBoxing
		int h = g;
		
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		
		// int 자료형의 값을 -> String(문자형)으로
		String num1 = Integer.toString(321);
		
		// int 자료형의 값 -> 2진수의 형태로(String)
		String num2 = Integer.toBinaryString(5); 
		 
		// String -> 기본형 (다이렉트로는 힘들고 객체형 거쳐야..)
		// String -> 객체형 -> 기본형 (이 형태로 가야함)
		String k = "345.67";
	 // double d = k.pars -> 이렇게 안되니까 아래처럼!
		// <1>방법
		Double k2 = Double.parseDouble(k);
		double k3 = k2.doubleValue();
		
		// <2>방법
		String m = "150";						// parse 쓰는 이유
		int m2 = Integer.parseInt(m);			// 가져온 문자열 데이터를 계산하기 위해 숫자로 변환하는 작업 과정
		
	}
}

// parse[x]-> 기본형 자료형 /  숫자 ->  문자로 => toString

// 객체 기본형 참조형  
// boolean 기본형
// Boolean 객체
// Integer -> int
// String -> String (참조형)
// Double -> double
// Void -> void (return할게없다.)
// Char -> char	(한글자를 나타내는 문자.) -> 문자열이 아니라 문자열은 string