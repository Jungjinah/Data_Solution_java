import java.util.Scanner;

public class PMain3 {
	// 정수 두 개 넣으면 그 합을 출력하는 함수
	public static void printSum(int a, int b) {
		System.out.printf("%d + %d = %d\n", a , b, a + b);
	}
	
	// 정수 세 개 넣으면 그 합을 출력하는 함수
	// *** 오버로딩 : 굳이 함수 이름을 다르게 할 필요 없다. (본질이 같다면!)
	public static void printSum2(int x, int y, int z) {
		System.out.printf("%d + %d + %d = %d\n", x, y, z, x + y + z);
	}
		
	// 정수 n개 넣으면 그 곱을 출력하는 함수 (파라미터가 몇 개인지 모름..)
	//		함수 파라미터로 개수 무제한...
	//		(자료형...변수명)
	public static void printMul(int...n) { //***
		int mul = 1;
		// 함수 내에서 사용할때는 배열처럼...
		for (int i = 0; i < n.length; i++) {
			mul *= n[i];
		}
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		printSum(10, 20);
		System.out.println("----------------------");
		printSum2(10, 20, 30);
		
		
	}
	
}
