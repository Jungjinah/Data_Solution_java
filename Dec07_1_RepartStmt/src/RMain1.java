import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// ���±��� �ߴ� �� - ������ ���..!

// �ݺ��� - �̰��� ���..! -> many many�������!

public class RMain1 {

	
 	// 1. � �۾��� 53�� �ݺ�(Ƚ��)
	//for (int i ("�����ʱ�ȭ") = 0; args.length (���ǽ�); i ++ (���� ����) {   // (1. �����ʱ�ȭ �°�) (2. ���ǽ��� ������ (��)) (4. ���� ����) (5. �ٽ� ���� ��) (7. ���� ����) (8. �ٽ� ���� ��) (10. ���Ǻ� �� �ȸ�����(����))
	// 	����																  // (3. ���� ���) (6. ���� ���) (9. 8�� ���̸� ���� ���) (11. 10�� �����̸� �ݺ��� ����)
	
	//}
	
	// 2. �۾� - ���ɽð����� �ݺ�(����)

	public static void main(String[] args) {
		// ���� 3�� ����ϰ� ����
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d : ��\n", i);
		}
			System.out.println("---------------");
			
			// 1, 3, 5, ... , 21���� ���
	
		for (int i = 0; i < 22; i++) {
			if ( i % 2 == 1) {
			System.out.println(i);
		// for (int i = 0; i < 22; i+=2){
		//	System.out.print(i + "" );
		// }	
		}
	}
		System.out.println("----------------");
		// 5���� 1���� ������� �������� ���
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		
		// �ݺ����� 5�� ���µ��ȿ� 1~10������ ���ڸ� �����ϰ� �̰������?
		System.out.println("---------------\n");
		Random r = new Random();
		int x = r.nextInt(10) + 1;
		for (int i = 0; i < 5; i++) {
			System.out.println(x); // ���� �ݺ��� 5��!
			
		}
		// �ݺ��� �ӿ��� ��������°� ����!
		// �ݺ����� �� �� �������� ������ ������
		System.out.println("---------------");
		for (int i = 0; i < 5; i++) {
			int x2 = r.nextInt(10) + 1;
			System.out.println(x2); // �ٸ� �ݺ��� 5��!
		}
		// �ݺ��� �ȿ��� ������ ���� ����� ���� �����ϴ°� ����!
		// �ݺ��� �ۿ��� ���� �ϳ� ���� ���� ���°� �� �� ȿ����!
		System.out.println("---------------");
		int x3 = 0;
		for (int i = 0; i < 5; i++) {
			x3 = r.nextInt(10) + 1;	// ������ ���� '����' (o) / ������ '����' (x)
			System.out.println(x3);
		}
		// 1 + 2 + 3 + 4 + ... + 10
		System.out.println("---------------");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum); // ������� ū��ȣ ������ ������ ����� �ϳ� ���!
		// ���丮��!
		// 7! = ?
		System.out.println("--------------");
		int multiple = 1;
		for (int i = 1; i < 8; i++) {
			multiple *= i;
		} 
		System.out.println(multiple); // ������� ū��ȣ ������ ������ ������ 1 2 6 24 120 ...  �̷��� ����!
		
		// 1 - 50���� �� �߿�
		// 3�� ����ų� 5�� ����� �� ���� ��
		System.out.println("-------------");
		int sum2 = 0;
		for (int i = 1; i < 51; i++) {
//			if (i % 3 == 0) {
//				sum2 += i;
//			}else if (i % 5 == 0)
//				sum2 += i;
//		}
			if (i % 3 == 0 || i % 5 == 0) {
				sum2 += i;
		}
		}
		System.out.println(sum2);
		
		
		
	}
	}













