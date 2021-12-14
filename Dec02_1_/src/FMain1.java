import java.util.Random;

// 함수 (Function)
// 		관련있는 기능(작업)들을 묶고
//		필요할때마다 불러서(호출해서) 사용이 가능 o

// JDK (자바 개발키트) > JRE (자바 실행환경)
// 실행 시 JRE가 OS(운영체제)에 맞춰서 > JVM(자바 가상머신)
//		-> WORA (Write Once Read AnyWhere) - Java의 장점!
//			OS별로 프로그램을 만들지 않아도 됨!

public class FMain1 {
	
	//public static 리턴타입 함수명(파라미터, 파라미터, ...) {
		//내용
		//return
				
		// 리턴타입 : 반환될 값의 자료형
		// 함수 내에서 식이 완성이 되고, main함수로 반환할 결과값에 대한 자료형
		// return이라는걸 사용해서 반환할 거고, 사용은 이따가!
				
		// 함수명 : 말그대로 이 함수의 이름
		//		1. 숫자로 시작하면 -> 에러!
		//		2. 특수문자, 띄어쓰기 -> 에러!
		//		3. 자바문법(예약어) -> 에러!
		//		Java의 문화)
		//		4. 함수명을 봐도 무슨 기능인지 알 수 있게!
		//  	5. 소문자로 시작
		//		6. 가독성을 위해서
		//			뱀체 : abcd_efg_ji
		//			낙타체 : abdeEfgJi
		// 		7. 한글 사용 x
		//	변수명 vs 함수명
		//	(명사)   (동사)
		
		// 파라미터 (인자, parameter) : 함수를 실행하는데 필요한 재료
		// 필요한 개수만큼 하되, 자료형에 맞춰 사용해야함!

	
	//}
	
	public static void prinMyThink() {
		// 현재 본인의 생각을 출력!
				System.out.println("벌써부터 배가 고파지넹");
				System.out.println("점심엔 뭐먹지");
				System.out.println("어제 먹은 김치나베");
				System.out.println("괜찮았는뎅");
				System.out.println("오늘은 추우니까");
				System.out.println("지하가서 먹자고 할까");
				System.out.println("지하 밥집 생각보다");
				System.out.println("괜찮았단 말이징");
				System.out.println("언니들도 맘에 들어했으니까");
				System.out.println("지하가서 움,,");
				System.out.println("같은 곳을 가자고 할까");
				System.out.println("아니면 부페식당 가자고 할까");
				System.out.println("셋 다 카레는 별루였다구 했징");
	}
	
	
	// 자기소개하는 함수 (이름, 핸드폰번호, 사는 곳 출력)
	public static void introduce() {
		System.out.println("이름 : 정진아");
		System.out.println("핸드폰번호 : 01054798483");
		System.out.println("사는 곳 : 봉천");
	}
	
	// 정수 두개를 넣으면, 사칙연산 결과를 출력해주는 함수
	// 계산하는 함수
	// 계산이라는 작업을 하려면, 숫자가 필요
	// 파라미터(parameter) : 함수를 실행하는데 필요한 재료
	
	
	public static void Integer(int x, int y) {
		
		System.out.println("--------------------");
		
		int plus = x + y;
		int minus = x - y;
		int multiply = x * y;
		double divide = x / (double)y;
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		
	}
	
	
	
	// 실행 시 JVM이 main을 자동으로 호출!
	// 우리가 자동완성해서 사용한 이 main도 사실은 함수의 일종!
	public static void main(String[] args) {
		
		prinMyThink();
		System.out.println("--------------------");
		introduce(); //함수호출
		Integer(10, 20);
		Integer(8, 2);
}
	
}
 