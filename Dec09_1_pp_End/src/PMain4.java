
public class PMain4 {
	public static void main(String[] args) {
		String[] ss = {"����", "����", "����", "^_^"};
		// �� ���
		
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		System.out.println("----------------");
		String s = null;
		for (int i = 0; i < ss.length; i++) {
			s = ss[i];
			System.out.println(s);
		}
		
		System.out.println("----------------");
		// for-each (���� for��)
		//		�迭�� ��Ҹ� ������ ��� ��� x!
		//			: ������ ���°� �ƴ� �ӽ÷� �����ش� ���� �����̶�
		//			: �������� ���� x!
		//		���� ���� �Ұ���
		//				: i(�ε���)�� ��� ���ϴ� ������ ����� �� ����
		//			�׷��� Ȱ�뵵�� ������..
		
		// for (�ڷ��� ������ : �迭��) { ���� }
		for (String s2 : ss) {
			// �迭 ss�� ��Ҹ� s2��� �׸��� ��Ƽ�..
			System.out.println(s2); // ��� (�迭�� ��� ������� ���)
		}
		
	}
	
	
}



