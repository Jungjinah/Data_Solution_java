import java.util.Scanner;

// �Ž����� ȯ�� ���α׷�
// �Լ� ���


// <�Է�>
/* ������ ���� ���� : 35000
 * �� �� : 41530
 * ----------------
 * �Ž��� ��: 6530��
 * 			50000 :
 * 			10000 :
 * 			5000 : 1
 * 			1000 : 1
 * 			500 : 1
 * 			100 : 
 * 			50 :
 * 			10 : 3
 */


public class PMain3 {
	
	
	// ���� ����
	public static int cost ( ) {
		Scanner key = new Scanner(System.in);
		System.out.print("������ ���� ���� : ");
		int c = key.nextInt();
		return c;
	}
	// �� ��
	public static int giveMoney ( ) {
		Scanner key = new Scanner(System.in);
		System.out.print("��� �Ӵ� : ");
		int gM = key.nextInt();
		System.out.println("------------------");
		return gM;
	}
	// �Ž����� ���
	public static void restMoney (int gM, int c) {
		
		System.out.printf("�Ž��� �� : %d\n", gM - c);
	}
	
	// ���� 3�� ��� �뵵
	
	public static void upThird(int gM, int c ) {
	
		restMoney(gM, c);
		System.out.println("========================");
		System.out.printf("���� ���� : %d��\n", c);
		System.out.printf("�� �� : %d��\n", gM);
		System.out.printf("�Ž����� : %d��\n", gM - c);
		System.out.println("========================");
		
		
	}
	// �Ž����� ���� ���� ��� �ٰ����� ���
	public static void changeBill (int restMoney) {
		int chkMoney = restMoney;	
		
		Scanner key = new Scanner(System.in);
		int fiveTenT = 0;
		int oneTenT = 0;
		int tenT = 0;
		int fiveT = 0;
		int oneT = 0;
		int fiveH = 0;
		int oneH = 0;
		int fifty = 0;
		int ten = 0;
		
	while (true) {
		
		if (restMoney / 50000 >= 1) {
			System.out.printf("50000 : %d",restMoney / 50000);
			int chkMoney_ = restMoney - 50000;
		}else if (chkMoney / 10000 >= 1) {
			System.out.printf("10000 : %d", chkMoney / 10000);
			int chkMoney1 = chkMoney - 10000;
		}else if (chkMoney1 / 5000 >= 1) {
			System.out.printf("5000 : %d", chkMoney1 / 5000);
			int chkMoney2 = chkMoney1 - 5000;
		}else if (chkMoney2 / 1000 >= 1) {
			System.out.printf("10000 : %d", chkMoney2 / 1000);
			int chkMoney3 = chkMoney2 - 1000;
		}else if (chkMoney / 500 >= 1) {
			System.out.printf("10000 : %d", chkMoney3/ 500);
			int chkMoney4 = chkMoney3 - 500;
		}else if (chkMoney / 100 >= 1) {
			System.out.printf("10000 : %d", chkMoney4 / 100);
			int chkMoney5 = chkMoney4 - 100;
		}else if (chkMoney / 50 >= 1) {
			System.out.printf("10000 : %d", chkMoney5 / 10);
		}
		
		
		
	}	
		
	}
	
	public static void main(String[] args) {
		
		int c = cost();
		int gM = giveMoney();
		upThird(gM, c);
		int restMoney = gM-c;
		changeBill(restMoney);
		
		
		
		
	}
	
	
	
	
}
