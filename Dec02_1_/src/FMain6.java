import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class FMain6 {

	// 정수 두개를 넣으면, 그 중에 큰 숫자를 출력하는 함수

	public static void printBigger() {

		Scanner key = new Scanner(System.in);

		System.out.print("a : ");
		int a = key.nextInt();
		System.out.print("b : ");
		int b = key.nextInt();

		int result = (a > b) ? a : b;
		System.out.println(result);

		// System.out.printf("둘 중에 더 큰 숫자는 %d이거야~\n", result);
		System.out.println("-----------------------");

	}

	// 실수 두개를 넣으면, 그 중에 큰 숫자를 구해주는 함수
	public static double getbigger(double a, double b) {
		double bigNum = (a > b) ? a : b;
		bigNum *= 1000;
		return bigNum;
	}

	public static void main(String[] args) throws InterruptedException {

		printBigger();
		double bigNum = getbigger(1.3, 3.4);
		System.out.println(bigNum);

		Thread.sleep((int) bigNum);
	}

}
