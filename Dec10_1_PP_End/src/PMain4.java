import java.util.Random;
import java.util.Scanner;

// UpDown게임(함수사용)
// 컴퓨터 : 1~100 사이의 숫자를 뽑음(ex : 34)
// 유저가 입력
//		1 트 : 50 -> down!
//		2 트 : 20 -> up!
//		...
//		10트 : 34 -> 정답!

public class PMain4 {

	
	// 컴퓨터가 1 - 100사이의 숫자를 하나 뽑아주는 함수
	public static int computerNum ( ) {
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		return num;
	}
	
	// 유저가 답을 입력할 수 있는 함수 (1 - 100)
	
	public static int userNum () {
		
		Scanner key = new Scanner(System.in);
		System.out.print("숫자를 입력하라 : ");
		int num1 = key.nextInt();
		return (num1 >=1 && num1 <= 100) ? num1 : userNum();
	}
	
	// 한 번 입력했을때 정답인지 아닌지 확인 + 반복문을 깰지 말지가 전달됨 (boolean)
	
	public static boolean check (int num, int num1) {
		if (num == num1) {
			System.out.println("정답!");
			//return true;			// 정답일때 true 값을 리턴하면서 종료되게
		}else if (num > num1) {
			System.out.println("Up!");	
			//return false;			// 정답이 아닐때 false값을 리턴하면서 게임을 계속 진행하도록
		}else if (num < num1) {
			System.out.println("Down!");
			//return false;
		
		
//		boolean OK = (num == num1);			-> boolean썼을때! 근데 이거 쓰면 아래꺼랑 안맞음,,,
//		System.out.println(OK);
//		System.out.printf("답은 ? : %b\n", OK);
//		System.out.printf("반복문 깨 ? : %b\n", OK);
//		return OK;
	}
		return (num == num1);		// 이 상황을 리턴한다!
									// 이 조건에 맞을 때 true값을 리턴하고, 아니면 false값을 리턴
	}
	// 정답 맞출때까지 반복하는 함수
	public static void ok(int num, int num1) {
		Scanner key = new Scanner(System.in);
		int turn = 0;
		while (true) {
			turn++;
			num1 = userNum();
			if (check(num, num1)) {
				System.out.printf("%d번 만에 종료합니다.", turn);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int num = computerNum();
		int num1 = 0;
		ok(num, num1);
	}
}
