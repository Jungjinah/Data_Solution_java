
/*	정리
 *  1. 기계어 상태의 소스가 stack영역에 깔림 (차곡차곡)
 *  2. static멤버변수들이 static영역에 배치
 *  3. JVM Smain.main(...); 를 호출
 *  4. 실행
 */


public class SMain1 {

	public static void main(String[] args) {
		
		// 과자 객체
		// 이름 / 중량 / 가격
		
		// 현재 main에는 과자가 없는 상태
		// 과자 이름? -> 모름
		// 과자 중량? -> 모름
		// 과자 가격? -> 모름
		// 과자 생산자? -> DDargiratte
		System.out.println(Snack.MANUFACTURE);
		System.out.println("----------------");
		
		
		Snack s1 = new Snack();
		s1.name = "홈런볼";
		s1.weight = 90.3;
		s1.price = 1500;
		s1.printInfo();
		System.out.println("----------------");
		
		Snack s2 = new Snack();
		s2.name = "미쯔";
		s2.weight = 50.7;
		s2.price = 1000;
		s2.printInfo();
		System.out.println("---------------");
		// 일단 생산자는 다 DDargiratte가 맞다!
		
		// 여기서 미쯔를 만든 생산자의 이름을 바꿔보자
//		s2.MANUFACTURE = "JinaFithing"; // 에러!
//		s2.printInfo();
		// 생산자는 다 DDargiratte라매,,?
		
		Snack.printTaste();
		
		
		
		
		
	}
	
	
	
}
