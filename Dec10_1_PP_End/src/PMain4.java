import java.util.Random;
import java.util.Scanner;

// UpDown����(�Լ����)
// ��ǻ�� : 1~100 ������ ���ڸ� ����(ex : 34)
// ������ �Է�
//		1 Ʈ : 50 -> down!
//		2 Ʈ : 20 -> up!
//		...
//		10Ʈ : 34 -> ����!

public class PMain4 {

	
	// ��ǻ�Ͱ� 1 - 100������ ���ڸ� �ϳ� �̾��ִ� �Լ�
	public static int computerNum ( ) {
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		return num;
	}
	
	// ������ ���� �Է��� �� �ִ� �Լ� (1 - 100)
	
	public static int userNum () {
		
		Scanner key = new Scanner(System.in);
		System.out.print("���ڸ� �Է��϶� : ");
		int num1 = key.nextInt();
		return (num1 >=1 && num1 <= 100) ? num1 : userNum();
	}
	
	// �� �� �Է������� �������� �ƴ��� Ȯ�� + �ݺ����� ���� ������ ���޵� (boolean)
	
	public static boolean check (int num, int num1) {
		if (num == num1) {
			System.out.println("����!");
			//return true;			// �����϶� true ���� �����ϸ鼭 ����ǰ�
		}else if (num > num1) {
			System.out.println("Up!");	
			//return false;			// ������ �ƴҶ� false���� �����ϸ鼭 ������ ��� �����ϵ���
		}else if (num < num1) {
			System.out.println("Down!");
			//return false;
		
		
//		boolean OK = (num == num1);			-> boolean������! �ٵ� �̰� ���� �Ʒ����� �ȸ���,,,
//		System.out.println(OK);
//		System.out.printf("���� ? : %b\n", OK);
//		System.out.printf("�ݺ��� �� ? : %b\n", OK);
//		return OK;
	}
		return (num == num1);		// �� ��Ȳ�� �����Ѵ�!
									// �� ���ǿ� ���� �� true���� �����ϰ�, �ƴϸ� false���� ����
	}
	// ���� ���⶧���� �ݺ��ϴ� �Լ�
	public static void ok(int num, int num1) {
		Scanner key = new Scanner(System.in);
		int turn = 0;
		while (true) {
			turn++;
			num1 = userNum();
			if (check(num, num1)) {
				System.out.printf("%d�� ���� �����մϴ�.", turn);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int num = computerNum();
		int num1 = 0;
		ok(num, num1);
	}
}
