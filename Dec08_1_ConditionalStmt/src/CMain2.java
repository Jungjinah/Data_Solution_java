import java.util.Random;
import java.util.Scanner;

// for, while, do-while

public class CMain2 {
	public static void main(String[] args) {
		// 반복문 10번 -> 반복문 1번당 돌때마다 안녕하세요 x 3번씩
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 3) {
				continue;
			}
			System.out.println("안녕하세요 1");
			System.out.println("안녕하세요 2");
			System.out.println("안녕하세요 3");
			
		}
		System.out.println("----------------");
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("와");
			}else {
				//continue;	// 강제반복(턴종료) -> 홀수일때는 무시하고, 다음으로 넘어감
				break; 		// (공식적), 반복문을 끝!
				//return;		// (비공식적). 함수가 끝, 어쨋든간에 반복문도 깨짐
				
			}
		}
		System.out.println("--------------");
		// 코멘트내용을 입력 받을건데, 내용은 계속 받아올 것
		// 내용이 "ㅎㅇ"면 반복문 끝!
		
		Scanner key = new Scanner(System.in);
		String c = null;
		
		while (true) { // () 안에 조건 쓰기 애매한거 true값으로 -> break가 없으면 무한반복!
				System.out.println("내용 : ");
				c = key.next();
				System.out.println("----------");
				System.out.println(c);
				System.out.println("----------");
				if (c.equals("ㅎㅇ")) {
					System.out.println("반복문 끝!");
					break;	// 반복문 박살!
				}
			}
		}	
	}







