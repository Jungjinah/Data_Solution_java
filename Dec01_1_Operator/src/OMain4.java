import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		
		// 이름을 하나 입력받을거,,
		// 그 이름이 '홍길동'이랑 같은지 true / false
		
		Scanner key = new Scanner(System.in);
		
		
		System.out.print("이름 : ");
		String name = key.next();
		boolean hkd = (name == "홍길동");
		System.out.println(hkd);
		System.out.printf("이름이 같음? %b\n", hkd);

		// ** String 같은지 비교
		// 대상의 값 자체를 비교하기 위해서 .equals를 사용!
		boolean hkd2 = name.equals("홍길동");
		System.out.println(hkd2);
		System.out.println("---------------------");
		
		// Shift 연산자 : 다중선택,,
		// shift : 옮기다 이동하다
		// (십진수 << 정수) 의 형태
		// << : 앞에 있는 수를 2진수로 바꾸고, 뒤에 있는 수만큼 왼쪾으로 밀어라.
		// 비어있는(오른쪽) 칸 수를 0으로 채우고, 2진수를 다시 10진수로 바꿔라.
		
		// ex) 카페!
		//		24시간 : 1 << 0 = 1
		//		와이파이 : 1 << 1 = 2
		//		흡연실 : 1 << 2 = 4
		//		주차장 : 1 << 3 = 8
		
		// A매장 : 2    와이파이
		// B매장 : 8	   주차장
		// C매장 : 13   주차장 흡연실 24시간
		// D매장 : 6    흡연실 와이파이 
		
		int c = (150 << 6);
		System.out.println(c);

		
		// 연산자
		//		단항 연산자 : a++, a--,!a, ...
		//		이항 연산자 : a + b, a > 10, ...
		//		삼항 연산자 :  
		//				조건을 따져서 값을 대입할 때 사용
		//				if문으로 대체 가능하지만 문법이 길어짐
		//				조건식 ? 조건을 만족할 때 쓸 값 : 조건불성립시 쓸 값
		
		// 나이 값도 입력해서 받아볼거
		// 나이가 20살 이상이면 '안녕하세요'
		// 나이가 20살 미만이면 'NAGA!' 를 출력
		
		// ** 3항 연산자 **
		System.out.print("나이 : ");
		int age = key.nextInt();
		System.out.printf("나이는 %d살\n", age);
		String result = (age >= 20) ?  "안녕하세요" : "NAGA!";
		System.out.println(result);
		
		// 나이가 50살 이상이면 '강녕하세요'
		// 나이가 50살 미만이면 '안녕하세요'
		
		System.out.println("나이 : ");
		int yeonsae = key.nextInt();
		System.out.printf("나이는 %d살\n", yeonsae);
		String result2 = (yeonsae >= 50) ? "강녕하세요" : "안녕하세요";
		System.out.println(result2);
		
		// 홍길동씨 1강의장 1강의장
		// 나이가 짝수 : 1강의장
		// 이외에 나머지는 : 2강의장

		String classNo = ((age % 2 == 0) || name.equals("홍길동"))  ? "1강의장" : "2강의장";
		System.out.println(classNo); 

		// 이름이 곽두팔이면서 10살 이하면 1강의장
		// 나머지는 2강의장
		
		String classNo2  = ((name.equals("곽두팔")) && (age <= 10)) ? "1강의장" : "2강의장";
		System.out.println("classNo2");
		
	
		
		
		
		
		
		
		
		
		
		
	}
}
