import java.util.Iterator;
import java.util.Scanner;

public class PMain1 {

// main�Լ����� ����
// 1�� �Է��ϸ� �л� �� ���� �Է� ���� �� �ְ�
// 2�� �Է��ϸ� �� �л����� ������ �Է� ���� �� �ְ�
// 3�� �Է��ϸ� �л����� ��������Ʈ ����� �� �ְ�(ex : 1�� �л� ���� : 50��)
// 4�� �Է��ϸ� �ְ������� ��������� �м��ؼ� ����� �� �ְ�
// 5�� �Է��ϸ� ���α׷� ����

// �迭�� �⺻�� = null
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int studentNum = 0;									// �л� �� �׸� ������ֱ�
		int studentScr = 0;									// �л� ���� �׸� ������ֱ�
		int[] studentScoreArray = null;						// �л��� ���� �迭�ϴµ� ���ѱ׸� ������ֱ�

		Y : while (true) {										// ���ڸ� �Է��϶�� ���� �ݺ��Ǿ�� �ϹǷ�
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int num = key.nextInt();
			switch (num) {									// ��Ȳ�� ���� ���� ������,,
			case 1:
				System.out.print("�л� �� : ");
				studentNum = key.nextInt();
				break;
			case 2:
				studentScoreArray = new int[studentNum];	// �л��� ���� �迭������ֱ� (�׷��� �л����� �������� ��������)
				for (int i = 0; i < studentNum; i++) {		// 1������ n�������� �л� ���� �迭 �ؾ��ϹǷ� for ���ֱ�
					// �迭�� index�� 0���� ���ϱ� +1 �ؼ� 1������ ��µ� �� �ֵ���!
					System.out.printf("%d�� �л� ���� : ", i + 1);
					studentScr = key.nextInt();
					studentScoreArray[i] = studentScr;		// ���� �л��� ���� �迭�� 
				}
				break;
			case 3:
//				for (int i = 0; i < studentScoreArray.length; i++) {
//					System.out.printf("%d�� �л� ���� : %d��\n",i + 1 , studentScoreArray[i]);
//				}
				int index = 1;
				for (int i : studentScoreArray) {
					System.out.printf("%d�� �л� ���� : %d��\n", index ++, i);
				}
				break;
			case 4:
				int sum = 0;
				int max = 0;
				double avg = 0;
				for (int i : studentScoreArray) {			// �ְ� ������ for ������. ��������� ��� ���� �ʿ䰡 ����
					sum += i;
					max = (max < i) ? i : max;
				}
				avg = (double) sum / studentScoreArray.length;
				System.out.printf("�ְ����� : %d��\n", max);
				System.out.printf("������� : %.2f��\n", avg);
				break;
			case 5:
				System.out.println("���α׷� ����");
				break Y;
			}
		}
	
	
	}
}
