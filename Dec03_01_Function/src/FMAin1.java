import java.util.Random;
import java.util.Scanner;

// 오늘도 함수!

// ? 출력과 생성의 차이는 출력은 main으로 내보낼거 없이 오로지 '출력'만 해서
// ? return을 쓰지 않고, 내보낼거 '없어서' void를 사용한다.
// ? 생성은 출력한 것을 main으로 내보내야 하므로 'return'을 사용해야 하고,
// ? return으로 내보낼 값이 int, double, string 중 하나가 된다.


public class FMAin1 {
	// 1) 랜덤한 정수를 '출력'하는 함수! // 그림) 기능만 있는 함수에 속함
	
	public static void red() {
		Random I = new Random(); // 랜덤할 정수 뽑을 준비!
		int In = I.nextInt();
		System.out.println(I);
		System.out.printf("-----------------------\n");
	}
	
	// 2) 랜덤할 정수를 '생성'하는 함수! // 그림) 결과값만 있는 함수에 속함
	
	public static int blue() {
		Random i = new Random();
		int in = i.nextInt();
		return in;
	}
	// 생성 = 구한다. // 정수를 '생성'하는 것이 이 함수의 목표,,
	// return을 하는데 에러가 나면 void -> int 로 바꾸거나
	//	return에 마우스 갖다대고 int로 바꿔주기
	//  -> in 에 있는 값을 최종 결과로 뱉어내기
	// 이함수는 종료
	
	// 3) 정수를 하나 넣으면
	// 홀수인지 짝수인지 출력하는 함수
	
	public static void green(int a) { // 그림)뭔가를 넣어서 기능을 만드는 함수
		String result = (a % 2 == 1) ? "홀수" : "짝수";
		System.out.printf("%d는 %s!\n", a, result);
	}
	// 4) 정수를 두개 넣었을 때
	// 앞 숫자가 크면 앞, 뒷 숫자가 크거나 같으면 '뒤' 생성
	
	public static String purple(int x, int y) { // 뭔가를 넣으면 결과값 생성
		String bigNum = (y <= x) ? "뒤" : "앞" ;
		// String bigNum = (x > y) ? "앞" : "뒤" ;
		return bigNum;
	}
	
	// 5) 점심메뉴 (2가지 중 하나!)
	// 위의 함수를 이용해서
	// 랜덤할 숫자를 2개 뽑아서
	// 먼저 뽑힌게 크면 '앞메뉴', 아니면 '뒤메뉴'
	public static String black(int A, int B) {
		
		Random number = new Random();
		String result = (A > B)? "덮밥" : "돈까스";
		return result;
	}
	
	// 5-1) 홀수이면 덮밥, 짝수이면 돈까스
	
	public static void white(int z) {
		String  reSult = (z % 2 == 1)? "덮밥" : "돈까스";
		System.out.printf("오늘 점심은 %s!\n", reSult);
	}
	
	
	// JVM -> main함수를 자동으로 호출
	public static void main(String[] args) {
		red();
		// blue()를 통해 구해진 숫자를 i라는 그릇에 담아서 콘솔에 출력
		int i = blue();
		System.out.println(i);
		System.out.println("------");
		// green()를 통해서 짝수인지 홀수인지 콘솔에 출력
		green(5);
		System.out.println("------");
		String ss = purple(10,20);
		System.out.println(ss);
		System.out.println("------");
		String lunch = black(10, 20);
		System.out.println(lunch);
		System.out.println("------");
		white(4);
		
		// 5) 선생님 버전
		int r1 = blue();
		int r2 = blue();
		System.out.println(r1);
		System.out.println(r2);
		String sss = purple(r1, r2);
		System.out.println(sss);
		String menu = (sss.equals("앞")) ? "초밥" : "짜장면";
		// 위의 식은 "앞"이라는 내용을 "초밥"으로 바꾼느 것!
		// String menu = (r1 > r2) ? "초밥" : "짜장면";
		System.out.println(menu);
		
		
		
		
		
		
		
		
	}
	
	
	
}
