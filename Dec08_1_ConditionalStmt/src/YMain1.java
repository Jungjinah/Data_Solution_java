import java.util.Iterator;

public class YMain1 {

	
	// for(변수초기화; 조건식; 값의 증감) {
	// }
	
	
	public static void main(String[] args) {
		
		
		// 1 ~ 100까지의 정수 중에서 6의 배수만 더하고 (최종결과) 출력
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				sum += i ; // sum = sum + i;
				System.out.println("현재숫자 : " + 1);
				System.out.println("현재 합 :" + sum);
				System.out.println("--------------");
			}
			System.out.println(sum);
		}
		System.out.println("총 합 : " + sum);
		System.out.println("--------------");
		
		
		// 4x + 5y = 60이 되는 해 (정수)를 모두 구해서
		// (x, y)의 형태로 출력
		// 조건 : x, y 는 둘 다 10 이하의 정수 (1~10)
		
		for (int x = 1; x < 11; x++) {
			for (int y = 1; y < 11; y++) {
				if (4*x + 5*y == 60) {
				System.out.printf("(%d, %d)", x, y);	
				}
			
			}
		}
		System.out.println("\n------------------");
		
		
	}
}












