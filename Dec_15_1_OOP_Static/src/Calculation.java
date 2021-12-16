
// 변수를 왜 만드나요? : 데이터 저장하려고 -> Memory상의 공간에
//		변수 : 메모리를 저장하하는 공간(그릇)

// 객체 왜 만드나요? : 실생활스러운 변수(속성)을 만들어서 알아보기 편하게,,
// 				  static 없는 method 가지고 오려고!


public class Calculation {
	
	// 멤버변수 없음 -> 저장할게 없음.
	// 			 -> 계산기 객체를 만들 필요 없음.
	//			 -> static 메소드 기반
	
	public static void printSum(int a, int b) {
		System.out.println(a + b);
	}
	public void sum(int a, int b, int c) {
		
		System.out.println(a + b + c);
		
		
	}
	



}
