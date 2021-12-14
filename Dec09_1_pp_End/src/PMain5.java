
// 면접문제....ㅇㅂㅇ!
// Call By Value, Call By Reference
// 어떻게 답이 도출 되었는지 설명할 수 있어야..!

// Call By Value : 변수의 '값'을 복사해서 함수의 파라미터 값으로 사용하는 것
// Call By Reference : 변수를 참조하는 주소값(번지값)을 파라미터로 전달하는 것

public class PMain5 {
	public static void test(int a, int[] b, int[] c ) {
		System.out.println("b(green)" + b);	// 번지값
		System.out.println("c(green)" + c);	// 번지값
		System.out.println(a + "a(green)");		
		System.out.println(b[0] + "b(green)");
		System.out.println(c[0] + "c(green)");
		a = 100;
		b[0] = 100; // main쪽에 영향을 줌(참조형)
					// 기본형과 참조형의 차이!
		c = new int[] { 100, 200};  // 새로운 배열이 만들어짐
									// 말 그대로 새로운 수 (new)
									// new int[] 꼭 써줘야 -> 약식을 못 쓰는 이유(정규식이 아니라서/ 말 그대로 약식)
									// new int[] 가 정규식
		System.out.println("b(green)" + b);
		System.out.println("c(green)" + c);
		System.out.println("a(green)" + a);		// 20000
		System.out.println(b[0] + "b(green)");
		System.out.println(c[0] + "c(green)");
		
	}
	
	public static void main(String[] args) {
		int a = 10;
		int[] b = { 10, 20 };
		int[] c = { 10, 20 };
		System.out.println("b(red)" + b); // 번지값
		System.out.println("c(red)" + c); // 번지값
		test(a, b, c); // test 함수 위로 올라감,,
		System.out.println(a + "a(red)");
		System.out.println(b[0] + "b(red)");	// *** 값 변경에 영향을 받았음
		System.out.println(c[0] + "c(red)");	// *** 값 변경에 영향을 받지 않았음
												// test 함수의 변경된 c와는 다드릭 때문에
	
	}
}
		
	

