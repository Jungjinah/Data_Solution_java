import java.util.Scanner;

// main�Լ����� ����
// 1�� �Է��ϸ� �л� �� ���� �Է� ���� �� �ְ�
// 2�� �Է��ϸ� �� �л����� ������ �Է� ���� �� �ְ�
// 3�� �Է��ϸ� �л����� ��������Ʈ ����� �� �ְ�(ex : 1�� �л� ���� : 50��)
// 4�� �Է��ϸ� �ְ������� ��������� �м��ؼ� ����� �� �ְ�
// 5�� �Է��ϸ� ���α׷� ����

// �迭�� �⺻�� = null

// ù ���� �κ�
// ������ ��ȣ �� �޾ƿ���
// �л� �� ���� �޾ƿ���
// �л����� ������ �Է��ϱ�
// �л����� ������ ����ϱ�
// �ְ������� ������� ����ϱ�
// ���α׷� ����
// ��ü���� ���α׷��� ���ư� ���

public class PMain2 {

	
	public static int student() {
		
		Scanner key = new Scanner(System.in);
		System.out.println("==================");
		System.out.println("1. �л� �� \n2. �л����� ����\n3. ��������Ʈ\n4. �ְ����� & �������\n5. ���α׷� ����");
		System.out.println("==================");

		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = key.nextInt();
		return num;
	}
	public static int studentCount() {
	
		System.out.print("�л� �� : ");
		Scanner key = new Scanner(System.in);
		int studentNum = key.nextInt();
		return studentNum;
	}
		
	public static void inputScore() {
		Scanner key = new Scanner(System.in);
		studentScoreArray = new int[studentNum];
		for (int i = 0; i < studentNum; i++) {
			System.out.printf("%d�� �л� ���� : ", i + 1);
			studentScoreArray[i] = studentScr;
		
		}
	}
	
	public static void outputScore() {
		for (int i = 0; i < studentNum; i++) {
			System.out.printf("%d�� �л� ���� : %d��\n", i + 1, studentScoreArray[i]);
			
			
		}
	}
	public static void bigAvgNum() {
		System.out.println("�ְ����� : ");
		System.out.println("������� : ");
		
	
	}
	public static void finish() {
		System.out.println("���α׷� ����");
	
		
	}
	
	public static void result() {
		while (true) {
			int num = student();
			switch (num) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
	
				break;
			case 5:
	
				break;
			}
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int num = student();
		int studentNum = studentCount();
		
		
		
		
	}
	
	
	
}
