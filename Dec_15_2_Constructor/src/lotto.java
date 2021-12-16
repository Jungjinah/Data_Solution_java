import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class lotto {

	/*
	 * 1. 로또 번호는 총 6개 번호를 지정한다.
	 * 2. 6개 일치 : 1등 / 5개 일치 : 2등 / 4개 일치 : 3등 / 그외 : 꽝으로 정한다.
	 * 3. Random객체를 사용해서 난수 랜덤 정수값을 생성한다. (1-45 정수 까지 범위 지정)
	 * 4. for문을 사용해서 두 배열 일치 값 개수를 확인하고 등수를 출력합니다.
	 */
	
	// 6개번호 지정
	
	public static int[] myNum() {
		Scanner key = new Scanner(System.in);
		int[] num = new int[6];
		int num1 = 1;
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i + 1);
			num1 = key.nextInt();
			if (num1 >= 1 && num1 <= 45) {
				num[i] = num1;
			}else {
				System.out.print("다시 입력해주세요 : ");
				num1 = key.nextInt();
				num[i] = num1;
			}
		}
		return num;
	}
	
	// 정렬 전 값을 출력
	public static void printMyNum(int[] num) {
		System.out.println("-----------------");
		System.out.println("<< 입력한 값 >>");
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}
	
	
	// 랜덤 6개 배열 지정
	public static int[] lottoNum() {
		Random r = new Random();
		int[] autoNum = {0,0,0,0,0,0};
		int autoNum1 = 0;
		for (int i = 0; i < 6; i++) {
		autoNum1 = r.nextInt(45) + 1;
		autoNum[i] = autoNum1; 
		}
		return autoNum;
	}
	
	// 컴퓨터값 배열
	public static void printLottoNum(int[] autoNum) {
		System.out.println("<< 컴퓨터 값 >>");
		for (int i : autoNum) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}
	
	// 중복값 제거
	public static int[] duplication(int[] autoNum) {
		Random r = new Random();
		int num = 0;
		for (int j = 0; j < autoNum.length; j++) {
			for (int i = j + 1; i < autoNum.length; i++) {
				if (autoNum[i] == autoNum[j + 1]) {
					num = r.nextInt(45) + 1 ;
					autoNum[i] = num;
				}
				
			}
		}
		return autoNum;
	}
	// 맞은 개수 세기
	public static int arrayCompare(int[] autoNum, int[]num) {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (autoNum[i] == num[i]) {
				count ++;
			}
		}
		return count;
	}
	
	// 당첨
	public static void lottery(int count) {
		if (count == 6) {
			System.out.println("1등 당첨");
		}else if (count ==5) {
			System.out.println("2등 당첨");
		}else if (count == 4) {
			System.out.println("3등 당첨");
		}else
			System.out.println("꽝");
	}
	
	
	public static void main(String[] args) {
		
		int[] num = myNum();
		printMyNum(num);
		int[] printLottoNum = lottoNum();
		int[] autoNum = lottoNum();
		printLottoNum(autoNum);
		duplication(autoNum);
		for (int i = 0; i < autoNum.length; i++) {
			System.out.print(autoNum[i]+ " ");
		}
		System.out.println("\n---------------");
		int count = arrayCompare(autoNum, num);
		System.out.printf("개수 : %d개\n", count);
		lottery(count);
	}
	
	
	
}
