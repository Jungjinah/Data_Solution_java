import java.util.Scanner;

public class CMain4 {
	// switch - case (ex: ���� ����)
	
	// Scanner�� ����� �Է� ���� ��!
	
	// �̺� �Է� -> ��ġ, �����, �Ʒ�, ��
	// �Ϻ� �Է� -> �����, �Ʒ�, ��
	// �� �Է� -> �Ʒ�, ��
	// ���� �Է� -> ��
	//		-> ���
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("��� : ");
		String grade = key.next();
		// System.out.println(x); -> Ȯ����
		
		switch (grade) {
		case "�̺�":
			System.out.println("��ġ����");
		case "�Ϻ�":
			System.out.println("�����");
		case "��":
			System.out.println("�Ʒ�");
		case "����":
			System.out.println("��");
			break;
		}
	// -> break �߰��� �����ָ� (���ǹ��� ���������ٴ� ��,,)
	// 	  �̺��� ��, ��ġ���� ����� �Ʒ� �� �� ������
	//	  �Ϻ��� ��, ����� �Ʒ� �� �̷��� ����,,
		
		
	}
	
	
}
