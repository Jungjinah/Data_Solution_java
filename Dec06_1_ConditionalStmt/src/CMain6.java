import java.util.Scanner;

public class CMain6 {

	// 1�� = 12
	// �� �޸��� ��ĥ���� �ٸ��ϴ�
	// ������� �Է��� �޾Ƽ�
	// 31�ϱ��� �ֽ��ϴ�. / 30�ϱ��� �ֽ��ϴ�. / 28�ϱ��� �ֽ��ϴ�
	// ���� �� -> ���� ���Դϴ� ���

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.print("�� : ");
		int month = key.nextInt();
		int day = 0;
		// 1 3 5 7 8 10 12
		// 4 6 9 11
		// 2

		switch (month) {
		case 1:
		case 3: // �䷱ ����� �ֱ�
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			// System.out.println("31�ϱ��� �ֽ��ϴ�!");
			break;
		case 4: case 6: case 9: case 11: // �䷱����� �ִ�~
			day = 30;
			// System.out.println("30�ϱ��� �ֽ��ϴ�!");
			break;
		case 2:
			day = 28;
			// System.out.println("28�ϱ��� �ֽ��ϴ�!");
			break;
		default:
			day = 0;
			System.err.println("���� ���Դϴ�!");
			break;
		}
		System.out.printf("%d���� %d�� ���� �ֽ��ϴ�", month, day);
	}

}
