import java.util.Scanner;

public class YMain2 {
	
	// f1 : 정수를 하나 입력받아서
	// 그게 양수면 '양' 출력 / 0이면 '0' 출력 / 음수면 '음' 출력
	
	public static int inInteger () {
		
		Scanner key = new Scanner(System.in);
		System.out.print("정수 : ");
		int f1 = key.nextInt();
		if (f1 > 0) {
			System.out.println("양");
		}else if (f1 == 0) {
			System.out.println(0);
		}else {
			System.out.println("음");
		}
		return f1;	
	}
	
	// f2 : 정수를 하나 입력 받아서
	// 3의 배수면  "3의 배수"
	// 	가 아니고 4의 배수면 "4의 배수"
	// 도 아니면 몰라!!
	// 를 판정해주는(출력할 생각은 없고) 함수
	
	public static String f2() {
		
		Scanner key = new Scanner(System.in);
		System.out.print("숫자를 입력하라 : ");
		int a = key.nextInt(); 
		
		if (a % 12 == 0) {
			return "3과 4의 공배수";
		}else if (a % 3 == 0) {
			return "3의 배수";
		}else if (a % 4 == 0) {
			return "4의 배수";
		}else {
			return "나도 몰라!!";
		}	
	}

	
	
	
	public static void main(String[] args) {
		
		int f1 = inInteger();
		//System.out.println(a);
		System.out.println("-------------");
		String a = f2();
		System.out.println(a);
		
	}
}
