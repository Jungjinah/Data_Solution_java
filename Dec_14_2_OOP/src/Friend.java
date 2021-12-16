import java.util.Random;
import java.util.Scanner;

public class Friend {
	
	int friendNum;
	Random r = new Random();
	
	// 숫자 대답
	public int answerNumber() {
		int friendNum = r.nextInt(100) + 1; // 뽑기
		// 머리속으로 숫자 하나 << 생각 >> 해서
		// 종이에 써서 답 제출
		return friendNum;
	}
	
	
	
	
}
