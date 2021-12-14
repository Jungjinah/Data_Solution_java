import java.util.Scanner;

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


public class PMain3 {
	
	
	// 물건 가격
	public static int cost ( ) {
		Scanner key = new Scanner(System.in);
		System.out.print("구매한 물건 가격 : ");
		int c = key.nextInt();
		return c;
	}
	// 낸 돈
	public static int giveMoney ( ) {
		Scanner key = new Scanner(System.in);
		System.out.print("기브 머니 : ");
		int gM = key.nextInt();
		System.out.println("------------------");
		return gM;
	}
	// 거스름돈 계산
	public static void restMoney (int gM, int c) {
		
		System.out.printf("거스름 돈 : %d\n", gM - c);
	}
	
	// 위에 3개 출력 용도
	
	public static void upThird(int gM, int c ) {
	
		restMoney(gM, c);
		System.out.println("========================");
		System.out.printf("물건 가격 : %d원\n", c);
		System.out.printf("낸 돈 : %d원\n", gM);
		System.out.printf("거스름돈 : %d원\n", gM - c);
		System.out.println("========================");
		
		
	}
	// 거스름돈 지폐에 따라 어떻게 줄건이지 출력
	public static void changeBill (int restMoney) {
		int chkMoney = restMoney;	
		
		Scanner key = new Scanner(System.in);
		int fiveTenT = 0;
		int oneTenT = 0;
		int tenT = 0;
		int fiveT = 0;
		int oneT = 0;
		int fiveH = 0;
		int oneH = 0;
		int fifty = 0;
		int ten = 0;
		
	while (true) {
		
		if (restMoney / 50000 >= 1) {
			System.out.printf("50000 : %d",restMoney / 50000);
			int chkMoney_ = restMoney - 50000;
		}else if (chkMoney / 10000 >= 1) {
			System.out.printf("10000 : %d", chkMoney / 10000);
			int chkMoney1 = chkMoney - 10000;
		}else if (chkMoney1 / 5000 >= 1) {
			System.out.printf("5000 : %d", chkMoney1 / 5000);
			int chkMoney2 = chkMoney1 - 5000;
		}else if (chkMoney2 / 1000 >= 1) {
			System.out.printf("10000 : %d", chkMoney2 / 1000);
			int chkMoney3 = chkMoney2 - 1000;
		}else if (chkMoney / 500 >= 1) {
			System.out.printf("10000 : %d", chkMoney3/ 500);
			int chkMoney4 = chkMoney3 - 500;
		}else if (chkMoney / 100 >= 1) {
			System.out.printf("10000 : %d", chkMoney4 / 100);
			int chkMoney5 = chkMoney4 - 100;
		}else if (chkMoney / 50 >= 1) {
			System.out.printf("10000 : %d", chkMoney5 / 10);
		}
		
		
		
	}	
		
	}
	
	public static void main(String[] args) {
		
		int c = cost();
		int gM = giveMoney();
		upThird(gM, c);
		int restMoney = gM-c;
		changeBill(restMoney);
		
		
		
		
	}
	
	
	
	
}
