package com.ddargiratte.dec211.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleMain1 {
	// 학생의 (이름/생년월일(yyyyMMdd)/국어/수학/영어)를 입력받아서
	// 학생의 나이(한국나이), 총점, 평균 값을 출력
	// split
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("이름/생년월일(yyyyMMdd)/국어/수학/영어");
		String s = key.next();
		String[] sData = s.split("/");							// sData라는 배열을 만듬. (그 안에 /를 제거한 채로 s데이터 들어감)
		
		// 이름
		String name = sData[0];									// 배열의 0번째 자리 : 이름
		System.out.printf("이름 : %s\n", name);					// 이름 출력
		
		// 나이																
		try {																		
			String bd = sData[1];											// bd 안에 19980801 들어감	
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");		// simpleDateFormat 쓰는 이유 (String일때만 쓸 수 있음)
			Date birthday = sdf.parse(bd);									// -> "(이 내용은 정해져있어)" 원하는 형식을 만들기 위해서				
			System.out.println(birthday);									// sdf는 연도월일 이라는 형태로 지정한다는 것
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E");
			String birthdayStr = sdf2.format(birthday);
			System.out.println(birthdayStr);

			Date now = new Date();											// 오늘 날짜 출력
			SimpleDateFormat nowFmt = new SimpleDateFormat("yyyy");			// 연도만 갖고온다
			String nowYr = nowFmt.format(now);								// 현재 연도
			String birthdayYr = nowFmt.format(birthday);					// 탄생일 연도
			
			int ny = Integer.parseInt(nowYr);								// 형변환처리
			int by = Integer.parseInt(birthdayYr);
			int age = ny - by + 1;
			System.out.printf("나이 : %d살\n", age);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 국어 영어 수학 점수
		int kor = Integer.parseInt(sData[2]);  // 국어점수 형변환처리 세개 다
		int math = Integer.parseInt(sData[3]);  // 수학점수
		int eng = Integer.parseInt(sData[4]);  // 영어점수
		
		System.out.printf("국어 : %d점\n", kor);
		System.out.printf("수학 : %d점\n", math);
		System.out.printf("영어 : %d점\n", eng);
		
		int sum = kor + math + eng;
		System.out.printf("총점 : %d점\n", sum);
		double avg = (double) sum / 3;
		System.out.printf("평균 : %.1f점\n", avg);
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
