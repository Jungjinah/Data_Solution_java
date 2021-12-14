import java.util.Scanner;

// main함수에서 진행
// 1을 입력하면 학생 수 값을 입력 받을 수 있게
// 2를 입력하면 각 학생들의 점수를 입력 받을 수 있게
// 3을 입력하면 학생들의 점수리스트 출력할 수 있게(ex : 1번 학생 점수 : 50점)
// 4를 입력하면 최고점수와 평균점수를 분석해서 출력할 수 있게
// 5를 입력하면 프로그램 종료

// 배열의 기본값 = null

// 첫 시작 부분
// 선택할 번호 값 받아오기
// 학생 수 값을 받아오기
// 학생들의 점수를 입력하기
// 학생들의 점수를 출력하기
// 최고점수와 평균점수 출력하기
// 프로그램 종료
// 전체적인 프로그램이 돌아갈 기능

public class PMain2 {

	
	public static int student() {
		
		Scanner key = new Scanner(System.in);
		System.out.println("==================");
		System.out.println("1. 학생 수 \n2. 학생들의 점수\n3. 점수리스트\n4. 최고점수 & 평균점수\n5. 프로그램 종료");
		System.out.println("==================");

		System.out.print("숫자를 입력하세요 : ");
		int num = key.nextInt();
		return num;
	}
	public static int studentCount() {
	
		System.out.print("학생 수 : ");
		Scanner key = new Scanner(System.in);
		int studentNum = key.nextInt();
		return studentNum;
	}
		
	public static void inputScore() {
		Scanner key = new Scanner(System.in);
		studentScoreArray = new int[studentNum];
		for (int i = 0; i < studentNum; i++) {
			System.out.printf("%d번 학생 점수 : ", i + 1);
			studentScoreArray[i] = studentScr;
		
		}
	}
	
	public static void outputScore() {
		for (int i = 0; i < studentNum; i++) {
			System.out.printf("%d번 학생 점수 : %d점\n", i + 1, studentScoreArray[i]);
			
			
		}
	}
	public static void bigAvgNum() {
		System.out.println("최고점수 : ");
		System.out.println("평균점수 : ");
		
	
	}
	public static void finish() {
		System.out.println("프로그램 종료");
	
		
	}
	
	public static void result() {
		while (true) {
			int num = student();
			switch (num) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
	
				break;
			case 5:
	
				break;
			}
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int num = student();
		int studentNum = studentCount();
		
		
		
		
	}
	
	
	
}
