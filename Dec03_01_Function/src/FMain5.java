import java.util.Random;
import java.util.Scanner;

public class FMain5 {
	
	// B : 함수명 / 기능이 대충이라도 보이기,, 동사같은 작명
	// 			  낙타체 , 뱀체 활용
	// C : 파라미터 / 함수를 호출하는 쪽에서(Main 함수)에서 해당 함수 쪽으로 데이터를 보낼 때
	//				( 자료형 변수명, 자료형 변수명, ...)
	// A : 리턴타입 / 해당 함수에서 작업한 결과를 호출한 쪽(Main 함수)으로 보낼 때
	//				
	// public static A B ( C ) {
	//		내용	
	//		 return
	// }
	
	// 현재 날씨를 구하는 함수
	public static String getWeather() {
		//오늘 날씨 맑음 -> blue
		String weather = "맑음";
		return weather;
		
	}
	
	// 1. 랜덤한 정수를 하나 구하는 함수
	public static int get() {
		Random r = new Random();
		int i = r.nextInt();
		return i;
		
	}
	
	// 3. 두 정수를 더한 값을 출력하는 함수
	public static void plus(int a, int b) {
	System.out.println(a + b);
	}
	
	
	public static void main(String[] args) {
		
		String weather = getWeather();
		System.out.println(weather + "^^7");
		System.out.println("------------");

		get();
		
		// 2. 랜덤한 정수 2개 구해서,,
		int a = get(); 
		int b = get();
		System.out.println(a);
		System.out.println(b);
		
		// 4. 랜덤한 정수 2개 더한 값을 출력 (3번 이용해서)
		plus(a, b);
	}
	
}
