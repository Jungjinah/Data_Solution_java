import java.util.Random;
import java.util.Scanner;

// 재귀적 호출 (recursive call)
// 함수 속에서 자기 자신(이 함수)을 또 호출 -> 반복

// 함수를 부른다 -> 느린작업


public class FMain6 {
	
	// 1) 등차수열
	// 정수를 하나 넣으면
	// 1 + 2 + 3 + ... + 그 숫자까지
	// 다 더하는 값을 구해주는 함수
	
	// add(1) = 1
	// add(2) = 3 add(1) + 2
	// add(3) = 6 add(2) + 3 = add(1) + 2 + 3
	
	public static int add(int x) {
		
		int answer = (x == 1) ? 1 : (x + add(x - 1));
		return answer;
	}
	
	// 2) 정수를 하나 넣으면 factorial 값 구하는 함수
	public static int multiply(int a) {
		int result = (a == 1) ? 1 : (a * multiply(a - 1));
		return result;
	}
	
	// 3) 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ... -피보나치수열
	public static int pbnchi(int b) {
		int result = (b < 3) ? 1 : (pbnchi(b-1) + pbnchi(b-2  ));
		return result;
		
	}
	
	public static void main(String[] args) {
	int i = add(10);
	System.out.println(i);
	System.out.println("-----------");
	int a = multiply(4);
	System.out.println(a);
	
	int b = pbnchi(3);
	System.out.println(b);
	
}
}
