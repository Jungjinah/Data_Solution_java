import java.util.Scanner;

public class FMain4 {

	// 오버로딩 (Over loading) -> 고오오오오오오급 기술!
	// 함수명 같게, 파라피터를 다르게 하는 기술
	// 호출할 때 어떤 값을 넣었냐에 따라 함수가 불러지게 하는 기술
	
	// 같은 자료형으로 써도, 파라미터의 개수가 다르면 오버로딩 o
	// 파라미터의 개수가 같아도, 다른 자료형을 사용하면 오버로딩 o
	
	
	
	// 정수 2개를 넣으면 그 합을 출력해주는 함수
	
	public static void printSum (int x, int y) {
		System.out.println(x + y);	
	}
	
	// 정수 3개를 넣으면 그 합을 출력해주는 함수
	
	public static void printSum (int a, int b, int c) {
		System.out.println(a + b + c);
		
	}
	
	// 실수 3개를 넣으면 그 합을 출력해주는 함수
	
	public static void printSum (double q, double w, double e) {
		double MS = q + w + e;
		System.out.println(MS);
		
	}
	
	// 정수를 넣으면 -> '윽!' 출력
	// 문자열을 넣으면 -> '악!' 출력
	// 실수를 넣으면 -> 으아아아악! 출력
	// 아무것도 넣지 않으면 -> 졸리다.. 출력
	
	public static void Euk (int a ) {
		System.out.println("윽!");
	}
	public static void Euk (String b ) {
		System.out.println("악!");		
	}
	public static void Euk (double c ) {
		System.out.println("으아아아악!");
	}	
	public static void Euk () {
		System.out.println("졸리다...");
	}

	
	// 프로그램 실행 시 -> JVM -> main함수를 자동으로 호출
	public static void main(String[] args) {
		printSum(10, 5);
		printSum(30, 20, 10);
		printSum(3.4, 3.2, 4.3);
		System.out.println("----------------------");
		Euk("a");
		Euk(4);
		Euk();

		// 오버로딩,,을 알아봤는데,,
		// 사실 우리는 첫날부터 이 오버로딩을 사용하고 있었습니당,,ㅇㅂㅇ
		// System.out.println(); -> 오버로딩 대표적인 예!
	}
}




