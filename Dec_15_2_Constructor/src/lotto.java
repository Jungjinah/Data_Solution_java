import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class lotto {

	/*
	 * 1. �ζ� ��ȣ�� �� 6�� ��ȣ�� �����Ѵ�.
	 * 2. 6�� ��ġ : 1�� / 5�� ��ġ : 2�� / 4�� ��ġ : 3�� / �׿� : ������ ���Ѵ�.
	 * 3. Random��ü�� ����ؼ� ���� ���� �������� �����Ѵ�. (1-45 ���� ���� ���� ����)
	 * 4. for���� ����ؼ� �� �迭 ��ġ �� ������ Ȯ���ϰ� ����� ����մϴ�.
	 */
	
	// 6����ȣ ����
	
	public static int[] myNum() {
		Scanner key = new Scanner(System.in);
		int[] num = new int[6];
		int num1 = 1;
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d��° ���� �Է� : ", i + 1);
			num1 = key.nextInt();
			if (num1 >= 1 && num1 <= 45) {
				num[i] = num1;
			}else {
				System.out.print("�ٽ� �Է����ּ��� : ");
				num1 = key.nextInt();
				num[i] = num1;
			}
		}
		return num;
	}
	
	// ���� �� ���� ���
	public static void printMyNum(int[] num) {
		System.out.println("-----------------");
		System.out.println("<< �Է��� �� >>");
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}
	
	
	// ���� 6�� �迭 ����
	public static int[] lottoNum() {
		Random r = new Random();
		int[] autoNum = {0,0,0,0,0,0};
		int autoNum1 = 0;
		for (int i = 0; i < 6; i++) {
		autoNum1 = r.nextInt(45) + 1;
		autoNum[i] = autoNum1; 
		}
		return autoNum;
	}
	
	// ��ǻ�Ͱ� �迭
	public static void printLottoNum(int[] autoNum) {
		System.out.println("<< ��ǻ�� �� >>");
		for (int i : autoNum) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}
	
	// �ߺ��� ����
	public static int[] duplication(int[] autoNum) {
		Random r = new Random();
		int num = 0;
		for (int j = 0; j < autoNum.length; j++) {
			for (int i = j + 1; i < autoNum.length; i++) {
				if (autoNum[i] == autoNum[j + 1]) {
					num = r.nextInt(45) + 1 ;
					autoNum[i] = num;
				}
				
			}
		}
		return autoNum;
	}
	// ���� ���� ����
	public static int arrayCompare(int[] autoNum, int[]num) {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (autoNum[i] == num[i]) {
				count ++;
			}
		}
		return count;
	}
	
	// ��÷
	public static void lottery(int count) {
		if (count == 6) {
			System.out.println("1�� ��÷");
		}else if (count ==5) {
			System.out.println("2�� ��÷");
		}else if (count == 4) {
			System.out.println("3�� ��÷");
		}else
			System.out.println("��");
	}
	
	
	public static void main(String[] args) {
		
		int[] num = myNum();
		printMyNum(num);
		int[] printLottoNum = lottoNum();
		int[] autoNum = lottoNum();
		printLottoNum(autoNum);
		duplication(autoNum);
		for (int i = 0; i < autoNum.length; i++) {
			System.out.print(autoNum[i]+ " ");
		}
		System.out.println("\n---------------");
		int count = arrayCompare(autoNum, num);
		System.out.printf("���� : %d��\n", count);
		lottery(count);
	}
	
	
	
}
