import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class FMain6 {

	// ���� �ΰ��� ������, �� �߿� ū ���ڸ� ����ϴ� �Լ�

	public static void printBigger() {

		Scanner key = new Scanner(System.in);

		System.out.print("a : ");
		int a = key.nextInt();
		System.out.print("b : ");
		int b = key.nextInt();

		int result = (a > b) ? a : b;
		System.out.println(result);

		// System.out.printf("�� �߿� �� ū ���ڴ� %d�̰ž�~\n", result);
		System.out.println("-----------------------");

	}

	// �Ǽ� �ΰ��� ������, �� �߿� ū ���ڸ� �����ִ� �Լ�
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
