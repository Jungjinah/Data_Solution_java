import java.util.Scanner;

// � ���ڸ� �ֿܼ� �Է�..
// �� ������ ����� �����ִ� ���α׷�
// Main���� ���� -> �������� ����
// ��) 12�� ����� : 1, 2, 3, 4, 6, 12
// ��� �Է��ϸ� ����� ��� �̾��ְ� ->
// �ܼ�â�� 0�� �Է��ϸ� ���α׷��� ����ǰ�! (0 �Է��ϱ� �������� ���� �ݺ�)
// �迭 ��� x

public class PMain1 {
	
	public static void main(String[] args) {
		
//		Scanner key = new Scanner(System.in);
//		int num = 0;
//		while (true) {
//			System.out.print("���� �Է� ( 0 �Է��ϸ� ����) : ");
//			num = key.nextInt();
//			if (num == 0) {
//				System.out.println("�����մϴ�.");
//				break;
//			}
//		System.out.printf("[%d]�� ����� : ", num);
//		for (int i = 0; i <= num; i++) {
//			if (num % i == 0) {
//				System.out.printf("%d ", i);
//			}
//		}
//		System.out.println();
//		}
//	}	
//}		
// ������ ������ ����!		
		
		Scanner key = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("���� �Է� : ");
			int a = key.nextInt();
			if (a == 0) {
				System.out.println("�ݺ��� ����!");
				break; 
			}
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					System.out.printf(i+ " ");
					//System.out.printf("%d ", i);
				}
			}
			System.out.println();
		}
		
	}
	
}
