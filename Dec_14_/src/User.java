import java.util.Scanner;

public class User {
	
	Scanner mouth = new Scanner(System.in);
	int count;
	String answer;
	String result;

// 멤버 변수 : 속성 (소개할 때 언급할 만한 것)
// 지역 변수 : 그 행동을 하는 동안만 의미있는 것
// 파라미터 : 그 행동을 하는데 필요한 재료
// 리턴 : 그 행동의 결과물
	
	public void printUser() {
		System.out.println("< 이용자 >");
		System.out.println("-----------------");
	}

	// 몇개로 할지
	public int answerCount() {
		return mouth.nextInt();
	} 
	// 짤짤이
	public String answerAnswer() {
		return mouth.next();
	}
	
	
	
}
