import java.util.Scanner;

public class YMain2 {

	// ���� 2���� �Է¹޾Ƽ� (������ �Լ���)
	// �� ���� 2���� ������ �� ¦���� ��� ����, �ƴϸ� ���� ���Է�

	public static int getA() {

		Scanner key = new Scanner(System.in);
		System.out.print("a : ");
		int a = key.nextInt();
		return a;
	}

	public static int getB() {
		Scanner key = new Scanner(System.in);
		System.out.print("b : ");
		int b = key.nextInt();
		return b;
	}

	public static int add(int a, int b) {
		Scanner key = new Scanner(System.in);
		int sum = a + b;
		//return (sum % 2 == 0) ? sum : add(a, b);		// ���ϴ� ���� ������ ������ ���� ������ ���ư�
														// -> ó�� �Է��� ���� ��� ����
		return(sum % 2 ==0)? sum : add(getA(), getB());
	}

	public static void main(String[] args) {
		int a = getA();
		int b = getB();
		int addNum = add(a, b);
		System.out.println(addNum);
		System.out.println("--------------");

	}
}
