
public class PMain3 {
	public static void main(String[] args) {
		// printf
		// System.out.printf("%?", ��); �� ����
		
		// ���� (decimal)
		// %d : ���������Ͱ� ���� �ڸ�(decimal, 10����) -> ��� ��� ����!
		// %xd : ���ڸ��� ����� ä������ ���
		// %0xd : ���ڸ��� 0���� ä���� x�ڸ��� ���ڷ� ������ش�.
		
		
		System.out.printf("%d\n", 1);
		System.out.printf("%3d\n", 1);
		System.out.printf("%03d\n", 1);
		
		// �Ǽ� (float)
		
		// %f : �Ǽ������Ͱ� ���� �ڸ�
		// %.xf : �Ҽ��� ������ �ڸ���  (�߸��� �κ��� �ݿø�ó��)
		//		  ���ڸ��� 0���� ä����
		
		
		System.out.printf("%.3f\n", 123.45678);

		System.out.printf("%.10f\n", 123.45678);
		
		// %s : ���ڵ����Ͱ� ���� �ڸ� (String)
		// ���� : �׳� �Է��ϸ� ��!
		// ���� : �׳� �Է��ϸ� Java�� �������� �ؼ��ϱ� ������ -> ����!
		// 			-> "����" (ū ����ǥ �ȿ� ���� �ֱ�)
		System.out.printf("%s\n", "�������󸮵����󷯾�");
		System.out.printf("%s\n", "���� 4�� 36���̾�!");
		
		
		// ���ó�¥���� ����, ��, ��
		
		
		
		
		//���ó�¥���� ����
		System.out.printf("%s\n", "2021��");
		System.out.printf("%d��\n" , 2021);
		System.out.printf("%4d��\n" , 2021);
		
		//���ó�¥���� ��
		System.out.printf("%s\n", "11��");
		System.out.printf("%d��\n" , 11);
		System.out.printf("%02d��\n" , 11);

		//���ó�¥���� ��
		System.out.printf("%s\n", "29��");
		System.out.printf("%d��\n", 29);
		System.out.printf("%02d��\n", 29);

		//���ó�¥���� ������
		System.out.printf("%4d-%02d-%02d\n", 2021, 11, 29);
		
		// ���� : ����
		System.out.printf("%s\n", "���� : ����");
		System.out.printf("���� : %s\n", "����");
		
		// ��� : 5��
		System.out.printf("%s\n", "��� : 5��");
		System.out.printf("��� : %d��\n",  5);
		
		// ���� : 21.8%
		// %% : %�� ���ڷ� ǥ���� ��(printf ����)
		System.out.printf("%s\n", "���� : 21.58%");
		System.out.printf("���� : %.2f%%\n", 21.58);
		
		
	}

}
