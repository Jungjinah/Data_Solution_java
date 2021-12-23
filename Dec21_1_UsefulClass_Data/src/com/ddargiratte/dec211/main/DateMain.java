package com.ddargiratte.dec211.main;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Locale;

/* Date.java : 아~~주 옛날 (1900년대) 만들어진 Class
 *			Y2K에 관심이 없던 시절..(Year 2000 Problem) >> k = 1000
 *			현재 실정에 맞지 않음
 *			현재 용량이 적었기 때문에 연도 끝에 2자리만...
 *			1970년대 이전의 컴퓨터 : 속도가 느리고 장치의 용량도 적었다.
 *			데이터량을 아끼기 위해서 연도를 4byte가 아닌, 2byte로 할당(연도끝에 2자리만..)
 *			문제가 생김
 *			1900년, 2000년 끝의 두자리가 00으로 통일 -> 구분이 불가능
 *				-> 컴퓨터의 오작동 가능성이 높아짐..!
 * 
 * deprecated
 *			세월이 흐르고, 컴퓨터도 발전 -> 옛날에 만들어 놓은거 못씀..
 *			프로그래밍언어도 업데이트가 되어야..
 *			없애거나 / 기능을 수정할 계획이 생겨버림
 *			현재 버전에서는 OK! / 다음 버전에 없어져도 불만 갖지마라!
 *
 */

// <슨생님 문제>
// Date : 날짜 / 시간

public class DateMain {
	public static void main(String[] args) {
		// 기본생성 -> 현재 시간/날짜 알려줌
		Date now = new Date();								// Date 두번째꺼 util 쓸거임!
		
		// 현재시간 날짜를 출력
		System.out.println(now);							// 이건 찐 현재 나타내주는 함수같은거 (= now)
		
		// 연도
		System.out.println(now.getYear() + 1900);				
		// 월
		System.out.println(now.getMonth() + 1);
		// 일
		System.out.println(now.getDate());
		// 요일
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(day[now.getDay()]);
		// -> 0(일) 1(월) 2(화) ... 6(토)
		
		System.out.println("=========================");
		// 한글처리 / 날짜 / 시간 : 지속적으로 여러분들을 괴롭힐것,,,,ㅇㅂㅇ
		
		// Date - 형식지정 -> String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd E a hh:mm", Locale.FRANCE);
		String s1 = sdf.format(now);					// SimpleDateFormat에 커서를 두면
		System.out.println(s1);							// + 연도 월 일 시간 모두 쓰는 방법 써있음
														// Locale은 나라 지정하면 그에 맞는 언어 지정됨
		System.out.println("=========================");
		
		// 특정한 시간날짜
		Date d2 = new Date(2000, 11, 11); 	// -> 이건 좀 비추,,
		
		// 그래서 String - 형식지정 -> Date
		
//		String s2 = "2021.06.25";					
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
//		Date d3 = sdf2.parse(s2);						// -> exception이 떠서 try 쓴다.
//														// -> pars쓰는 이유는 string을 date타입을 바꾸려고
		
		try {											// try를 쓰는 이유는 위와같이 안되기 때문에
			String s2 = "2021.06.25";					// -> 그래서 예외처리한다.
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
			Date d3 = sdf2.parse(s2);					// -> 이것도 형변환 한거임
			System.out.println(d3);
		} catch (Exception e) {
			e.printStackTrace();						// 에러 어떤거 뜨는지 알게 하기 위해 쓰는거임
		}												// 가급적 쓰는게 좋다구 쌤이 말씀하심!
		
		System.out.println("========================");
		
		// <예제1>
		// 10년 전 크리스마스는 무슨 요일일까요??
		try {
			String Christmas = "2011.12.25";
			SimpleDateFormat chs = new SimpleDateFormat("yyyy.MM.dd");
			Date dd = chs.parse(Christmas);
			System.out.println(dd);
			System.out.println(day[dd.getDay()]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
