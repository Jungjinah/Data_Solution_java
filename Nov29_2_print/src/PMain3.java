
public class PMain3 {
	public static void main(String[] args) {
		// printf
		// System.out.printf("%?", 값); 의 형태
		
		// 정수 (decimal)
		// %d : 정수데이터가 들어올 자리(decimal, 10진수) -> 모든 언어 공통!
		// %xd : 빈자리가 띄어쓰기로 채워져서 출력
		// %0xd : 빈자리를 0으로 채워서 x자리의 숫자로 만들어준다.
		
		
		System.out.printf("%d\n", 1);
		System.out.printf("%3d\n", 1);
		System.out.printf("%03d\n", 1);
		
		// 실수 (float)
		
		// %f : 실수데이터가 들어올 자리
		// %.xf : 소수점 이하의 자릿수  (잘리는 부분은 반올림처리)
		//		  빈자리는 0으로 채워줌
		
		
		System.out.printf("%.3f\n", 123.45678);

		System.out.printf("%.10f\n", 123.45678);
		
		// %s : 글자데이터가 들어올 자리 (String)
		// 숫자 : 그냥 입력하면 됨!
		// 글자 : 그냥 입력하면 Java의 문법으로 해석하기 때문에 -> 오류!
		// 			-> "내용" (큰 따옴표 안에 글자 넣기)
		System.out.printf("%s\n", "얄랄리얄라리따릴라러아");
		System.out.printf("%s\n", "벌써 4시 36분이양!");
		
		
		// 오늘날짜기준 연도, 월, 일
		
		
		
		
		//오늘날짜기준 연도
		System.out.printf("%s\n", "2021년");
		System.out.printf("%d년\n" , 2021);
		System.out.printf("%4d년\n" , 2021);
		
		//오늘날짜기준 월
		System.out.printf("%s\n", "11월");
		System.out.printf("%d월\n" , 11);
		System.out.printf("%02d월\n" , 11);

		//오늘날짜기준 일
		System.out.printf("%s\n", "29일");
		System.out.printf("%d일\n", 29);
		System.out.printf("%02d일\n", 29);

		//오늘날짜기준 연월일
		System.out.printf("%4d-%02d-%02d\n", 2021, 11, 29);
		
		// 날씨 : 구름
		System.out.printf("%s\n", "날씨 : 구름");
		System.out.printf("날씨 : %s\n", "구름");
		
		// 기온 : 5도
		System.out.printf("%s\n", "기온 : 5도");
		System.out.printf("기온 : %d도\n",  5);
		
		// 습도 : 21.8%
		// %% : %를 글자로 표현할 때(printf 에서)
		System.out.printf("%s\n", "습도 : 21.58%");
		System.out.printf("습도 : %.2f%%\n", 21.58);
		
		
	}

}
