import java.util.Iterator;
import java.util.Scanner;

// part 1 : �������� ���α׷��� ( ������� �� �Ἥ ����� �� ����) - �̰�������.
// part 2 : ��ü���� ���α׷��� - ����������.
// part 3 : ��Ÿ ��� �ܺ� ���̺귯��

// ���ǹ�
// �ݺ���
// �迭
// -------------> �����ø��ǾƵ幮��
// part 2 : ��ü, �ܺ� ���̺귯��...

public class CMain3 {
	// ���� : 
	//		�Ŵ���
	//			�ý��۰��� / �л����� / �������� ���� /
	//		����
	//			�л����� / �������� ����
	//		�л� 
	//			�������� ����
	//		�� �ݺ��ϴٰ� "��" �̶�� �Է��ϸ� ���α׷� ����
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		String c = null; // string�� �⺻���� null�� ����ִ� ��� ��,, ���ڶ�� 0 ���� ����!
		
		a : while (true) {	// �ݺ����� �̸��� �ٿ��ָ�( [�̸�] [:] ) ������ ���� break �ڿ� a��  ���δ�. 
			System.out.print("���� : ");
			c = key.next();
			switch(c) {
			case "�Ŵ���":
				System.out.println("�ý��۰���");
			case "����":
			System.out.println("�л�����");
			case "�л�":
			System.out.println("�������� ����");
				break;	// �� �Ʒ��� �ִ� ���� or ����� ��� or ���� ���� ����
						// break�� ������ �Ʒ� case���� ���� �ѹ����� ���� �Ǿ����
						// break�� �ɾ ������ ������ְ� switch�� �����ؼ� �ݺ��� �ٽ� ����!
			case "��":
				break a; // ������ ������ switch-case�� ����
						 // break �ڿ� �ݺ����� �̸��� ���̸� �ݺ����� ����!
			}

			
//			if (c.equals("�Ŵ���")) {
//				System.out.println("�ý��۰��� �л����� �������� ����");
//			}else if (c.equals("����")) {
//				System.out.println("�л����� �������� ����");
//			}else if(c.equals("�л�") ) {
//			System.out.println("�������� ����");
//			}else if (c.equals("��")) {
//				break;
//			}
		}
		
		System.out.println("-----------");
		bb: for (int i = 0; i < 3; i++) {
			//System.out.printf("i : %d\n", i);
		aa:	for (int j = 0; j < 3; j++) {
				//System.out.printf("j : %d\n", j);
				for (int j2 = 0; j2 < 3; j2++) {
					//System.out.printf("j2 : %d\n", j2);
					System.out.printf("%d %d %d\n", i , j, j2);
					if (i == 1) {
						System.out.println("�ߴ�!");
						//break;			// ���� ����� �ݺ����� �ߴ� (�̸� �Ⱥ��� �ݺ���)
										// i�� 1�� ���ٰ� j�� ���� ������(0) j2 ù��° ��(0)
										// ��µǸ鼭 -> ���ǹ����� ��
										// ���ǹ� break�� �ɷ��� �� ���� for������ �ö󰡼� ����
										// i�� 2�� ������ ���� ���� ���
						//break aa;		// i�� 1�� �κп��� i = 1, j = 0, j2 = 0 ���� ���
										// -> ���ǹ� break�� �ɷ��� aa�ݺ����� ������
										// ���� �ݺ����� bb��  i = 2���� ���ư��� ����
						break bb;		// i�� 1�� �κп��� i = 1, j = 1, j2 = 0 ���� ���
										// -> ���ǹ� break�� �ᷯ�� bb �ݺ����� ������
										// bb�� ���ΰ� �ִ� ���� �ƹ��͵� ���
										// �״�� �ݺ��� ����
					}
				}
			}
		}
	}
}
















