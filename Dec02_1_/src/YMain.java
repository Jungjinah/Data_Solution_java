import java.util.Random;
import java.util.Scanner;

public class YMain {
	public static void main(String[] args) {
		
	// Ȧ¦ ���� �����!
	//		���� 10���� ����ִٰ�
		
	//		���� 'Ȧ' �ϸ�
		
		//Random r = new Random();
		//int i = r.nextInt(10) + 1; // ��ȣ�ȿ� �ҷ����� ������ŭ�� ���� �Է� (0~4)-> (1~5)
		//System.out.println(i);
		
		// �Է� ���� �غ�
		Scanner key = new Scanner(System.in);
		
		// �����ϰ� ������ ���� �غ�
		Random c = new Random();
		
		// ������ ���� �߿��� ������ ���� ���� �̱�
		int coin = c.nextInt(10) + 1;
		
		// ���������� Ȧ���� 'Ȧ', ¦���� '¦'
		String result = (coin % 2 == 1) ? "Ȧ" : "¦";
//		System.out.println(result);
		
		// �� ���� �� �ְ� �Է�
		
		System.out.print("Ȧ or ¦ : ");
		String userAns = key.next();

		// ����� �������.. (��ǻ�Ͱ� ���� ����?�� �Է��� ������ ������)
		String finalResult = (result.equals(userAns)) ? "����" : "��";
		System.out.printf("���� : %d��\n", coin);
		System.out.println(finalResult);
		
		
		
		
		
		
	}
}
