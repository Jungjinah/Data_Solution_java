import java.util.Iterator;
import java.util.Random;

public class CMain1 {
	public static void main(String[] args) {
		// 1~10 ������ ������ ����
		// 5�� ���
		Random r = new Random();
		int x = 0;
		for (int i = 0; i < 5; i++) {
			x = r.nextInt(10) + 1;
			System.out.println(x);
		}
		
		// 1 ~ 10������ ������ ������ ���
		// 9�� ������ �ݺ��� ����
		// -> �Ұ���
		
		// �ݺ�Ƚ�� ��Ȯ - for ��(o)
		
		// �ݺ� ������ ���� �� (if���� �ݺ�����)
		// while �� : ������ ���� �˻�
		// 		������ true(��)�� ���ȿ� ��� �ݺ��ؼ� ���� �κ��� �����Ű��..
		//		����κп��� ������ false(����)���� ���� ���ߵ��� �ϰų�
		//		break; ��ɾ�� �ݺ����� �����ų �� �ִ�.
		//		������ ���� ������ �ݺ��ϴ� �۾��� ����!
		//		���Ѵ�� �ݺ��ϰ� ���� �� while (true)
		
		// while : �ݺ� Ƚ���� ��Ȯ�� �� �� ������, 
		// 		   Ư���� ���ǿ��� ����� �ϴ� ��쿡 ���!	
		//		while (���ǽ�) { -> ���̸� ���� ���ư� , �����̸� ��������
		//			����
		//		}
		System.out.println("------------");
		int y = r.nextInt(10) + 1; // ������ ������ �ѹ� �̾Ұ�
		while (y != 9) {		   // 9�� �ƴϸ� (= 9�� ���ö�����)
			System.out.println(y);
			y = r.nextInt(10) + 1; // �ٽ� while�� ���ư��� ������ üũ
			
		}
		
		// 1~3 ������ ������ ������ ���
		// 3�� ������ �ݺ��� ����
		int z = r.nextInt(3) + 1;
		while (z != 3) {
			System.out.println(z);
			z = r.nextInt(3) + 1;
		}
		
		System.out.println("-------");
	
		// do-while�� : ������� �ϰ� ������ ���߿� �˻� ( ���� �Ⱦ�)
		// �ѹ��� �ݺ��� ����
		do {
			System.out.println(z);
			z = r.nextInt(3) + 1; 
		} while (z != 3);
		System.out.println("-------------");
		// 1 + 2 + 3 + ... + 10 = ? -> for��
		// 1 + 2 + 3 + ... + n <= 100 -> while��
	
		// 1 ~ n��° �������� 100�� �Ѿ�� �ݺ����� ����ǰ�
		// �� ���� ������ /n�� ���� ������
		
		int sum = 0;
		int num = 0;
		 while (sum < 100 ) { 
			 num++;
			 sum = sum + num;
		 }
		System.out.printf("n�� �� : %d\n", num);
		System.out.printf("�� ��  : %d\n", sum);
		System.out.println("------------");
	
		// 1000������ ���� �߿���
		// ���� ū 15�� ����� ?
		int n = 1000;;
		while (n % 15 > 0) {
			n--;
			}
		//System.out.println(n);			
		System.out.printf("15�� ��� �� ���� ū �� : %d\n", n);
			System.out.println("------------");
		}
	
	
	
	
	
	} 
	





























