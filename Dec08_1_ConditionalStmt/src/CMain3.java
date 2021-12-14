import java.util.Iterator;
import java.util.Scanner;

// part 1 : 절차지향 프로그래밍 ( 순서대로 잘 써서 결과를 잘 내자) - 이과스럽다.
// part 2 : 객체지향 프로그래밍 - 문과스럽다.
// part 3 : 기타 등등 외부 라이브러리

// 조건문
// 반복문
// 배열
// -------------> 정보올림피아드문제
// part 2 : 객체, 외부 라이브러리...

public class CMain3 {
	// 누구 : 
	//		매니저
	//			시스템관리 / 학생관리 / 수업관련 업무 /
	//		강사
	//			학생관리 / 수업관련 업무
	//		학생 
	//			수업관련 업무
	//		를 반복하다가 "끝" 이라고 입력하면 프로그램 종료
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		String c = null; // string의 기본값은 null로 비어있다 라는 뜻,, 숫자라면 0 같은 느낌!
		
		a : while (true) {	// 반복문에 이름을 붙여주면( [이름] [:] ) 끝내고 싶은 break 뒤에 a를  붙인다. 
			System.out.print("누구 : ");
			c = key.next();
			switch(c) {
			case "매니저":
				System.out.println("시스템관리");
			case "강사":
			System.out.println("학생관리");
			case "학생":
			System.out.println("수업관련 업무");
				break;	// 이 아래에 있는 내용 or 기능은 출력 or 동작 되지 않음
						// break가 없으면 아래 case까지 가서 한번만에 종료 되어버림
						// break를 걸어서 내용을 출력해주고 switch를 종료해서 반복문 다시 돌게!
			case "끝":
				break a; // 무조건 가까운거 switch-case를 종료
						 // break 뒤에 반복문의 이름을 붙이면 반복문이 종료!
			}

			
//			if (c.equals("매니저")) {
//				System.out.println("시스템관리 학생관리 수업관련 업무");
//			}else if (c.equals("강사")) {
//				System.out.println("학생관리 수업관련 업무");
//			}else if(c.equals("학생") ) {
//			System.out.println("수업관련 업무");
//			}else if (c.equals("끝")) {
//				break;
//			}
		}
		
		System.out.println("-----------");
		bb: for (int i = 0; i < 3; i++) {
			//System.out.printf("i : %d\n", i);
		aa:	for (int j = 0; j < 3; j++) {
				//System.out.printf("j : %d\n", j);
				for (int j2 = 0; j2 < 3; j2++) {
					//System.out.printf("j2 : %d\n", j2);
					System.out.printf("%d %d %d\n", i , j, j2);
					if (i == 1) {
						System.out.println("중단!");
						//break;			// 가장 가까운 반복문이 중단 (이름 안붙힌 반복문)
										// i가 1로 갔다가 j쪽 값이 나오고(0) j2 첫번째 값(0)
										// 출력되면서 -> 조건문으로 들어감
										// 조건문 break에 걸려서 그 상위 for문으로 올라가서 실행
										// i가 2로 시작할 때는 정상 출력
						//break aa;		// i가 1인 부분에서 i = 1, j = 0, j2 = 0 까지 출력
										// -> 조건문 break에 걸려서 aa반복문이 깨지고
										// 상위 반복문인 bb의  i = 2부터 돌아가는 형태
						break bb;		// i가 1인 부분에서 i = 1, j = 1, j2 = 0 까지 출력
										// -> 조건문 break에 결러서 bb 반복문이 깨지고
										// bb를 감싸고 있는 것이 아무것도 없어서
										// 그대로 반복문 종료
					}
				}
			}
		}
	}
}
















