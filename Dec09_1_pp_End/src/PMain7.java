import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class PMain7 {
	
	
	
	
	public static void main(String[] args) {
//		int[] num = {12, 30, 45, 85, 1, 3, 9, 100, 77, 54};
//		for (int i : num) {
//			System.out.print(i +" ");
//		}
		
		// 10개의 숫자를 랜덤으로 뽑아서 (1-100)
		// 배열에 담을것! -> 출력
		
		
		Random r = new Random();	// 랜덤해야행
		
//		int[] num = new int[10];
//		for (int i : num) {
//			int a = r.nextInt(100) + 1;
//			num[i] = a;
//			System.out.println(num[i] + " ");
//		}
		
		int[] num = new int[10]; // 배열 만들기
		for (int i = 0; i < num.length; i++) { // for을 사용하는 이유는 반복하기위해서,,
			int a = r.nextInt(100) + 1;		// 1-100 숫자 중에서 10개의 숫자를 뽑기 위한 랜덤돌리기
			num[i] = a;						// num[i] => 그릇, a는 100개의 랜덤숫자중에서 10개의 숫자를 하나씩 10개의 그릇에 넣어.
			System.out.print(num[i] + " ");	// 숫자 나열(가독성 좋게 하기 위해 띄어쓰기 했음)
		}
		
		
		// 10개의 숫자를 직접 입력해서
		 //배열에 담고 -> 출력
		System.out.println("\n----------------");   
		Scanner key = new Scanner(System.in);
		int[] nuM = new int[10];
		int a = 0;
		for (int i = 0; i < nuM.length; i++) {			// for을 쓴 이유가 10개의 입력을 받아서 배열값에 넣어준다.
			System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
			a = key.nextInt();
			nuM[i] = a;
		}											
		for (int i = 0; i < nuM.length; i++) {			// for을 쓴 이유는 배열에 넣은 값을 보기 위해서.
			System.out.print(nuM[i] + " ");
		}														
//		for (int i : nuM) {
//			System.out.println(i + " ");
//		}
		
		// 배열 num의 (Random으로 받아온) 최대값, 최소값 구하기
			
			int max = num[0];	// 배열의 0번째 숫자가 최대값이라고 가정
			int min = num[0];	// 배열의 0번째 숫자가 최소값이라고 가정
			for (int j = 0; j < nuM.length; j++) {
				if(min > num[j]) {	// min에 있는 숫자보다 num[j]의 숫자가 더 작다면
					min = num[j];	// num[j]의 숫자값을 min에 옮겨 담기
				}else if (max < num[j]) {	// max에 있는 숫자보다 num[i]의 숫자가 더 크다면
					max = num[j];		// num[j]의 숫자값을 max에 옮겨 담기
					
				}
			}
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		
	}		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
}
