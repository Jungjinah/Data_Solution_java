import java.util.Random;
import java.util.Scanner;

import javax.management.monitor.CounterMonitor;

// ���� ���߱� ����
// 10��

	// ������ ���� ���� ��������
public class FMain4 {
	public static int shakeCoin() {
		Random r = new Random();
		int coin = r.nextInt(10) + 1;
		return coin;
	}
	
	// ���� & �� �Է�
	public static int askUserAns() {
		Scanner key = new Scanner(System.in);
		System.out.println("��ϰŰ���~? : ");
		int userAns = key.nextInt();
		return userAns;
	}
		
	// �������� ���߱�
		public static String getResult(int coin, int userAns) {
			String result = (coin == userAns)? "����" : "��";
			return result;

		}
	public static void printResult(int coin, int userAns, String result) {
		System.out.printf("������ %d!\n", coin);
		System.out.printf("���� �Է��� �� : %s!\n", userAns);
		System.out.printf("��� : %s �̶� %s! \n", userAns, result);
		
	}
	
	public static void main(String[] args) {
		int coin = shakeCoin();
		int userAns = askUserAns();
		String result = getResult(coin, userAns);
		printResult(coin, userAns, result);
		
	}
	
}
	

