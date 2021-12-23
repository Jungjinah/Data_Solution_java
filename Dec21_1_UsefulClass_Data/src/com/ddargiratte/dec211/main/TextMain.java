package com.ddargiratte.dec211.main;

import java.util.StringTokenizer;

public class TextMain {
	
	/* 버전
	 *		1.8.12버전이 있다고 가정하여,
	 *		앞자리 : major버전(1)
	 *		뒷자리 : minor버전(8.12)
	 *			더 뒷자리로 갈수록 더 minor한 느낌이다~
	 *		더 minor한 쪽이..
	 *			버전업이 됐는데 (1.8.12 -> 1.8.13) : 살짝 수정한 정도야,, (정기점검 같은 느낌)
	 *			버전업을 했는데 (1.8.12 -> 1.9.0) : 변화에 어느정도 느낌이 오는 그런 느낌,,
	 *			버전업을 다시..(1.8.12 -> 2.0.0) : 새로운 프로그램을 짠 느낌,,
	 */

	/* 네트워크를 통해서 데이터를 받아오면 : 글자형태로 받아옴
	 * 네트워크를 통해서 데이터를 주게되면 : 글자형태로 전해줌
	 * 한글처리하기가 까다로워,, 
	 */
	
	// String관련 기능들
	public static void main(String[] args) {

		String s1 = "으아아아아아아아"; // 기본형? NO! / 약식 YE
		String s2 = new String("곧 있으면 크리스마스! 스파이더맨~~");
		
		// <예제1>
		// s2에서 3번째에 있는 글자만 출력
		// chatAt() : 특정위치에 있는 글자를 뽑아낼때
		System.out.println(s2.charAt(3)); 
		
		// <예제2>
		// s2는 총 몇글자인지 출력
		// length() : 총 글자수를 알고 싶을때
		System.out.println(s2.length());
		
		// <예제3>
		// s2가 '곧' 이라는 단어로 시작하는지
		// startWith() : 시작하는 단어가 맞는지 확인될때, 결과는 (true / false)
		System.out.println(s2.startsWith("곧"));
		
		// <예제4>
		// s2에 '너무' 라는 단어가 있는지
		// contains() : 찾는 글자가 있는지
		System.out.println(s2.contains("너무"));
		
		// <예제5>
		// s2에서 '크리스마스'를 '새해!'로 바꿔서 출력
		// replace() : 특정 글자를 다른 글자로 바꿀때
		System.out.println(s2.replace("크리스마스!", "새해!"));
		
		// <예제6>
		// s2에서 2 ~ 5번째 글자만 출력
		// substring(시작위치, 끝위치-1) : 원하는 범위의 글자를 출력할때
		System.out.println(s2.substring(1, 5));
		
		System.out.println("======================");
		
		// String 객체를 생성하는데 형식을 잡아서 
		String s3 = String.format("무게 : %.2fkg", 123.45678);
		System.out.println(s3);
		// System.out.printf();
		// -> printf의 f는 format이다!
		
		// s2에 글자 추가
		// 한줄 추가
		s2 = s2 + " \n내년에는 모두 다 잘 됐으면 좋겠어요!";
		System.out.println(s2);
		s2 += "모두 부자되세요~~";
		System.out.println(s2);
		
		s2 = new String(s2 + "ㅎㅎㅎㅎ");
		System.out.println(s2);
				
		// String 대량으로 추가 ===========
		// append() : 덧붙이다
		StringBuffer sb = new StringBuffer(s2);
		sb.append("일은 적게하되 돈은 많이 벌게 해주세요!");
		sb.append("껄껄껄껄");
		sb.append("근데 주말에도 일해야해요,,");
		System.out.println(sb);
		
		// 새로운 String 추가
		String s4 = sb.toString();
		System.out.println(s4);
		
		// String 분리 ============ 2가지방법
		String s5 = "김비버,박비버,최비버,정비버";
		// 1. Split ============
		String[] s5Ar = s5.split(",");
		System.out.println(s5Ar[0]); // 첫번째
		System.out.println(s5Ar[3]); // 네번째
 		// split의 장점은 요소 하나하나 선택해서 분리 가능
		
		// 2. StringTokenizer ==============
		// StringTokenizer st = new StringTokenizer(s5, 기준점 );
		StringTokenizer st = new StringTokenizer(s5, ",");
		// 4명이 순서대로 출력
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		//  -> stringTokenizer는 순서대로 출력할 때
		
		// 반복문 형식(while문) + 순서대로 나옴
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		// <예제1>
		System.out.println("========1=========");
		String a = "I,My,Me,Mine";
		
		System.out.println("========split=======");
		String[] aAr = a.split(",");
		System.out.println(aAr[0]);
		System.out.println(aAr[1]);
		
		String[]s =a.split(",");
		for (int i = 0; i < aAr.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("========Token=======");
		StringTokenizer ar = new StringTokenizer(a, ",");
		System.out.println(ar.nextToken());
		System.out.println(ar.nextToken());
		System.out.println(ar.nextToken());
		
		while (ar.hasMoreTokens()) {
			System.out.println(ar.nextToken());
		}
		
		// <예제2>
		System.out.println("========2=========");
		String a1 = "I,My,,Me,Mine";
		
		System.out.println("========split=======");
		String[] a11 = a1.split(",");
		System.out.println(a11[0]);
		System.out.println(a11[1]);
		System.out.println(a11[2]);
		
		String[]a12 = a1.split(",");
		for (int i = 0; i < a12.length; i++) {
			System.out.println(a12[i]);
		}
		
		System.out.println("========Token=======");
		StringTokenizer a2 = new StringTokenizer(a1, ",");
		System.out.println(a2.nextToken());
		System.out.println(a2.nextToken());
		System.out.println(a2.nextToken());
		System.out.println(a2.nextToken());

		while (a2.hasMoreTokens()) {
			System.out.println(a2.nextToken());
		}
		// Tokenizer에서 ,, 두개를 한번에 없애지 못하는 이유
		// -> 속도가 너무 빨라서 따라가지 못하는 것임  
		
		// Split과 stirngTokenizer의 차이점
		// 속도적인면 : StringTokenizer
		// data속에서 변수가 많다면(잘라낼게 많다면) : Split
		
	}
		
}


