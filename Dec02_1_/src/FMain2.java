
public class FMain2 {

	
	public static void test(int b) { // 파라미터 값으로 불러오고 그 다음 함수 안에 있는
									 // 내용이 진행되어서 그림상 b가 먼저 stack에 쌓임
		int a = 123;
	
		System.out.println(b); // 30
		System.out.println(a + b); // 153
	}
	
	
	public static void main(String[] args) {
		int a = 10;		// 지역변수 (local variable)
		int b = 20;		// 함수 내에서 만든 변수
						// 그 함수 내에서만 사용이 가능!
		int c = 30;		
		test(c);
		System.out.println(b); // 20
		
		// 같은 공간 내에서는 같은 변수명 불가능~
		// ex) int a = 100; -> 에러!
		
		
	}
	
}
