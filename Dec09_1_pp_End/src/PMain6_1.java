import java.util.Iterator;
import java.util.Scanner;

public class PMain6_1 {
	
	// 숫자를 입력받아서 배열에 담을 것 (숫자는 5개)
	public static int[] getNum() {
		Scanner key = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자 입력 : ", i + 1); // 배열은 0부터 시작이라 +1dksgkaus 0번째 숫자,,
			num[i]= key.nextInt();
		}
		System.out.println();
		System.out.println("-----------------");
		return num;
	}
// 정렬 전 값을 출력
	public static void printNum(int[] num) {
		System.out.println("<< 입력한 값 >>");
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}
// 정렬
	public static int[] getResult(int[] num) {
		int b = 0; // 값을 담을 그릇
		System.out.printf("배열의 개수 : ", +num.length);
		System.out.println("-----------------");
		for (int turn = 1; turn < num.length; turn++) {
			System.out.println(turn + "턴");
			for (int i = 0; i < num.length - 1 ; i++) {
			// num.length -1 을 한 이유 :	
			// if문 안에서 계산을 할 때, 다음 배열값을 비교하기 위해서
			// +1을 사용했는데
			// length 길이 그대로 사용하면 에러가 발생함!
				if (num[i] > num[i +1]) {
					b = num[i];
					num[i] = num[i +1];
					num[i + 1] = b;
				}
				System.out.print(num[i] + " ");
			}
			System.out.println(num[4]);
			System.out.println("정렬된 값 : " + b);
			System.out.println("----------------");
		}
		return num;
	}
// 정렬 후 값을 출력
	public static void printResult(int[] result){
		System.out.println("<< 정렬 후 값 >>");
		for( int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}
// 각각 함수 만들어서!
	public static void main(String[] args) {
		int[] num = getNum();
		printNum(num);
		int[] result = getResult(num);
	}
	

}

// 사실상 크게 의미가 없음..!
// 성능에서 효과가 없기 때문에..
// 코테용으로만 사용,,,,,,,,,,,,,,,,,
// 선택정렬, 삽입정렬, 퀵정렬, 합병정렬, .....




