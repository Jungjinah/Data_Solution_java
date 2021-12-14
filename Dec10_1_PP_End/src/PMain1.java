import java.util.Iterator;
import java.util.Scanner;

public class PMain1 {

// main함수에서 진행
// 1을 입력하면 학생 수 값을 입력 받을 수 있게
// 2를 입력하면 각 학생들의 점수를 입력 받을 수 있게
// 3을 입력하면 학생들의 점수리스트 출력할 수 있게(ex : 1번 학생 점수 : 50점)
// 4를 입력하면 최고점수와 평균점수를 분석해서 출력할 수 있게
// 5를 입력하면 프로그램 종료

// 배열의 기본값 = null
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int studentNum = 0;									// 학생 수 그릇 만들어주기
		int studentScr = 0;									// 학생 점수 그릇 만들어주기
		int[] studentScoreArray = null;						// 학생들 점수 배열하는데 무한그릇 만들어주기

		Y : while (true) {										// 숫자를 입력하라는 말이 반복되어야 하므로
			System.out.print("숫자를 입력하세요 : ");
			int num = key.nextInt();
			switch (num) {									// 상황에 따라 말이 나오게,,
			case 1:
				System.out.print("학생 수 : ");
				studentNum = key.nextInt();
				break;
			case 2:
				studentScoreArray = new int[studentNum];	// 학생들 점수 배열만들어주기 (그러니 학생수를 기준으로 만들어야해)
				for (int i = 0; i < studentNum; i++) {		// 1번부터 n번까지의 학생 점수 배열 해야하므로 for 써주기
					// 배열의 index는 0부터 세니까 +1 해서 1번부터 출력될 수 있도록!
					System.out.printf("%d의 학생 점수 : ", i + 1);
					studentScr = key.nextInt();
					studentScoreArray[i] = studentScr;		// 위에 학생들 점수 배열에 
				}
				break;
			case 3:
//				for (int i = 0; i < studentScoreArray.length; i++) {
//					System.out.printf("%d번 학생 점수 : %d점\n",i + 1 , studentScoreArray[i]);
//				}
				int index = 1;
				for (int i : studentScoreArray) {
					System.out.printf("%d번 학생 점수 : %d점\n", index ++, i);
				}
				break;
			case 4:
				int sum = 0;
				int max = 0;
				double avg = 0;
				for (int i : studentScoreArray) {			// 최고 점수만 for 돌리기. 평균점수는 계속 돌릴 필요가 없어
					sum += i;
					max = (max < i) ? i : max;
				}
				avg = (double) sum / studentScoreArray.length;
				System.out.printf("최고점수 : %d점\n", max);
				System.out.printf("평균점수 : %.2f점\n", avg);
				break;
			case 5:
				System.out.println("프로그램 종료");
				break Y;
			}
		}
	
	
	}
}
