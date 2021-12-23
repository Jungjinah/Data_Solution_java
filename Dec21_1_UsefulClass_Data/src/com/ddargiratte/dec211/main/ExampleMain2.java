package com.ddargiratte.dec211.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExampleMain2 {

	// 학생의 (이름/생년월일(yyyyMMdd)/국어/수학/영어)를 입력받아서
	// 학생의 나이(한국나이), 총점, 평균 값을 출력
	// stringTokenizer
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("이름/생년월일(yyyyMMdd)/국어/수학/영어");
		String s = key.next();
		
		StringTokenizer st = new StringTokenizer(s, "/");
		
		// 나이 국.영.수 점수
		int sum = 0;
		int kor = 0;
		int math = 0;
		int eng = 0;
		String birthday = null;			// 문자열 기본값은 null
		String name = null;				// 숫자는 기본값 0
		
		while (st.hasMoreTokens()) {					// while 안에 토큰 있으면 true
			
			try {
				// 이름
				name = st.nextToken();
				
				// 나이
				birthday = st.nextToken();
				
				//국영수
				kor = Integer.parseInt(st.nextToken());
				math = Integer.parseInt(st.nextToken());
				eng = Integer.parseInt(st.nextToken());
				sum += kor + math + eng;				// count++는 숫자가 정해진 개수가 없을때 사용하므로
														// 여기는 3개 개수가 있으므로 쓸 필요 없음!
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		//birthday = 19980801
		Date nowYear = new Date();								// Date(util꺼) : 오늘 날짜 출력
		int stYear = Integer.parseInt(birthday.substring(0, 4));// substring 쓰는 이유
		int stAge = (nowYear.getYear()+1900) - stYear + 1;		//  -> 주어진 글자에서 특정문자를 꺼내고 싶을때 씀
		System.out.printf("이름 : %s\n", name);					// 52번줄-> nowyear는 Date(자료형)이므로
		System.out.printf("나이 : %d\n", stAge);					// + parse같이 형변환을 해줘야하는
		System.out.printf("합계 : %d\n", sum);					// Date는 getYear 기능을 가지고 있이 때문에 저렇게 쓴다~
		double avg = (double) sum / 3;
		System.out.printf("평균 : %.1f\n", avg);
		
	}
	
}
