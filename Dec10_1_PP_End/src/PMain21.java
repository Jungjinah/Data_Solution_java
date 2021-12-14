import java.util.Scanner;

public class PMain21 {

	
	// 첫 부분 시작
	public static void start() {
		System.out.println("================================================");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("================================================");
	}
	
	// 선택할 번호 값 받아오기
	public static int getSelectNo() {
		Scanner key = new Scanner(System.in);
		System.out.print("선택> ");
		int selectNo = key.nextInt();
		return selectNo;
	}
	// 학생 수 받아오기
	public static int getStudentNum() {
		Scanner key = new Scanner(System.in);
		System.out.println("학생 수  : ");
		int studentNum = key.nextInt();
		return studentNum;
	}
	
	// 학생 개인의 점수 받아오기
	public static int getScore() {
		Scanner key = new Scanner(System.in);
		int score = key.nextInt();
		if (score > 100) {
			System.out.println("점수는 100점이 넘을 수 없습니다.");
			System.out.print("다시 입력 : ");
		}else if (score < 0){
			System.out.println("점수는 0점보다 낮을 수 없습니다.");
			System.out.print("다시 입력 : ");
		}
		return (score >= 0 && score <= 100) ? score : getScore();
	}
	
	
	// 학생들의 점수 입력하기
		public static int[] getScore(int[] scores) {
			for (int i = 0; i < scores.length; i++) {
				System.out.printf("%d번 학생 점수 입력 : ", i + 1);
				scores[i] = getScore();
			}
			return scores;
		}
		
	// 학생들의 점수 출력하기
		public static void printScore(int[] scores) {
			int index = 1;
			for (int i : scores) {
				System.out.printf("%d번 학생 점수 : %d점\n", index++ , i);
			}
		}
		
	// 최고점수, 평균점수 출력하기
		public static void printStats(int[] scores) {
			int sum = 0;
			int max = 0;
			double avg = 0;
			for (int i : scores) {			// 최고 점수만 for 돌리기. 평균점수는 계속 돌릴 필요가 없어
				sum += i;
				max = (max < i) ? i : max;
			}
			avg = (double) sum / scores.length;
			System.out.printf("최고점수 : %d점\n", max);
			System.out.printf("평균점수 : %.2f점\n", avg); 
		}
		
	// 종료 메시지
		public static void end( ) {
			System.out.println("종료합니다.");
			System.out.println("=======================");
		}
		
	// 전체적인 프로그램이 돌아갈 기능	
		public static void activate() {
			int selectNo = 0;
			int studentNum = 0;
			int[] scores = null;
			while (true) {
				start();
				selectNo = getSelectNo();
				if (selectNo == 1) {
					studentNum = getStudentNum();
					scores = new int[studentNum]; // 학생의 수만큼 배열의 크기를 정함
				}else if (selectNo == 2) {
					getScore(scores);
				}else if (selectNo ==3) {
					printScore(scores);
				}else if (selectNo ==4) {
					printScore(scores);
				}else if (selectNo == 5) {
					end();
					break;
				}else {
					System.out.println("입력이 잘못되었습니다.");
					System.out.println("다시 입력하세요.");
				}
			}
		}
		
	public static void main(String[] args) {
		activate();
		
	}		
	
}
