import java.util.Scanner;

public class CMain6 {

	// 1년 = 12
	// 각 달마다 며칠인지 다릅니다
	// 몇월인지 입력을 받아서
	// 31일까지 있습니다. / 30일까지 있습니다. / 28일까지 있습니다
	// 없는 달 -> 없는 달입니다 출력

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.print("월 : ");
		int month = key.nextInt();
		int day = 0;
		// 1 3 5 7 8 10 12
		// 4 6 9 11
		// 2

		switch (month) {
		case 1:
		case 3: // 요런 방법도 있구
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			// System.out.println("31일까지 있습니다!");
			break;
		case 4: case 6: case 9: case 11: // 요런방법도 있다~
			day = 30;
			// System.out.println("30일까지 있습니다!");
			break;
		case 2:
			day = 28;
			// System.out.println("28일까지 있습니다!");
			break;
		default:
			day = 0;
			System.err.println("없는 달입니다!");
			break;
		}
		System.out.printf("%d월은 %d일 까지 있습니다", month, day);
	}

}
