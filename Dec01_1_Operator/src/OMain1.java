import java.util.Scanner;

public class OMain1 {
	public static void main(String[] args) {
		
		// 변수
		// (자료형 변수명 = 값;)
		// =(대입연산자)
		// A = B
		// 우항에 있는 것을 좌항에 넣어라.
		// 변수에 값을 넣을 때 사용
		
		// 사칙연산 (Scanner + 출력)
		// 숫자는 2개만 입력받음 (x, y)
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("x = ");
		int x = key.nextInt();
		
		System.out.print("y = ");
		int y = key.nextInt();
		
		//System.out.printf("첫번째 문제 : %.2f\n", x + y);
		//System.out.printf("두번째 문제 : %.2f\n", x * y);
		//System.out.printf("세번째 문제 : %.2f\n", x / y);
		//System.out.printf("네번째 문제 : %.2f\n", (x - y)/3);
		//System.out.printf("다섯번째 문제 : %.2f\n", x * y * ( x - y ));
		
		 int plus = x + y;
		 int minus = x - y;
		 int multiply = x * y;
		 int divide = x / y;
		
		System.out.printf("%d + %d = %d\n" , x, y, plus);
		System.out.printf("%d - %d = %d\n" , x, y, minus);
		System.out.printf("%d * %d = %d\n" , x, y, multiply);
		System.out.printf("%d / %d = %d\n" , x, y, divide);
			// int / int = int (Java 한정) ex)  10 /  4 = 2 (o), 2.5 (x)
			// double / int = double
			// int / double = double
			// double / double = double
		double divide2 = (double) x / y; // 형 변환
		System.out.println(divide2);
		
		int remainder = x % y; // 나누기 후 나머지 값 구할 때
							   // ex) 10 % 4 = 2 (o)
		System.out.println(remainder);
		
		// 다시 리마인드!!
		// x = 10, y = 4
		// A = B 는 같다는 의미가 아니라, <A에 B를 넣어라!>
		System.out.println("-------------------");
		System.out.printf("x는 %d\n", x);
		System.out.printf("y는 %d\n", y);
		
		x = y;
		
		System.out.printf("x는 %d\n", x);
		System.out.printf("y는 %d\n", y);
		System.out.println("-------------------");
		
		// 대입연산자 활용
		// [+=, -=, *=, /=, %=]
		// 한 글자당 2byte -> 한 글자라도 덜 치면... bset~
		x += 1; //x = x + 1;
		System.out.println(x);
		x -= 1; //x = x - 1;
		System.out.println(x);
		x *= 2; //x =  x * 2;
		System.out.println(x);
		x /= 2; //x = x / 2;
		System.out.println(x);
		
		x %= 2; //x = x % 2;
		System.out.println(x);
		
		System.out.println("-------------------");
		x++; //x += 1; //x = x + 1;
		System.out.println(x);
		
		x --; //x -= 1;//x = x - 1;
		System.out.println(x);
		System.out.println("플러스랑 마이너스만 줄여서 가능해여!");
		System.out.println("-------------------");
		
		
		
		
		
		
	}
}
