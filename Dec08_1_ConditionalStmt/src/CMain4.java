import java.util.Scanner;

public class CMain4 {
	// ATM����� �ϴ� ���α׷�
	// 1�� ���� ���� / 2�� ���� ��� / 3�� ���� �ܰ� Ȯ�� / 4�� ���� ���α׷� ����
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		int balance = 0;
		int plus = 0;
		int minus = 0;
		int num = 0;
		int choice = 0;
		int money = 0;
		a : while (true) {
			System.out.print("1)�Ա� 2)��� 3)�ܰ�Ȯ�� 4)����\n"
					+ "��ȣ�� �Է��Ͻʽÿ�.\t");
			choice = key.nextInt();
			if (choice == 1) {
				System.out.println("���ݾ�>");
				int plusMoney = key.nextInt();
				System.out.printf("%d���� �����մϴ�.\n", plusMoney);
				money += plusMoney;
			}else if (choice
					== 2) {
				System.out.println("��ݾ�>");
				int minusMoney = key.nextInt();
				System.out.printf("%d���� ����մϴ�.\n", minusMoney);
				money += minusMoney;
			}else if (choice == 3) {
				System.out.printf("�ܰ�> %d��\n", money);
			}else if (choice == 4) {
				System.out.println("���α׷� ����");
				break;
			}
			
			System.out.println();
			
//			num = key.nextInt();
//			 
//			switch (num) {
//			case 1:
//				System.out.print("���� �Է�: ");
//				plus = key.nextInt();
//				balance += plus;
//				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
//				
//				break;
//			case 2:
//				System.out.print("��� �Է�: ");
//				minus = key.nextInt();
//				balance -= minus;				
//				if (balance >= minus) {
//					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
//				}else {
//					System.out.println("�ܾ��� �����մϴ�.") ;
//				}
//				break;
//			case 3:
//				System.out.printf("�ܰ� : %d���� �����ֽ��ϴ�.\n", balance);
//				
//				break;
//			case 4:
//				System.out.println("���α׷� ����");
//				break a ;
			}
		
		}
		
		
		
	}
	

	
