import java.util.Random;
import java.util.Scanner;

public class YMain1 {
	// (3보다 작은) 정수를 입력받는 함수
	// 3보다 크거나 같을 때 -> 다시 입력 받을 수 있도록!
	
	
	public static int getNum() {
		
		Scanner key = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num = key.nextInt();
		return (num < 3) ? num : getNum();
	}
	
	// 홀수만 입력 받을 수 있는 함수
	// -> 짝수 입력하면 다시 입력받을 수 있도록
	
	public static int getNum2() {
		Scanner key = new Scanner(System.in);
		System.out.println("숫자 : ");
		int n = key.nextInt();
		return (n % 2 == 1) ? n : getNum2();
	}
	
	// 정수를 입력받는 함수 => 0 ~ 100
	
	public static int getNum3() {
		
		Scanner key = new Scanner(System.in);
		System.out.print("0 ~ 100 : ");
		int num = key.nextInt();
		return (0 <= num && num <= 100) ? num : getNum3(); 
	}
	
	
	
	
	

	public static void main(String[] args) {
		int num1 = getNum();
		System.out.println(num1);
		System.out.println("---------------");
		int num2 = getNum2();
		System.out.println(num2);
		System.out.println("---------------");
		int result = getNum3();
		System.out.println(result);
		
}
	
	
}
