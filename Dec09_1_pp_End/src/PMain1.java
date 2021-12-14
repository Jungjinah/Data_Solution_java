import java.util.Scanner;

// 어떤 숫자를 콘솔에 입력..
// 그 숫자의 약수를 구해주는 프로그램
// Main에서 진행 -> 음수값은 무시
// 예) 12의 약수는 : 1, 2, 3, 4, 6, 12
// 계속 입력하면 약수를 계속 뽑아주고 ->
// 콘솔창에 0을 입력하면 프로그램이 종료되게! (0 입력하기 전까지는 무한 반복)
// 배열 사용 x

public class PMain1 {
	
	public static void main(String[] args) {
		
//		Scanner key = new Scanner(System.in);
//		int num = 0;
//		while (true) {
//			System.out.print("숫자 입력 ( 0 입력하면 종료) : ");
//			num = key.nextInt();
//			if (num == 0) {
//				System.out.println("종료합니다.");
//				break;
//			}
//		System.out.printf("[%d]의 약수는 : ", num);
//		for (int i = 0; i <= num; i++) {
//			if (num % i == 0) {
//				System.out.printf("%d ", i);
//			}
//		}
//		System.out.println();
//		}
//	}	
//}		
// 위에는 슨생님 버전!		
		
		Scanner key = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("숫자 입력 : ");
			int a = key.nextInt();
			if (a == 0) {
				System.out.println("반복문 종료!");
				break; 
			}
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					System.out.printf(i+ " ");
					//System.out.printf("%d ", i);
				}
			}
			System.out.println();
		}
		
	}
	
}
