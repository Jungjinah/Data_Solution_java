import java.util.Scanner;

public class CMain4 {
	// ATM기능을 하는 프로그램
	// 1을 고르면 예금 / 2를 고르면 출금 / 3을 고르면 잔고 확인 / 4를 고르면 프로그램 종료
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		int balance = 0;
		int plus = 0;
		int minus = 0;
		int num = 0;
		int choice = 0;
		int money = 0;
		a : while (true) {
			System.out.print("1)입금 2)출금 3)잔고확인 4)종료\n"
					+ "번호를 입력하십시오.\t");
			choice = key.nextInt();
			if (choice == 1) {
				System.out.println("예금액>");
				int plusMoney = key.nextInt();
				System.out.printf("%d원을 예금합니다.\n", plusMoney);
				money += plusMoney;
			}else if (choice
					== 2) {
				System.out.println("출금액>");
				int minusMoney = key.nextInt();
				System.out.printf("%d원을 출금합니다.\n", minusMoney);
				money += minusMoney;
			}else if (choice == 3) {
				System.out.printf("잔고> %d원\n", money);
			}else if (choice == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.println();
			
//			num = key.nextInt();
//			 
//			switch (num) {
//			case 1:
//				System.out.print("예금 입력: ");
//				plus = key.nextInt();
//				balance += plus;
//				System.out.println("입금이 완료되었습니다.");
//				
//				break;
//			case 2:
//				System.out.print("출금 입력: ");
//				minus = key.nextInt();
//				balance -= minus;				
//				if (balance >= minus) {
//					System.out.println("출금이 완료되었습니다.");
//				}else {
//					System.out.println("잔액이 부족합니다.") ;
//				}
//				break;
//			case 3:
//				System.out.printf("잔고 : %d원이 남아있습니다.\n", balance);
//				
//				break;
//			case 4:
//				System.out.println("프로그램 종료");
//				break a ;
			}
		
		}
		
		
		
	}
	

	
