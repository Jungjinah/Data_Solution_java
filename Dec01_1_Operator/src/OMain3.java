import java.util.Scanner;

// 논리연산자
//		결과가 boolean (true / false)
//		>, >=, ==, !=, <, <=
//	 초과, 이상, 같다, 다름, 미만, 이하 
public class OMain3 {
	public static void main(String[] args) {
		
	// 놀이공원에서 놀이기구를 타도 되나 판정해주는 프로그램
	// 키(cm),  나이
	// 키는 xxxcm, 나이는 xx살
		
		
	Scanner key = new Scanner(System.in);	
		
	System.out.print("키 :");
	double Height = key.nextDouble();
	
	System.out.print("나이 :");
	int age = key.nextInt();
	
	System.out.printf("키는 %.1fm , 나이는 %d살\n", Height, age);
	
	System.out.println("--------------------------------");
	
	// 나이가 10살이 넘는 사람만 탈 수 있음
	boolean agee = (age > 10);
	System.out.printf(">10 탑승 가능 ? : %b\n", agee);
		
	// 나이가 5살 미만만 탈 수 있음
	boolean age1 = (age <5);
	System.out.printf("<5 탑승 가능 ? : %b\n", age1);
	
	// 나이 20살만 탈 수 있음!
	boolean age2 = (age == 20);
	System.out.printf("==20 탑승 가능 ? : %b\n", age2);
	
	// 나이 1살만 아니면 됨
	boolean age3 = (age != 1);
	System.out.printf("!=1 탑승 가능 ? : %b\n", age3);
	
	// 나이가 홀수인 사람만 탈 수 있음!
	boolean age4 = (age % 2 == 1 );
	System.out.printf("=홀수 탑승 가능 ? : %b\n", age4);
	
	System.out.println("--------------------------------");
	
	// 고오오오오급 내용!
	//	~고 (and) : &&
	//			 -> 확률 낮은 것을 앞으로 배치
	//	~거나 (or) : || (shift + \)
	//	XOR		  : ^  (eXclusive OR) => 두 입력이 서로 다를 때 '1' 결과값을 출력
	//	NOT		  : !  => 결과를 뒤집는 것
	
	// A && B : A도 만족, B도 만족 => 최종 ok!
	//	-> 확률이 낮은 조건을 앞으로 배치,, 
	// A || B : A가 만족하거나, B가 만족하거나, 둘 다 만족하거나 => 최종 ok!
	//	-> 확률이 높은 조건을 앞으로 배치,,
	
	// 나이가 3살이 넘고, 키가 2m 넘어야 탈 수 있음!
	//       95%              5%         => 95% 이상의 확률로 2번 검사해야,,
	// 키가 2m가 넘어야 		나이가 3살이 넘어야 한다면
	//		5%						95%  => 95%의 확률로 1번만 검사해도 괜츈,, 
	// boolean age5 = (age > 3 && Height > 200);
	boolean age5 = ( Height * 0.01 > 2 && age > 3 );
	System.out.printf("다 포함됨? : %b\n", age5);
	
	// 키가 1.9m 넘거나, 나이가 50살 미만 탑승
	boolean mixx = (age < 50 || Height * 0.01 > 1.9 );
	System.out.printf("둘중에 하나 포함됨? : %b\n", mixx);
	
	// 10 < 나이 < 40이면 탈 수 있음	
	boolean ages = (10 < age && age < 40 );
	System.out.printf("나이 가능? : %b\n", ages);
	
	
	// 나이가 10살 이상이던지, 키가 1.5m 이상이던지 하나만
	boolean agess = (age >= 10) ^ (Height >= 1.5);		
	System.out.printf("나이키 가능? : %b\n", agess);
	
	// agess를 탈 수 있는 사람은 못타고,
	// agess를 탈 수 없는 사람은 탈 수 있음
	boolean agesss = !((age >= 10) ^ (Height >= 1.5));		
	System.out.printf("나이키 가능?? : %b\n", agesss);
	
	// 불 대수
	// 0(거짓), 1(참)
	
	
	
	
	
	
	
		
	}
}
