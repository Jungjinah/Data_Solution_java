
// 거스름돈 환전 프로그램
// 함수 사용


// <입력>
/* 구매한 물건 가격 : 35000
 * 낸 돈 : 41530
 * ----------------
 * 거스름 돈: 6530을
 * 			50000 :
 * 			10000 :
 * 			5000 : 1
 * 			1000 : 1
 * 			500 : 1
 * 			100 : 
 * 			50 :
 * 			10 : 3
 */

public class PMain31 {
	
	// 거스름돈을 지폐에 따라 어떻게 줄 것인지 출력
	public static void printChange() {
		
		// 1.
		int[] currency = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		for (int i = 0; i < currency.length; i++) {
			if (change >= currency[i]) {
				System.out.println("%d원권 : %d개\n", currency[i], (change / currency[i]));
				change %= currency[i];
			}
		}
		
		// 2.
		int currency2 = 10000;
		while (true) {
			currency2 /= 2;
			if(change >= currency2) {
				System.out.printf("%d원권 : %d개\n", currency2, (change / currency2));
				change %= currency2;
			}
			currency2 /= 5;
			if
		}
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}
	
	
}
