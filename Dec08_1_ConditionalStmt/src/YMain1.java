import java.util.Iterator;

public class YMain1 {

	
	// for(�����ʱ�ȭ; ���ǽ�; ���� ����) {
	// }
	
	
	public static void main(String[] args) {
		
		
		// 1 ~ 100������ ���� �߿��� 6�� ����� ���ϰ� (�������) ���
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				sum += i ; // sum = sum + i;
				System.out.println("������� : " + 1);
				System.out.println("���� �� :" + sum);
				System.out.println("--------------");
			}
			System.out.println(sum);
		}
		System.out.println("�� �� : " + sum);
		System.out.println("--------------");
		
		
		// 4x + 5y = 60�� �Ǵ� �� (����)�� ��� ���ؼ�
		// (x, y)�� ���·� ���
		// ���� : x, y �� �� �� 10 ������ ���� (1~10)
		
		for (int x = 1; x < 11; x++) {
			for (int y = 1; y < 11; y++) {
				if (4*x + 5*y == 60) {
				System.out.printf("(%d, %d)", x, y);	
				}
			
			}
		}
		System.out.println("\n------------------");
		
		
	}
}












