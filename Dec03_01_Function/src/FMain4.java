import java.util.Random;
import java.util.Scanner;

import javax.management.monitor.CounterMonitor;

// 동전 맞추기 게임
// 10개

	// 랜덤한 동전 개수 가져오기
public class FMain4 {
	public static int shakeCoin() {
		Random r = new Random();
		int coin = r.nextInt(10) + 1;
		return coin;
	}
	
	// 질문 & 답 입력
	public static int askUserAns() {
		Scanner key = new Scanner(System.in);
		System.out.println("몇개일거같냐~? : ");
		int userAns = key.nextInt();
		return userAns;
	}
		
	// 동전개수 맞추기
		public static String getResult(int coin, int userAns) {
			String result = (coin == userAns)? "정답" : "땡";
			return result;

		}
	public static void printResult(int coin, int userAns, String result) {
		System.out.printf("동전은 %d!\n", coin);
		System.out.printf("내가 입력한 답 : %s!\n", userAns);
		System.out.printf("결과 : %s 이라서 %s! \n", userAns, result);
		
	}
	
	public static void main(String[] args) {
		int coin = shakeCoin();
		int userAns = askUserAns();
		String result = getResult(coin, userAns);
		printResult(coin, userAns, result);
		
	}
	
}
	

