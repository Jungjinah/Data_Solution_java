import java.util.Random;
import java.util.Scanner;

public class YMain {
	public static void main(String[] args) {
		
	// 홀짝 게임 만들기!
	//		동전 10개를 쥐고있다가
		
	//		내가 '홀' 하면
		
		//Random r = new Random();
		//int i = r.nextInt(10) + 1; // 괄호안에 불러오고 싶은만큼의 범위 입력 (0~4)-> (1~5)
		//System.out.println(i);
		
		// 입력 받을 준비
		Scanner key = new Scanner(System.in);
		
		// 랜덤하게 동전을 뽑을 준비
		Random c = new Random();
		
		// 지정한 개수 중에서 랜덤한 동전 개수 뽑기
		int coin = c.nextInt(10) + 1;
		
		// 동전개수가 홀수면 '홀', 짝수면 '짝'
		String result = (coin % 2 == 1) ? "홀" : "짝";
//		System.out.println(result);
		
		// 답 맞출 수 있게 입력
		
		System.out.print("홀 or 짝 : ");
		String userAns = key.next();

		// 결과를 맞춰봐야.. (컴퓨터가 뽑은 정답?과 입력한 정답이 같은지)
		String finalResult = (result.equals(userAns)) ? "정답" : "땡";
		System.out.printf("동전 : %d개\n", coin);
		System.out.println(finalResult);
		
		
		
		
		
		
	}
}
