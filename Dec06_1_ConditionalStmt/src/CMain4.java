import java.util.Scanner;

public class CMain4 {
	// switch - case (ex: 권한 설정)
	
	// Scanner로 계급을 입력 받을 것!
	
	// 이병 입력 -> 눈치, 관등성명, 훈련, 잠
	// 일병 입력 -> 관등성명, 훈련, 잠
	// 상병 입력 -> 훈련, 잠
	// 병장 입력 -> 잠
	//		-> 출력
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("계급 : ");
		String grade = key.next();
		// System.out.println(x); -> 확인차
		
		switch (grade) {
		case "이병":
			System.out.println("눈치보기");
		case "일병":
			System.out.println("관등성명");
		case "상병":
			System.out.println("훈련");
		case "병장":
			System.out.println("잠");
			break;
		}
	// -> break 중간꺼 없애주면 (조건문이 깨져버린다는 뜻,,)
	// 	  이병일 때, 눈치보기 관등성명 훈련 잠 다 나오구
	//	  일병일 때, 관등성명 훈련 잠 이렇게 나옴,,
		
		
	}
	
	
}
