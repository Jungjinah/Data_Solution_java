import java.util.Scanner;

// Bubble Sort : 인접한 두 항목의 값을 비교해서
//				 기준에 만족하면 서로의 값을 교환하는 정렬방법

// 숫자를 입력받아서 배열에 담을 것 ( 숫자는 5개)
// 정렬 전 값을 출력
// 정렬
// 정렬 후 값을 출력
// 각각 함수 만들어서 !

public class PMain6 {
		
	
	
			 
		public static void main(String[] args) {
			
			Scanner key = new Scanner(System.in);
			System.out.println("----------------");
			int[] num = new int[5];
			for (int i = 0; i < num.length; i++) {
				System.out.printf("%d번째 숫자 입력 : ", i + 1);
				num[i] = key.nextInt();
					//if (num[i]> num[i + 1]) {
					//	System.out.print(num[i]);
					//}else if (num[i] <= num[i + 1]){
					//	System.out.print("다시 입력 : ");
					
				//	}
			}
			System.out.println("----------------");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]);
			}
			System.out.println("\n----------------");
			
			System.out.printf("배열의 개수 : %d\n", num.length);
			
			System.out.println("----------------");

			for (int i = 1; i < num.length; i++) {
					System.out.printf("%d턴\n", num[i]);
					if (i > i + 1) {
						System.out.printf("%d %d", num[i+1], num[i]);
					}
					System.out.printf("정렬 된 값 : %d %d %d %d %d", 
							num[i + 1], num[i], num[i+2], num[i+3], num[i+4]);		
			
			
			
					
					
					
					
			}
			System.out.println("----------------");
			
			
		}			 
					 
}





















